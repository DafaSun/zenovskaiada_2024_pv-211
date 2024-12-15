package tech.reliab.course.zenovskaad.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankOffice{
    // Id банковского офиса
    private int officeId;
    // Название офиса
    private String officeName;
    // Адрес банковского офиса
    private String officeAddress;
    // Статус (работает/не работает)
    private boolean isOpen;
    // Банк, которому принадлежит офис
    private Bank chiefBank;
    // Можно ли разместить банкомат?
    private boolean canAddAtm;
    // Кол-во банкоматов в данном офисе
    private int atmNumber;
    // Можно ли оформить кредит в данном офисе?
    private boolean canTakeCredit;
    // Работает ли на выдачу денег?
    private boolean canGiveMoney;
    // Можно ли внести деньги?
    private boolean canDepositMoney;
    // Кол-во денег в банковском офисе
    private int moneyNumber;
    // Стоимость аренды банковского офиса
    private int rentingPrice;

    public BankOffice(int officeId, String officeName, String officeAddress, boolean isOpen, boolean canAddAtm, boolean canTakeCredit, boolean canGiveMoney, boolean canDepositMoney, int rentingPrice, Bank bank) {
        this.officeId = officeId;
        this.officeName = officeName;
        this.officeAddress = officeAddress;
        this.isOpen = isOpen;
        this.canAddAtm = canAddAtm;
        this.atmNumber = bank.getAtmsNumber()/3;
        this.canTakeCredit = canTakeCredit;
        this.canGiveMoney = canGiveMoney;
        this.canDepositMoney = canDepositMoney;
        this.moneyNumber = bank.getMoneysInTheBank()/6;
        this.rentingPrice = rentingPrice;
        this.chiefBank = bank;
    }

    @Override
    public String toString() {
        String s1 = "\nBankOffice " +
                "\nId банковского офиса: " + this.officeId +
                "\nНазвание офиса: " + this.officeName +
                "\nАдрес банковского офиса: " + this.officeAddress;

        if (this.isOpen) {
            s1 += "\nСегодня офис работает";
        } else {
            s1 += "\nСегодня офис не работает: ";
        }

        s1 += "\nБанк, которому принадлежит офис: " + this.chiefBank.getBankName();

        if (this.canAddAtm) {
            s1 += "\nМожно разместить банкомат: ";
        } else {
            s1 += "\nНельзя разместить банкомат: ";
        }

        s1 += "\nКол-во банкоматов в данном офисе: " + this.atmNumber;

        if (this.canTakeCredit) {
            s1 += "\nМожно оформить кредит: ";
        } else {
            s1 += "\nНельзя оформить кредит: ";
        }

        if (this.canGiveMoney) {
            s1 += "\nРаботает на выдачу денег ";
        } else {
            s1 += "\nНе работает на выдачу денег ";
        }

        if (this.canDepositMoney) {
            s1 += "\nМожно внести деньги";
        } else {
            s1 += "\nНельзя внести деньги ";
        }

        s1 += "\nКол-во денег в банковском офисе: " + this.moneyNumber +
                "\nСтоимость аренды банковского офиса: " + this.rentingPrice;

        return s1;
    }

//    public String getOfficeAddress() {
//        return officeAddress;
//    }
//
//    public String getOfficeName(){
//        return this.officeName;
//    }
//
//    public void updateOfficeName(String newOfficeName) {
//        this.officeName = newOfficeName;
//    }
//
//    public void updateIsOpen(boolean newIsOpen) {
//        this.isOpen = newIsOpen;
//    }
//
//    public void updateCanAddAtm(boolean newCanAddAtm) {
//        this.canAddAtm = newCanAddAtm;
//    }
//
//    public void updateCanTakeCredit(boolean newCanTakeCredit) {
//        this.canTakeCredit = newCanTakeCredit;
//    }
//
//    public void updateCanGiveMoney(boolean newCanGiveMoney) {
//        this.canGiveMoney = newCanGiveMoney;
//    }
//
//    public void updateCanDepositMoney(boolean newCanDepositMoney) {
//        this.canDepositMoney = newCanDepositMoney;
//    }
//
//    public void updateRentingPrice(int newRentingPrice) {
//        this.rentingPrice = newRentingPrice;
//    }

    public boolean addAtm(){
        if (canAddAtm){
            this.atmNumber++;
            this.chiefBank.addAtm();
            return true;
        }
        return false;
    }

    public boolean removeAtm(){
        if (atmNumber>0) {
            this.atmNumber--;
            this.chiefBank.removeAtm();
            return true;
        }
        return false;
    }

    public boolean minusMoney(int amount){
        if (this.moneyNumber>=amount){
            this.moneyNumber-=amount;
            this.chiefBank.minusMoney(amount);
            return true;
        }
        return false;
    }

    public boolean plusMoney(int amount){
        this.moneyNumber+=amount;
        this.chiefBank.plusMoney(amount);
        return true;
    }

    public void delete(){
        this.delete();
    }

    public void output(){
        System.out.println(this.toString());
    }
}
