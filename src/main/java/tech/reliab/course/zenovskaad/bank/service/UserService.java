package tech.reliab.course.zenovskaad.bank.service;

import tech.reliab.course.zenovskaad.bank.entity.*;

import java.util.Vector;

public interface UserService {
    // Создает объект клиент
    public User create(int id, String name, String birthday, String workPlace);

    // Возвращает ФИО клиента
    public String getUserName();

    // Обновляет ФИО на
    public void updateName(String newName);

    // Обновляет место работы на
    public void updateWorkPlace(String newWorkPlace);

    // Обновляет ежемесячный доход на
    public void updateMonthIncome(int newMonthIncome);

    // Обновляет кредитный рейтинг на
    public void updateCreditRating(int newCreditRating);

    // Обновляет список банков на
    public void updateBanks(Vector<Bank> newBanks);

    // Обновляет список кредитных счетов на
    public void updateCreditAccounts(Vector<CreditAccount> newCreditAccounts);

    // Обновляет список платежных счетов на
    public void updatePaymentAccounts(Vector<PaymentAccount> newPaymentAccounts);

    // Добавляет платежный счет в список
    public void addPaymentAccount(PaymentAccount newPaymentAccount);

    // Добавляет кредитный счет в список
    public void addCreditAccount(CreditAccount newCreditAccount);

    // Добавляет банк в список
    public void addBank(Bank newBank);

    // Удаляет объект клиент
    public void delete();

    // выводит информацию о клиенте
    public void output();
}
