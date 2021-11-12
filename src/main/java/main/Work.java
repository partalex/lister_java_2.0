package main;

import imlemented.Material;
import imlemented.Tape;
import fabric.Fabric;
import reader.ReadCSV;
import reader.CsvTable;
import writer.WriteCSV;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Work {
    public static void main(String[] args) {
        try {
//            ReadCSV readCSV = new ReadCSV("C:\\Users\\kaoko\\OneDrive\\Desktop\\list.csv");
            ReadCSV readCSV_relative = new ReadCSV(); // relative path
            Fabric fabric = new Fabric(CsvTable.list);

//        Element.print_static();
//        System.out.println("");
//
//            Product.print_static();
//            System.out.println("");
//
//            Tape.print_static();
//            System.out.println("");
//
//            Material.print_static();
//            System.out.println("");

//            WriteCSV.writeCSV(Product.csvList(), "Product"); // radi
//            WriteCSV.writeCSV(Material.csvList(), "Material"); // radi
            WriteCSV.writeCSV(Tape.statistic(), "Tape");
            WriteCSV.writeCSV(Material.statistic(), "StatisticsMaterial");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
