/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import examcutgrade.ExamCutGrade;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SCIRMUTP
 */
public class testCutGrade {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ExamCutGrade call = new ExamCutGrade();
        call.readTXTFile("student.txt");
        call.DisplayData();
        System.out.println("============================");
        System.out.println("======= SORTED SCORE =======");
        call.sortScore();
        call.sortstudentID();
        call.DisplaySort();
        System.out.println("============================");
        System.out.println("========= CUT GRADE ========");
        call.knowGrade();
        call.DisplayGrade();
        System.out.println("============================");
        call.examPass();
        call.writeTxt("reportsummary.txt");
        
    }
    
}
