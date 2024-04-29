package org.example.provider;

import org.example.service.CurencyConverter_SvKr;

public class EuroToSwedishKr implements CurencyConverter_SvKr {

    public EuroToSwedishKr(){
        System.out.println("This is your SEK amount converted to Euro: ");
    }

    @Override
    public String convertToKr(String sekAmount) {
        double newSekAmount = Double.parseDouble(sekAmount);;
        double euroAmount = newSekAmount * 0.11;
        String euroFormat = String.format("%.2f Euro",euroAmount);
        return "Sek" +euroFormat;
    }


}
