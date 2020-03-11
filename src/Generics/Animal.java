package Generics;

public class Animal {
    private int id;
    public Animal (int id){
        this.id = id;
    }
    public Animal (){    //так как у нас есть потомок, и мы переопределили конструктор, то и пустой конструктор
                        // стерся и его тоже надо переоперделить!!!
    }

    public String toString (){  //переопределим метод toString, чтобы он возвращал нам сконвертированную строку, вместо целого числа id
        return String.valueOf(id); //метод valueOf сконверирует число id  в строку
    }
}
