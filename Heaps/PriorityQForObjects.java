package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQForObjects {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("Aryan", 3));
        pq.add(new Student("Akash", 8));
        pq.add(new Student("Alok", 1));
        pq.add(new Student("Akarshit", 4));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }

    }
}
