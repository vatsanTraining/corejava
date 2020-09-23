package com.training.utils;

import java.util.Comparator;

import com.training.Model.Patient;

public class PateintNameComparator implements Comparator<Patient> {

	@Override
	public int compare(Patient p1, Patient p2) {
		return p1.getPatientName().compareTo(p2.getPatientName());
	}

}
