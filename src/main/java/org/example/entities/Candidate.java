package org.example.entities;

import org.example.utils.PrepareDatabase;

import javax.persistence.*;

@Entity
@Table(name = "candidates")
public class Candidate {
    @Id
    @Column(name = "candidate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidateId;

    @Column(name = "candidate_name")
    private String candidateName;

    @Column(name = "candidate_location")
    private String candidateLocation;

    @Column(name = "candidate_college")
    private String candidateCollege;

    @Column(name = "candidate_degree")
    private String candidateDegree;

    @Column(name = "candidate_grade")
    private String candidateGrade;

    @Column(name = "candidate_gender")
    private String candidateGender;

    @Column(name = "candidate_visa")
    private String candidateVisa;

    @Column(name = "candidate_profile")
    private String candidateProfile;

    @Column(name = "candidate_panel_score")
    private int candidateIntPanelScore;

    @Column(name = "candidate_rejection_reason")
    private String candidateRejectionReason;

    public Candidate() {
    }

    public Candidate(int candidateId, String candidateName, String candidateLocation, String candidateCollege,
                     String candidateDegree, String candidateGrade, String candidateGender, String candidateVisa,
                     String candidateProfile, int candidateIntPanelScore, String candidateRejectionReason) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.candidateLocation = candidateLocation;
        this.candidateCollege = candidateCollege;
        this.candidateDegree = candidateDegree;
        this.candidateGrade = candidateGrade;
        this.candidateGender = candidateGender;
        this.candidateVisa = candidateVisa;
        this.candidateProfile = candidateProfile;
        this.candidateIntPanelScore = candidateIntPanelScore;
        this.candidateRejectionReason = candidateRejectionReason;
    }

    public Candidate getCandidateFromName(String name) {
        for(Candidate cand : PrepareDatabase.candidateList) {
            if(cand.getCandidateName().equals(name)) {
                return cand;
            }
        }
      return null;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateLocation() {
        return candidateLocation;
    }

    public void setCandidateLocation(String candidateLocation) {
        this.candidateLocation = candidateLocation;
    }

    public String getCandidateCollege() {
        return candidateCollege;
    }

    public void setCandidateCollege(String candidateCollege) {
        this.candidateCollege = candidateCollege;
    }

    public String getCandidateDegree() {
        return candidateDegree;
    }

    public void setCandidateDegree(String candidateDegree) {
        this.candidateDegree = candidateDegree;
    }

    public String getCandidateGrade() {
        return candidateGrade;
    }

    public void setCandidateGrade(String candidateGrade) {
        this.candidateGrade = candidateGrade;
    }

    public String getCandidateGender() {
        return candidateGender;
    }

    public void setCandidateGender(String candidateGender) {
        this.candidateGender = candidateGender;
    }

    public String getCandidateVisa() {
        return candidateVisa;
    }

    public void setCandidateVisa(String candidateVisa) {
        this.candidateVisa = candidateVisa;
    }

    public String getCandidateProfile() {
        return candidateProfile;
    }

    public void setCandidateProfile(String candidateProfile) {
        this.candidateProfile = candidateProfile;
    }

    public int getCandidateIntPanelScore() {
        return candidateIntPanelScore;
    }

    public void setCandidateIntPanelScore(int candidateIntPanelScore) {
        this.candidateIntPanelScore = candidateIntPanelScore;
    }

    public String getCandidateRejectionReason() {
        return candidateRejectionReason;
    }

    public void setCandidateRejectionReason(String candidateRejectionReason) {
        this.candidateRejectionReason = candidateRejectionReason;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId=" + candidateId +
                ", candidateName='" + candidateName + '\'' +
                ", candidateLocation='" + candidateLocation + '\'' +
                ", candidateCollege='" + candidateCollege + '\'' +
                ", candidateDegree='" + candidateDegree + '\'' +
                ", candidateGrade='" + candidateGrade + '\'' +
                ", candidateGender='" + candidateGender + '\'' +
                ", candidateVisa='" + candidateVisa + '\'' +
                ", candidateProfile='" + candidateProfile + '\'' +
                ", candidateIntPanelScore=" + candidateIntPanelScore +
                ", candidateRejectionReason='" + candidateRejectionReason + '\'' +
                '}';
    }
}
