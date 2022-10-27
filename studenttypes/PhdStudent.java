package studenttypes;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
	private boolean qualifyingExamTaken;

	public PhdStudent(final int no, final String name, final int year, final Date dob, final String major, final String advisor,
			final boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor);
		this.qualifyingExamTaken = qualifyingExamTaken;

	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(final boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	public void writePaper() {
		System.out.println("Phd student is wirting paper");
	}

	@Override
	public void writeThesis() {
		System.out.println("Phd student is writing thesis.");
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Phd student met his advisor:  " + getAdvisor());
	}

	public void study() {
		System.out.println("Phd student is studying");
	}

	public void register() {
		System.out.println("Phd student is registering");
	}

}
