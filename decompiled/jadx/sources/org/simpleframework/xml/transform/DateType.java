package org.simpleframework.xml.transform;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public enum DateType {
    FULL("yyyy-MM-dd HH:mm:ss.S z"),
    LONG("yyyy-MM-dd HH:mm:ss z"),
    NORMAL("yyyy-MM-dd z"),
    SHORT("yyyy-MM-dd");

    public DateFormat format;

    DateType(String str) {
        this.format = new DateFormat(str);
    }

    private DateFormat getFormat() {
        return this.format;
    }

    public static String getText(Date date) {
        return FULL.getFormat().getText(date);
    }

    public static Date getDate(String str) {
        return getType(str).getFormat().getDate(str);
    }

    public static DateType getType(String str) {
        int length = str.length();
        if (length > 23) {
            return FULL;
        }
        if (length > 20) {
            return LONG;
        }
        if (length > 11) {
            return NORMAL;
        }
        return SHORT;
    }

    public class DateFormat {
        public SimpleDateFormat format;

        public synchronized Date getDate(String str) {
            return this.format.parse(str);
        }

        public synchronized String getText(Date date) {
            return this.format.format(date);
        }

        public DateFormat(String str) {
            this.format = new SimpleDateFormat(str);
        }
    }
}
