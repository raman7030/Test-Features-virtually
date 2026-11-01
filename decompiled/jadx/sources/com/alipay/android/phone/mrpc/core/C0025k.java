package com.alipay.android.phone.mrpc.core;

import android.text.format.Time;
import com.google.android.material.datepicker.UtcDates;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.k */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C0025k {

    /* JADX INFO: renamed from: a */
    public static final Pattern f108a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");

    /* JADX INFO: renamed from: b */
    public static final Pattern f109b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    /* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.k$a */
    /* JADX INFO: compiled from: N673 */
    public class a {

        /* JADX INFO: renamed from: a */
        public int f110a;

        /* JADX INFO: renamed from: b */
        public int f111b;

        /* JADX INFO: renamed from: c */
        public int f112c;

        public a(int i, int i2, int i3) {
            this.f110a = i;
            this.f111b = i2;
            this.f112c = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m197a(String str) {
        int iM199c;
        int iM200d;
        int iM198b;
        a aVarM201e;
        int i;
        int i2;
        int i3;
        Matcher matcher = f108a.matcher(str);
        if (matcher.find()) {
            iM198b = m198b(matcher.group(1));
            iM199c = m199c(matcher.group(2));
            iM200d = m200d(matcher.group(3));
            aVarM201e = m201e(matcher.group(4));
        } else {
            Matcher matcher2 = f109b.matcher(str);
            if (!matcher2.find()) {
                throw new IllegalArgumentException();
            }
            iM199c = m199c(matcher2.group(1));
            int iM198b2 = m198b(matcher2.group(2));
            a aVarM201e2 = m201e(matcher2.group(3));
            iM200d = m200d(matcher2.group(4));
            iM198b = iM198b2;
            aVarM201e = aVarM201e2;
        }
        if (iM200d >= 2038) {
            i = 1;
            i2 = 0;
            i3 = 2038;
        } else {
            i = iM198b;
            i2 = iM199c;
            i3 = iM200d;
        }
        Time time = new Time(UtcDates.UTC);
        time.set(aVarM201e.f112c, aVarM201e.f111b, aVarM201e.f110a, i, i2, i3);
        return time.toMillis(false);
    }

    /* JADX INFO: renamed from: b */
    public static int m198b(String str) {
        if (str.length() != 2) {
            return str.charAt(0) - '0';
        }
        return (str.charAt(1) - '0') + ((str.charAt(0) - '0') * 10);
    }

    /* JADX INFO: renamed from: c */
    public static int m199c(String str) {
        int lowerCase = (Character.toLowerCase(str.charAt(2)) + (Character.toLowerCase(str.charAt(1)) + Character.toLowerCase(str.charAt(0)))) - 291;
        if (lowerCase == 9) {
            return 11;
        }
        if (lowerCase == 10) {
            return 1;
        }
        if (lowerCase == 22) {
            return 0;
        }
        if (lowerCase == 26) {
            return 7;
        }
        if (lowerCase == 29) {
            return 2;
        }
        if (lowerCase == 32) {
            return 3;
        }
        if (lowerCase == 40) {
            return 6;
        }
        if (lowerCase == 42) {
            return 5;
        }
        if (lowerCase == 48) {
            return 10;
        }
        switch (lowerCase) {
            case 35:
                return 9;
            case 36:
                return 4;
            case 37:
                return 8;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m200d(String str) {
        if (str.length() == 2) {
            int iCharAt = (str.charAt(1) - '0') + ((str.charAt(0) - '0') * 10);
            return iCharAt >= 70 ? iCharAt + 1900 : iCharAt + 2000;
        }
        if (str.length() == 3) {
            return (str.charAt(2) - '0') + ((str.charAt(1) - '0') * 10) + ((str.charAt(0) - '0') * 100) + 1900;
        }
        if (str.length() == 4) {
            return (str.charAt(3) - '0') + ((str.charAt(2) - '0') * 10) + ((str.charAt(1) - '0') * 100) + ((str.charAt(0) - '0') * 1000);
        }
        return 1970;
    }

    /* JADX INFO: renamed from: e */
    public static a m201e(String str) {
        int iCharAt = str.charAt(0) - '0';
        int i = 1;
        if (str.charAt(1) != ':') {
            iCharAt = (iCharAt * 10) + (str.charAt(1) - '0');
            i = 2;
        }
        return new a(iCharAt, (str.charAt(i + 2) - '0') + ((str.charAt(i + 1) - '0') * 10), (str.charAt(i + 5) - '0') + ((str.charAt(i + 4) - '0') * 10));
    }
}
