package com.coldxiangyu.elasticsearch.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "qa_question", type = "_doc")
public class QuestionBean {
    @Id
    private String id;
    private String questionType;
    private String applyTopic;
    private String questionDetail;
    private String state;
    private String createDate;
    private String modifyDate;

    public QuestionBean(){}

    public QuestionBean(String id, String questionType, String applyTopic, String questionDetail, String state, String createDate, String modifyDate) {
        this.id = id;
        this.questionType = questionType;
        this.applyTopic = applyTopic;
        this.questionDetail = questionDetail;
        this.state = state;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getApplyTopic() {
        return applyTopic;
    }

    public void setApplyTopic(String applyTopic) {
        this.applyTopic = applyTopic;
    }

    public String getQuestionDetail() {
        return questionDetail;
    }

    public void setQuestionDetail(String questionDetail) {
        this.questionDetail = questionDetail;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "QuestionBean{" +
                "id='" + id + '\'' +
                ", questionType='" + questionType + '\'' +
                ", applyTopic='" + applyTopic + '\'' +
                ", questionDetail='" + questionDetail + '\'' +
                ", state='" + state + '\'' +
                ", createDate='" + createDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                '}';
    }
}
