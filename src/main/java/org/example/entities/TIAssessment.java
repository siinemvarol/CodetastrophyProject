package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "ti_assessments")
public class TIAssessment {
    @Id
    @Column(name = "ti_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tiId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @Column(name = "candidate_gia")
    private int candidateGia;

    @Column(name = "candidate_ppa")
    private String candidatePpa;

    public TIAssessment(int tiId, int candidateGia, String candidatePpa, Candidate candidate) {
        this.tiId = tiId;
        this.candidateGia = candidateGia;
        this.candidatePpa = candidatePpa;
        this.candidate = candidate;
    }

    public TIAssessment() {
    }

    public int getTiId() {
        return tiId;
    }

    public void setTiId(int tiId) {
        this.tiId = tiId;
    }

    public int getCandidateGia() {
        return candidateGia;
    }

    public void setCandidateGia(int candidateGia) {
        this.candidateGia = candidateGia;
    }

    public String getCandidatePpa() {
        return candidatePpa;
    }

    public void setCandidatePpa(String candidatePpa) {
        this.candidatePpa = candidatePpa;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "TIAssessment{" +
                "tiId=" + tiId +
                ", candidateGia=" + candidateGia +
                ", candidatePpa='" + candidatePpa + '\'' +
                ", candidate=" + candidate +
                '}';
    }
}
