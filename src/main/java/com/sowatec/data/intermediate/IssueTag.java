package com.sowatec.data.intermediate;

import com.sowatec.data.DataObject;

public class IssueTag extends DataObject {

    private int issueId;
    private int tagId;

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }
}
