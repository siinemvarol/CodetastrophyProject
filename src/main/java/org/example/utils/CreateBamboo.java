package org.example.utils;

import org.example.entities.Bamboo;
import org.example.entities.Candidate;

import java.util.ArrayList;

public class CreateBamboo {

    private static ReadFile readFile = new ReadFile();

    public ArrayList<Bamboo> createBambooObjects(String fileName) {
        ArrayList<Bamboo> bambooList = new ArrayList<>();
        Candidate candidate = new Candidate();

        for (int i = 1; i <= 303; i++) {
            Bamboo newBamboo = new Bamboo();
            for (int j = 1; j <= 18; j++) {
                switch (j) {
                    case 1:
                        candidate = candidate.getCandidateFromName(readFile.readStringCellData(fileName,i,j));
                        newBamboo.setCandidate(candidate);
                        break;
                    case 4:
                        newBamboo.setAssociateDob(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 5:
                        newBamboo.setAssociateNationality(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 6:
                        newBamboo.setAssociatePortfolio(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 7:
                        newBamboo.setAssociateDivision(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 8:
                        newBamboo.setAssociateDepartment(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 9:
                        newBamboo.setAssociateJobTitle(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 10:
                        newBamboo.setAssociateLineManager(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 11:
                        newBamboo.setAssociateCpdLevel(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 12:
                        newBamboo.setAssociateCpdStage(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 13:
                        newBamboo.setAssociateAcademy(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 14:
                        newBamboo.setAssociate6MonthUplift(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 15:
                        newBamboo.setAssociate12MonthUplift(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 16:
                        newBamboo.setAssociate18MonthUplift(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 17:
                        newBamboo.setAssociateGreenlineRating(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 18:
                        newBamboo.setAssociateLeaverReason(readFile.readStringCellData(fileName, i, j));
                        break;
                }
            }
            bambooList.add(newBamboo);
        }
        return bambooList;
    }
}
