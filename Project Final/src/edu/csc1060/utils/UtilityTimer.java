package src.edu.csc1060.utils;

public class UtilityTimer {
    public static long getTime() {
        return System.nanoTime();
    }

    public static long compareTime(long start, long finish) {
        return (finish - start);
    }

    public static void logTime() {
        System.nanoTime();
    }
}
