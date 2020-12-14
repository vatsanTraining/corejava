package com.training.daos;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.Model.Doctor;
import com.training.Model.Patient;

import com.training.ifaces.HospitalServiceDAO;

public class HospitalServiceDaoImpl implements HospitalServiceDAO {
	private Set<Doctor> doclist;
	private Set<Patient> patlist;
	private Map<Doctor, HashSet<Patient>> mapObject;
	
	
	public HospitalServiceDaoImpl() {
		super();
		
		doclist=new HashSet<Doctor>();
		patlist=new HashSet<Patient>();
		mapObject=new HashMap<Doctor,HashSet<Patient>>();
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Collection<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub
		
		return this.doclist;
	}
	@Override
	public Collection<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return this.patlist;
	}
	@Override
	public boolean addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		boolean flag=false;
		flag=this.doclist.add(doctor);
		return flag;
	}
	public boolean addPatient(Patient patient) {
		// TODO Auto-generated method stub
		boolean flag=false;
		flag=this.patlist.add(patient);
		return flag;
	}
	@Override
	public Collection<Patient> getPatientList(Doctor doctor) {

		return mapObject.get(doctor);
	}
	@Override
	public boolean setAppointment(Doctor doc, Patient patient) {
		
		if(mapObject.get(doc)==null)
		{
			HashSet<Patient> patientToadd=new HashSet<Patient>();
			patientToadd.add(patient);
			mapObject.put(doc,patientToadd);
			return true;
		}
		
		return mapObject.get(doc).add(patient);
	}
	
	
	

	

	public boolean cancelAppointmentofDoctor(Doctor doctor) {
		try {
			if(!mapObject.containsKey(doctor)) {
				return false;
			}
			else {
				mapObject.remove(doctor);
				return true;
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error occured here");
		}
		finally {
			
		}
		return false;
		
		
		
	}
	
	@Override
	public Map<Doctor, HashSet<Patient>> getAllAppointments() {
		// TODO Auto-generated method stub
		return this.mapObject;
	}
	
	
	
	
	
	
}
