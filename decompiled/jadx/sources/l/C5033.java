package l;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۚ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K4FK */
/* JADX INFO: loaded from: classes2.dex */
public final class C5033 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final DateFormat[] f15846;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f15847;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f15848 = new C0093();

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f15847 = strArr;
        f15846 = new DateFormat[strArr.length];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Date m14545(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f15848.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f15847;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = f15846;
                DateFormat simpleDateFormat = dateFormatArr[i];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new SimpleDateFormat(f15847[i], Locale.US);
                    simpleDateFormat.setTimeZone(C20032.f64892);
                    dateFormatArr[i] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m14544(Date date) {
        return ((DateFormat) f15848.get()).format(date);
    }
}
