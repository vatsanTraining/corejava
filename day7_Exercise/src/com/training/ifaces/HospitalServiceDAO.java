package com.training.ifaces;

import java.util.Collection;

import com.training.Model.Doctor;
import com.training.Model.Patient;

public interface HospitalServiceDAO {

	
	Collection<Doctor> getAllDoctor();
	Collection<Patient> getAllPatients();
	boolean addDoctor(Doctor doctor);
	Collection<Patient> returnPatientList(Doctor doctor);
	boolean setAppointment(Doctor doc,Patient patient);
	
}
