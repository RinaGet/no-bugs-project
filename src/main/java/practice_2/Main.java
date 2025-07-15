package practice_2;

public class Main {
    public static void main(String[] args) {
        // проверка конструктора по умолчанию
        Student petya = new Student(18, "Petya");

        petya.print(); //оптимизировали код!запомнить!

        System.out.println("Возраст Пети " + petya.age);
        System.out.println("Имя Пети " + petya.name);

        //создаём другой новый объект
        Student kolya = new Student(20, "Kolya"); // по одному и тому же чертежу мы можем создавать много разных объектов

        kolya.print(); //оптимизировали код!запомнить!

        System.out.println("Возраст Коли " + kolya.age);
        System.out.println("Имя Коли " + kolya.name);

        petya.setName("Petr");
        System.out.println("New Petya's name -> " + petya.name);

        kolya.setAge(21);
        System.out.println("Happy birthday Kolya! Now you are " + kolya.age + " years old!");



        // DEBUG
        // программа останавливается ПЕРЕД брейкпоинтом

    }
}
