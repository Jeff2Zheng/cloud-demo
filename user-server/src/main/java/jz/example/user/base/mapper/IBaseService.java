package jz.example.user.base.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @Author JZ
 * @Date 2022/4/3
 */
public interface IBaseService<T> extends BaseMapper<T> {

    // 插入一条记录（选择字段，策略插入）
    boolean save(T entity);
    // 插入（批量）
    boolean saveBatch(Collection<T> entityList);
    // 插入（批量）
    boolean saveBatch(Collection<T> entityList, int batchSize);

    // TableId 注解存在更新记录，否插入一条记录
    boolean saveOrUpdate(T entity);
    // 根据updateWrapper尝试更新，否继续执行saveOrUpdate(T)方法
    boolean saveOrUpdate(T entity, Wrapper<T> updateWrapper);
    // 批量修改插入
    boolean saveOrUpdateBatch(Collection<T> entityList);
    // 批量修改插入
    boolean saveOrUpdateBatch(Collection<T> entityList, int batchSize);

    // 根据 entity 条件，删除记录
    boolean remove(Wrapper<T> queryWrapper);
    // 根据 ID 删除
    boolean removeById(Serializable id);
    // 根据 columnMap 条件，删除记录
    boolean removeByMap(Map<String, Object> columnMap);
    // 删除（根据ID 批量删除）
    boolean removeByIds(Collection<? extends Serializable> idList);

    // 根据 UpdateWrapper 条件，更新记录 需要设置sqlset
    boolean update(Wrapper<T> updateWrapper);
    // 根据ID 批量更新
    boolean updateBatchById(Collection<T> entityList);
    // 根据ID 批量更新
    boolean updateBatchById(Collection<T> entityList, int batchSize);

    // 根据 ID 查询
    T getById(Serializable id);
    // 根据 Wrapper，查询一条记录。结果集，如果是多个会抛出异常，随机取一条加上限制条件 wrapper.last("LIMIT 1")
    T getOne(Wrapper<T> queryWrapper);
    // 根据 Wrapper，查询一条记录
    T getOne(Wrapper<T> queryWrapper, boolean throwEx);
    // 根据 Wrapper，查询一条记录
    Map<String, Object> getMap(Wrapper<T> queryWrapper);
    // 根据 Wrapper，查询一条记录
    <V> V getObj(Wrapper<T> queryWrapper, Function<? super Object, V> mapper);

    // 查询所有
    List<T> list();
    // 查询列表
    List<T> list(Wrapper<T> queryWrapper);
    // 查询（根据ID 批量查询）
    Collection<T> listByIds(Collection<? extends Serializable> idList);
    // 查询（根据 columnMap 条件）
    Collection<T> listByMap(Map<String, Object> columnMap);
    // 查询所有列表
    List<Map<String, Object>> listMaps();
    // 查询列表
    List<Map<String, Object>> listMaps(Wrapper<T> queryWrapper);
    // 查询全部记录
    List<Object> listObjs();
    // 查询全部记录
    <V> List<V> listObjs(Function<? super Object, V> mapper);
    // 根据 Wrapper 条件，查询全部记录
    List<Object> listObjs(Wrapper<T> queryWrapper);
    // 根据 Wrapper 条件，查询全部记录
    <V> List<V> listObjs(Wrapper<T> queryWrapper, Function<? super Object, V> mapper);

    // 无条件分页查询
    IPage<T> page(IPage<T> page);
    // 条件分页查询
    IPage<T> page(IPage<T> page, Wrapper<T> queryWrapper);
    // 无条件分页查询
    IPage<Map<String, Object>> pageMaps(IPage<T> page);
    // 条件分页查询
    IPage<Map<String, Object>> pageMaps(IPage<T> page, Wrapper<T> queryWrapper);

    // 查询总记录数
    int count();
    // 根据 Wrapper 条件，查询总记录数
    int count(Wrapper<T> queryWrapper);
}
