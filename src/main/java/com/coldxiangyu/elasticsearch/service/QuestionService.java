package com.coldxiangyu.elasticsearch.service;

import com.coldxiangyu.elasticsearch.bean.QuestionBean;
import java.util.Optional;

public interface QuestionService {

    Optional<QuestionBean> findById(String id);

    QuestionBean save(QuestionBean question);


}

