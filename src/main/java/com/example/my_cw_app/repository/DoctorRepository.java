package com.example.my_cw_app.repository;

import com.example.my_cw_app.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    @Query("select d from Doctor d where d.doctor_name=?1")
    public List<Doctor> searchDoctors(String doctor_name);

    @Query("select d from Doctor d where d.doctor_name=?1 AND d.speciality=?2")
    public List<Doctor> searchDoctorsByNameSpeciality(String doctor_name,String speciality);

}
