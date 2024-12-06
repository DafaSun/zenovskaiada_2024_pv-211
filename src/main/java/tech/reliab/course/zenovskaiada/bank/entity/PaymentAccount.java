package tech.reliab.course.zenovskaiada.bank.entity;

import tech.reliab.course.zenovskaiada.bank.service.PaymentAccountService;

public class PaymentAccount implements PaymentAccountService {
    // Id платёжного счета
    private int paymentAccountId;
    // Пользователь, за которым закреплен этот платежный счет
    private User user;
    // Название банка, в котором открыт этот счет
    private Bank bank;
    // Сумма, которая лежит в данный момент на счету
    private int availableAmount;

    public PaymentAccount create(int paymentAccountId, User user0, Bank bank0, int availableAmount) {
        this.paymentAccountId = paymentAccountId;
        this.user = user0;
        this.bank = bank0;
        this.bank.plusMoney(availableAmount);
        this.availableAmount = availableAmount;

        return this;
    }

    public PaymentAccount(int paymentAccountId, User user0, Bank bank0, int availableAmount) {
        this.paymentAccountId = paymentAccountId;
        this.user = user0;
        this.bank = bank0;
        this.bank.plusMoney(availableAmount);
        this.availableAmount = availableAmount;
    }

    @Override
    public String toString(){
        return "\nPaymentAccount "+
                "\nId платёжного счета: " + this.paymentAccountId +
                "\nПользователь, за которым закреплен этот платежный счет: " + this.user.getUserName() +
                "\nНазвание банка, в котором открыт этот счет: " + this.bank.getBankName() +
                "\nСумма, которая лежит в данный момент на счету: " + this.availableAmount;
    }

    public  int getId(){
        return paymentAccountId;
    }

    public void updateAmount(int amount){
        this.availableAmount = amount;
    }

    public boolean getMoney(int amount){
        if (this.availableAmount>=amount){
            this.availableAmount -= amount;
            this.bank.minusMoney(amount);
            return true;
        }
        return false;
    }

    public boolean depositMoney(int amount){
        this.availableAmount += amount;
        this.bank.plusMoney(amount);
        return true;
    }

    public int getAvailableAmount(){
        return availableAmount;
    }

    public void delete(){
        this.delete();
    }

    public void output(){
        System.out.println(this.toString());
    }
}
