package tech.reliab.course.zenovskaad.bank.service;

import tech.reliab.course.zenovskaad.bank.entity.*;

public interface PaymentAccountService {
    // Создает объект платежный счет
    public PaymentAccount create(int paymentAccountId, User user0, Bank bank0, int availableAmount) ;

    // возвращает Id платежного счета
    public  int getId();

    // Обновляет сумму на amount
    public void updateAmount(int amount);

    // Если сумма на счету больше или равна amount,
    // то сумма денег на счету и сумма в банке
    // уменьшаются на amount и функция возвращает true, иначе возвращает false
    public boolean getMoney(int amount);

    // Увеличивает сумму денег на счету и сумму в банке на amount, возвращает true
    public boolean depositMoney(int amount);

    // Возвращает сумму на счету
    public int getAvailableAmount();

    // Удаляет объект платежный счет
    public void delete();

    // Выводит всю информацию об объекте платежный счет
    public void output();
}
