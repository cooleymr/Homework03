public class Tester {
	public static void main(String args[]) {

		//Counter Class
		Counter counter = new Counter();
		counter.click();
		System.out.println(counter.getValue());
		counter.reset();
		System.out.println(counter.getValue());

		
		//Car Class
		Car myCar = new Car(25);
		myCar.addGas(20);
		myCar.drive(100);
		myCar.addGas(5);
		myCar.drive(125);
		//Expected: 16 gallons left
		System.out.println(myCar.getGas());
		//Actual: 16
		
		
		//Student Class
		Student Mac = new Student("Mac");
		Mac.addQuiz(100);
		Mac.addQuiz(80);
		Mac.addQuiz(90);
		System.out.println(Mac.getName());
		System.out.println(Mac.getTotalScore());
		System.out.println(Mac.getAverageScore());
		//Expected: Mac, 270, 90
		//Actual: Mac, 270,90
		
	}
}
