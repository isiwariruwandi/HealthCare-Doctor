package com.example.my_cw_app.controller;

import com.example.my_cw_app.entity.Doctor;
import com.example.my_cw_app.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping(path = "/doctors")
    public List<Doctor> getDoctors(){
        return doctorService.getDoctors();
    }

    @GetMapping(path = "/doctors/{doctor_id}")
    public Doctor getDoctorById(@PathVariable int doctor_id){
        return doctorService.getDoctorById(doctor_id);
    }

    @PostMapping(path = "/doctors")
    public Doctor createDoctor(@RequestBody Doctor doctor){
        return doctorService.createDoctor(doctor);
    }

    @DeleteMapping(path = "/doctors/{doctor_id}")
    public Doctor deleteDoctorById(@PathVariable int doctor_id){
        return doctorService.deleteDoctorById(doctor_id);
    }

    @PutMapping(path = "/doctors/{doctor_id}")
    public Doctor updateDoctor(@PathVariable int doctor_id,@RequestBody Doctor doctor){
        return doctorService.updateDoctor(doctor_id,doctor);
    }

    @GetMapping(path = "/doctors", params="doctor_name")
    public List<Doctor> searchDoctors(@RequestParam String doctor_name){
        return doctorService.searchDoctors(doctor_name);
    }

    @GetMapping(path = "/doctors", params={"doctor_name","speciality"})
    public List<Doctor> searchDoctorsByNameSpeciality(@RequestParam String doctor_name,@RequestParam String speciality){
        return doctorService.searchDoctorsByNameSpeciality(doctor_name,speciality);
    }
}
