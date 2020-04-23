package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "nations")
public class Nation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long nationID;

    private String nationName;

    @OneToMany(targetEntity = City.class)
    private List<City> cities;

    public Nation() {
    }

    public Long getNationID() {
        return nationID;
    }

    public void setNationID(Long nationID) {
        this.nationID = nationID;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
