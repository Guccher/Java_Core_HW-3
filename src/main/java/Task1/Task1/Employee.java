package Task1.Task1;

//Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
//представленные в виде трёх чисел гггг-мм-дд,
//без использования условного оператора.

import java.time.LocalDate;

class Employee {

    LocalDate date1;
    LocalDate date2;

    public static void main(String[] args){
        Employee emp = new Employee();
        emp.date1 = LocalDate.of(2020, 7, 29);
        emp.date2 = LocalDate.of(2020, 7, 29);
        System.out.println(("Comparison = " + emp.date1.isEqual(emp.date2)) + '\n' + ("Compare = " + emp.date1.compareTo(emp.date2)));

    }
}

