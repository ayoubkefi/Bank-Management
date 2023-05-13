package tn.esprit.gnbapp.entities;


import java.io.Serializable;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class transaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_trans;
    private String type_trans;
    private LocalDate date_trans;
    private String RibRecipient;
    private String RibEmetteur;
    private float amount;

    @Enumerated(EnumType.STRING)
    private typeTrans typetrans ;
    @ManyToOne
    private account account;

    public int getId_trans() {
        return id_trans;
    }

    public void setId_trans(int id_trans) {
        this.id_trans = id_trans;
    }

    public String getType_trans() {
        return type_trans;
    }

    public void setType_trans(String type_trans) {
        this.type_trans = type_trans;
    }

    public LocalDate getDate_trans() {
        return date_trans;
    }

    public void setDate_trans(LocalDate date_trans) {
        this.date_trans = date_trans;
    }

    public String getRibRecipient() {
        return RibRecipient;
    }

    public void setRibRecipient(String ribRecipient) {
        RibRecipient = ribRecipient;
    }

    public String getRibEmetteur() {
        return RibEmetteur;
    }

    public void setRibEmetteur(String ribEmetteur) {
        RibEmetteur = ribEmetteur;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public typeTrans getTypetrans() {
        return typetrans;
    }

    public void setTypetrans(typeTrans typetrans) {
        this.typetrans = typetrans;
    }

    public tn.esprit.gnbapp.entities.account getAccount() {
        return account;
    }

    public void setAccount(tn.esprit.gnbapp.entities.account account) {
        this.account = account;
    }


}
