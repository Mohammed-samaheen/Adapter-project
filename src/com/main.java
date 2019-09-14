package com;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class main {


    public static void main(String[] args) {


        System.out.print("enter the name of your file :");
        Scanner input=new Scanner(System.in);
        String fileName=input.next();
        try {
            input=new Scanner(new File(fileName));
            String xmlString ="";
            while (input.hasNext()){
                xmlString+=input.nextLine()+'\n';
            }

            Adapter adapter =Adapter.getAdapter();
            ToolUtil.Logger.log(adapter.toJson(xmlString));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
