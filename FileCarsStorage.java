package homework_12_inter;

import homework_12.Car;
import homework_12_inter.CarStorage;

import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;


public class FileCarsStorage implements CarStorage {

    private String inputFileName;
    private String outputFileName;
    String st;

    public FileCarsStorage(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }
    public FileCarsStorage(String fileName){
        this(fileName,fileName);

    }

    @Override
    public Car[] readCars() {    //отсюда считываем инфу из файла

        try(FileInputStream fis = new FileInputStream(inputFileName)) {

            byte [] fileBytes = new byte[fis.available()];

            fis.read(fileBytes);

            String fileString = new String(fileBytes);

            String [] carString = fileString.split(";"+System.lineSeparator());

            for (String car: carString){
                String[] carProperties = car.split(",");
                System.out.println(Arrays.toString(carProperties));


            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return new Car[0];

    }


    @Override
    public void writeCars(Car[] cars) {

        try (FileOutputStream fos = new FileOutputStream(outputFileName)) {
            StringJoiner sj = new StringJoiner(";" + System.lineSeparator());
            for (Car car : cars) {
                sj.add(car.toFileFormat());
            }
            fos.write(sj.toString().getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
