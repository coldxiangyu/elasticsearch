package com.coldxiangyu.elasticsearch.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "qa_applicant_to_attachment", type = "_doc")
public class ApplicantAttachmentBean {
    @Id
    private String id;
    private String applicantId;
    private String attachmentId;

    public ApplicantAttachmentBean(){}

    public ApplicantAttachmentBean(String id, String applicantId, String attachmentId) {
        this.id = id;
        this.applicantId = applicantId;
        this.attachmentId = attachmentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    @Override
    public String toString() {
        return "AttachmentBean{" +
                "id='" + id + '\'' +
                ", applicantId='" + applicantId + '\'' +
                ", attachmentId='" + attachmentId + '\'' +
                '}';
    }
}
