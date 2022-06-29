package jz.example.user.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author JZ
 * @Date 2022/3/16
 */
@Configuration
public class ElasticSearchConfig implements InitializingBean {

    private static ElasticSearchConfig INSTANCE ;

    @Value("${elasticsearch.clientUrl:}")
    private String clientUrl;

    public static final ElasticSearchConfig me() {
        return INSTANCE;
    }

    @Override
    public void afterPropertiesSet() {
        INSTANCE = this;
    }

    public static ElasticSearchConfig getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(ElasticSearchConfig INSTANCE) {
        ElasticSearchConfig.INSTANCE = INSTANCE;
    }

    public String getClientUrl() {
        return clientUrl;
    }

    public void setClientUrl(String clientUrl) {
        this.clientUrl = clientUrl;
    }

    @Bean
    public RestHighLevelClient restHighLevelClient(){
        return new RestHighLevelClient(RestClient.builder(
                HttpHost.create(clientUrl)
        ));
    }
}
