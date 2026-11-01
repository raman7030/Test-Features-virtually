package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩻᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7FQ */
/* JADX INFO: loaded from: classes.dex */
public final class C25207 {
    /* JADX INFO: renamed from: ֫ */
    public static String m55280(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder(String.format(Locale.US, C7050.m16224(R.string.MT_Protector), "\\u"));
        if (!arrayList.isEmpty()) {
            sb.append('\n');
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C14259 c14259 = (C14259) arrayList.get(i);
            if (i > 0) {
                sb.append('\n');
            }
            sb.append("password=");
            sb.append(m55283(c14259.f40605));
            sb.append("\nremark=");
            String str = c14259.f40604;
            if (str == null) {
                str = "";
            }
            sb.append(m55283(str));
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m55281(String str) throws C9114 {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        String[] strArrSplit = str.replace("\r\n", "\n").replace('\r', '\n').split("\n", -1);
        int i = 0;
        int i2 = -1;
        String strM55279 = null;
        while (i < strArrSplit.length) {
            int i3 = i + 1;
            String strSubstring = strArrSplit[i];
            if (i == 0 && !strSubstring.isEmpty() && strSubstring.charAt(0) == 65279) {
                strSubstring = strSubstring.substring(1);
            }
            if (!strSubstring.isEmpty() && !strSubstring.startsWith("#")) {
                if (strM55279 == null) {
                    if (!strSubstring.startsWith("password=")) {
                        if (strSubstring.startsWith("remark=")) {
                            throw m55282(i3, R.string.MT_Protector);
                        }
                        throw m55282(i3, R.string.MT_Protector);
                    }
                    strM55279 = m55279(i3, strSubstring.substring(9));
                    if (strM55279.isEmpty()) {
                        throw m55282(i3, R.string.MT_Protector);
                    }
                    if (!hashSet.add(strM55279)) {
                        throw m55282(i3, R.string.MT_Protector);
                    }
                    i2 = i3;
                } else {
                    if (!strSubstring.startsWith("remark=")) {
                        if (strSubstring.startsWith("password=")) {
                            throw m55282(i3, R.string.MT_Protector);
                        }
                        throw m55282(i3, R.string.MT_Protector);
                    }
                    arrayList.add(new C14259(strM55279, m55279(i3, strSubstring.substring(7))));
                    strM55279 = null;
                    i2 = -1;
                }
            }
            i = i3;
        }
        if (strM55279 == null) {
            return arrayList;
        }
        throw m55282(i2, R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m55283(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (Character.isISOControl(cCharAt)) {
                sb.append(String.format(Locale.US, "\\u%04X", Integer.valueOf(cCharAt)));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[LOOP:1: B:31:0x007c->B:35:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0092 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static String m55279(int i, String str) throws C9114 {
        String strSubstring;
        int i2;
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\\') {
                sb.append(cCharAt);
            } else {
                if (i3 == length - 1) {
                    throw m55282(i, R.string.MT_Protector);
                }
                int i4 = i3 + 1;
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 == 'U') {
                    i4 = i3 + 5;
                    if (i4 < length) {
                        throw m55282(i, R.string.MT_Protector);
                    }
                    strSubstring = str.substring(i3 + 2, i3 + 6);
                    for (i2 = 0; i2 < strSubstring.length(); i2++) {
                        if (Character.digit(strSubstring.charAt(i2), 16) != -1) {
                            throw m55282(i, R.string.MT_Protector);
                        }
                    }
                    sb.append((char) Integer.parseInt(strSubstring, 16));
                } else if (cCharAt2 == '\\') {
                    sb.append('\\');
                } else if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append('\r');
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else {
                    if (cCharAt2 != 'u') {
                        throw new C9114(i, C7050.m16203(R.string.MT_Protector, Character.valueOf(cCharAt2)));
                    }
                    i4 = i3 + 5;
                    if (i4 < length) {
                        throw m55282(i, R.string.MT_Protector);
                    }
                    strSubstring = str.substring(i3 + 2, i3 + 6);
                    while (i2 < strSubstring.length()) {
                        if (Character.digit(strSubstring.charAt(i2), 16) != -1) {
                            throw m55282(i, R.string.MT_Protector);
                        }
                    }
                    sb.append((char) Integer.parseInt(strSubstring, 16));
                }
                i3 = i4;
            }
            i3++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9114 m55282(int i, int i2) {
        return new C9114(i, C7050.m16224(i2));
    }
}
