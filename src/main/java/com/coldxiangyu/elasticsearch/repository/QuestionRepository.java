package com.coldxiangyu.elasticsearch.repository;
import com.coldxiangyu.elasticsearch.bean.QuestionBean;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 接口关系：
 * ElasticsearchRepository --> ElasticsearchCrudRepository --> PagingAndSortingRepository --> CrudRepository
 */
public interface QuestionRepository extends ElasticsearchRepository<QuestionBean, String> {

    //Optional<BookBean> findById(String id);

}
