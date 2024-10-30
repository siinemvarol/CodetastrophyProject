package org.example.utils;

import org.example.entities.Candidate;

import java.util.ArrayList;

public class CreateCandidate {

    private static ReadFile readFile = new ReadFile();

    public ArrayList<Candidate> createCandidateObjects(String fileName) {
        ArrayList<Candidate> candidateList = new ArrayList<>();

        for (int i = 1; i <= 353; i++) {
            Candidate newCandidate = new Candidate();
            for (int j = 1; j <= 10; j++) {
                switch (j) {
                    case 1:
                        newCandidate.setCandidateName(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 2:
                        newCandidate.setCandidateLocation(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 3:
                        newCandidate.setCandidateCollege(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 4:
                        newCandidate.setCandidateDegree(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 5:
                        newCandidate.setCandidateGrade(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 6:
                        newCandidate.setCandidateGender(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 7:
                        newCandidate.setCandidateVisa(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 8:
                        newCandidate.setCandidateProfile(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 9:
                        newCandidate.setCandidateIntPanelScore(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 10:
                        newCandidate.setCandidateRejectionReason(readFile.readStringCellData(fileName, i, j));
                        break;
                }
            }
            candidateList.add(newCandidate);
        }
        return candidateList;
    }
}
