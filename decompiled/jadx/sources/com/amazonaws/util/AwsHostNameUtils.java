package com.amazonaws.util;

import com.amazonaws.internal.config.HostRegexToRegionMapping;
import com.amazonaws.internal.config.InternalConfig;
import java.net.URI;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067l.C17073;
import p067l.C6988;

/* JADX INFO: loaded from: classes.dex */
public class AwsHostNameUtils {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f1982 = Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

    /* JADX INFO: renamed from: ֫ */
    public static String m1903(String str) {
        Matcher matcher = f1982.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return "us-east-1";
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (strSubstring.equals("vpce")) {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length < 2) {
                return "us-east-1";
            }
            strSubstring = strArrSplit[strArrSplit.length - 2];
        }
        return "us-gov".equals(strSubstring) ? "us-gov-west-1" : strSubstring;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1904(String str, String str2) {
        String strM1450;
        if (str == null) {
            throw new IllegalArgumentException("hostname cannot be null");
        }
        Iterator it = InternalConfig.Factory.m1455().m1454().iterator();
        while (true) {
            if (!it.hasNext()) {
                strM1450 = null;
                break;
            }
            HostRegexToRegionMapping hostRegexToRegionMapping = (HostRegexToRegionMapping) it.next();
            if (str.matches(hostRegexToRegionMapping.m1449())) {
                strM1450 = hostRegexToRegionMapping.m1450();
                break;
            }
        }
        if (strM1450 != null) {
            return strM1450;
        }
        if (str.endsWith(".amazonaws.com")) {
            return m1903(C17073.m38720(14, 0, str));
        }
        if (str.endsWith(".amazonaws.com.cn")) {
            return m1903(C17073.m38720(17, 0, str));
        }
        if (str2 == null) {
            return "us-east-1";
        }
        Matcher matcher = Pattern.compile("^(?:.+\\.)?" + Pattern.quote(str2) + "[.-]([a-z0-9-]+)\\.").matcher(str);
        return matcher.find() ? matcher.group(1) : "us-east-1";
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static String m1905(URI uri) {
        String host = uri.getHost();
        if (!host.endsWith(".amazonaws.com")) {
            throw new IllegalArgumentException(C6988.m16053("Cannot parse a service name from an unrecognized endpoint (", host, ")."));
        }
        String strSubstring = host.substring(0, host.indexOf(".amazonaws.com"));
        if (strSubstring.endsWith(".s3") || f1982.matcher(strSubstring).matches()) {
            return "s3";
        }
        return strSubstring.indexOf(46) == -1 ? strSubstring : strSubstring.substring(0, strSubstring.indexOf(46));
    }
}
