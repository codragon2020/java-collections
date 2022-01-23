package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Jason"), new Student(100, "Adam"), new Student(3, "Eve"));

		ArrayList<Student> studentsAl = new ArrayList<>(students);

		System.out.println(studentsAl);

		Collections.sort(studentsAl, Collections.reverseOrder());

		System.out.println("Descending " + studentsAl);

		Collections.sort(studentsAl, new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator " + studentsAl);

		studentsAl.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator " + studentsAl);
	}

}
