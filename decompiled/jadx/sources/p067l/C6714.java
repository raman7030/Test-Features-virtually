package p067l;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 39WK */
/* JADX INFO: loaded from: classes2.dex */
public final class C6714 {

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f17417 = Pattern.compile("^((.*)\\._)?_?(.*)\\._sub\\._([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f17416 = Pattern.compile("^((.*)?\\._)?([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m15319(String str) {
        String strM48637;
        String strSubstring;
        String str2;
        String strM15318;
        String str3;
        String strM15319;
        String strM153110;
        String strM153111;
        String lowerCase = str.toLowerCase();
        String strM153112 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int iIndexOf = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            strM48637 = C21467.m48637(str.substring(0, iIndexOf));
            strSubstring = str.substring(iIndexOf);
        } else {
            if (!lowerCase.contains("_") && lowerCase.contains(".")) {
                int iIndexOf2 = lowerCase.indexOf(46);
                strM48637 = C21467.m48637(str.substring(0, iIndexOf2));
                strSubstring = C21467.m48637(str.substring(iIndexOf2));
            } else {
                Matcher matcher = f17417.matcher(lowerCase);
                if (matcher.matches()) {
                    strM15319 = m15318(str, matcher, 2);
                    strM153112 = m15318(str, matcher, 3);
                    strM153110 = m15318(str, matcher, 4);
                    strM15318 = m15318(str, matcher, 5);
                    strM153111 = m15318(str, matcher, 6);
                } else {
                    Matcher matcher2 = f17416.matcher(lowerCase);
                    if (matcher2.matches()) {
                        strM15319 = m15318(str, matcher2, 2);
                        strM153110 = m15318(str, matcher2, 3);
                        strM15318 = m15318(str, matcher2, 4);
                        strM153111 = m15318(str, matcher2, 5);
                    } else {
                        str2 = "";
                        str3 = str2;
                        strM15318 = str3;
                    }
                }
                String str4 = strM153111;
                str2 = strM15319;
                lowerCase = strM153110;
                String str5 = strM153112;
                strM153112 = str4;
                str3 = str5;
            }
            String strM48638 = C21467.m48637(lowerCase);
            String strM48639 = C21467.m48637(strM153112);
            HashMap map = new HashMap(5);
            map.put(EnumC14011.Instance, str2);
            map.put(EnumC14011.Application, strM48638);
            map.put(EnumC14011.Protocol, strM15318);
            map.put(EnumC14011.Domain, strM48639);
            map.put(EnumC14011.Subtype, str3);
            return map;
        }
        lowerCase = "";
        strM15318 = lowerCase;
        strM153112 = strSubstring;
        str2 = strM48637;
        str3 = strM15318;
        String strM486310 = C21467.m48637(lowerCase);
        String strM486311 = C21467.m48637(strM153112);
        HashMap map2 = new HashMap(5);
        map2.put(EnumC14011.Instance, str2);
        map2.put(EnumC14011.Application, strM486310);
        map2.put(EnumC14011.Protocol, strM15318);
        map2.put(EnumC14011.Domain, strM486311);
        map2.put(EnumC14011.Subtype, str3);
        return map2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15318(String str, Matcher matcher, int i) {
        return matcher.start(i) != -1 ? str.substring(matcher.start(i), matcher.end(i)) : "";
    }
}
