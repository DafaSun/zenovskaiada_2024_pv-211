package tech.reliab.course.zenovskaad.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditAccount{
    // Id кредитного счета
    private int creditAccountId;
    // Пользователь, за которым закреплен этот кредитный счет
    private User user;
    // Название банка, где взят кредит
    private Bank bank;
    // Дата начала кредита
    private String dateBegin;
    // Дата окончания кредита
    private String dateEnd;
    // Кол-во месяцев, на которые взят кредит
    private int creditPeriod;
    // Сумма кредита
    private int creditAmount;
    // Сумма кредита
    private int curCreditAmount;
    // Ежемесячный платеж
    private int monthPayment;
    // Процентная ставка
    private float interestRate;
    // Сотрудник, который выдал кредит
    private Employee employee;
    // Платежный счет в банке с которого будет осуществляться погашение данного кредита
    private PaymentAccount paymentAccount;

    public CreditAccount(int creditAccountId, User user0, Bank bank0, String dateBegin, String dateEnd, int creditPeriod, int creditAmount, int monthPayment, Employee employee0, PaymentAccount paymentAccount) {
        this.creditAccountId = creditAccountId;
        this.user = user0;
        this.bank = bank0;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.creditPeriod = creditPeriod;
        this.curCreditAmount = (int) (creditPeriod * bank.getInterestRate() + creditAmount);
        this.creditAmount = creditAmount;
        this.monthPayment = monthPayment;
        this.interestRate = bank.getInterestRate();
        this.employee = employee0;
        this.paymentAccount = paymentAccount;
        this.bank.minusMoney(creditAmount);
    }

    @Override
    public String toString() {
        return "\nCreditAccount " +
                "\nId кредитного счета: " + this.creditAccountId +
                "\nНазвание банка, где взят кредит: " + this.bank.getBankName() +
                "\nДата начала кредита: " + this.dateBegin +
                "\nДата окончания кредита: " + this.dateEnd +
                "\nКол-во месяцев, на которые взят кредит: " + this.creditPeriod +
                "\nСумма кредита: " + this.creditAmount +
                "\nЕжемесячный платеж: " + this.monthPayment +
                "\nПроцентная ставка: " + String.format("%.2f", this.interestRate) +
                "\nСотрудник, который выдал кредит: " + this.employee.getEmployeeName() +
                "\nПлатежный счет в банке с которого будет осуществляться погашение данного кредита: " + this.paymentAccount.getPaymentAccountId();
    }

//    public int getId() {
//        return this.creditAccountId;
//    }
//
//    public void updateDateEnd(String dateEnd) {
//        this.dateEnd = dateEnd;
//    }
//
//    public void updateCreditPeriod(int creditPeriod) {
//        this.creditPeriod = creditPeriod;
//    }
//
//    public void updateCreditAmount(int creditAmount) {
//        this.creditAmount = creditAmount;
//    }
//
//    public void updateMonthPayment(int monthPayment) {
//        this.monthPayment = monthPayment;
//    }
//
//    public void updatePaymentAccount(PaymentAccount paymentAccount) {
//        this.paymentAccount = paymentAccount;
//    }

    public boolean depositMoney(int amount) {
        if (this.paymentAccount.getAvailableAmount() >= amount) {
            if (this.curCreditAmount < amount) {
                this.paymentAccount.setAvailableAmount(amount - this.curCreditAmount);
            } else {
                this.curCreditAmount -= amount;
            }
            return true;
        }
        return false;
    }

    public boolean giveMoney(int amount) {
        if (this.bank.getMoneysInTheBank() >= amount) {
            this.curCreditAmount += amount;
            this.creditAmount += amount;
            this.bank.minusMoney(amount);
            return true;
        }
        return false;
    }

    public boolean doMonthPayment() {
        return this.depositMoney(this.monthPayment);
    }

    public void delete() {
        this.delete();
    }

    public void output() {
        System.out.println(this.toString());
    }
}
