package org.example.utils;

import org.example.entities.JobRole;

import java.util.ArrayList;

public class CreateJobRoleObject {

    private static ReadFile readFile = new ReadFile();

    public ArrayList<JobRole> createJobRoleObjects(String fileName) {
        ArrayList<JobRole> jobRoleList = new ArrayList<>();

        for (int i = 1; i <= 35; i++) {
            JobRole newJobRole = new JobRole();
            for (int j = 1; j <= 10; j++) {
                switch (j) {
                    case 1:
                        newJobRole.setJobRoleName(readFile.readStringCellData(fileName, i, j));
                        break;
                    case 2:
                        newJobRole.setNumberOfApplications(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 3:
                        newJobRole.setNumberOfInterviews(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 4:
                        newJobRole.setNumberOfRejected(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 5:
                        newJobRole.setSourceOfApplicationPaid(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 6:
                        newJobRole.setSourceOfApplicationCrm(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 7:
                        newJobRole.setSourceOfApplicationReferral(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 8:
                        newJobRole.setSourceOfApplicationOrganic(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 9:
                        newJobRole.setSourceOfApplicationAgency(readFile.readNumericCellData(fileName, i, j));
                        break;
                    case 10:
                        newJobRole.setSourceOfApplicationOther(readFile.readNumericCellData(fileName, i, j));
                        break;
                }
            }
            jobRoleList.add(newJobRole);
        }
        return jobRoleList;
    }
}
