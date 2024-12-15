package tech.reliab.course.zenovskaad.bank;

import tech.reliab.course.zenovskaad.bank.entity.*;

class App {
	public static void main(String[] args) {
		Bank bank1 = new Bank(1, "Alfa Bank");
		System.out.println(bank1);

		BankOffice office1 = new BankOffice(11, "Main office", "Russia, Moscow", true, true, true, true, true, 200, bank1);
		office1.output();

		Employee employee1 = new Employee(11, "Arina Alekseevna Ivanova", "12-03-2000", "Consultant", bank1, false, office1, true, 5000);
		employee1.output();

		BankAtm atm1 = new BankAtm(11, "New atm", "work", bank1, office1, employee1, true, true, 4700);
		atm1.output();

		User user1 = new User(101, "Petrov  Oleg Semenovich", "30.08.1965", "Art School");
		user1.output();

		PaymentAccount payment1 = new PaymentAccount(101, user1, bank1, 29000);
		payment1.output();

		CreditAccount credit1 = new CreditAccount(101, user1, bank1, "15-07-2024", "15-09-2024", 2, 50000, 30000, employee1, payment1);
		credit1.output();

		bank1.setBankName("Beta-Bank");
		bank1.setBankId(561);
		bank1.output();
	}
}