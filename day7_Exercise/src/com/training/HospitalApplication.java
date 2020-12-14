package com.training;
import java.util.*;

import javax.print.Doc;

import com.training.Model.*;
import com.training.daos.HospitalServiceDaoImpl;
import com.training.utils.DoctorIdCompartor;
import com.training.utils.PateintNameComparator;

public class HospitalApplication {
	
		
		public static void main(String args[])throws Exception
		{

			Doctor doc1 =new Doctor(101, "Mr.Raj", "eye");
			Doctor doc2=new Doctor(102, "Mr.Ramesh", "jointPain");
			Doctor doc3=new Doctor(103,"Ms.Neetu","dentist");
			Doctor doc4=new Doctor(104,"Ms. Nitish","ear");
			Patient pat1=new Patient(501, "nehal", 21, "Female", "eye");
			Patient pat2=new Patient(502, "megha", 21, "Female", "dentist");
			Patient pat3=new Patient(503, "bhavna", 21, "Female", "ortho");
			Patient pat4=new Patient(504, "mansi", 21, "Female", "eye");
			
			
			HospitalServiceDaoImpl hs=new HospitalServiceDaoImpl();
			hs.addDoctor(doc1);
			hs.addDoctor(doc2);
			hs.addDoctor(doc3);
			hs.addDoctor(doc4);
			hs.addPatient(pat1);
			hs.addPatient(pat2);
			hs.addPatient(pat3);
			hs.addPatient(pat4);
			
			
			System.out.println("All the Doctors");
			printList(hs.getAllDoctor());
			
			System.out.println("\n\nAll the Patients");
			printList(hs.getAllPatients());
			
			hs.setAppointment(doc1, pat1);
			hs.setAppointment(doc1, pat2);
			hs.setAppointment(doc2, pat2);
			hs.setAppointment(doc2, pat3);
			hs.setAppointment(doc4, pat4);
			hs.setAppointment(doc4, pat1);
			
			System.out.println("\n\nAll appointments for doctor doc1");
			printList(hs.getPatientList(doc1));
			
			
			System.out.println("\n\nAfter cancelling appointment of doc 1 ");
			System.out.println(hs.cancelAppointmentofDoctor(doc1));
			if(!printList(hs.getPatientList(doc1))) {
				System.out.println("There is no current Appointment");
			}
			
			
			
			System.out.println("\n\nAll the Appointments");
			printAppointmentTable(hs.getAllAppointments());
			
		}
		
		
		public static void printAppointmentTable(Map<Doctor,HashSet<Patient>> appointTable)
		{
			Set<Map.Entry<Doctor, HashSet<Patient>>> list=appointTable.entrySet();
			for(Map.Entry<Doctor, HashSet<Patient>> eachrecord:list)
			{
				System.out.println(eachrecord.getKey());
				printList(eachrecord.getValue());
				System.out.println("\n\n");
			}
		}
		public static boolean printList(Collection<?> listItems)
		{
			//Collections.sort
			if(listItems.isEmpty()) {
				return false;
			}
			Iterator<?> iterator=listItems.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}return true;
		}
		
		
		
}
