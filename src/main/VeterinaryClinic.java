package main;

import main.clients.*;
import main.personal.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.getType;

public class VeterinaryClinic {
    static ArrayList<Animal> animals = new ArrayList<>();

    public static ArrayList<Flyable> getFlyables() {
        ArrayList<Flyable> result = new ArrayList<>();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Flyable) {
                result.add((Flyable) animals.get(i));
            }
        }
        return result;
    }

    public static ArrayList<Swimable> getSwimmables() {
        ArrayList<Swimable> result = new ArrayList<>();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Swimable) {
                result.add((Swimable) animals.get(i));
            }
        }
        return result;
    }

    public static ArrayList<Goable> getGoables() {
        ArrayList<Goable> result = new ArrayList<>();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Goable) {
                result.add((Goable) animals.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args){


        //Создаю персонаж
        Doctor doctor = new Doctor();
        Assistant assistantOne = new Assistant();
        Assistant assistantTwo = new Assistant();

        Nurse nurseOne = new Nurse();
        Nurse nurseTwo = new Nurse();
        Nurse nurseThree = new Nurse();


        List<BaseStaff> staff = new ArrayList<>();
        staff.add(doctor);
        staff.add(assistantOne);
        staff.add(assistantTwo);

        staff.add(nurseOne);
        staff.add(nurseTwo);
        staff.add(nurseThree);


        System.out.println("Численность персонала: " + staff.size());
        System.out.println(staff);



        List<Goable> list = new ArrayList<>();

        Cat cat = new Cat();
        Cat cat2 = new Cat();
        list.add(cat);
        list.add(cat2);

        System.out.println("Численность пациентов: " + list.size());
        System.out.println(list);

    }
}
