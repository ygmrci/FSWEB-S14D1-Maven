package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = developer;
                System.out.println("Junior developer başarıyla eklendi.");
            } else {
                System.out.println("Hata: Bu index zaten dolu!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = developer;
            } else {
                System.out.println("Hata: Bu index dolu!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index!");
        }

    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = developer;
            } else {
                System.out.println("Hata: Bu index dolu!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index!");
        }
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary() + 10000);
    }

}

