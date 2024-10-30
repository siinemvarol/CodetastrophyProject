package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "job_roles")
public class JobRole {
    @Id
    @Column(name = "job_role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobRoleId;

    @Column(name = "job_role_name")
    private String jobRoleName;

    @Column(name = "number_of_applications")
    private int numberOfApplications;

    @Column(name = "number_of_interviews")
    private int numberOfInterviews;

    @Column(name = "number_of_rejected")
    private int numberOfRejected;

    @Column(name = "source_paid")
    private int sourceOfApplicationPaid;

    @Column(name = "source_crm")
    private int sourceOfApplicationCrm;

    @Column(name = "source_referral")
    private int sourceOfApplicationReferral;

    @Column(name = "source_organic")
    private int sourceOfApplicationOrganic;

    @Column(name = "source_agency")
    private int sourceOfApplicationAgency;

    @Column(name = "source_other")
    private int sourceOfApplicationOther;

    public JobRole() {
    }

    public JobRole(int jobRoleId, String jobRoleName, int numberOfApplications, int numberOfInterviews,
                   int numberOfRejected, int sourceOfApplicationPaid, int sourceOfApplicationCrm,
                   int sourceOfApplicationReferral, int sourceOfApplicationOrganic, int sourceOfApplicationAgency,
                   int sourceOfApplicationOther) {
        this.jobRoleId = jobRoleId;
        this.jobRoleName = jobRoleName;
        this.numberOfApplications = numberOfApplications;
        this.numberOfInterviews = numberOfInterviews;
        this.numberOfRejected = numberOfRejected;
        this.sourceOfApplicationPaid = sourceOfApplicationPaid;
        this.sourceOfApplicationCrm = sourceOfApplicationCrm;
        this.sourceOfApplicationReferral = sourceOfApplicationReferral;
        this.sourceOfApplicationOrganic = sourceOfApplicationOrganic;
        this.sourceOfApplicationAgency = sourceOfApplicationAgency;
        this.sourceOfApplicationOther = sourceOfApplicationOther;
    }

    public int getJobRoleId() {
        return jobRoleId;
    }

    public void setJobRoleId(int jobRoleId) {
        this.jobRoleId = jobRoleId;
    }

    public String getJobRoleName() {
        return jobRoleName;
    }

    public void setJobRoleName(String jobRoleName) {
        this.jobRoleName = jobRoleName;
    }

    public int getNumberOfApplications() {
        return numberOfApplications;
    }

    public void setNumberOfApplications(int numberOfApplications) {
        this.numberOfApplications = numberOfApplications;
    }

    public int getNumberOfInterviews() {
        return numberOfInterviews;
    }

    public void setNumberOfInterviews(int numberOfInterviews) {
        this.numberOfInterviews = numberOfInterviews;
    }

    public int getNumberOfRejected() {
        return numberOfRejected;
    }

    public void setNumberOfRejected(int numberOfRejected) {
        this.numberOfRejected = numberOfRejected;
    }

    public int getSourceOfApplicationPaid() {
        return sourceOfApplicationPaid;
    }

    public void setSourceOfApplicationPaid(int sourceOfApplicationPaid) {
        this.sourceOfApplicationPaid = sourceOfApplicationPaid;
    }

    public int getSourceOfApplicationCrm() {
        return sourceOfApplicationCrm;
    }

    public void setSourceOfApplicationCrm(int sourceOfApplicationCrm) {
        this.sourceOfApplicationCrm = sourceOfApplicationCrm;
    }

    public int getSourceOfApplicationReferral() {
        return sourceOfApplicationReferral;
    }

    public void setSourceOfApplicationReferral(int sourceOfApplicationReferral) {
        this.sourceOfApplicationReferral = sourceOfApplicationReferral;
    }

    public int getSourceOfApplicationOrganic() {
        return sourceOfApplicationOrganic;
    }

    public void setSourceOfApplicationOrganic(int sourceOfApplicationOrganic) {
        this.sourceOfApplicationOrganic = sourceOfApplicationOrganic;
    }

    public int getSourceOfApplicationAgency() {
        return sourceOfApplicationAgency;
    }

    public void setSourceOfApplicationAgency(int sourceOfApplicationAgency) {
        this.sourceOfApplicationAgency = sourceOfApplicationAgency;
    }

    public int getSourceOfApplicationOther() {
        return sourceOfApplicationOther;
    }

    public void setSourceOfApplicationOther(int sourceOfApplicationOther) {
        this.sourceOfApplicationOther = sourceOfApplicationOther;
    }

    @Override
    public String toString() {
        return "JobRole{" +
                "jobRoleId=" + jobRoleId +
                ", jobRoleName='" + jobRoleName + '\'' +
                ", numberOfApplications=" + numberOfApplications +
                ", numberOfInterviews=" + numberOfInterviews +
                ", numberOfRejected=" + numberOfRejected +
                ", sourceOfApplicationPaid=" + sourceOfApplicationPaid +
                ", sourceOfApplicationCrm=" + sourceOfApplicationCrm +
                ", sourceOfApplicationReferral=" + sourceOfApplicationReferral +
                ", sourceOfApplicationOrganic=" + sourceOfApplicationOrganic +
                ", sourceOfApplicationAgency=" + sourceOfApplicationAgency +
                ", sourceOfApplicationOther=" + sourceOfApplicationOther +
                '}';
    }
}
