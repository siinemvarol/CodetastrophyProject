package org.example.utils;

import org.example.entities.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class PrepareDatabase {

    public static List<Candidate> candidateList = new ArrayList<>();
    public static List<Bamboo> bambooList = new ArrayList<>();

    public void postAllObjectsToDb() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("v1PersistentUnit");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        CreateJobRoleObject createJobRole = new CreateJobRoleObject();
        ArrayList<JobRole> jobRoles = createJobRole.createJobRoleObjects("job_role.xlsx");
        for (JobRole role : jobRoles) {
            System.out.println(role);
            manager.persist(role);
        }

        CreateCandidate createCandidate = new CreateCandidate();
        ArrayList<Candidate> candidates = createCandidate.createCandidateObjects("candidate.xlsx");
        for(Candidate cand : candidates) {
            System.out.println(cand);
            manager.persist(cand);
        }

        Query query1 = manager.createNativeQuery("SELECT * FROM candidates", Candidate.class);
        candidateList = (List<Candidate>) query1.getResultList();

        CreateTIAssessment createTIAssessment = new CreateTIAssessment();
        ArrayList<TIAssessment> tiAssessments = createTIAssessment.createTIAssessmentObjects("ti_assessment.xlsx");
        for(TIAssessment assessment : tiAssessments) {
            System.out.println(assessment);
            manager.persist(assessment);
        }

        CreateBamboo createBamboo = new CreateBamboo();
        ArrayList<Bamboo> bamboos = createBamboo.createBambooObjects("bamboo.xlsx");
        for(Bamboo bamboo : bamboos) {
            System.out.println(bamboo);
            manager.persist(bamboo);
        }

        Query query2 = manager.createNativeQuery("SELECT * FROM bamboos", Bamboo.class);
        bambooList = (List<Bamboo>) query2.getResultList();

        CreateTimesheet createTimesheet = new CreateTimesheet();
        ArrayList<Timesheet> timesheets = createTimesheet.createTimesheetObjects("timesheet.xlsx");
        for(Timesheet timesheet : timesheets) {
            System.out.println(timesheet);
            manager.persist(timesheet);
        }

        transaction.commit();
        manager.close();
        factory.close();
    }
}
