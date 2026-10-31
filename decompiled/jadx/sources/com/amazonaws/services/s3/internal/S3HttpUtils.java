package com.amazonaws.services.s3.internal;

import com.alipay.sdk.m.w.a;
import com.google.android.material.badge.BadgeDrawable;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.C12789;

/* JADX INFO: loaded from: classes.dex */
public final class S3HttpUtils {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f500 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f501 = Pattern.compile(Pattern.quote(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F") + "|" + Pattern.quote("%3A") + "|" + Pattern.quote("%27") + "|" + Pattern.quote("%28") + "|" + Pattern.quote("%29") + "|" + Pattern.quote("%21") + "|" + Pattern.quote("%5B") + "|" + Pattern.quote("%5D") + "|" + Pattern.quote("%24"));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m477(String str) {
        if (str == null) {
            return "";
        }
        try {
            String strEncode = C12789.encode(str, a.D);
            Matcher matcher = f501.matcher(strEncode);
            StringBuffer stringBuffer = new StringBuffer(strEncode.length());
            while (matcher.find()) {
                String strGroup = matcher.group(0);
                if (BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX.equals(strGroup)) {
                    strGroup = " ";
                } else if ("*".equals(strGroup)) {
                    strGroup = "%2A";
                } else if ("%7E".equals(strGroup)) {
                    strGroup = "~";
                }
                matcher.appendReplacement(stringBuffer, strGroup);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
