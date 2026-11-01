package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩵ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: P7KL */
/* JADX INFO: loaded from: classes4.dex */
public final class C20629 {
    /* JADX INFO: renamed from: ֫ */
    public static HashSet m46627(String str) {
        int iM46628;
        HashSet hashSet = new HashSet();
        if (!str.isEmpty()) {
            char cM21911 = C9417.m21911(1, str);
            boolean z = cM21911 == '\n' || cM21911 == '\r';
            String[] strArrSplit = str.split("\\R");
            int length = strArrSplit.length;
            String str2 = length == 0 ? "" : strArrSplit[length - 1];
            if (z) {
                iM46628 = 0;
            } else {
                iM46628 = m46628(str2);
                for (String str3 : strArrSplit) {
                    int length2 = str3.length();
                    int iCharCount = 0;
                    while (iCharCount < length2) {
                        int iCodePointAt = str3.codePointAt(iCharCount);
                        if (!Character.isWhitespace(iCodePointAt)) {
                            iM46628 = Math.min(iM46628, m46628(str3));
                            if (iM46628 != 0) {
                                break;
                            }
                            break;
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
            }
            String strSubstring = str2.substring(0, iM46628);
            for (String str4 : strArrSplit) {
                int length3 = str4.length();
                int iCharCount2 = 0;
                while (iCharCount2 < length3) {
                    int iCodePointAt2 = str4.codePointAt(iCharCount2);
                    if (!Character.isWhitespace(iCodePointAt2)) {
                        if (!str4.startsWith(strSubstring)) {
                            hashSet.add(EnumC19958.INCONSISTENT);
                            break;
                        }
                        break;
                    }
                    iCharCount2 += Character.charCount(iCodePointAt2);
                }
                if (iM46628 < str4.length() && Character.isWhitespace(str4.charAt(str4.length() - 1))) {
                    hashSet.add(EnumC19958.TRAILING);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m46628(String str) {
        int length = str.length();
        int length2 = str.length();
        int iCharCount = 0;
        while (iCharCount < length2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return length - str.substring(iCharCount, length2).length();
    }
}
