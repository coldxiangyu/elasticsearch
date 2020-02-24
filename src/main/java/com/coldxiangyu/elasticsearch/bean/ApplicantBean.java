package com.coldxiangyu.elasticsearch.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "qa_question_applicant", type = "_doc")
public class ApplicantBean {
    @Id
    private String id;
    private String questionId;
    private String applicantId;
    private String applicantTeam;

    public ApplicantBean(){}

    public ApplicantBean(String id, String questionId, String applicantId, String applicantTeam) {
        this.id = id;
        this.questionId = questionId;
        this.applicantId = applicantId;
        this.applicantTeam = applicantTeam;
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

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicantTeam() {
        return applicantTeam;
    }

    public void setApplicantTeam(String applicantTeam) {
        this.applicantTeam = applicantTeam;
    }

    @Override
    public String toString() {
        return "ApplicantBean{" +
                "id='" + id + '\'' +
                ", questionId='" + questionId + '\'' +
                ", applicantId='" + applicantId + '\'' +
                ", applicantTeam='" + applicantTeam + '\'' +
                '}';
    }
}
