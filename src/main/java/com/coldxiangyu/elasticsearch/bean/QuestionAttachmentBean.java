package com.coldxiangyu.elasticsearch.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "qa_question_attachment", type = "_doc")
public class QuestionAttachmentBean {
    @Id
    private String id;
    private String questionId;
    private String name;
    private String path;
    private String uploadDate;

    public QuestionAttachmentBean(){}

    public QuestionAttachmentBean(String id, String questionId, String name, String path, String uploadDate) {
        this.id = id;
        this.questionId = questionId;
        this.name = name;
        this.path = path;
        this.uploadDate = uploadDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        return "QuestionAttachmentBean{" +
                "id='" + id + '\'' +
                ", questionId='" + questionId + '\'' +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                '}';
    }
}
