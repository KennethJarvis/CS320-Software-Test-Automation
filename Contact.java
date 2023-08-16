public class Contact {

  private static final int phoneNumberLength = 10;
  private static final int addressLength = 30;
  private static final int idLength = 10;
  private static final int firstNameLength = 10;
  private static final int LastNameLength = 10;
  private static final String initialize = "initial";
  private static final String initializeNumber = "9999999999";
  private String phoneNumber;
  private String address;
  private String contactId;
  private String firstName;
  private String lastName;

  Contact() {
    this.contactId = initialize;
    this.firstName = initialize;
    this.lastName = initialize;
    this.phoneNumber = initializeNumber;
    this.address = initialize;
  }

  Contact(String contactId) {
    updateContactId(contactId);
    this.firstName = initialize;
    this.lastName = initialize;
    this.phoneNumber = initializeNumber;
    this.address = initialize;
  }

  Contact(String contactId, String firstName) {
    updateContactId(contactId);
    updateFirstName(firstName);
    this.lastName = initialize;
    this.phoneNumber = initializeNumber;
    this.address = initialize;
  }

  Contact(String contactId, String firstName, String lastName) {
    updateContactId(contactId);
    updateFirstName(firstName);
    updateLastName(lastName);
    this.phoneNumber = initializeNumber;
    this.address = initialize;
  }

  Contact(String contactId, String firstName, String lastName,
          String phoneNumber) {
    updateContactId(contactId);
    updateFirstName(firstName);
    updateLastName(lastName);
    updatePhoneNumber(phoneNumber);
    this.address = initialize;
  }

  Contact(String contactId, String firstName, String lastName,
          String phoneNumber, String address) {
    updateContactId(contactId);
    updateFirstName(firstName);
    updateLastName(lastName);
    updatePhoneNumber(phoneNumber);
    updateAddress(address);
  }
  
  protected final String getLastName() { return lastName; }

  protected final String getPhoneNumber() { return phoneNumber; }

  protected final String getAddress() { return address; }

  protected final String getContactId() { return contactId; }

  protected final String getFirstName() { return firstName; }

  protected void updateFirstName(String firstName) {
    if (firstName == null) {
      throw new IllegalArgumentException("First name can't be empty");
    } 
    else if (firstName.length() > firstNameLength) {
      throw new IllegalArgumentException("First name can't be longer than " + firstNameLength + " characters");
    } 
    else {
      this.firstName = firstName;
    }
  }

  protected void updateAddress(String address) {
    if (address == null) {
      throw new IllegalArgumentException("Address can't be empty");
    } 
    else if (address.length() > addressLength) {
      throw new IllegalArgumentException("Address can't be longer than " + addressLength + " characters");
    } 
    else {
      this.address = address;
    }
  }
  protected void updateLastName(String lastName) {
	    if (lastName == null) {
	      throw new IllegalArgumentException("Last name cannot be empty");
	    } 
	    else if (lastName.length() > LastNameLength) {
	      throw new IllegalArgumentException("Last name cannot be longer than " + LastNameLength + " characters");
	    } 
	    else {
	      this.lastName = lastName;
	    }
	  }

  protected void updatePhoneNumber(String phoneNumber) {
	  String regex = "[0-9]+";
	  if (phoneNumber == null) {
	    throw new IllegalArgumentException("Phone number can't be empty.");
	  } 
	  else if (phoneNumber.length() != phoneNumberLength) {
	      throw new IllegalArgumentException(
	        "Phone number length invalid. Ensure it is " + phoneNumberLength + " digits.");
	  } 
	  else if (!phoneNumber.matches(regex)) {
	    throw new IllegalArgumentException(
	        "Phone number cannot have anything but numbers");
	    } 
	  else {
	      this.phoneNumber = phoneNumber;
	    }
	  }

  protected void updateContactId(String contactId) {
    if (contactId == null) {
      throw new IllegalArgumentException("Contact ID cannot be empty");
    } 
    else if (contactId.length() > idLength) {
      throw new IllegalArgumentException("Contact ID cannot be longer than " + idLength + " characters");
    } 
    else {
      this.contactId = contactId;
    }
  }
}
