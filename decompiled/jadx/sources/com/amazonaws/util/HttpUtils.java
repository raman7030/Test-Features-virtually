package com.amazonaws.util;

import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.google.android.material.badge.BadgeDrawable;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067l.C14523;
import p067l.C17073;
import p067l.C17588;

/* JADX INFO: loaded from: classes.dex */
public class HttpUtils {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f1993 = Pattern.compile(Pattern.quote(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F"));

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Pattern.quote("%2A"));
        sb.append("|");
        sb.append(Pattern.quote("%2B"));
        sb.append("|");
        Pattern.compile(sb.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1940(String str, boolean z) {
        if (str == null) {
            return "";
        }
        try {
            String strEncode = C14523.encode(str, C0233a.f1077D);
            Matcher matcher = f1993.matcher(strEncode);
            StringBuffer stringBuffer = new StringBuffer(strEncode.length());
            while (matcher.find()) {
                String strGroup = matcher.group(0);
                if (BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX.equals(strGroup)) {
                    strGroup = "%20";
                } else if ("*".equals(strGroup)) {
                    strGroup = "%2A";
                } else if ("%7E".equals(strGroup)) {
                    strGroup = "~";
                } else if (z && "%2F".equals(strGroup)) {
                    strGroup = "/";
                }
                matcher.appendReplacement(stringBuffer, strGroup);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m1941(URI uri) {
        String strM1954 = StringUtils.m1954(uri.getScheme());
        int port = uri.getPort();
        if (port <= 0) {
            return false;
        }
        if (C0170a.f680s.equals(strM1954) && port == 80) {
            return false;
        }
        return (C0171b.f688a.equals(strM1954) && port == 443) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m1942(Request request) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        return HttpMethodName.POST.equals(defaultRequest.m1359()) && (defaultRequest.m1343() == null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1938(Request request) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        if (defaultRequest.m1356().isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            boolean z = true;
            for (Map.Entry entry : defaultRequest.m1356().entrySet()) {
                String strEncode = C14523.encode((String) entry.getKey(), C0233a.f1077D);
                String str = (String) entry.getValue();
                String strEncode2 = str == null ? "" : C14523.encode(str, C0233a.f1077D);
                if (z) {
                    z = false;
                } else {
                    sb.append(C0233a.f1084p);
                }
                sb.append(strEncode);
                sb.append("=");
                sb.append(strEncode2);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1939(String str, String str2, boolean z) {
        if (str2 == null || str2.length() <= 0) {
            return !str.endsWith("/") ? str.concat("/") : str;
        }
        if (str2.startsWith("/")) {
            if (str.endsWith("/")) {
                str = C17073.m38720(1, 0, str);
            }
        } else if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        String strM1940 = m1940(str2, true);
        if (z) {
            strM1940 = strM1940.replace("//", "/%2F");
        }
        return C17588.m40053(str, strM1940);
    }
}
