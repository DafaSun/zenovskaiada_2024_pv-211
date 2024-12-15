package tech.reliab.course.zenovskaad.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAtm{
    // Id банкомата
    private int atmId;
    // Имя банкомата
    private String atmName;
    // Адрес
    private String address;
    // Статус
    private String status;
    // Банк, которому принадлежит банкомат
    private Bank chiefBank;
    // Расположение банкомата
    private BankOffice atmLocation;
    // Обслуживающий сотрудник
    private Employee serviceEmployee;
    // Работает ли на выдачу денег?
    private boolean canGiveMoney;
    // Можно ли внести деньги
    private boolean canDepositMoney;
    // Кол-во денег в банкомате
    private int moneyNumber;
    // Стоимость обслуживания банкомата
    private int servicePrice;

    public BankAtm(int id, String name, String status, Bank chiefBank, BankOffice location, Employee employee, boolean canGiveMoney, boolean canDepositMoney, int servicePrice) {
        this.atmId = id;
        this.atmName = name;
        this.address = location.getOfficeAddress();
        this.status = status;
        this.chiefBank = chiefBank;
        this.atmLocation = location;
        this.serviceEmployee = employee;
        this.canGiveMoney = canGiveMoney;
        this.canDepositMoney = canDepositMoney;
        this.moneyNumber = chiefBank.getMoneysInTheBank()/10;
        this.servicePrice = servicePrice;
    }

    @Override
    public String toString() {
        String s1 = "\nBankAtm " +
                "\nId банкомата: " + this.atmId +
                "\nИмя банкомата: " + this.atmName +
                "\nАдрес: " + this.address +
                "\nСтатус: " + this.status +
                "\nБанк, которому принадлежит банкомат: " + this.chiefBank.getBankName() +
                "\nРасположение банкомата: " + this.atmLocation.getOfficeAddress() +
                "\nОбслуживающий сотрудник: " + this.serviceEmployee.getEmployeeName();

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
        s1 += "\nКол-во денег в банкомате: " + this.moneyNumber +
                "\nСтоимость обслуживания банкомата: " + this.servicePrice;

        return s1;
    }

//    public void updateAtmName(String newName) {
//        this.atmName = newName;
//    }
//
//    public void updateStatus(String newStatus) {
//        this.status = newStatus;
//    }
//
//    public void updateLocation(BankOffice newLocation) {
//        this.atmLocation = newLocation;
//    }
//
//    public void updateServiceEmployee(Employee newServiceEmployee) {
//        this.serviceEmployee = newServiceEmployee;
//    }
//
//    public void updateCanGiveMoney(boolean newCanGiveMoney) {
//        this.canGiveMoney = newCanGiveMoney;
//    }
//
//    public  void updateCanDepositMoney(boolean newCanDepositMoney) {
//        this.canDepositMoney = newCanDepositMoney;
//    }
//
//    public void updateServicePrice(int newServicePrice) {
//        this.servicePrice = newServicePrice;
//    }

    public boolean plusMoney(int amount){
        this.moneyNumber += amount;
        this.chiefBank.plusMoney(amount);
        return true;
    }

    public boolean minusMoney(int amount){
        if (this.moneyNumber >= amount){
            this.moneyNumber -= amount;
            this.chiefBank.minusMoney(amount);
            return true;
        }
        return false;
    }

    public void delete(){
        this.delete();
    }

    public void output(){
        System.out.println(this.toString());
    }
}
