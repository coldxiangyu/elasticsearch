package com.coldxiangyu.elasticsearch.controller;

import com.coldxiangyu.elasticsearch.bean.QuestionBean;
import com.coldxiangyu.elasticsearch.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
public class ElasticController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping("/question/{id}")
    @ResponseBody
    public QuestionBean getQuestionById(@PathVariable String id) {
        Optional<QuestionBean> opt = questionService.findById(id);
        QuestionBean question = opt.get();
        System.out.println(question);
        return question;
    }

    @RequestMapping("/save")
    @ResponseBody
    public void save() {
        QuestionBean questionBean = new QuestionBean("1", "java", "elasticsearch技术", "哒哒哒哒哒哒多多多多多多多多多多多多多多多多多多多多多多多多", "1", new Date(), new Date());
        System.out.println(questionBean);
        questionService.save(questionBean);
    }


}

