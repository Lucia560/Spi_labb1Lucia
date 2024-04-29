package org.example.provider;

import org.example.service.CurencyConverter_SvKr;

public class RonToSwedishKr implements CurencyConverter_SvKr {

    public RonToSwedishKr(){ System.out.println("This is your Sek amount converted to Ron: ");}

    @Override
    public String convertToKr(String sekAmount) {
        double newSekAmount = Double.parseDouble(sekAmount);;
        double ronAmount = newSekAmount * 0.20;
        String ronFormat = String.format("%.2f Ron",ronAmount);
        return "Sek" + ronFormat;
    }

}
