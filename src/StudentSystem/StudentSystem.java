package StudentSystem;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void doCommand(String[]args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] args = scanner.nextLine().split(" ");

        if (args[0].equals("Create")) {
            createStudent(args);
        }
        else if (args[0].equals("Show"))
        {
            String name = args[1];
            if (repo.containsKey(name))
            {
                System.out.println(repo.get(name));
            }
        }
    }

    private void createStudent(String[] args) {
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        double grade =Double.parseDouble(args[3]);
        if (!repo.containsKey(name))
        {
            var student = new Student(name, age, grade);
            repo.put(name,student);
        }
    }
}
