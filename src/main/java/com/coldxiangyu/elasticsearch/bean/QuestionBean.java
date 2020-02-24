package com.coldxiangyu.elasticsearch.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "qa_question", type = "_doc")
public class QuestionBean {
    @Id
    private String id;
    private String questionType;
    private String applyTopic;
    private String questionDetail;
    private String state;
    @Field(type = FieldType.Date , format= DateFormat.custom , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
    @Field(type = FieldType.Date , format= DateFormat.custom , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyDate;

    public QuestionBean(){}

    public QuestionBean(String id, String questionType, String applyTopic, String questionDetail, String state, Date createDate, Date modifyDate) {
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
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
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
