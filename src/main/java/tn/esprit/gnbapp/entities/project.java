package tn.esprit.gnbapp.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String estimated_time;
    private float investable_amout;
    private int numberInv;
    private Double shareInv;

    private String image;

    @ManyToMany
    private Set<user> users;


}
