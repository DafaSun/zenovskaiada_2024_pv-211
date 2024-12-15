package tech.reliab.course.zenovskaad.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee{
    // Id сотрудника
    private int employeeId;
    // ФИО
    private String employeeName;
    // Дата рождения
    private String birthday;
    // Должность
    private String post;
    // В каком банке работает
    private Bank bank;
    // Работает ли в банковском офисе или удаленно?
    private boolean offlineWork;
    // Банковский офис, в котором работает
    private BankOffice bankOffice;
    // Может ли выдавать кредиты?
    private boolean canTakeCredit;
    // Размер зарплаты
    private int salary;

    public Employee(int id, String name, String birthday, String post, Bank bank0, boolean offlineWork, BankOffice bankOffice0, boolean canTakeCredit, int salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.birthday = birthday;
        this.post = post;
        this.bank = bank0;
        this.offlineWork = offlineWork;
        this.bankOffice = bankOffice0;
        this.canTakeCredit = canTakeCredit;
        this.salary = salary;
    }

    @Override
    public String toString() {
        String s1 = "\nEmployee " +
                "\nId сотрудника: " + this.employeeId +
                "\nФИО: " + this.employeeName +
                "\nДата рождения: " + this.birthday +
                "\nДолжность: " + this.post +
                "\nВ каком банке работает: " + this.bank.getBankName();

        if (this.offlineWork) {
            s1 += "\nРаботает в офисе ";
        } else {
            s1 += "\nРаботает удаленно ";
        }

        s1 += "\nБанковский офис, в котором работает: " + this.bankOffice.getOfficeName();

        if (this.canTakeCredit) {
            s1 += "\nМожет выдавать кредиты ";
        } else {
            s1 += "\nНе может выдавать кредиты ";
        }

        s1 += "\nРазмер зарплаты: " + this.salary;

        return s1;
    }

//    public String getName() {
//        return employeeName;
//    }
//
//    public void  updateName(String newName) {
//        this.employeeName = newName;
//    }
//
//    public void updatePost(String newPost) {
//        this.post = newPost;
//    }
//
//    public void updateBank(Bank bank) {
//        this.bank = bank;
//    }
//
//    public void updateOfflineWork(boolean offlineWork) {
//        this.offlineWork = offlineWork;
//    }
//
//    public  void updateBankOffice(BankOffice bankOffice) {
//        this.bankOffice = bankOffice;
//    }
//
//    public void updateSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public void updateCanTakeCredit(boolean canTakeCredit) {
//        this.canTakeCredit = canTakeCredit;
//    }

    public void delete(){
        this.delete();
    }

    public void output(){
        System.out.println(this.toString());
    }
}
