package Tasks;
/*
Программист может создать мужчину и женщину парой-тройкой ловких движений своих пальцев. Делов-то: пишем соответствующие
 классы, создаем объекты. Поработаем над семейной парой: cформируем объекты Man и Woman, затем сохраняем ссылку
  на Woman в man.wife, а на Man — в woman.husband. Видите, даже загс не нужен.
 */
public class Family {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
    }
    public static class Man{
        String name;
        int age;
        Woman wife;
    }
    public static class Woman{
        String name;
        int age;
        Man husband;
    }
}
