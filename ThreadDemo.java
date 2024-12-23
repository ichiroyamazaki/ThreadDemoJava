package Threads;

import java.util.Scanner;

public class ThreadDemo extends Thread {
    private String threadName;

    public ThreadDemo(String name) {
        threadName = name;
    }

    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(threadName + " is " + currentThread.getState());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name your first thread: ");
        String name1 = scanner.nextLine();
        ThreadDemo thread1 = new ThreadDemo(name1);

        System.out.print("Name your second thread: ");
        String name2 = scanner.nextLine();
        ThreadDemo thread2 = new ThreadDemo(name2);

        System.out.println(thread1.threadName + " is " + thread1.getState());
        System.out.println(thread2.threadName + " is " + thread2.getState());

        System.out.println("\nStarting the threads...");
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nAfter sleep...");
        System.out.println(thread1.threadName + " is " + thread1.getState());
        System.out.println(thread2.threadName + " is " + thread2.getState());

        scanner.close();
    }
}
