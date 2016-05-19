package model;
// Generated 11-may-2016 12:59:30 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Country generated by hbm2java
 */
@JsonIgnoreProperties(value = {"countryLanguages", "cities"})
public class Country  implements java.io.Serializable {


     private String code;
     private String name;
     private String continent;
     private String region;
     private String localName;
     private Integer capital;
     private String code2;
     private Set countryLanguages = new HashSet(0);
     private Set cities = new HashSet(0);

    public Country() {
    }

	
    public Country(String code, String name, String continent, String region, String localName, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.localName = localName;
        this.code2 = code2;
    }
    public Country(String code, String name, String continent, String region, String localName, Integer capital, String code2, Set countryLanguages, Set cities) {
       this.code = code;
       this.name = name;
       this.continent = continent;
       this.region = region;
       this.localName = localName;
       this.capital = capital;
       this.code2 = code2;
       this.countryLanguages = countryLanguages;
       this.cities = cities;
    }
   
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getContinent() {
        return this.continent;
    }
    
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    public String getLocalName() {
        return this.localName;
    }
    
    public void setLocalName(String localName) {
        this.localName = localName;
    }
    public Integer getCapital() {
        return this.capital;
    }
    
    public void setCapital(Integer capital) {
        this.capital = capital;
    }
    public String getCode2() {
        return this.code2;
    }
    
    public void setCode2(String code2) {
        this.code2 = code2;
    }
    public Set getCountryLanguages() {
        return this.countryLanguages;
    }
    
    public void setCountryLanguages(Set countryLanguages) {
        this.countryLanguages = countryLanguages;
    }
    public Set getCities() {
        return this.cities;
    }
    
    public void setCities(Set cities) {
        this.cities = cities;
    }




}


