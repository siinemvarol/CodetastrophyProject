package org.example.entities;
import javax.persistence.*;

@Entity
@Table(name = "timesheets")
public class Timesheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="atlas_id")
    private int atlasId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bamboo_id")
    private Bamboo bamboo;

    @Column(name="chargeability_jan2023")
    private int chargeabilityJan2023;

    @Column(name="chargeability_feb2023")
    private int chargeabilityFeb2023;

    @Column(name="chargeability_mar2023")
    private int chargeabilityMar2023;

    @Column(name="chargeability_apr2023")
    private int chargeabilityApr2023;

    @Column(name="chargeability_may2023")
    private int chargeabilityMay2023;

    @Column(name="chargeability_jun2023")
    private int chargeabilityJun2023;

    @Column(name="chargeability_jul2023")
    private int chargeabilityJul2023;

    @Column(name="chargeability_aug2023")
    private int chargeabilityAug2023;

    @Column(name="chargeability_sep2023")
    private int chargeabilitySep2023;

    @Column(name="chargeability_oct2023")
    private int chargeabilityOct2023;

    @Column(name="chargeability_nov2023")
    private int chargeabilityNov2023;

    @Column(name="chargeability_dec2023")
    private int chargeabilityDec2023;

    @Column(name="chargeability_jan2024")
    private int chargeabilityJan2024;

    @Column(name="chargeability_feb2024")
    private int chargeabilityFeb2024;

    @Column(name="chargeability_mar2024")
    private int chargeabilityMar2024;

    @Column(name="chargeability_apr2024")
    private int chargeabilityApr2024;

    @Column(name="chargeability_may2024")
    private int chargeabilityMay2024;

    @Column(name="chargeability_jun2024")
    private int chargeabilityJun2024;

    @Column(name="chargeability_jul2024")
    private int chargeabilityJul2024;

    @Column(name="chargeability_aug2024")
    private int chargeabilityAug2024;

    @Column(name="chargeability_sep2024")
    private int chargeabilitySep2024;

    @Column(name="chargeability_oct2024")
    private int chargeabilityOct2024;

    public Timesheet(int atlasId, Bamboo bamboo, int chargeabilityJan2023, int chargeabilityFeb2023,
                     int chargeabilityMar2023, int chargeabilityApr2023, int chargeabilityMay2023,
                     int chargeabilityJun2023, int chargeabilityJul2023, int chargeabilityAug2023,
                     int chargeabilitySep2023, int chargeabilityOct2023, int chargeabilityNov2023,
                     int chargeabilityDec2023, int chargeabilityJan2024, int chargeabilityFeb2024,
                     int chargeabilityMar2024, int chargeabilityApr2024, int chargeabilityMay2024,
                     int chargeabilityJun2024, int chargeabilityJul2024, int chargeabilityAug2024,
                     int chargeabilitySep2024, int chargeabilityOct2024) {
        this.atlasId = atlasId;
        this.bamboo = bamboo;
        this.chargeabilityJan2023 = chargeabilityJan2023;
        this.chargeabilityFeb2023 = chargeabilityFeb2023;
        this.chargeabilityMar2023 = chargeabilityMar2023;
        this.chargeabilityApr2023 = chargeabilityApr2023;
        this.chargeabilityMay2023 = chargeabilityMay2023;
        this.chargeabilityJun2023 = chargeabilityJun2023;
        this.chargeabilityJul2023 = chargeabilityJul2023;
        this.chargeabilityAug2023 = chargeabilityAug2023;
        this.chargeabilitySep2023 = chargeabilitySep2023;
        this.chargeabilityOct2023 = chargeabilityOct2023;
        this.chargeabilityNov2023 = chargeabilityNov2023;
        this.chargeabilityDec2023 = chargeabilityDec2023;
        this.chargeabilityJan2024 = chargeabilityJan2024;
        this.chargeabilityFeb2024 = chargeabilityFeb2024;
        this.chargeabilityMar2024 = chargeabilityMar2024;
        this.chargeabilityApr2024 = chargeabilityApr2024;
        this.chargeabilityMay2024 = chargeabilityMay2024;
        this.chargeabilityJun2024 = chargeabilityJun2024;
        this.chargeabilityJul2024 = chargeabilityJul2024;
        this.chargeabilityAug2024 = chargeabilityAug2024;
        this.chargeabilitySep2024 = chargeabilitySep2024;
        this.chargeabilityOct2024 = chargeabilityOct2024;
    }

    public Timesheet() {
    }

    public int getAtlasId() {
        return atlasId;
    }

    public void setAtlasId(int atlasId) {
        this.atlasId = atlasId;
    }

    public Bamboo getBamboo() {
        return bamboo;
    }

    public void setBamboo(Bamboo bamboo) {
        this.bamboo = bamboo;
    }

    public int getChargeabilityJan2023() {
        return chargeabilityJan2023;
    }

    public void setChargeabilityJan2023(int chargeabilityJan2023) {
        this.chargeabilityJan2023 = chargeabilityJan2023;
    }

    public int getChargeabilityFeb2023() {
        return chargeabilityFeb2023;
    }

    public void setChargeabilityFeb2023(int chargeabilityFeb2023) {
        this.chargeabilityFeb2023 = chargeabilityFeb2023;
    }

    public int getChargeabilityMar2023() {
        return chargeabilityMar2023;
    }

    public void setChargeabilityMar2023(int chargeabilityMar2023) {
        this.chargeabilityMar2023 = chargeabilityMar2023;
    }

    public int getChargeabilityApr2023() {
        return chargeabilityApr2023;
    }

    public void setChargeabilityApr2023(int chargeabilityApr2023) {
        this.chargeabilityApr2023 = chargeabilityApr2023;
    }

    public int getChargeabilityMay2023() {
        return chargeabilityMay2023;
    }

    public void setChargeabilityMay2023(int chargeabilityMay2023) {
        this.chargeabilityMay2023 = chargeabilityMay2023;
    }

    public int getChargeabilityJun2023() {
        return chargeabilityJun2023;
    }

    public void setChargeabilityJun2023(int chargeabilityJun2023) {
        this.chargeabilityJun2023 = chargeabilityJun2023;
    }

    public int getChargeabilityJul2023() {
        return chargeabilityJul2023;
    }

    public void setChargeabilityJul2023(int chargeabilityJul2023) {
        this.chargeabilityJul2023 = chargeabilityJul2023;
    }

    public int getChargeabilityAug2023() {
        return chargeabilityAug2023;
    }

    public void setChargeabilityAug2023(int chargeabilityAug2023) {
        this.chargeabilityAug2023 = chargeabilityAug2023;
    }

    public int getChargeabilitySep2023() {
        return chargeabilitySep2023;
    }

    public void setChargeabilitySep2023(int chargeabilitySep2023) {
        this.chargeabilitySep2023 = chargeabilitySep2023;
    }

    public int getChargeabilityOct2023() {
        return chargeabilityOct2023;
    }

    public void setChargeabilityOct2023(int chargeabilityOct2023) {
        this.chargeabilityOct2023 = chargeabilityOct2023;
    }

    public int getChargeabilityNov2023() {
        return chargeabilityNov2023;
    }

    public void setChargeabilityNov2023(int chargeabilityNov2023) {
        this.chargeabilityNov2023 = chargeabilityNov2023;
    }

    public int getChargeabilityDec2023() {
        return chargeabilityDec2023;
    }

    public void setChargeabilityDec2023(int chargeabilityDec2023) {
        this.chargeabilityDec2023 = chargeabilityDec2023;
    }

    public int getChargeabilityJan2024() {
        return chargeabilityJan2024;
    }

    public void setChargeabilityJan2024(int chargeabilityJan2024) {
        this.chargeabilityJan2024 = chargeabilityJan2024;
    }

    public int getChargeabilityFeb2024() {
        return chargeabilityFeb2024;
    }

    public void setChargeabilityFeb2024(int chargeabilityFeb2024) {
        this.chargeabilityFeb2024 = chargeabilityFeb2024;
    }

    public int getChargeabilityMar2024() {
        return chargeabilityMar2024;
    }

    public void setChargeabilityMar2024(int chargeabilityMar2024) {
        this.chargeabilityMar2024 = chargeabilityMar2024;
    }

    public int getChargeabilityApr2024() {
        return chargeabilityApr2024;
    }

    public void setChargeabilityApr2024(int chargeabilityApr2024) {
        this.chargeabilityApr2024 = chargeabilityApr2024;
    }

    public int getChargeabilityMay2024() {
        return chargeabilityMay2024;
    }

    public void setChargeabilityMay2024(int chargeabilityMay2024) {
        this.chargeabilityMay2024 = chargeabilityMay2024;
    }

    public int getChargeabilityJun2024() {
        return chargeabilityJun2024;
    }

    public void setChargeabilityJun2024(int chargeabilityJun2024) {
        this.chargeabilityJun2024 = chargeabilityJun2024;
    }

    public int getChargeabilityJul2024() {
        return chargeabilityJul2024;
    }

    public void setChargeabilityJul2024(int chargeabilityJul2024) {
        this.chargeabilityJul2024 = chargeabilityJul2024;
    }

    public int getChargeabilityAug2024() {
        return chargeabilityAug2024;
    }

    public void setChargeabilityAug2024(int chargeabilityAug2024) {
        this.chargeabilityAug2024 = chargeabilityAug2024;
    }

    public int getChargeabilitySep2024() {
        return chargeabilitySep2024;
    }

    public void setChargeabilitySep2024(int chargeabilitySep2024) {
        this.chargeabilitySep2024 = chargeabilitySep2024;
    }

    public int getChargeabilityOct2024() {
        return chargeabilityOct2024;
    }

    public void setChargeabilityOct2024(int chargeabilityOct2024) {
        this.chargeabilityOct2024 = chargeabilityOct2024;
    }

    @Override
    public String toString() {
        return "Timesheet{" +
                "atlasId=" + atlasId +
                ", bamboo=" + bamboo +
                ", chargeabilityJan2023=" + chargeabilityJan2023 +
                ", chargeabilityFeb2023=" + chargeabilityFeb2023 +
                ", chargeabilityMar2023=" + chargeabilityMar2023 +
                ", chargeabilityApr2023=" + chargeabilityApr2023 +
                ", chargeabilityMay2023=" + chargeabilityMay2023 +
                ", chargeabilityJun2023=" + chargeabilityJun2023 +
                ", chargeabilityJul2023=" + chargeabilityJul2023 +
                ", chargeabilityAug2023=" + chargeabilityAug2023 +
                ", chargeabilitySep2023=" + chargeabilitySep2023 +
                ", chargeabilityOct2023=" + chargeabilityOct2023 +
                ", chargeabilityNov2023=" + chargeabilityNov2023 +
                ", chargeabilityDec2023=" + chargeabilityDec2023 +
                ", chargeabilityJan2024=" + chargeabilityJan2024 +
                ", chargeabilityFeb2024=" + chargeabilityFeb2024 +
                ", chargeabilityMar2024=" + chargeabilityMar2024 +
                ", chargeabilityApr2024=" + chargeabilityApr2024 +
                ", chargeabilityMay2024=" + chargeabilityMay2024 +
                ", chargeabilityJun2024=" + chargeabilityJun2024 +
                ", chargeabilityJul2024=" + chargeabilityJul2024 +
                ", chargeabilityAug2024=" + chargeabilityAug2024 +
                ", chargeabilitySep2024=" + chargeabilitySep2024 +
                ", chargeabilityOct2024=" + chargeabilityOct2024 +
                '}';
    }
}
