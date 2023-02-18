package module12;

import module7.Time;

public class StopThreadTask {
    public static void main(String[] args) throws InterruptedException {
        StoppableThread thread = new StoppableThread();
        thread.start();
        Thread.currentThread().sleep(7000);
        thread.setAlive(false);
        System.out.println("Continue main method");
    }

    public static class StoppableThread extends Thread {
        private boolean isAlive = true;
        // подумати як поставити поток на паузу методом флагів
        private boolean isRunning = true;
        @Override
        public void run() {
            while (isAlive) {
                System.out.println("Time: " + System.currentTimeMillis());
                try {
                    Thread.sleep(2000l);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public void setAlive(boolean alive) {
            isAlive = alive;
        }
    }
}
