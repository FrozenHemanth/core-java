package com.hemanth.software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.sql.PreparedStatement;

public class ReadExcel {

    public static void main(String[] args) {

        String excelPath = "Software_Info.xlsx";

        try {

            FileInputStream fis = new FileInputStream(excelPath);

            Workbook workbook = new XSSFWorkbook(fis);

            Sheet sheet = workbook.getSheetAt(0);

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/software_db","root","hemanth@mysql");


            String sql =
                    "INSERT INTO software(software_name,founder,launch_date,description) VALUES(?,?,?,?)";

            assert connection != null;
            PreparedStatement ps = connection.prepareStatement(sql);
            for (Row row : sheet) {

                if (row.getRowNum() == 0) {
                    continue;
                }

                String softwareName =
                        row.getCell(0).getStringCellValue();

                String founder =
                        row.getCell(1).getStringCellValue();

                String launchDate =
                        row.getCell(2).getStringCellValue();

                String description =
                        row.getCell(3).getStringCellValue();

                ps.setString(1, softwareName);
                ps.setString(2, founder);
                ps.setString(3, launchDate);
                ps.setString(4, description);

                ps.executeUpdate();
            }

            workbook.close();
            connection.close();

            System.out.println("Data inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

