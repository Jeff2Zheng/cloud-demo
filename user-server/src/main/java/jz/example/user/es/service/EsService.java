package jz.example.user.es.service;

import jz.example.user.base.UserPublicService;
import jz.example.user.base.result.ResponseData;
import jz.example.user.es.json.HotelIndexConstants;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Author JZ
 * @Date 2022/3/30
 */
@Service
public class EsService extends UserPublicService {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    public ResponseData createSuoYin()  throws IOException {
        if(ifExists()){
            return ResponseData.fail("索引库已经存在，请勿创建");
        }
        CreateIndexRequest request = new CreateIndexRequest("hotel");
        // 2.准备请求参数
        request.source(HotelIndexConstants.MAPPING_TEMPLATE, XContentType.JSON);
        // 3.发送请求
        restHighLevelClient.indices().create(request, RequestOptions.DEFAULT);
        return ResponseData.success("索引库创建成功");
    }

    /**
     * @Description: 判断索引哭是否存在
     * @Author: JZ
     * @date: 2022/4/10
     */
    public boolean ifExists() throws IOException {
        GetIndexRequest request = new GetIndexRequest("hotel");
        // 3.发送请求
        return restHighLevelClient.indices().exists(request, RequestOptions.DEFAULT);
    }

    /**
     * @Description: 删除索引库
     * @Author: JZ
     * @date: 2022/4/10
     */
    public ResponseData deleteSuoYinKu()  throws IOException {
        if(!ifExists()){
            return ResponseData.fail("索引库不存在，请勿删除");
        }
        DeleteIndexRequest request = new DeleteIndexRequest("hotel");
        // 3.发送请求
        restHighLevelClient.indices().delete(request, RequestOptions.DEFAULT);
        return ResponseData.success("索引库删除成功");
    }

    /**
     * @Description: 文档新增
     * @Author: JZ
     * @date: 2022/4/10
     */
    public ResponseData addWenDang()  throws IOException {
        IndexRequest request = new IndexRequest("jz-demo").id("1");
        request.source("{\"address\": \"郑钟铃\", \"email\": \"924689923@qq.con\"}",XContentType.JSON);
        // 3.发送请求
        restHighLevelClient.index(request,RequestOptions.DEFAULT);
        return ResponseData.success("新增文档成功");
    }


    /**
     * @Description: 文档新增
     * @Author: JZ
     * @date: 2022/4/10
     */
    public ResponseData deleteWenDang()  throws IOException {
        DeleteRequest request = new DeleteRequest("jz-demo","1");
        // 3.发送请求
        restHighLevelClient.delete(request,RequestOptions.DEFAULT);
        return ResponseData.success("删除文档成功");
    }



}
