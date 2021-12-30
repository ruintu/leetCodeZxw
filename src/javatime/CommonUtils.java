package javatime;


import java.io.*;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class CommonUtils {



    //初始化时间解析格式
    private static String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM",
            "yyyyMMdd", "yyyyMMdd HHmmss","yyyyMMdd HH:mm:ss","yyyy-MM-dd'T'HH:mm:ss+SSS","dd/MM/yyyy HH.mm",
            "dd MMM yyyy HH:mm ZZ","dd/MM/yyyy hh:mm:ss a"," MMM dd yyyy HH:mm:ss z"
    };

    /**
     * Date转LocalDateTime
     * @param date Date
     * @return LocalDateTime
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        try {
            Instant instant = date.toInstant();
            ZoneId zoneId = ZoneId.systemDefault();
            return instant.atZone(zoneId).toLocalDateTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 功能描述:
     * 〈解析时间格式〉
     *
     * @params : [str]
     * @return : java.util.Date
     * @author : cwl
     * @date : 2019/10/17 16:47
     */
    public static LocalDateTime parseDate(Object str) {
        if (str == null) {
            return null;
        }
        return parseDate(str.toString().trim(), parsePatterns);
    }


    public static LocalDateTime parseDate(String str, String[] parsePatterns) {
        if (str == null || parsePatterns == null) {
            throw new IllegalArgumentException("Date and Patterns must not be null");
        }

        DateTimeFormatter dateTimeFormatter = null;

        for (int i = 0; i < parsePatterns.length; i++) {
            if (i == 0) {
                dateTimeFormatter = DateTimeFormatter.ofPattern(parsePatterns[0], Locale.ENGLISH);
            } else {
                dateTimeFormatter = DateTimeFormatter.ofPattern(parsePatterns[i], Locale.ENGLISH);
            }
            LocalDateTime parser = null;
            try {

                parser = LocalDateTime.parse(str, dateTimeFormatter);

            }catch (DateTimeParseException e){

            }

            if(parser != null)
                return parser;

        }
        return null;


    }

    public static void main(String[] args) {
        LocalDateTime date = CommonUtils.parseDate("20201202 150246 ");
        System.out.println("========>date        "+date);


        LocalDateTime date7 = CommonUtils.parseDate("28/01/2021 09:17:33 PM");
        System.out.println("========>date7        "+date7);


        LocalDateTime date8 = CommonUtils.parseDate("Jun 03 2013 07:01:29 GMT");
        System.out.println("========>date8        "+date8);


        DateTimeFormatter df2 = DateTimeFormatter.ofPattern(" MMM dd yyyy HH:mm:ss z", Locale.ENGLISH);
        LocalDateTime dateTime2 = LocalDateTime.parse(" Jun 03 2013 07:01:29 GMT", df2);
        System.out.println("========>dateTime2        "+dateTime2);

    }


}
