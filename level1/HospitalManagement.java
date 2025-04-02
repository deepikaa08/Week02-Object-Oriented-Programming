interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private StringBuilder medicalHistory = new StringBuilder();

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    protected StringBuilder getMedicalHistory() {
        return medicalHistory;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    public abstract double calculateBill();
}


class InPatient extends Patient implements MedicalRecord{
    private int daysAdmitted;
    private double dailyRate = 2000.0;

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        getMedicalHistory().append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:\n" + getMedicalHistory());
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee = 500.0;

    public OutPatient(String patientId, String name, int age, String diagnosis) {
        super(patientId, name, age, diagnosis);
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        getMedicalHistory().append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:\n" + getMedicalHistory());
    }
}

public class HospitalManagement{
    public static void main(String[] args) {
        Patient patient1 = new InPatient("P001", "John Doe", 45, "Pneumonia", 5);
        Patient patient2 = new OutPatient("P002", "Jane Smith", 30, "Migraine");
        Patient[] patients = {patient1, patient2};

        for (Patient patient : patients) {
            System.out.println(" Patient Details ");
            patient.getPatientDetails();
            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Initial diagnosis noted.");
                record.addRecord("Medication prescribed.");
                record.viewRecords();
            }
            System.out.println("Total Bill: " + patient.calculateBill());
			System.out.println();
        }
    }
}
