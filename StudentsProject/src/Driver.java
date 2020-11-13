import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver {

	//print menu
	public static void printMenu() {
		System.out.println("* Menu *" + "\n1 - add student" +
				"\n2 - display student" + "\n3 - remove student" + "\n4 - quit");
	}
	
	//menu 1 - ask student info and add student
	public static void addStudent(LinkedList<Student> students) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nEnter your full name : ");
		String fullName = input.nextLine();
		System.out.println("\nEnter your email : ");
		String email = input.nextLine();
		while(!Validator.EmailValidator(email)) {
			System.out.println("\nWrong input, Enter your email :");
			email = input.nextLine();
		}
		System.out.println("\nEnter your id : ");
		int id = input.nextInt();
		
		Student s = new Student(id, email, fullName);
		students.add(s);
	}
	
	//menu 2 - display students
	public static void displayStudent(LinkedList<Student> students) {
		Iterator iterator = students.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	//menu 3 - remove students
	public static void removeStudent(LinkedList<Student> students) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the id that you want to remove : ");
		int id = input.nextInt();

		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student s = iterator.next();
			if (s.getId() == id) {
				System.out.println("Removed: " + s);
				iterator.remove();
			}
		}
	}

	//main
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//student object
		Student s1 = new Student(1, "john@email.com", "John Lennon");
		Student s2 = new Student(2, "paul@email.com", "Paul McCartney");
		//student list
		LinkedList<Student> students = new LinkedList<Student>();
		students.add(s1);
		students.add(s2);
		
		//ask user to choose menu
		printMenu();
		boolean quit = false; 
		
		while(!quit) {
			System.out.println("\nChoose menu 1 to 4 : ");
			int user = input.nextInt();
			switch (user) {
			case 1:
				addStudent(students);
				break;
			case 2:
				displayStudent(students);
				break;
			case 3:
				removeStudent(students);
				break;
			case 4:
				quit = true;
				System.out.println("See You");
				break;
			default:
				System.err.println("Wrong input");
			}
		}
	}
}
