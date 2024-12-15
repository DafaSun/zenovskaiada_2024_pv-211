package tech.reliab.course.zenovskaad.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentAccount{
    // Id платёжного счета
    private int paymentAccountId;
    // Пользователь, за которым закреплен этот платежный счет
    private User user;
    // Название банка, в котором открыт этот счет
    private Bank bank;
    // Сумма, которая лежит в данный момент на счету
    private int availableAmount;

    public PaymentAccount(int paymentAccountId, User user0, Bank bank0, int availableAmount) {
        this.paymentAccountId = paymentAccountId;
        this.user = user0;
        this.bank = bank0;
        this.bank.plusMoney(availableAmount);
        this.availableAmount = availableAmount;
    }

    @Override
    public String toString() {
        return "\nPaymentAccount " +
                "\nId платёжного счета: " + this.paymentAccountId +
                "\nПользователь, за которым закреплен этот платежный счет: " + this.user.getUserName() +
                "\nНазвание банка, в котором открыт этот счет: " + this.bank.getBankName() +
                "\nСумма, которая лежит в данный момент на счету: " + this.availableAmount;
    }

//    public int getId() {
//        return paymentAccountId;
//    }
//
//    public int getAvailableAmount() {
//        return availableAmount;
//    }
//
//    public void updateAmount(int amount) {
//        this.availableAmount = amount;
//    }

    public boolean giveMoney(int amount) {
        if (this.availableAmount >= amount) {
            this.availableAmount -= amount;
            this.bank.minusMoney(amount);
            return true;
        }
        return false;
    }

    public boolean depositMoney(int amount) {
        this.availableAmount += amount;
        this.bank.plusMoney(amount);
        return true;
    }

    public void delete() {
        this.delete();
    }

    public void output() {
        System.out.println(this.toString());
    }
}
