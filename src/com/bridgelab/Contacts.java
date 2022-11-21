package com.bridgelab;

public class Contacts {
   private String firstName;
   private String LastName;
   private String address;
   private String city;
   private String state;
   private String zip;
   private String phoneNo;
   private String emailID;

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return LastName;
   }

   public void setLastName(String lastName) {
      LastName = lastName;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public String getZip() {
      return zip;
   }

   public void setZip(String zip) {
      this.zip = zip;
   }

   public String getPhoneNo() {
      return phoneNo;
   }

   public void setPhoneNo(String phoneNo) {
      this.phoneNo = phoneNo;
   }

   public String getEmailID() {
      return emailID;
   }

   public void setEmailID(String emailID) {
      this.emailID = emailID;
   }

   @Override
   public String toString() {
      return "Contacts Details :---" +'\n'+
              "FirstName='" + firstName + '\n' +
              "LastName='" + LastName + '\n' +
              "Address='" + address + '\n' +
              "City='" + city + '\n' +
              "State='" + state + '\n' +
              "PIN='" + zip + '\n' +
              "PhoneNo='" + phoneNo + '\n' +
              "EmailID='" + emailID  ;
   }
}