package org.example;

public class Park {
    private String name;
    private Attraction[] attractions;

    public Park(String name, Attraction[] attractions) {
        this.name = name;
        this.attractions = attractions;
    }

    public static class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Стоимость: " + cost);
        }
    }

    public void printParkInfo() {
        System.out.println("Парк: " + name);
        for (Attraction attraction : attractions) {
            attraction.printInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Attraction attraction1 = new Attraction("Американские горки", "10:00 - 20:00", 500);
        Attraction attraction2 = new Attraction("Колесо обозрения", "10:00 - 22:00", 300);
        Attraction attraction3 = new Attraction("Комната страха", "12:00 - 21:00", 400);

        Park park = new Park("Сказочный мир", new Attraction[]{attraction1, attraction2, attraction3});

        park.printParkInfo();
    }
}
