package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.concurent.RunnableSuccessor;
import com.epam.jwd.lecture.concurent.ThreadSuccessor;

public class Main {

    public static void main(String[] args) {
        final ThreadSuccessor firstThread = new ThreadSuccessor();
        final Thread secondThread = new Thread(new RunnableSuccessor());

        System.out.println("Hello from Main thread");

        System.out.println("first thread state: " + firstThread.getState());
        System.out.println("second thread state: " + secondThread.getState());

        firstThread.start();

        System.out.println("first thread state: " + firstThread.getState());
        System.out.println("second thread state: " + secondThread.getState());

        secondThread.start();

        System.out.println("first thread state: " + firstThread.getState());
        System.out.println("second thread state: " + secondThread.getState());

        System.out.println("Hello again from Main thread");
    }
}
