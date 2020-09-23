package com.training.daos;

import java.util.Collection;
import com.training.Model.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.training.Model.Doctor;
import com.training.Model.Patient;

import com.training.ifaces.HospitalServiceDAO;

public class HospitalServiceDaoImpl implements HospitalServiceDAO {
	private List<Doctor> doclist;
	private List<Patient> patlist;
	private Map<Doctor, HashSet<Patient>> mapObject;
	
	
	public HospitalServiceDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HospitalServiceDaoImpl(List<Doctor> doclist, List<Patient> patlist, Map<Doctor, HashSet<Patient>> mapObject) {
		super();
		this.doclist = doclist;
		this.patlist = patlist;
		this.mapObject=mapObject;
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
	public Collection<Patient> returnPatientList(Doctor doctor) {
		// TODO Auto-generated method stub
		Set<Map.Entry<Doctor,HashSet<Patient>>> mylist=this.mapObject.entrySet();
		for(Map.Entry<Doctor, HashSet<Patient>> eachEntry:mylist)
		{
			if(eachEntry.getKey().equals(doctor))
			{
				return eachEntry.getValue();
				
			}
		}
		return null;
	}
	@Override
	public boolean setAppointment(Doctor doc, Patient patient) {
		// TODO Auto-generated method stub
		
		Set<Map.Entry<Doctor,HashSet<Patient>>> mylist=mapObject.entrySet();
		for(Map.Entry<Doctor, HashSet<Patient>> eachEntry:mylist)
		{
			if(eachEntry.getKey().equals(doc))
			{
				eachEntry.getValue().add(patient);
				return true;
			}
		}
		return false;
	}
	public void printList(String type) {
		//Collections.sort(list,getComparator(type));
		if(type.equalsIgnoreCase("doctor")) {
			Iterator<Doctor> iterator=this.doclist.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
		}
		}
			else
		{
			Iterator<Patient> iterator=this.patlist.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			
		}
		
		}

	}
	
	
	
}
