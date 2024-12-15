package tech.reliab.course.zenovskaad.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Bank {
    // Id банка
    private int bankId;
    // Имя банка
    private String bankName;
    // Кол-во офисов
    private int officesNumber;
    // Кол-во банкоматов
    private int atmsNumber;
    // Кол-во сотрудников
    private int employeesNumber;
    // Кол-во клиентов
    private int clientsNumber;
    // Рейтинг банка
    private int bankRating;
    // Всего денег в банке
    private int moneysInTheBank;
    // Процентная ставка
    private float interestRate;

    public Bank(int id, String name) {
        this.bankId = id;
        this.bankName = name;
        this.officesNumber = 0;
        this.atmsNumber = 0;
        this.employeesNumber = 0;
        this.clientsNumber = 0;
        Random random = new Random();
        this.bankRating = random.nextInt(0, 100);
        this.moneysInTheBank = random.nextInt(0, 1000000);
        this.interestRate = random.nextFloat(0, 20) / this.getBankRating();
    }

    @Override
    public String toString() {
        return "\nBank " +
                "\nId банка: " + this.bankId +
                "\nИмя банка: " + this.bankName +
                "\nКоличество офисов: " + this.officesNumber +
                "\nКоличество банкоматов: " + this.atmsNumber +
                "\nКоличество сотрудников: " + this.employeesNumber +
                "\nКоличество клиентов: " + this.clientsNumber +
                "\nРейтинг банка: " + this.bankRating +
                "\nВсего денег в банке: " + this.moneysInTheBank +
                "\nПроцентная ставка: " + String.format("%.2f", this.interestRate);
    }

//    public int getBankRating() {
//        return this.bankRating;
//    }
//
//    public int getMoneysInTheBank() {
//        return this.moneysInTheBank;
//    }
//
//    public int getAtmsNumber() {
//        return this.atmsNumber;
//    }
//
//    public float getInterestRate() {
//        return this.interestRate;
//    }
//
//    public String getBankName() {
//        return this.bankName;
//    }

//    public void updateBankName(String name) {
//        this.bankName = name;
//    }
//
//    public void updateInterestRate(float rate) {
//        this.interestRate = rate;
//    }
//
//    public void updateMoneysInTheBank(int amount) {
//        this.moneysInTheBank = amount;
//    }
//
//    public void updateBankRating(int rating) {
//        this.bankRating = rating;
//    }

    public boolean addAtm() {
        this.atmsNumber++;

        return true;
    }

    public boolean removeAtm() {
        if (this.atmsNumber > 0) {
            atmsNumber--;
            return true;
        }
        return false;
    }

    public boolean minusMoney(int amount) {
        if (this.moneysInTheBank >= amount) {
            this.moneysInTheBank -= amount;
            return true;
        }
        return false;
    }

    public boolean plusMoney(int amount) {
        this.moneysInTheBank += amount;
        return true;
    }

    public void delete() {
        this.delete();
    }

    public void output() {
        System.out.println(this.toString());
    }
}