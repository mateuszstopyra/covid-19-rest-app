package com.isa.restapidemo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.isa.restapidemo.model.Address;
import com.isa.restapidemo.model.Citizen;
import com.isa.restapidemo.model.Gender;

import java.util.Date;
import java.util.Set;

public class PatientDto {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer citizenId;

    private String name;

    private String surname;

    private Gender gender;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private Date birthdate;

    private String pesel;

    private Boolean isDoctor;

    private Citizen doctor;

    private Address address;

    public PatientDto(){
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(Integer citizenId) {
        this.citizenId = citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Boolean getIsDoctor() {
        return isDoctor;
    }

    public void setIsDoctor(Boolean doctor) {
        this.isDoctor = doctor;
    }

    public Citizen getDoctor() {
        return doctor;
    }

    public void setDoctor(Citizen doctor) {
        this.doctor = doctor;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PatientDto{" +
                "citizenId=" + citizenId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                ", pesel='" + pesel + '\'' +
                ", isDoctor=" + isDoctor +
                ", doctor=" + doctor +
                ", address=" + address +
                '}';
    }
}
