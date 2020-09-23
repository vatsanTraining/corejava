package com.training;
import java.util.*;

import javax.print.Doc;

import com.training.Model.*;
import com.training.daos.HospitalServiceDaoImpl;
import com.training.utils.DoctorIdCompartor;
import com.training.utils.PateintNameComparator;

public class HospitalApplication {
	
		
		public static void main(String args[])
		{
//			Set<Doctor> doctorList=new HashSet<Doctor>();
//			Set<Patient> patientList=new HashSet<Patient>();
//			Map<Doctor, HashSet<Patient>> mapObject=new HashMap<Doctor, HashSet<Patient>>() ;
			Doctor doc1 =new Doctor(101, "Mr.Raj", "eye");
			Doctor doc2=new Doctor(102, "Mr.Ramesh", "jointPain");
			Patient pat1=new Patient(102, "nehal", 21, "Female", "eye");
			
			
			HospitalServiceDaoImpl hs=new HospitalServiceDaoImpl();
			hs.addDoctor(doc1);
			hs.addDoctor(doc2);
			hs.addPatient(pat1);
			
			System.out.println("Set appointment");
			hs.setAppointment(doc1, pat1);
			
			System.out.println("All doctors");
			hs.printList("doctor");
			

			System.out.println("All Patient");
			hs.printList( "Patient");
			
			
			
		}
		
		
		public Comparator<?> getComparator(String type)
		{
			if(type.equalsIgnoreCase("doctor"))
				return new DoctorIdCompartor();
			else return new PateintNameComparator();
		}
}
