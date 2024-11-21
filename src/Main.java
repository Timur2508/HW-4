public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");
        System.out.println("Задача №1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний ");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать. ");
        }

        System.out.println("Задача №2");
        int tempAir = 5;
        if (tempAir >= 5) {
            System.out.println("На улице холодно, нужно надеть шапку ");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки ");
        }

        System.out.println("Задача №3");
        int rateLimit = 50;
        if (rateLimit >= 60) {
            System.out.println("Скорость превышена ,придется заплатить штраф ");
        } else {
            System.out.println("Превышения скорости нет ,можно ездить спокойно ");
        }

        System.out.println("Задача №4");
        int age1 = 19;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен от 2 до 6 лет, то ему нужно ходить в детский сад ");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен от 7 до 17 лет, то ему нужно ходить в школу ");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если человеку больше или равно 18 лет, но меньше или равно 24, то его место в университете ");
        } else if (age1 >= 24 && age1 <= 60) {
            System.out.println("А если человеку больше 24, то ему пора ходить на работу");
        }

        System.out.println("Задача №5");
        int ageChild = 3;
        if (ageChild >= 2 && ageChild <= 5) {
            System.out.println("Если возраст ребенка равен меньше 5 лет, то ему нельзя кататься на атракционе ");
        }else if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен больше 5, но меньше 14 лет,  то ему можно кататься на аттракционе в сопровождении взрослого.Если взрослого нет, то кататься нельзя.");
        }else if (ageChild >= 14 && ageChild <= 17) {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого. ");
        }

        System.out.println("Задача №6");
        int сapacityWagon = 5;
        if (сapacityWagon > 60) {
            System.out.println("Если место под номером " + сapacityWagon + ", то   место стоячее");
        }else if (сapacityWagon <= 62 && сapacityWagon != 0) {
            System.out.println("Если место под номером " + сapacityWagon + ", то   место сидячее ");
        } else {
            System.out.println("Если мест " + сapacityWagon + ", то вагон уже полностью забит  ");
        }

        System.out.println("Задача №7");
        int one = 15;
        int two = 9;
        int three = 11;
        if (one > two && one > three) {
            System.out.println("Число one больше");
        } else if (two > one && two > three) {
                System.out.println("Число two больше");
            } else {
                System.out.println("Число three больше остальных");
            }

        }


    }