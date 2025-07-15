package com.example.my_cw_app.service;

import com.example.my_cw_app.entity.Doctor;
import com.example.my_cw_app.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getDoctors(){
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(int doctor_id){
        Optional<Doctor> doc = doctorRepository.findById(doctor_id);
        if(doc.isPresent()){
            return doc.get();
        }
        return null;
    }

    public Doctor createDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public Doctor deleteDoctorById(int doctor_id){
        doctorRepository.deleteById(doctor_id);
        return null;
    }

    public Doctor updateDoctor(int doctor_id,Doctor doctor){
        Optional<Doctor> doc = doctorRepository.findById(doctor_id);

        if(doc.isPresent()){
            Doctor existingDoc = doc.get();
            existingDoc.setDoctor_name(doctor.getDoctor_name());
            existingDoc.setSpeciality(doctor.getSpeciality());
            existingDoc.setDoctor_fee(doctor.getDoctor_fee());
            existingDoc.setPhone(doctor.getPhone());
            existingDoc.setEmail(doctor.getEmail());
            doctorRepository.save(existingDoc);
            return existingDoc;
        }
        return doctor;
    }

    public List<Doctor> searchDoctors(String doctor_name){
        return doctorRepository.searchDoctors(doctor_name);
    }

    public List<Doctor> searchDoctorsByNameSpeciality(String doctor_name, String speciality){
        return doctorRepository.searchDoctorsByNameSpeciality(doctor_name,speciality);
    }
}
