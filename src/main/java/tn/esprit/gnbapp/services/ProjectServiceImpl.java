package tn.esprit.gnbapp.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import tn.esprit.gnbapp.entities.project;
import tn.esprit.gnbapp.repositories.ProjectRepository;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;

@AllArgsConstructor
@Service
public class ProjectServiceImpl implements ProjectServices {
    private ProjectRepository projectRepository;
    @Autowired
    private JavaMailSender mailSender;
    @Override
    public project add(project p) {
        return projectRepository.save(p);
    }
    @Override

    public project edit(project p) {
        return projectRepository.save(p);
    }


    @Override
    public project selectById(int Id) {
        return projectRepository.findById(Id).get();
    }

    @Override
    public void deleteById(int Id) {
        projectRepository.deleteById(Id);
    }

    @Override
    public void delete(project p) {

        projectRepository.delete(p);
    }

    @Override
    public List<project> addAll(List<project> list) {
        List<project> savedProjects = projectRepository.saveAll(list);
        return savedProjects;


    }

    @Override
    public void deleteAll(List<project> list) {
        projectRepository.deleteAll(list);
    }

    @Override
    public List<project> retrieveAllProject() {
        return projectRepository.findAll();
    }


    @Override
    public void sendmail(String toEmail, String subject, String htmlBody) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHealper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHealper.setFrom("sara.wahada@esprit.tn");
        mimeMessageHealper.setTo(toEmail);
        mimeMessageHealper.setText(htmlBody,true);
        mimeMessageHealper.setSubject(subject);
        mailSender.send(mimeMessage);
        System.out.println("Mail sent successfully!");

    }


}