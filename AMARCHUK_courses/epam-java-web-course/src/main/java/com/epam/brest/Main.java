package com.epam.brest;

import com.epam.brest.files.CSVFileReader;
import com.epam.brest.files.FileReader;
import com.epam.brest.model.ReadDataState;
import com.epam.brest.model.Status;
import com.epam.brest.model.StatusType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-config.xml");
//        FileReader fileReader=(FileReader) applicationContext.getBean("fileReader");
//
//        Map<Integer, BigDecimal> pricePerKgMap = fileReader.readData("price_weight.csv");
//        Map<Integer, BigDecimal> pricePerKmMap = fileReader.readData("price_distance.csv");
//
//        try (Scanner scanner =new Scanner(System.in)){
//            Status currentStatus = new ReadDataState(scanner, pricePerKgMap, pricePerKmMap);
//            while (currentStatus.getType()!= StatusType.EXIT){
//                System.out.println("current type: "+currentStatus.getType());
//                currentStatus=currentStatus.handle();
//            }
//        }


            for(int i = 0; i < 13; i = i + 2) {
                if((i == 6)||(i == 10))
                    break;
                System.out.print(i+", ");
            }
        }



}
