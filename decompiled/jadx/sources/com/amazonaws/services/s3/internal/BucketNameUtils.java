package com.amazonaws.services.s3.internal;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public enum BucketNameUtils {
    ;


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f474 = 3;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int f475 = 63;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f477 = Pattern.compile("(\\d+\\.){3}\\d+");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m462(String str) {
        m459(str, true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m461(String str) {
        return m459(str, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m458(String str) {
        return m461(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m459(String str, boolean z) {
        if (str == null) {
            return m460(z, "Bucket name cannot be null");
        }
        if (str.length() < 3 || str.length() > 63) {
            return m460(z, "Bucket name should be between 3 and 63 characters long");
        }
        if (f477.matcher(str).matches()) {
            return m460(z, "Bucket name must not be formatted as an IP Address");
        }
        int i = 0;
        char c = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                return m460(z, "Bucket name should not contain uppercase characters");
            }
            if (cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n') {
                return m460(z, "Bucket name should not contain white space");
            }
            if (cCharAt == '.') {
                if (c == 0) {
                    return m460(z, "Bucket name should not begin with a period");
                }
                if (c == '.') {
                    return m460(z, "Bucket name should not contain two adjacent periods");
                }
                if (c == '-') {
                    return m460(z, "Bucket name should not contain dashes next to periods");
                }
            } else if (cCharAt == '-') {
                if (c == '.') {
                    return m460(z, "Bucket name should not contain dashes next to periods");
                }
                if (c == 0) {
                    return m460(z, "Bucket name should not begin with a '-'");
                }
            } else if (cCharAt < '0' || ((cCharAt > '9' && cCharAt < 'a') || cCharAt > 'z')) {
                return m460(z, "Bucket name should not contain '" + cCharAt + "'");
            }
            i++;
            c = cCharAt;
        }
        if (c == '.' || c == '-') {
            return m460(z, "Bucket name should not end with '-' or '.'");
        }
        return !str.contains(".");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m460(boolean z, String str) {
        if (z) {
            throw new IllegalArgumentException(str);
        }
        return false;
    }
}
