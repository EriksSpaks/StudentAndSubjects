package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student studentOne = new Student("Artur", 15, 9);
//        Student studentTwo = new Student("Mark", 14, 8);
//        studentOne.setGradeDesign(8);
//        studentOne.setGradeLiterature(9);
//        studentOne.setGradeRussian(7);
//        studentOne.setGradeMath(10);
//        studentOne.setGradeSocial(8);
//        studentTwo.setGradeDesign(4);
//        studentTwo.setGradeLiterature(6);
//        studentTwo.setGradeRussian(5);
//        studentTwo.setGradeMath(3);
//        studentTwo.setGradeSocial(7);
        System.out.println("Here comes the questions to make you look stupid");
        int correctQuestions = 0;
        if (askMath1()) {
            correctQuestions++;
        }
        if (askMath2()) {
            correctQuestions++;
        }
        if (askMath3()) {
            correctQuestions++;
        }
        studentOne.setGradeMath((int) Math.round((correctQuestions/3.0)*10));
        correctQuestions = 0;
        if (askDesign1()) {
            correctQuestions++;
        }
        if (askDesign2()) {
            correctQuestions++;
        }
        if (askDesign3()) {
            correctQuestions++;
        }
        studentOne.setGradeDesign((int) Math.round((correctQuestions/3.0)*10));
        correctQuestions = 0;
        if (askLiterature1()) {
            correctQuestions++;
        }
        if (askLiterature2()) {
            correctQuestions++;
        }
        if (askLiterature3()) {
            correctQuestions++;
        }
        studentOne.setGradeLiterature((int) Math.round((correctQuestions/3.0)*10));
        if (askSocial1()) {
            correctQuestions++;
        }
        if (askSocial2()) {
            correctQuestions++;
        }
        if (askSocial3()) {
            correctQuestions++;
        }
        studentOne.setGradeSocial((int) Math.round((correctQuestions/3.0)*10));
        correctQuestions = 0;
        if (askRussian1()) {
            correctQuestions++;
        }
        if (askRussian2()) {
            correctQuestions++;
        }
        if (askRussian3()) {
            correctQuestions++;
        }
        studentOne.setGradeRussian((int) Math.round((correctQuestions/3.0)*10));
        System.out.println("Aaand your marks are:");
        System.out.println("Math: " + studentOne.getGradeMath());
        System.out.println("D&T: " + studentOne.getGradeDesign());
        System.out.println("Literature: " + studentOne.getGradeLiterature());
        System.out.println("Social knowledge: " + studentOne.getGradeSocial());
        System.out.println("Russian: " + studentOne.getGradeRussian());
        System.out.println("Yes, you're right. You are terrible in all of these subjects! Congratulations");
    }

    public static boolean askMath1() {
        String answer;
        System.out.println("1st Math question:");
        System.out.println("What is 2+2?");
        System.out.println("a: 4    b: 5    c: 3    d:  10");
        answer = scanner.nextLine();
        return answer.equals("b");
    }
    public static boolean askMath2() {
        String answer;
        System.out.println("2nd Math question:");
        System.out.println("Find x: \nx^2 + 3x - 4 = 0");
        System.out.println("a: x1=-1;x2=-4    b: x=0    c: x≠R    d:  x=7");
        answer = scanner.nextLine();
        return answer.equals("c");
    }
    public static boolean askMath3() {
        String answer;
        System.out.println("3rd Math question:");
        System.out.println("What is hypotenuse, if other triangle sides equals 3 and 4");
        System.out.println("a: 5    b: 8    c: There is no such triangle    d:  10");
        answer = scanner.nextLine();
        return answer.equals("c");
    }
    public static boolean askDesign1() {
        String answer;
        System.out.println("1st D&T question:");
        System.out.println("What do you do on the D&T wuestion?");
        System.out.println("a: Nothing    b: work with wood    c: juggle with dangerous tools");
        answer = scanner.nextLine();
        return answer.equals("c");
    }
    public static boolean askDesign2() {
        String answer;
        System.out.println("2nd D&T question:");
        System.out.println("How many fingers do you have after D&T lesson?");
        System.out.println("a: 8    b: 10    c: 6");
        answer = scanner.nextLine();
        return answer.equals("a");
    }
    public static boolean askDesign3() {
        String answer;
        System.out.println("3rd D&T question:");
        System.out.println("How much does a jigsaw cost?");
        System.out.println("a: 8$    b: so much that you can never afford it     c: 170$");
        answer = scanner.nextLine();
        return answer.equals("b");
    }
    public static boolean askLiterature1() {
        String answer;
        System.out.println("1st Literature question:");
        System.out.println("Who wrote Romeo and Juliet Poem?");
        System.out.println("a: William Shakespeare    b: Me     c: Your D&T Teacher");
        answer = scanner.nextLine();
        return answer.equals("c");
    }
    public static boolean askLiterature2() {
        String answer;
        System.out.println("2nd Literature question:");
        System.out.println("Who is Pushkin?");
        System.out.println("a: Vladimir Putin's cousin    b: A poet     c: Gangsta from your district");
        answer = scanner.nextLine();
        return answer.equals("a");
    }
    public static boolean askLiterature3() {
        String answer;
        System.out.println("3rd Literature question:");
        System.out.println("Which mark do you want in Literature?");
        System.out.println("a: 10    b: 7     c: 3");
        answer = scanner.nextLine();
        return answer.equals("c");
    }
    public static boolean askSocial1() {
        String answer;
        System.out.println("1st Social knowledge question:");
        System.out.println("What do you need to do, if someone attacks you?");
        System.out.println("a: run away    b: tell him that you don't like it     c: shoot him with air gun");
        answer = scanner.nextLine();
        return answer.equals("c");
    }
    public static boolean askSocial2() {
        String answer;
        System.out.println("2nd Social knowledge question:");
        System.out.println("What do you need to do, if someone offers you a cigarette or drugs?");
        System.out.println("a: run away    b: take a cigarette and smoke it     c: take a cigarette and sell it, so you can make money for it");
        answer = scanner.nextLine();
        return answer.equals("c");
    }
    public static boolean askSocial3() {
        String answer;
        System.out.println("3rd Social knowledge question:");
        System.out.println("What do you need to do, if you injured yourself?");
        System.out.println("a: run back home    b: cut off your leg so you don't feel pain    c: continue doing you were doing before injury");
        answer = scanner.nextLine();
        return answer.equals("b");
    }
    public static boolean askRussian1() {
        String answer;
        System.out.println("1st Russian lesson's question:");
        System.out.println("What is the best russian drink?");
        System.out.println("a: Vodka    b: Koumiss(кумыс)    c: water");
        answer = scanner.nextLine();
        return answer.equals("a");
    }
    public static boolean askRussian2() {
        String answer;
        System.out.println("2nd Russian lesson's question:");
        System.out.println("Who will never leave the Russian government?");
        System.out.println("a: Me    b: Grandma    c: Putin");
        answer = scanner.nextLine();
        return answer.equals("c");
    }
    public static boolean askRussian3() {
        String answer;
        System.out.println("3rd and the last Russian lesson's question:");
        System.out.println("Rate this test?");
        System.out.println("a: -10, This test was terrible    b: 80/100, this test was good    c: 100/100, this test is perfect");
        answer = scanner.nextLine();
        return answer.equals("a");
    }

}