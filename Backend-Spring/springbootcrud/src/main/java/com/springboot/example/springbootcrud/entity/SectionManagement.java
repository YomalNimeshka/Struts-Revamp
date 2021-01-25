package com.springboot.example.springbootcrud.entity;

import javax.persistence.*;

@Entity
@Table(name = "section_management")
public class SectionManagement {
    //commit
    @Id
    @Column(name = "section_code")
    private String sectionCode;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "sort_key")
    private int sortKey;

    @Column(name = "remarks")
    private String remarks;

    public SectionManagement(String sectionCode, String description, String status, int sortKey, String remarks) {
        this.sectionCode = sectionCode;
        this.description = description;
        this.status = status;
        this.sortKey = sortKey;
        this.remarks = remarks;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSortKey() {
        return sortKey;
    }

    public void setSortKey(int sortKey) {
        this.sortKey = sortKey;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "SectionManagement{" +
                "sectionCode='" + sectionCode + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", sortKey=" + sortKey +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
