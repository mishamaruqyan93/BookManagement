package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");


    public static Date stringToDate(String dateStr) {
        try {
            Date parse = simpleDateFormat.parse(dateStr);
            return parse;
        } catch (ParseException e) {
            System.out.println("invalid format");
        }
        return null;
    }

    public static String dateToString(Date date) {
        if (date ==null){
            return "";
        }
        return simpleDateFormat.format(date);
    }
}
