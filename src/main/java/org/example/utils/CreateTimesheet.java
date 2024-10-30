package org.example.utils;

import org.example.entities.Bamboo;
import org.example.entities.Candidate;
import org.example.entities.Timesheet;

import java.util.ArrayList;

public class CreateTimesheet {

    private static ReadFile readFile = new ReadFile();

    public ArrayList<Timesheet> createTimesheetObjects(String fileName) {
        ArrayList<Timesheet> timesheetList = new ArrayList<>();
        Candidate candidate = new Candidate();
        Bamboo bamboo = new Bamboo();

        for (int i = 1; i <= 303; i++) {
            Timesheet newTimesheet = new Timesheet();
            for (int j = 1; j <= 23; j++) {
                switch (j) {
                    case 1:
                        candidate = candidate.getCandidateFromName(readFile.readStringCellData(fileName,i,j));
                        bamboo = bamboo.getBambooFromCandidate(candidate);
                        newTimesheet.setBamboo(bamboo);
                        break;
                    case 2:
                        newTimesheet.setChargeabilityJan2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 3:
                        newTimesheet.setChargeabilityFeb2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 4:
                        newTimesheet.setChargeabilityMar2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 5:
                        newTimesheet.setChargeabilityApr2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 6:
                        newTimesheet.setChargeabilityMay2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 7:
                        newTimesheet.setChargeabilityJun2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 8:
                        newTimesheet.setChargeabilityJul2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 9:
                        newTimesheet.setChargeabilityAug2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 10:
                        newTimesheet.setChargeabilitySep2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 11:
                        newTimesheet.setChargeabilityOct2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 12:
                        newTimesheet.setChargeabilityNov2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 13:
                        newTimesheet.setChargeabilityDec2023(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 14:
                        newTimesheet.setChargeabilityJan2024(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 15:
                        newTimesheet.setChargeabilityFeb2024(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 16:
                        newTimesheet.setChargeabilityMar2024(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 17:
                        newTimesheet.setChargeabilityApr2024(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 18:
                        newTimesheet.setChargeabilityMay2024(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 19:
                        newTimesheet.setChargeabilityJun2024(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 20:
                        newTimesheet.setChargeabilityJul2024(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 21:
                        newTimesheet.setChargeabilityAug2024(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 22:
                        newTimesheet.setChargeabilitySep2024(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 23:
                        newTimesheet.setChargeabilityOct2024(readFile.readNumericCellData(fileName, i, j));
                        break;
                }
            }
            timesheetList.add(newTimesheet);
        }
        return timesheetList;
    }
}
