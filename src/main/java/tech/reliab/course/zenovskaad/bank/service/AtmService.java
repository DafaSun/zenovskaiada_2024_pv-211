package tech.reliab.course.zenovskaad.bank.service;

import tech.reliab.course.zenovskaad.bank.entity.Bank;
import tech.reliab.course.zenovskaad.bank.entity.BankAtm;
import tech.reliab.course.zenovskaad.bank.entity.BankOffice;
import tech.reliab.course.zenovskaad.bank.entity.Employee;

public interface AtmService {
    // Создание объекта банкомата
    BankAtm create(int id, String name, String status, Bank chiefBank, BankOffice location, Employee employee, boolean canGiveMoney, boolean canDepositMoney, int servicePrice);

    // Обновляет название банкомта на newName
    void updateAtmName(String newName);

    // Обновляет статус банкомата на newStatus
    void updateStatus(String newStatus);

    // Обновляет расположение банкомата на офис newLocation
    void updateLocation(BankOffice newLocation);

    // Обновляет обслуживающего сотрудника на newServiceEmployee
    void updateServiceEmployee(Employee newServiceEmployee);

    // Обновляет значение, работает ли банкомат на выдачу денег
    // Если newCanGiveMoney = true, то банкомат будет работать на выдачу денег,
    // при newCanGiveMoney = false банкомат не будет работать на выдачу денег
    void updateCanGiveMoney(boolean newCanGiveMoney);

    // Обновляет значение, можно ли через банкомат вносить деньги
    // Если newCanDepositMoney = true, то через банкомат можно вносить деньги,
    // при newCanGiveMoney = false через банкомат нельзя вносить деньги
    void updateCanDepositMoney(boolean newCanDepositMoney);

    // Обновляет стоимость обслуживания на newServicePrice
    void updateServicePrice(int newServicePrice);

    // Увеличивает сумму денег в банкомате и сумму денег
    // в банке, которому принадлежит банкомат, на amount
    boolean plusMoney(int amount);

    // Если сумма денег в банкомате больше amount, то сумма и сумма денег в банке,
    // которому принадлежит банкомат в банкомате уменьшаются на amount, функция возвращает true
    // Если сумма денег в банкомате меньше amount, то функция возвращает  false
    boolean minusMoney(int amount);

    // Удаляет объект банкомат
    void delete();

    // Выводит всю инфлрмацию об объекте банкомат
    void output();
}
