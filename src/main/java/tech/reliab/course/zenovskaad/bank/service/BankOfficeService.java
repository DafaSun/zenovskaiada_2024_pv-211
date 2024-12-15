package tech.reliab.course.zenovskaad.bank.service;

import tech.reliab.course.zenovskaad.bank.entity.Bank;
import tech.reliab.course.zenovskaad.bank.entity.BankOffice;

public interface BankOfficeService {
    // Создает объект банк
    BankOffice create(int officeId, String officeName, String officeAddress, boolean isOpen, boolean canAddAtm, boolean canTakeCredit, boolean canGiveMoney, boolean canDepositMoney, int rentingPrice, Bank bank) ;

    // Возвращает адрес офиса
    String getOfficeAddress() ;

    // Возвращает название офиса
    String getOfficeName();

    // Обновляет название офиса на newOfficeName
    void updateOfficeName(String newOfficeName) ;

    // Если newIsOpen = true, то обновляет что офис открыт,
    // в ином случае, что банк закрыт
    void updateIsOpen(boolean newIsOpen) ;

    // Если newCanAddAtm = true, то обновляет что можно установить банкомат,
    // в ином случае, что нельзя установить банкомат
    void updateCanAddAtm(boolean newCanAddAtm) ;

    // Если newCanTakeCredit = true, то обновляет что можно брать  кредиты,
    // в ином случае, что нельзя брать кредиты
    void updateCanTakeCredit(boolean newCanTakeCredit) ;

    // Если newCanGiveMoney = true, то обновляет что в офисе выдают деньги,
    // в ином случае, что нельзя установить банкомат
    void updateCanGiveMoney(boolean newCanGiveMoney);

    // Если newCanDepositMoney = true, то обновляет что можно вносить деньги,
    // в ином случае, что нельзя вносить деньги
    void updateCanDepositMoney(boolean newCanDepositMoney) ;

    // Обновляет стоимость аренды на newRentingPrice
    void updateRentingPrice(int newRentingPrice) ;

    // Если в офис можно установить банкомат, то добавляет 1 банкомат
    // в офис и увеличивает кол-вл банкоматов банка на 1, возвращает true
    // иначе функция возвращает false
    boolean addAtm();

    // Если в офис есть банкоматы, то убирает 1 банкомат
    // из офиса и уменьшает кол-во банкоматов банка на 1, возвращает true
    // иначе функция возвращает false
    boolean removeAtm();

    // Если в офисе сумма денег больше или равна amount, то уменьшает
    // сумму денег в офисе и сумму денег в банке на amount и возвращает true,
    // иначе возвращает false
    boolean minusMoney(int amount);

    // Увеличивает сумму денег в офисе и сумму денег в банке на amount
    // и возвращает true
    boolean plusMoney(int amount);

    // Удаляет объект банк
    void delete();

    // Выводит всю информацию об объекте банк
    void output();
}
