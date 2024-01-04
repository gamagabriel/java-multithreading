package org.multithread.creation;

import java.util.ArrayList;
import java.util.List;

public class ExerciseAboutThreadCreation {

    private final List<Runnable> tasks;
    private final static String RUNNABLE_ONE = "Runnable 1 executed";
    private final static String RUNNABLE_TWO = "Runnable 2 executed";
    private final static String RUNNABLE_THREE = "Runnable 3 executed";

    public ExerciseAboutThreadCreation(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    public void executeAll() {
        List<Thread> threads = new ArrayList<>(tasks.size());

        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }

    }

    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println(RUNNABLE_ONE);
        Runnable runnable2 = () -> System.out.println(RUNNABLE_TWO);
        Runnable runnable3 = () -> System.out.println(RUNNABLE_THREE);

        List<Runnable> list = List.of(runnable1, runnable2, runnable3);
        ExerciseAboutThreadCreation exerciseAboutThreadCreation = new ExerciseAboutThreadCreation(list);
        exerciseAboutThreadCreation.executeAll();
    }
}