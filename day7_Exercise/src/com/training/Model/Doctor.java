package com.training.Model;

public class Doctor {
	private int doctorId;
	private String doctorName;
	private String doctorSpecially;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctorId, String doctorName, String doctorSpecially) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorSpecially = doctorSpecially;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorSpecially() {
		return doctorSpecially;
	}
	public void setDoctorSpecially(String doctorSpecially) {
		this.doctorSpecially = doctorSpecially;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorSpecially=" + doctorSpecially
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + doctorId;
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + ((doctorSpecially == null) ? 0 : doctorSpecially.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (doctorId != other.doctorId)
			return false;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (doctorSpecially == null) {
			if (other.doctorSpecially != null)
				return false;
		} else if (!doctorSpecially.equals(other.doctorSpecially))
			return false;
		return true;
	}
	
	
	

}
