package studenttypes;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {

	public void RegisterStudent(AbstractStudent s2) {
		if (s2 instanceof PhdStudent) {
			PhdStudent phd = (PhdStudent) s2;
			System.out.println("Phd student " + phd.getName() + " has registered");
		} else if (s2 instanceof MasterStudent) {
			MasterStudent master = (MasterStudent) s2;
			System.out.println("Master student " + master.getName() + " has registered.");
		} else if (s2 instanceof GraduateStudent) {
			GraduateStudent grd = (GraduateStudent) s2;
			System.out.println("Graduate student " + grd.getName() + " has registered.");
		} else if (s2 instanceof UndergraduateStudent) {
			UndergraduateStudent ugrd = (UndergraduateStudent) s2;
			System.out.println("Undergraduate student " + ugrd.getName() + " has registered.");
		} else if (s2 instanceof VocationalStudent) {
			VocationalStudent voc = (VocationalStudent) s2;
			System.out.println("vocational student " + voc.getName() + " has registered.");
		} else {
			System.out.println("Student " + s2.getName() + " has registered.");
		}
	}

	@SuppressWarnings("deprecation")
	public AbstractStudent getAStudent() {
		AbstractStudent student = null;
		Random r = new Random();
		int i = r.nextInt(6);
		switch (i) {
		case 1:
			student = new VocationalStudent(156, "Busra", 1997, new Date(1966, 01, 6), "Computer Science");
			break;
		case 2:
			student = new GraduateStudent(169, "Asli", 2000, new Date(1980, 04, 15), "Food", "Defne Kasik");
			break;
		case 3:
			student = new UndergraduateStudent(147, "Mehmet", 1994, new Date(1970, 02, 2), "Mathematics", "Mathematician");
			break;
		case 4:
			student = new MasterStudent(220, "Sema", 2007, new Date(1975, 11, 6), "Chemistry", "Hande Bilal");
			break;
		default:
			student = new PhdStudent(345, "Defne", 1999, new Date(1969, 10, 8), "Engineer", "Fatih Tasci", true);
			break;
		}

		return student;
	}
}
