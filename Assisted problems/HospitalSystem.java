import java.util.ArrayList;
import java.util.List;
class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }
    public void showPatientDetails() {
        System.out.println("Patient: " + name);
        System.out.println("Consulted Doctors:");
        for (Doctor doc : doctors) {
            System.out.println(" - " + doc.getName());
        }
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Establish two-way association
        }
    }
    public void showDoctorDetails() {
        System.out.println("Doctor: " + name);
        System.out.println("Patients consulted:");
        for (Patient pat : patients) {
            System.out.println(" - " + pat.getName());
        }
    }
}

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor " + doctor.getName() + " added to " + hospitalName);
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added to " + hospitalName);
    }
    public void showHospitalDetails() {
        System.out.println("\nHospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doc : doctors) {
            doc.showDoctorDetails();
        }
        System.out.println("Patients:");
        for (Patient pat : patients) {
            pat.showPatientDetails();
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Smith");
        Doctor d2 = new Doctor("Dr. Brown");
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
        hospital.showHospitalDetails();
    }
}
