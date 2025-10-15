package academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio;

public class Car {
    private String name = "Audi";
    private String color;
    private int ano;

    public Car(String color, int ano) {
        this.color = color;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAno() {
        return ano;
    }
}
