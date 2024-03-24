package com.klimov.domain;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "country", schema = "world")
public class Country {
    @Id
    private Integer id;
    @Column(length = 3)
    private String code;
    @Column(name = "code_2",length = 2)
    private String alternativeCode;
    @Column(length = 52)
    private String name;
    @Enumerated(EnumType.ORDINAL)
    private Continent continent;
    private String region;
    @Column(name = "surface_area")
    private BigDecimal surfaceArea;
    @Column(name = "indep_year")
    private Short independenceYear;
    private Integer population;
    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;
    private BigDecimal gnp;
    @Column(name = "gnpo_id")
    private BigDecimal gnpoId;
    @Column(name = "local_name")
    private String localName;
    @Column(name = "government_form")
    private String governmentForm;
    @Column(name = "head_of_state")
    private String headOfState;
    @OneToOne
    @JoinColumn(name = "capital")
    private City city;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    Set<CountryLanguage> countryLanguages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAlternativeCode() {
        return alternativeCode;
    }

    public void setAlternativeCode(String alternativeCode) {
        this.alternativeCode = alternativeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(BigDecimal surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Short getIndependenceYear() {
        return independenceYear;
    }

    public void setIndependenceYear(Short independenceYear) {
        this.independenceYear = independenceYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(BigDecimal lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    public BigDecimal getGnpoId() {
        return gnpoId;
    }

    public void setGnpoId(BigDecimal gnpoId) {
        this.gnpoId = gnpoId;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<CountryLanguage> getCountryLanguages() {
        return countryLanguages;
    }

    public void setCountryLanguages(Set<CountryLanguage> countryLanguages) {
        this.countryLanguages = countryLanguages;
    }
}
