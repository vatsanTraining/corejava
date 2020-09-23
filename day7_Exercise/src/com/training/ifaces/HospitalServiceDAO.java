package com.training.ifaces;

import java.util.Collection;
import java.util.*;

import com.training.Model.Doctor;
import com.training.Model.Patient;

public interface HospitalServiceDAO {

	
	Collection<Doctor> getAllDoctor();
	Collection<Patient> getAllPatients();
	boolean addDoctor(Doctor doctor);
	public boolean addPatient(Patient patient) ;
	boolean setAppointment(Doctor doc,Patient patient);
	Collection<Patient> getPatientList(Doctor doctor);
	public boolean cancelAppointmentofDoctor(Doctor doctor);
	public Map<Doctor,HashSet<Patient>> getAllAppointments();
	
}
