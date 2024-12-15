package tech.reliab.course.zenovskaad.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Vector;

@Getter
@Setter
public class User {
    // Id клиента
    private int userId;
    // ФИО
    private String userName;
    // Дата рождения
    private String birthday;
    // Место работы
    private String workPlace;
    // Ежемесячный доход
    private int monthIncome;
    // Банки, которыми он пользуется
    private Vector<Bank> banks;
    // Кредитные счета
    private Vector<CreditAccount> creditAccounts;
    // Платежные счета
    private Vector<PaymentAccount> paymentAccounts;
    // Кредитный рейтинг для банка
    private int creditRating;

    public User(int id, String name, String birthday, String workPlace) {
        this.userId = id;
        this.userName = name;
        this.birthday = birthday;
        this.workPlace = workPlace;
        Random random = new Random();
        this.monthIncome = random.nextInt(500, 10000);
        this.banks = new Vector<Bank>();
        this.creditAccounts = new Vector<CreditAccount>();
        this.paymentAccounts = new Vector<PaymentAccount>();
        this.creditRating = this.monthIncome / 10;
    }

    @Override
    public String toString() {
        String s1 = "\nBank " +
                "\nId клиента: " + this.userId +
                "\nФИО: " + this.userName +
                "\nДата рождения: " + this.birthday +
                "\nМесто работы: " + this.workPlace +
                "\nЕжемесячный доход: " + this.monthIncome;

        s1 += "\nБанки, которыми он пользуется: ";
        for (Bank b : this.banks) {
            s1 += b.getBankName() + ", ";
        }

        s1 += "\nКредитные счета: ";
        for (CreditAccount b : this.creditAccounts) {
            s1 += b.getCreditAccountId() + ", ";
        }

        s1 += "\nПлатежные счета: ";
        for (PaymentAccount b : this.paymentAccounts) {
            s1 += b.getPaymentAccountId() + ", ";
        }

        s1 += "\nКредитный рейтинг для банка: " + this.creditRating;

        return s1;
    }

//    public String getUserName() {
//        return userName;
//    }

//    public void updateName(String newName) {
//        this.userName = newName;
//    }
//
//    public void updateWorkPlace(String newWorkPlace) {
//        this.workPlace = newWorkPlace;
//    }
//
//    public void updateMonthIncome(int newMonthIncome) {
//        this.monthIncome = newMonthIncome;
//    }
//
//    public void updateCreditRating(int newCreditRating) {
//        this.creditRating = newCreditRating;
//    }
//
//    public void updateBanks(Vector<Bank> newBanks) {
//        this.banks = newBanks;
//    }
//
//    public void updateCreditAccounts(Vector<CreditAccount> newCreditAccounts) {
//        this.creditAccounts = newCreditAccounts;
//    }
//
//    public void updatePaymentAccounts(Vector<PaymentAccount> newPaymentAccounts) {
//        this.paymentAccounts = newPaymentAccounts;
//    }

    public void addPaymentAccount(PaymentAccount newPaymentAccount) {
        this.paymentAccounts.add(newPaymentAccount);
    }

    public void addCreditAccount(CreditAccount newCreditAccount) {
        this.creditAccounts.add(newCreditAccount);
    }

    public void addBank(Bank newBank) {
        this.banks.add(newBank);
    }

    public void delete(){
        this.delete();
    }

    public void output(){
        System.out.println(this.toString());
    }
}
