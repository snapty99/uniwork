/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examcutgrade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SCIRMUTP
 */
public class ExamCutGrade {
    int passexam = 0;
    int failexam = 0;
    ArrayList<Integer> StudentID = new ArrayList<Integer>();
    ArrayList<Integer> SortStudentID = new ArrayList<Integer>();
    ArrayList<Integer> Score = new ArrayList<Integer>();
    ArrayList<Integer> PointScore = new ArrayList<Integer>();
    ArrayList<String> myGrade = new ArrayList<String>();
    ArrayList<Integer> scoreindex = new ArrayList<Integer>();

    public void readTXTFile(String filename) throws FileNotFoundException {
        Scanner readfile = new Scanner(new FileReader(filename));
        int i = 0;
        while (readfile.hasNext()) {
            StudentID.add(readfile.nextInt());
            Score.add(readfile.nextInt());
            PointScore.add(Score.get(i));
            i++;
        }
    }

    public void DisplayData() {
        System.out.println("===== DATA FROM TEXT FILE =====");
        System.out.println("STUDENTID \t|\t SCORE");
                    System.out.println("------------------------------");
        for (int i = 0; i < StudentID.size(); i++) {
            System.out.println(StudentID.get(i) + " \t|\t " + Score.get(i));
        }
    }

    public void DisplaySort() {
        System.out.println("STUDENTID \t|\t SCORE");
                    System.out.println("------------------------------");
        for (int i = 0; i < SortStudentID.size(); i++) {
            System.out.println(SortStudentID.get(i) + " \t|\t " + Score.get(i));
        }
    }

    public void sortScore() {
        Collections.sort(Score);
        Collections.reverse(Score);
    }

    public void sortstudentID() {
        
        for (int i = 0; i < PointScore.size(); i++) {
            scoreindex.add(PointScore.indexOf(Score.get(i)));;
            SortStudentID.add(StudentID.get(scoreindex.get(i)));
            PointScore.set(scoreindex.get(i), -1);
        }

    }

    public void examPass() {
        System.out.println("=== STUDENT PASSED EXAM ===");
        System.out.println("STUDENTID \t|\t SCORE");
            System.out.println("------------------------------");
        int pass = 0;
        int fail = 0;
        for (int i = 0; i < SortStudentID.size(); i++) {
            if (Score.get(i) >= 50) {
                System.out.println(SortStudentID.get(i) + " \t|\t " + Score.get(i));
                pass++;
            }
        }
        this.passexam = pass;
        System.out.println("PASSED EXAM " + pass + " PERSON");
        System.out.println("=== STUDENT NOTPASS EXAM ===");
        System.out.println("STUDENTID \t|\t SCORE");
            System.out.println("------------------------------");
        for (int i = 0; i < SortStudentID.size(); i++) {
            if (Score.get(i) < 50) {
                System.out.println(SortStudentID.get(i) + " \t|\t " + Score.get(i));
                fail++;
            }
        }
        this.failexam = fail;
        System.out.println("FAILED EXAM " + fail + " PERSON");
    }

    public void writeTxt(String filename) throws IOException {
        try {
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);
            fw.write("STUDENTID"
                    + "\t|\tSCORE\n");
            fw.write("------------------------------\n");
            for (int i = 0; i < SortStudentID.size(); i++) {
                String writeid = String.valueOf(SortStudentID.get(i));
                String writescore = String.valueOf(Score.get(i));
                fw.write(writeid + "\t|\t" + writescore + "\n");

            }
            fw.write("PASSED EXAM TOTAL " + passexam + " PERSON\nFAILED EXAM TOTAL " + failexam +" PERSON");
            fw.flush();
            System.out.println("Write report to file Successfully");

        } catch (IOException e) {
        }
    }

    public void DisplayGrade() {
        System.out.println("STUDENTID \t|\t GRADE");
                    System.out.println("------------------------------");
        for (int i = 0; i < SortStudentID.size(); i++) {
            System.out.println(SortStudentID.get(i) + " \t|\t " + myGrade.get(i));
        }
    }

    public void knowGrade() {
        for (int i = 0; i < Score.size(); i++) {
            myGrade.add(divideGrade(Score.get(i)));
        }
    }

    public String divideGrade(int score) {
        String grade;
        if (score >= 80) {
            grade = "A";
            return grade;
        }
        if (score >= 75) {
            grade = "B+";
            return grade;
        }
        if (score >= 70) {
            grade = "B";
            return grade;
        }
        if (score >= 65) {
            grade = "C+";
            return grade;
        }
        if (score >= 60) {
            grade = "C";
            return grade;
        }
        if (score >= 55) {
            grade = "D+";
            return grade;
        }
        if (score >= 50) {
            grade = "D";
            return grade;
        }
        if (score < 50) {
            grade = "F";
            return grade;
        }
        return "ERROR";
    }

}
