package com.amazonaws.util;

import com.amazonaws.internal.config.HostRegexToRegionMapping;
import com.amazonaws.internal.config.InternalConfig;
import java.net.URI;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.C15472;
import l.C4860;

/* JADX INFO: loaded from: classes.dex */
public class AwsHostNameUtils {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f822 = Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m738(String str) {
        Matcher matcher = f822.matcher(str);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m739(String str, String str2) {
        String strM284;
        if (str == null) {
            throw new IllegalArgumentException("hostname cannot be null");
        }
        Iterator it = InternalConfig.Factory.m289().m288().iterator();
        while (true) {
            if (!it.hasNext()) {
                strM284 = null;
                break;
            }
            HostRegexToRegionMapping hostRegexToRegionMapping = (HostRegexToRegionMapping) it.next();
            if (str.matches(hostRegexToRegionMapping.m283())) {
                strM284 = hostRegexToRegionMapping.m284();
                break;
            }
        }
        if (strM284 != null) {
            return strM284;
        }
        if (str.endsWith(".amazonaws.com")) {
            return m738(C15472.m36561(14, 0, str));
        }
        if (str.endsWith(".amazonaws.com.cn")) {
            return m738(C15472.m36561(17, 0, str));
        }
        if (str2 == null) {
            return "us-east-1";
        }
        Matcher matcher = Pattern.compile("^(?:.+\\.)?" + Pattern.quote(str2) + "[.-]([a-z0-9-]+)\\.").matcher(str);
        return matcher.find() ? matcher.group(1) : "us-east-1";
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m740(URI uri) {
        String host = uri.getHost();
        if (!host.endsWith(".amazonaws.com")) {
            throw new IllegalArgumentException(C4860.m14172("Cannot parse a service name from an unrecognized endpoint (", host, ")."));
        }
        String strSubstring = host.substring(0, host.indexOf(".amazonaws.com"));
        if (strSubstring.endsWith(".s3") || f822.matcher(strSubstring).matches()) {
            return "s3";
        }
        return strSubstring.indexOf(46) == -1 ? strSubstring : strSubstring.substring(0, strSubstring.indexOf(46));
    }
}
