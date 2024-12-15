package tech.reliab.course.zenovskaad.bank.service;

import tech.reliab.course.zenovskaad.bank.entity.*;

public interface CreditAccountService {
    // Создает объект кредитный аккаунт
    CreditAccount create(int creditAccountId, User user0, Bank bank0, String dateBegin, String dateEnd, int creditPeriod, int creditAmount, int monthPayment, Employee employee0, PaymentAccount paymentAccount) ;

    // Возвращает Id кредитного аккаунта
    int getId();

    // Обновляет дату окончания кредита на dateEnd
    void updateDateEnd(String dateEnd) ;

    // Обновляет период кредита в месяцах на creditPeriod
    void updateCreditPeriod(int creditPeriod) ;

    // Обновляет сумму кредита на creditAmount
    void updateCreditAmount(int creditAmount) ;

    // Обновляет размер ежемесячного платежа на monthPayment
    void updateMonthPayment(int monthPayment) ;

    // Обновляет аккаунт, с которого списывается плата за кредит на paymentAccount
    void updatePaymentAccount(PaymentAccount paymentAccount) ;

    // Усли на платежном счете сумма больше или равна amount, то возвращает true вносит сумму
    // amount для погашение кредита, с плаежного счета списывается сумма amount,
    // если непогашенная задолжность больше или равна amount,
    // если задолжность меньше amount, то списывается сумма равная задолжности
    // Иначе возвращает false
    boolean depositMoney(int amount) ;

    // Если в банке сумма денег больше или равна amount, то увеличивает
    // сумму кредита и текущую сумму кредита на amount, сумму денег в банке
    // уменьшает на amount, возвращает true
    // В ином случае возвращает false
    boolean getMoney(int amount) ;

    // Возвращает true и списывает платежного аккаунта сумму amount,
    // текущую стоимость кредита уменьшает на amount, сумму
    // денег в банке увеличивает на amount, если возможно
    // произвести месячный платеж (хватает денег)
    // В ином случае возвращает false
    boolean doMonthPayment() ;

    // Удаляет объект кредитный аккаунт
    void delete() ;

    // Выводит информацию об объекте кредитный аккаунт
    void output() ;
}
