package com.coldxiangyu.elasticsearch.service.impl;

import com.coldxiangyu.elasticsearch.bean.QuestionBean;
import com.coldxiangyu.elasticsearch.repository.QuestionRepository;
import com.coldxiangyu.elasticsearch.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    @Qualifier("questionRepository")
    private QuestionRepository questionRepository;


    @Override
    public Optional<QuestionBean> findById(String id) {
        //CrudRepository中的方法
        return questionRepository.findById(id);
    }

    @Override
    public QuestionBean save(QuestionBean blog) {
        return questionRepository.save(blog);
    }

}

