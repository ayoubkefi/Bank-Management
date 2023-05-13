package tn.esprit.gnbapp.services;

import tn.esprit.gnbapp.entities.project;

import javax.mail.MessagingException;
import java.util.List;



public interface ProjectServices {
    project add(project project);

    project edit(project project);



    project selectById(int ProjectId);

    void deleteById(int ProjectId);

    void delete(project project);

    List<project> addAll(List<project> list);

    void deleteAll(List<project> list);

    List<project> retrieveAllProject();
    public void sendmail(String toEmail, String subject, String htmlBody) throws MessagingException ;

    }