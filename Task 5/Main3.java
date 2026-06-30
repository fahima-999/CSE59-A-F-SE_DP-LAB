
class Patient{
private String patientName;
private String nationalID;
public Patient(String patientName,String nationalID){
    this.patientName = patientName;
    this.nationalID = nationalID;
}

public String getPatientName(){
    return patientName;
}
public String getNationalID(){
    return nationalID;
}
}
class idValidator{
    public boolean validateId(String nationalID){
        return nationalID.length() == 10 || nationalID.length()==17;

    }
}


class SmsService{
    public void sendSms(Patient patient){
        System.out.println("Sending SMS to " + patient.getPatientName()  + ":Registration succesfull.");
    }
}
public class Main3{
    public static void main(String[] args) {
        Patient patient = new Patient("Fahima ","1234567890");
        idValidator validator = new idValidator();
        SmsService smsService = new SmsService();

        if(validator.validateId(patient.getNationalID())){
            smsService.sendSms(patient);
        }
        else{
            System.out.println("Invalid National ID!");
        }
        }
    }
