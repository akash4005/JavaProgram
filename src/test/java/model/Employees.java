package model;

public class Employees{
	private String fname;
	private String lname;
	private String address;
	private String emailId;

	private String mobileNo;

	public Employees() {
	}

	public Employees(String fname, String lname, String address, String emailId, String mobileNo) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
	}

	public void setFname(String fname){
		this.fname = fname;
	}

	public String getFname(){
		return fname;
	}

	public void setLname(String lname){
		this.lname = lname;
	}

	public String getLname(){
		return lname;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setEmailId(String emailId){
		this.emailId = emailId;
	}

	public String getEmailId(){
		return emailId;
	}

/*	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}*/

	public void setMobileNo(String mobileNo){
		this.mobileNo = mobileNo;
	}

	public String getMobileNo(){
		return mobileNo;
	}

	@Override
	public String toString() {
		return "Employees{" +
				"fname='" + fname + '\'' +
				", lname='" + lname + '\'' +
				", address='" + address + '\'' +
				", emailId='" + emailId + '\'' +
				", mobileNo='" + mobileNo + '\'' +
				'}';
	}
}
