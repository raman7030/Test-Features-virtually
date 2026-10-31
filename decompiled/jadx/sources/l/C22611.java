package l;

import com.google.android.material.datepicker.UtcDates;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩹᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I87D */
/* JADX INFO: loaded from: classes.dex */
public final class C22611 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final TimeZone f73058 = C3261.getTimeZone(UtcDates.UTC);

    /* JADX WARN: Code duplicated, block: B:60:0x00ea A[Catch: IllegalArgumentException -> 0x01d7, IllegalArgumentException | IndexOutOfBoundsException -> 0x01d9, TRY_LEAVE, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01d9, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0075, B:25:0x007b, B:29:0x0085, B:34:0x0095, B:36:0x009d, B:37:0x00a1, B:39:0x00a7, B:44:0x00b4, B:47:0x00bf, B:58:0x00e4, B:60:0x00ea, B:87:0x019e, B:69:0x00fe, B:70:0x0119, B:71:0x011a, B:75:0x0137, B:77:0x0144, B:80:0x014d, B:82:0x016c, B:85:0x017b, B:86:0x019d, B:74:0x0126, B:89:0x01cf, B:90:0x01d6, B:51:0x00cf, B:52:0x00d2, B:46:0x00bb), top: B:104:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126 A[Catch: IllegalArgumentException -> 0x01d7, IllegalArgumentException | IndexOutOfBoundsException -> 0x01d9, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01d9, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0075, B:25:0x007b, B:29:0x0085, B:34:0x0095, B:36:0x009d, B:37:0x00a1, B:39:0x00a7, B:44:0x00b4, B:47:0x00bf, B:58:0x00e4, B:60:0x00ea, B:87:0x019e, B:69:0x00fe, B:70:0x0119, B:71:0x011a, B:75:0x0137, B:77:0x0144, B:80:0x014d, B:82:0x016c, B:85:0x017b, B:86:0x019d, B:74:0x0126, B:89:0x01cf, B:90:0x01d6, B:51:0x00cf, B:52:0x00d2, B:46:0x00bb), top: B:104:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01cf A[Catch: IllegalArgumentException -> 0x01d7, IllegalArgumentException | IndexOutOfBoundsException -> 0x01d9, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01d9, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0075, B:25:0x007b, B:29:0x0085, B:34:0x0095, B:36:0x009d, B:37:0x00a1, B:39:0x00a7, B:44:0x00b4, B:47:0x00bf, B:58:0x00e4, B:60:0x00ea, B:87:0x019e, B:69:0x00fe, B:70:0x0119, B:71:0x011a, B:75:0x0137, B:77:0x0144, B:80:0x014d, B:82:0x016c, B:85:0x017b, B:86:0x019d, B:74:0x0126, B:89:0x01cf, B:90:0x01d6, B:51:0x00cf, B:52:0x00d2, B:46:0x00bb), top: B:104:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0126, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Date m50596(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i;
        int iM50595;
        int iM50596;
        int iM50597;
        int i2;
        int iM50598;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str3;
        String id;
        char cCharAt2;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iM50599 = m50595(index, i3, str);
            if (m50597(str, i3, '-')) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iM505910 = m50595(i3, i4, str);
            if (m50597(str, i4, '-')) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iM505911 = m50595(i4, i5, str);
            boolean zM50597 = m50597(str, i5, 'T');
            if (!zM50597 && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM50599, iM505910 - 1, iM505911);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zM50597) {
                int i6 = i4 + 5;
                iM50598 = m50595(i4 + 3, i6, str);
                if (m50597(str, i6, ':')) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                iM50595 = m50595(i6, i7, str);
                if (m50597(str, i7, ':')) {
                    i7 = i6 + 3;
                }
                if (str.length() <= i7 || (cCharAt2 = str.charAt(i7)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i5 = i7;
                    i = iM50598;
                } else {
                    i2 = i7 + 2;
                    iM50597 = m50595(i7, i2, str);
                    if (iM50597 > 59 && iM50597 < 63) {
                        iM50597 = 59;
                    }
                    if (m50597(str, i2, '.')) {
                        int i8 = i7 + 3;
                        int i9 = i7 + 4;
                        while (true) {
                            if (i9 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(i9);
                            if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                                i9++;
                            }
                            length2 = i9;
                            break;
                        }
                        int iMin = Math.min(length2, i7 + 6);
                        iM50596 = m50595(i8, iMin, str);
                        int i10 = iMin - i8;
                        if (i10 == 1) {
                            iM50596 *= 100;
                        } else if (i10 == 2) {
                            iM50596 *= 10;
                        }
                        i2 = length2;
                    } else {
                        iM50596 = 0;
                    }
                }
                if (str.length() > i2) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i2);
                timeZone = f73058;
                if (cCharAt == 'Z') {
                    length = i2 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i2);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + ChipTextInputComboView.TextFormatter.DEFAULT_TEXT;
                    }
                    length = i2 + strSubstring.length();
                    if (!strSubstring.equals("+0000") && !strSubstring.equals("+00:00")) {
                        str3 = "GMT" + strSubstring;
                        timeZone = C3261.getTimeZone(str3);
                        id = timeZone.getID();
                        if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iM50599);
                gregorianCalendar2.set(2, iM505910 - 1);
                gregorianCalendar2.set(5, iM505911);
                gregorianCalendar2.set(11, iM50598);
                gregorianCalendar2.set(12, iM50595);
                gregorianCalendar2.set(13, iM50597);
                gregorianCalendar2.set(14, iM50596);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i = 0;
            iM50595 = 0;
            iM50596 = 0;
            iM50597 = 0;
            i2 = i5;
            iM50598 = i;
            if (str.length() > i2) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i2);
            timeZone = f73058;
            if (cCharAt == 'Z') {
                length = i2 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i2);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + ChipTextInputComboView.TextFormatter.DEFAULT_TEXT;
                }
                length = i2 + strSubstring.length();
                if (!strSubstring.equals("+0000")) {
                    str3 = "GMT" + strSubstring;
                    timeZone = C3261.getTimeZone(str3);
                    id = timeZone.getID();
                    if (!id.equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iM50599);
            gregorianCalendar3.set(2, iM505910 - 1);
            gregorianCalendar3.set(5, iM505911);
            gregorianCalendar3.set(11, iM50598);
            gregorianCalendar3.set(12, iM50595);
            gregorianCalendar3.set(13, iM50597);
            gregorianCalendar3.set(14, iM50596);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = MotionUtils.EASING_TYPE_FORMAT_START + e.getClass().getName() + MotionUtils.EASING_TYPE_FORMAT_END;
            }
            ParseException parseException = new ParseException(C19462.m44858("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50597(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50595(int i, int i2, String str) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
