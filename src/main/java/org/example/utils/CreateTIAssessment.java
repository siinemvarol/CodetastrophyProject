package org.example.utils;

import org.example.entities.Candidate;
import org.example.entities.TIAssessment;

import java.util.ArrayList;

public class CreateTIAssessment {

    private static ReadFile readFile = new ReadFile();

    public ArrayList<TIAssessment> createTIAssessmentObjects(String fileName) {
        ArrayList<TIAssessment> tiAssessmentList = new ArrayList<>();

        for (int i = 1; i <= 353; i++) {
            TIAssessment newTIAssessment = new TIAssessment();
            Candidate candidate = new Candidate();
            for (int j = 1; j <= 3; j++) {
                switch (j) {
                    case 1:
                        candidate = candidate.getCandidateFromName(readFile.readStringCellData(fileName,i,j));
                        newTIAssessment.setCandidate(candidate);
                        break;
                    case 2:
                        newTIAssessment.setCandidateGia(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 3:
                        newTIAssessment.setCandidatePpa(readFile.readStringCellData(fileName, i, j));
                        break;
                }
            }
            tiAssessmentList.add(newTIAssessment);
        }
        return tiAssessmentList;
    }
}
