//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// todo   Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
//        жана circumference деген статик методдору болсун.
//        areaны табуу учун: PI * (radius * radius)
//        circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат

       Circle.setPI(4.5);
       Circle.setRadius(3.5);


        System.out.println("Circle.getArea: " + Circle.getArea());
        System.out.println("Circle.getCircumference: " + Circle.getCircumference());


    }
}