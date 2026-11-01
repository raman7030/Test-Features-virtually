package com.amazonaws.services.p061s3.internal;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.google.android.material.badge.BadgeDrawable;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067l.C14523;

/* JADX INFO: loaded from: classes.dex */
public final class S3HttpUtils {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f1660 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f1661 = Pattern.compile(Pattern.quote(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F") + "|" + Pattern.quote("%3A") + "|" + Pattern.quote("%27") + "|" + Pattern.quote("%28") + "|" + Pattern.quote("%29") + "|" + Pattern.quote("%21") + "|" + Pattern.quote("%5B") + "|" + Pattern.quote("%5D") + "|" + Pattern.quote("%24"));

    /* JADX INFO: renamed from: ֫ */
    public static String m1643(String str) {
        if (str == null) {
            return "";
        }
        try {
            String strEncode = C14523.encode(str, C0233a.f1077D);
            Matcher matcher = f1661.matcher(strEncode);
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
