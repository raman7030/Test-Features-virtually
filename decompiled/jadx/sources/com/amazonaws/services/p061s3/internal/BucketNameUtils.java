package com.amazonaws.services.p061s3.internal;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public enum BucketNameUtils {
    ;


    /* JADX INFO: renamed from: ۙ */
    public static final int f1634 = 3;

    /* JADX INFO: renamed from: ᩶ */
    public static final int f1635 = 63;

    /* JADX INFO: renamed from: ᩹ */
    public static final Pattern f1637 = Pattern.compile("(\\d+\\.){3}\\d+");

    /* JADX INFO: renamed from: ܽ */
    public static void m1628(String str) {
        m1625(str, true);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m1627(String str) {
        return m1625(str, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m1624(String str) {
        return m1627(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m1625(String str, boolean z) {
        if (str == null) {
            return m1626(z, "Bucket name cannot be null");
        }
        if (str.length() < 3 || str.length() > 63) {
            return m1626(z, "Bucket name should be between 3 and 63 characters long");
        }
        if (f1637.matcher(str).matches()) {
            return m1626(z, "Bucket name must not be formatted as an IP Address");
        }
        int i = 0;
        char c = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                return m1626(z, "Bucket name should not contain uppercase characters");
            }
            if (cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n') {
                return m1626(z, "Bucket name should not contain white space");
            }
            if (cCharAt == '.') {
                if (c == 0) {
                    return m1626(z, "Bucket name should not begin with a period");
                }
                if (c == '.') {
                    return m1626(z, "Bucket name should not contain two adjacent periods");
                }
                if (c == '-') {
                    return m1626(z, "Bucket name should not contain dashes next to periods");
                }
            } else if (cCharAt == '-') {
                if (c == '.') {
                    return m1626(z, "Bucket name should not contain dashes next to periods");
                }
                if (c == 0) {
                    return m1626(z, "Bucket name should not begin with a '-'");
                }
            } else if (cCharAt < '0' || ((cCharAt > '9' && cCharAt < 'a') || cCharAt > 'z')) {
                return m1626(z, "Bucket name should not contain '" + cCharAt + "'");
            }
            i++;
            c = cCharAt;
        }
        if (c == '.' || c == '-') {
            return m1626(z, "Bucket name should not end with '-' or '.'");
        }
        return !str.contains(".");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m1626(boolean z, String str) {
        if (z) {
            throw new IllegalArgumentException(str);
        }
        return false;
    }
}
