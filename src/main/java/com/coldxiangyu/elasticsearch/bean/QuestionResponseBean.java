package com.coldxiangyu.elasticsearch.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "qa_question_response", type = "_doc")
public class QuestionResponseBean {
    @Id
    private String id;
    private String questionId;
    private String replierId;
    private String applicantTeam;
    @Field(type = FieldType.Date , format= DateFormat.custom , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date replyDate;
    private String content;
    @Field(type = FieldType.Date , format= DateFormat.custom , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    public QuestionResponseBean(){}

    public QuestionResponseBean(String id, String questionId, String replierId, String applicantTeam, Date replyDate, String content, Date updateDate) {
        this.id = id;
        this.questionId = questionId;
        this.replierId = replierId;
        this.applicantTeam = applicantTeam;
        this.replyDate = replyDate;
        this.content = content;
        this.updateDate = updateDate;
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

    public String getReplierId() {
        return replierId;
    }

    public void setReplierId(String replierId) {
        this.replierId = replierId;
    }

    public String getApplicantTeam() {
        return applicantTeam;
    }

    public void setApplicantTeam(String applicantTeam) {
        this.applicantTeam = applicantTeam;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "QuestionResponseBean{" +
                "id='" + id + '\'' +
                ", questionId='" + questionId + '\'' +
                ", replierId='" + replierId + '\'' +
                ", applicantTeam='" + applicantTeam + '\'' +
                ", replyDate=" + replyDate +
                ", content='" + content + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}
