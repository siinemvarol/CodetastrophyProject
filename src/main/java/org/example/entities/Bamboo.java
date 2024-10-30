package org.example.entities;
import org.example.utils.PrepareDatabase;

import javax.persistence.*;

@Entity@Table(name = "bamboos")

public class Bamboo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bamboo_id")
    private int bambooId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @Column(name="assoc_dob")
    private String associateDob;

    @Column(name="assoc_nationality")
    private String associateNationality;

    @Column(name="assoc_portfolio")
    private String associatePortfolio;

    @Column(name="assoc_division")
    private String associateDivision;

    @Column(name="assoc_department")
    private String associateDepartment;

    @Column(name="assoc_job_title")
    private String associateJobTitle;

    @Column(name="assoc_line_manager")
    private String associateLineManager;

    @Column(name="assoc_cpd_level")
    private int associateCpdLevel;

    @Column(name="assoc_cpd_stage")
    private String associateCpdStage;

    @Column(name="assoc_academy")
    private String associateAcademy;

    @Column(name="assoc_6month_uplift")
    private String associate6MonthUplift;

    @Column(name="assoc_12month_uplift")
    private String associate12MonthUplift;

    @Column(name="assoc_18month_uplift")
    private String associate18MonthUplift;

    @Column(name="assoc_greenline_rating")
    private int associateGreenlineRating;

    @Column(name="assoc_leaver_reason")
    private String associateLeaverReason;

    public Bamboo(int bambooId, String associateDob, String associateNationality, String associatePortfolio,
                  String associateDivision, String associateDepartment, String associateJobTitle,
                  String associateLineManager, int associateCpdLevel, String associateCpdStage, String associateAcademy,
                  String associate6MonthUplift, String associate12MonthUplift, String associate18MonthUplift,
                  int associateGreenlineRating, String associateLeaverReason, Candidate candidate) {
        this.bambooId = bambooId;
        this.associateDob = associateDob;
        this.associateNationality = associateNationality;
        this.associatePortfolio = associatePortfolio;
        this.associateDivision = associateDivision;
        this.associateDepartment = associateDepartment;
        this.associateJobTitle = associateJobTitle;
        this.associateLineManager = associateLineManager;
        this.associateCpdLevel = associateCpdLevel;
        this.associateCpdStage = associateCpdStage;
        this.associateAcademy = associateAcademy;
        this.associate6MonthUplift = associate6MonthUplift;
        this.associate12MonthUplift = associate12MonthUplift;
        this.associate18MonthUplift = associate18MonthUplift;
        this.associateGreenlineRating = associateGreenlineRating;
        this.associateLeaverReason = associateLeaverReason;
        this.candidate = candidate;
    }

    public Bamboo() {
    }

    public Bamboo getBambooFromCandidate(Candidate candidate) {
        for(Bamboo bamboo : PrepareDatabase.bambooList) {
            if(bamboo.getCandidate() == candidate) {
                return bamboo;
            }
        }
        return null;
    }

    public int getBambooId() {
        return bambooId;
    }

    public void setBambooId(int bambooId) {
        this.bambooId = bambooId;
    }

    public String getAssociateDob() {
        return associateDob;
    }

    public void setAssociateDob(String associateDob) {
        this.associateDob = associateDob;
    }

    public String getAssociateNationality() {
        return associateNationality;
    }

    public void setAssociateNationality(String associateNationality) {
        this.associateNationality = associateNationality;
    }

    public String getAssociatePortfolio() {
        return associatePortfolio;
    }

    public void setAssociatePortfolio(String associatePortfolio) {
        this.associatePortfolio = associatePortfolio;
    }

    public String getAssociateDivision() {
        return associateDivision;
    }

    public void setAssociateDivision(String associateDivision) {
        this.associateDivision = associateDivision;
    }

    public String getAssociateDepartment() {
        return associateDepartment;
    }

    public void setAssociateDepartment(String associateDepartment) {
        this.associateDepartment = associateDepartment;
    }

    public String getAssociateJobTitle() {
        return associateJobTitle;
    }

    public void setAssociateJobTitle(String associateJobTitle) {
        this.associateJobTitle = associateJobTitle;
    }

    public String getAssociateLineManager() {
        return associateLineManager;
    }

    public void setAssociateLineManager(String associateLineManager) {
        this.associateLineManager = associateLineManager;
    }

    public int getAssociateCpdLevel() {
        return associateCpdLevel;
    }

    public void setAssociateCpdLevel(int associateCpdLevel) {
        this.associateCpdLevel = associateCpdLevel;
    }

    public String getAssociateCpdStage() {
        return associateCpdStage;
    }

    public void setAssociateCpdStage(String associateCpdStage) {
        this.associateCpdStage = associateCpdStage;
    }

    public String getAssociateAcademy() {
        return associateAcademy;
    }

    public void setAssociateAcademy(String associateAcademy) {
        this.associateAcademy = associateAcademy;
    }

    public String getAssociate6MonthUplift() {
        return associate6MonthUplift;
    }

    public void setAssociate6MonthUplift(String associate6MonthUplift) {
        this.associate6MonthUplift = associate6MonthUplift;
    }

    public String getAssociate12MonthUplift() {
        return associate12MonthUplift;
    }

    public void setAssociate12MonthUplift(String associate12MonthUplift) {
        this.associate12MonthUplift = associate12MonthUplift;
    }

    public String getAssociate18MonthUplift() {
        return associate18MonthUplift;
    }

    public void setAssociate18MonthUplift(String associate18MonthUplift) {
        this.associate18MonthUplift = associate18MonthUplift;
    }

    public int getAssociateGreenlineRating() {
        return associateGreenlineRating;
    }

    public void setAssociateGreenlineRating(int associateGreenlineRating) {
        this.associateGreenlineRating = associateGreenlineRating;
    }

    public String getAssociateLeaverReason() {
        return associateLeaverReason;
    }

    public void setAssociateLeaverReason(String associateLeaverReason) {
        this.associateLeaverReason = associateLeaverReason;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Bamboo{" +
                "bambooId=" + bambooId +
                ", associateDob='" + associateDob + '\'' +
                ", associateNationality='" + associateNationality + '\'' +
                ", associatePortfolio='" + associatePortfolio + '\'' +
                ", associateDivision='" + associateDivision + '\'' +
                ", associateDepartment='" + associateDepartment + '\'' +
                ", associateJobTitle='" + associateJobTitle + '\'' +
                ", associateLineManager='" + associateLineManager + '\'' +
                ", associateCpdLevel=" + associateCpdLevel +
                ", associateCpdStage='" + associateCpdStage + '\'' +
                ", associateAcademy='" + associateAcademy + '\'' +
                ", associate6MonthUplift='" + associate6MonthUplift + '\'' +
                ", associate12MonthUplift='" + associate12MonthUplift + '\'' +
                ", associate18MonthUplift='" + associate18MonthUplift + '\'' +
                ", associateGreenlineRating=" + associateGreenlineRating +
                ", associateLeaverReason='" + associateLeaverReason + '\'' +
                ", candidate=" + candidate +
                '}';
    }
}


