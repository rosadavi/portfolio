package com.rosadavi.portfolio_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String topic1;

    private String topic2;

    @Column(unique = true)
    private String title;

    private String description;

    @OneToMany(mappedBy = "project")
    private List<Stack> stacks;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
