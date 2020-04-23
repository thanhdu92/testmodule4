package com.codegym.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long cityID;

    private String cityName;

    @ManyToOne
    @JoinColumn(name = "book_nation")
    private Nation nation;

    private Long area;

    private Long population;

    private Long GDP;

    private String description;

    public City() {
    }

    public Long getCityID() {
        return cityID;
    }

    public void setCityID(Long cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getGDP() {
        return GDP;
    }

    public void setGDP(Long GDP) {
        this.GDP = GDP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
