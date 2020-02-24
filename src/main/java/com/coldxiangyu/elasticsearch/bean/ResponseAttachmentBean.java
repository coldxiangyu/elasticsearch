package com.coldxiangyu.elasticsearch.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "qa_response_to_attachment", type = "_doc")
public class ResponseAttachmentBean {
    @Id
    private String id;
    private String responseId;
    private String attachmentId;

    public ResponseAttachmentBean(){}

    public ResponseAttachmentBean(String id, String responseId, String attachmentId) {
        this.id = id;
        this.responseId = responseId;
        this.attachmentId = attachmentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    @Override
    public String toString() {
        return "ResponseAttachmentBean{" +
                "id='" + id + '\'' +
                ", responseId='" + responseId + '\'' +
                ", attachmentId='" + attachmentId + '\'' +
                '}';
    }
}
