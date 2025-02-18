package org.example.pr6.local_class;

public class LocalClassDemo {

    public void executeTask() {
        int taskId = 999;

        class LocalWorker {
            public void run() {
                System.out.println("Local started with taskId = " + taskId);
            }
        }
        LocalWorker worker = new LocalWorker();
        worker.run();
    }

    public static void main(String[] args) {


    }
}
