package com.amazonaws.util;

import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.w.a;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.google.android.material.badge.BadgeDrawable;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.C12789;
import l.C15472;
import l.C16014;

/* JADX INFO: loaded from: classes.dex */
public class HttpUtils {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f833 = Pattern.compile(Pattern.quote(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F"));

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Pattern.quote("%2A"));
        sb.append("|");
        sb.append(Pattern.quote("%2B"));
        sb.append("|");
        Pattern.compile(sb.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m775(String str, boolean z) {
        if (str == null) {
            return "";
        }
        try {
            String strEncode = C12789.encode(str, a.D);
            Matcher matcher = f833.matcher(strEncode);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m776(URI uri) {
        String strM789 = StringUtils.m789(uri.getScheme());
        int port = uri.getPort();
        if (port <= 0) {
            return false;
        }
        if (com.alipay.sdk.m.n.a.s.equals(strM789) && port == 80) {
            return false;
        }
        return (b.a.equals(strM789) && port == 443) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m777(Request request) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        return HttpMethodName.POST.equals(defaultRequest.m193()) && (defaultRequest.m177() == null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m773(Request request) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        if (defaultRequest.m190().isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            boolean z = true;
            for (Map.Entry entry : defaultRequest.m190().entrySet()) {
                String strEncode = C12789.encode((String) entry.getKey(), a.D);
                String str = (String) entry.getValue();
                String strEncode2 = str == null ? "" : C12789.encode(str, a.D);
                if (z) {
                    z = false;
                } else {
                    sb.append(a.p);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m774(String str, String str2, boolean z) {
        if (str2 == null || str2.length() <= 0) {
            return !str.endsWith("/") ? str.concat("/") : str;
        }
        if (str2.startsWith("/")) {
            if (str.endsWith("/")) {
                str = C15472.m36561(1, 0, str);
            }
        } else if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        String strM775 = m775(str2, true);
        if (z) {
            strM775 = strM775.replace("//", "/%2F");
        }
        return C16014.m37867(str, strM775);
    }
}
