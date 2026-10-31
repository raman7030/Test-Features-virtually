package l;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 39WK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4572 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f14588 = Pattern.compile("^((.*)\\._)?_?(.*)\\._sub\\._([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f14587 = Pattern.compile("^((.*)?\\._)?([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m13431(String str) {
        String strM46321;
        String strSubstring;
        String str2;
        String strM13430;
        String str3;
        String strM13431;
        String strM13432;
        String strM13433;
        String lowerCase = str.toLowerCase();
        String strM13434 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int iIndexOf = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            strM46321 = C20095.m46321(str.substring(0, iIndexOf));
            strSubstring = str.substring(iIndexOf);
        } else {
            if (!lowerCase.contains("_") && lowerCase.contains(".")) {
                int iIndexOf2 = lowerCase.indexOf(46);
                strM46321 = C20095.m46321(str.substring(0, iIndexOf2));
                strSubstring = C20095.m46321(str.substring(iIndexOf2));
            } else {
                Matcher matcher = f14588.matcher(lowerCase);
                if (matcher.matches()) {
                    strM13431 = m13430(str, matcher, 2);
                    strM13434 = m13430(str, matcher, 3);
                    strM13432 = m13430(str, matcher, 4);
                    strM13430 = m13430(str, matcher, 5);
                    strM13433 = m13430(str, matcher, 6);
                } else {
                    Matcher matcher2 = f14587.matcher(lowerCase);
                    if (matcher2.matches()) {
                        strM13431 = m13430(str, matcher2, 2);
                        strM13432 = m13430(str, matcher2, 3);
                        strM13430 = m13430(str, matcher2, 4);
                        strM13433 = m13430(str, matcher2, 5);
                    } else {
                        str2 = "";
                        str3 = str2;
                        strM13430 = str3;
                    }
                }
                String str4 = strM13433;
                str2 = strM13431;
                lowerCase = strM13432;
                String str5 = strM13434;
                strM13434 = str4;
                str3 = str5;
            }
            String strM46322 = C20095.m46321(lowerCase);
            String strM46323 = C20095.m46321(strM13434);
            HashMap map = new HashMap(5);
            map.put(EnumC12250.Instance, str2);
            map.put(EnumC12250.Application, strM46322);
            map.put(EnumC12250.Protocol, strM13430);
            map.put(EnumC12250.Domain, strM46323);
            map.put(EnumC12250.Subtype, str3);
            return map;
        }
        lowerCase = "";
        strM13430 = lowerCase;
        strM13434 = strSubstring;
        str2 = strM46321;
        str3 = strM13430;
        String strM46324 = C20095.m46321(lowerCase);
        String strM46325 = C20095.m46321(strM13434);
        HashMap map2 = new HashMap(5);
        map2.put(EnumC12250.Instance, str2);
        map2.put(EnumC12250.Application, strM46324);
        map2.put(EnumC12250.Protocol, strM13430);
        map2.put(EnumC12250.Domain, strM46325);
        map2.put(EnumC12250.Subtype, str3);
        return map2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13430(String str, Matcher matcher, int i) {
        return matcher.start(i) != -1 ? str.substring(matcher.start(i), matcher.end(i)) : "";
    }
}
