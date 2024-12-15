package tech.reliab.course.zenovskaad.bank.service;

import tech.reliab.course.zenovskaad.bank.entity.*;

public interface EmployeeService {
    // Создает объект работник
    Employee create(int id, String name, String birthday, String post, Bank bank0, boolean offlineWork, BankOffice bankOffice0, boolean canTakeCredit, int salary) ;

    // Возвращает ФИО сотрудника
    String getName() ;

    // Обновляет имя на newName
    void  updateName(String newName);

    // Обновляет должность на newPost
    void updatePost(String newPost) ;

    // Обновляет банк на bank
    void updateBank(Bank bank) ;

    // Если offlineWork = true, то сотрудник работает в офисе,
    // иначе сотрудник работает удаленно
    void updateOfflineWork(boolean offlineWork) ;

    // Обновляет офис на bankOffice
     void updateBankOffice(BankOffice bankOffice) ;

     // Обновляет зарплату на salary
    void updateSalary(int salary) ;

    // Если canTakeCredit = true, то сотрудник может выдавать кредиты,
    // иначе работник не может выдавать кредиты
    void updateCanTakeCredit(boolean canTakeCredit);

    // Удаляет объект работник
    void delete();

    // Выводит всю информацию об объекте работник
    void output();
}
