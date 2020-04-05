package com.szachnowicz;


public class CalculationService {

    public static void main(String[] args) {
        CalculationService calculationService = new CalculationService();

        NumberProvider integrated = new IntegrationNumberProvider();
        NumberProvider localProvider = new LocalNumberProvider();


        Integer result = calculationService.addNumbers(integrated.getRandomNumber(),
                localProvider.getRandomNumber());

        System.out.println("Result : " +result);
    }

    public Integer addNumbers(Integer first, Integer second) {
        return first + second;

    }


}
