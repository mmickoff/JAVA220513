package lesson5;

import java.util.Arrays;

public class EmployeesInfo {
    public static void main(String[] args) {

        Employee person1 = new Employee("Иванов Иван Иванович");
        Employee person2 = new Employee("Петров Пётр Петрович");
        Employee person3 = new Employee("Петров Иван Петрович");
        Employee person4 = new Employee("Иванов Пётр Петрович");
        Employee person5 = new Employee("Петров Иван Иванович");
        Employee person6 = new Employee("Иванов Пётр Иванович");

        person1.setPosition("Коммерческий директор");
        person2.setEmail("mail21@mail.ru");
        person3.setEmail("mail24@mail.ru");
        person4.setEmail("mail27@mail.ru");
        person5.setEmail("mail29@mail.ru");
        person6.setEmail("mail31@mail.ru");
        person1.setMoney(155000);
        person1.setAge(33);
        person2.setAge(30);
        person5.setAge(37);

        Employee ageLimitForPrintData(int getAge);

        Employee[] persArray = {person1, person2, person3, person4, person5, person6};
        for (int i = 0; i < persArray.length; i++) {
            ageLimitForPrintData();

        }
        /*person1.ageLimitForPrintData();
        person2.ageLimitForPrintData();
        person3.ageLimitForPrintData();
        person4.ageLimitForPrintData();
        person5.ageLimitForPrintData();
        person6.ageLimitForPrintData();*/
    }

    private static void ageLimitForPrintData() {
        Employee.ageLimitForPrintData(int setAge);
    }
//        printInfoFirm ();
        /*Employee[][] persArray = {person1, person2, person3, person4, person5, person6};
        for (int i = 0; i < persArray.length; i++) {
            for (int j = 0; j < persArray.length; j++) {
                if (persArray[i][6] < 40) {
                    Employee.printInfo();
                } else {
                    System.out.println();
                }*/

/*public static void printInfoFirm () {
    Employee person1 = new Employee("Иванов Иван Иванович");
    Employee person2 = new Employee("Петров Пётр Петрович");
    Employee person3 = new Employee("Петров Иван Петрович");
    Employee person4 = new Employee("Иванов Пётр Петрович");
    Employee person5 = new Employee("Петров Иван Иванович");
    Employee person6 = new Employee("Иванов Пётр Иванович");
        if (person1.getAge < 40) {
            person1.printInfo();
        }
        person2.printInfo();
        person3.printInfo();
        person4.printInfo();
        person5.printInfo();
        person6.printInfo();*/
//                System.out.printf(Arrays.toString(persArray));

        /*public static void printInfoFirm () {
            for (int i = 0; i < persArray.length; i++) {
                for (int j = 0; j < 6; j++) {
                    if (Employee[i][6] < 40) {
                        new Employee.pintInfo;*/
//                    System.out.printf(Arrays.toString(persArray));


//        printInfoFirm(Employee[]persArray);
//        public static String printInfoFirm(Employee[]persArray){

/*persArray[0] = person1;
        persArray[1] = person2;
        persArray[2] = person3;
        persArray[3] = person4;
        persArray[4] = person5;
        persArray[5] = person6;*/

        /*persArray[0] = newPerson1("Иванов Иван Петрович");
        persArray[1] = newPerson2("Иванов Иван Петрович");
        persArray[2] = newPerson3("Иванов Иван Петрович");
        persArray[3] = newPerson4("Иванов Иван Петрович");
        persArray[4] = newPerson5("Иванов Иван Петрович");
        persArray[5] = newPerson6("Иванов Иван Петрович");*/

/*    }

    private static void printInfo() {

    }

    public static void printInfoFirm(String[] persArray){
    Employee[] persArray = new Employee[];

    *//*for (int i = 0; i < persArray.length; i++) {
        if(age < 40){
            printInfo()
        }
    }*//**/

}