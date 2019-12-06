public class SetGet {
    public static void main(String[] args) {
        Persons persons1 = new Persons();
        persons1.setName("");
        persons1.setAge(-5);
        persons1.speak();
    }
}
class Persons {
    private String name; //сделали недоступными эти поля для пользователя
    private int age;

    public void setName (String name){     //создали сеттер имени
        if (name.isEmpty()){               //проверяем не пустое ли имя
            System.out.println("Ты ввел пустое имя");}
        else {
        this.name=name;}  //чтобы не придумывать разные имена для одного значения используем this
    }
    public String getName (){  //создали геттер имени
        return name;
    }

    public void setAge (int age){
        if (age<0){                         // проверяем возраст на отрицательность, если true то пишем ошибка
            System.out.println("Возраст должен быть положительным");}
        else {
        this.age=age;}  // this.age заменяет вызов метода в объекте person1.age
    }
    public int getAge (){
        return age;
    }
    public void speak (){
        System.out.println("Меня зовут "+name+" и мне "+age+" лет.");
    }
}