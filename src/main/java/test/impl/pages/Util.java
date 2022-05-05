package test.impl.pages;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd.HH.mm.ss.SSSXXX");
    public static String timeStamp()

    {
        Date dt= new Date();
return sdf.format((new Timestamp(dt.getTime()))).toString();

    }

}

