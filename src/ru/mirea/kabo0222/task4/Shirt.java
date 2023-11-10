package ru.mirea.kabo0222.task4;
import java.util.Arrays;

public class Shirt {
    private String code;
    private String description;
    private String color;
    private String size;

    public Shirt(String code, String description, String color, String size) {
        this.code = code;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Код: ").append(code).append("\n");
        sb.append("Описание: ").append(description).append("\n");
        sb.append("Цвет: ").append(color).append("\n");
        sb.append("Размер: ").append(size).append("\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirtArray = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            String[] shirtData = shirts[i].split(",");
            String code = shirtData[0];
            String description = shirtData[1];
            String color = shirtData[2];
            String size = shirtData[3];
            Shirt shirt = new Shirt(code, description, color, size);
            shirtArray[i] = shirt;
        }

        System.out.println(Arrays.toString(shirtArray));
    }
}
