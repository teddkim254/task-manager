package com.teddkim.taskmanagerAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TaskManagerApiApplication {

  class Task {
    //properties! our class have on start
    private int id;
    private String tittle;
    private boolean done;

    // constructor, where objects/instances will be born or made from
    Task(String Tittle) {
      this.tittle = Tittle;
      this.id = 0;
      this.done = false;
    }

    int getID() { return id; }
    String getTittle() { return tittle; }
    boolean isDone() { return done; }

    void toggleDone() { this.done = !this.done; } // just fancy equate to true
  }










  public static void main(String[] args) {
    SpringApplication.run(TaskManagerApiApplication.class, args);
  }

  Scanner scanner = new Scanner(System.in);

  // all this can't work on a web server app lol!!!!😭😭😭
  System.out.println("Enter new task Titlle: ");
  tittle = scanner.nextLine();

  Task tasks = new Task(tittle);
}
