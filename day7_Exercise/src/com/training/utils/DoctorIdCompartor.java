package com.training.utils;

import java.util.Comparator;

import com.training.Model.Doctor;

public class DoctorIdCompartor implements Comparator<Doctor> {

	@Override
	public int compare(Doctor o1, Doctor o2) {
		if(o1.getDoctorId()<o2.getDoctorId())return -1;
		else if(o1.getDoctorId()>o2.getDoctorId())return 1;
		return 0;
	}

}
