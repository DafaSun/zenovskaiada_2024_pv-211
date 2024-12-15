package tech.reliab.course.zenovskaad.bank.service;

import java.util.Random;

import tech.reliab.course.zenovskaad.bank.entity.Bank;

public interface BankService {
    // Создание объекта банк
    Bank сreate(int id, String name);

    // Возвращает рейтинг банка
    int getBankRating() ;

    // Возвращает общую сумму денег в банке
    int getMoneysInTheBank() ;

    // Возвращает кол-во банкотов, принадлежащих банку
    int getAtmsNumber() ;

    // Возвращает процентную ставку
    float getInterestRate();

    // Возвращает имя банка
    String getBankName() ;

    // Обновляет имя банка на name
    void updateBankName(String name) ;

    // Обновляет процентную ставку на rate
    void updateInterestRate(float rate) ;

    // Обновляет кол-во денег в банке на amount
    void updateMoneysInTheBank(int amount);

    // Обновляет рейтинг банка на rating
    void updateBankRating(int rating);

    // Добавляет банку 1 банкомат, возвращает true
    boolean addAtm() ;

    // Если у банка есть банкоматы, то уменьшает их кол-во на 1 и возвращает true,
    // иначе возвращает false
    boolean removeAtm() ;

    // Если сумма денег в банке больше или равна amount, то уменьшает сумму денег
    // в банке на amount и возвращает true, иначе возвращает false
    boolean minusMoney(int amount) ;

    // Увеличивает сумму денег в банке на amount и возвращает true
    boolean plusMoney(int amount) ;

    // Удаляет объект банк
    void delete() ;

    // Выводит всю информацию об объекте банк
    void output();
}
