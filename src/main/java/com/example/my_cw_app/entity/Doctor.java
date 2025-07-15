package com.example.my_cw_app.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;


@Entity
@Table(name = "doctor")
@JsonPropertyOrder({"doctor_id", "doctor_name", "speciality", "doctor_fee", "Phone", "Email"})
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctor_id;

    @Column(name = "doctor_name")
    private String doctor_name;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "doctor_fee")
    private double doctor_fee;

    @Column(name = "Phone")
    private String Phone;

    @Column(name = "Email")
    private String Email;

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getDoctor_fee() {
        return doctor_fee;
    }

    public void setDoctor_fee(double doctor_fee) {
        this.doctor_fee = doctor_fee;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
