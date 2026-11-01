package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P784 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14466 {
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x013f  */
    /* JADX INFO: renamed from: ֫ */
    public static String m33106(C13220 c13220, C4236 c4236, C24729 c24729) {
        int i = c4236.f9370;
        boolean z = c24729.f78295;
        int i2 = c24729.f78292;
        if (!z || i2 <= 0 || i < 0) {
            return null;
        }
        int iM23613 = C10127.m23613(i, c13220);
        int i3 = c4236.f9365;
        if (i3 > i) {
            i = i3 - 1;
        }
        int iM23612 = C10127.m23612(i, c13220);
        ArrayList arrayList = new ArrayList();
        int iMax = Math.max(0, Math.min(iM23613, c13220.length()));
        int iMax2 = Math.max(iMax, Math.min(iM23612, c13220.length()));
        while (iMax <= iMax2 && iMax < c13220.length()) {
            int iM23614 = C10127.m23612(iMax, c13220);
            C15136 c15136M33107 = m33107(iMax, iM23614, i2, c13220);
            if (c15136M33107 != null) {
                arrayList.add(c15136M33107);
            }
            if (iM23614 >= iMax2 || iM23614 >= c13220.length()) {
                break;
            }
            iMax = iM23614 + 1;
        }
        if (arrayList.isEmpty()) {
            return m33105((CharSequence) c13220, c4236, c24729);
        }
        ArrayList arrayList2 = new ArrayList();
        int iMax3 = Math.max(0, Math.min(iM23613, c13220.length()));
        while (iMax3 > 0 && arrayList2.size() < 2) {
            int i4 = iMax3 - 1;
            int i5 = iMax3 - 2;
            while (true) {
                if (i5 < 0) {
                    iMax3 = 0;
                    break;
                }
                if (c13220.charAt(i5) == '\n') {
                    iMax3 = i5 + 1;
                    break;
                }
                i5--;
            }
            C15136 c15136M33108 = m33107(iMax3, i4, i2, c13220);
            if (c15136M33108 != null) {
                arrayList2.add(0, c15136M33108);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int length = iM23612 < c13220.length() ? iM23612 + 1 : c13220.length();
        while (length < c13220.length() && arrayList3.size() < 2) {
            int iM23615 = C10127.m23612(length, c13220);
            C15136 c15136M33109 = m33107(length, iM23615, i2, c13220);
            if (c15136M33109 != null) {
                arrayList3.add(c15136M33109);
            }
            if (iM23615 >= c13220.length()) {
                break;
            }
            length = iM23615 + 1;
        }
        String strM33104 = m33104(i2, arrayList2, arrayList, arrayList3);
        if (strM33104 == null) {
            ArrayList arrayList4 = new ArrayList(arrayList2);
            ArrayList arrayList5 = new ArrayList(arrayList3);
            C15136 c15136 = arrayList4.size() >= 2 ? (C15136) arrayList4.get(0) : null;
            C15136 c15137 = arrayList5.size() >= 2 ? (C15136) C20013.m45383(arrayList5, 1) : null;
            if (c15136 == null && c15137 == null) {
                if (arrayList2.size() > 1) {
                    arrayList2 = new ArrayList(arrayList2.subList(arrayList2.size() - 1, arrayList2.size()));
                }
                if (arrayList3.size() > 1) {
                    arrayList3 = new ArrayList(arrayList3.subList(0, 1));
                }
                strM33104 = m33104(i2, arrayList2, arrayList, arrayList3);
            } else {
                if (c15136 == null || (c15137 != null && c15136.f43215 <= c15137.f43215)) {
                    C19925.m45229(arrayList5, 1);
                } else {
                    arrayList4.remove(0);
                }
                strM33104 = m33104(i2, arrayList4, arrayList, arrayList5);
                if (strM33104 == null) {
                    if (arrayList2.size() > 1) {
                        arrayList2 = new ArrayList(arrayList2.subList(arrayList2.size() - 1, arrayList2.size()));
                    }
                    if (arrayList3.size() > 1) {
                        arrayList3 = new ArrayList(arrayList3.subList(0, 1));
                    }
                    strM33104 = m33104(i2, arrayList2, arrayList, arrayList3);
                }
            }
        }
        return strM33104 != null ? strM33104 : m33105((CharSequence) c13220, c4236, c24729);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33104(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ArrayList arrayList4 = new ArrayList(arrayList3.size() + arrayList2.size() + arrayList.size());
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        if (arrayList4.isEmpty()) {
            return null;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            i2 += ((C15136) arrayList4.get(i3)).f43215;
            if (i3 > 0) {
                i2++;
            }
            if (i2 > i) {
                return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < arrayList4.size(); i4++) {
            if (i4 > 0) {
                sb.append('\n');
            }
            String str = ((C15136) arrayList4.get(i4)).f43216;
            if (str == null) {
                return null;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33105(CharSequence charSequence, C4236 c4236, C24729 c24729) {
        int iMax = Math.max(0, Math.min(c4236.f9370, charSequence.length()));
        int iCodePointCount = Character.codePointCount(charSequence, iMax, Math.max(iMax, Math.min(c4236.f9365, charSequence.length())));
        int i = c24729.f78292;
        String strM23604 = C10127.m23604(C10127.m23611(iMax, -(iCodePointCount >= i ? 0 : Math.min(i - iCodePointCount, i / 3)), charSequence), charSequence.length(), i, charSequence);
        String[] strArrSplit = strM23604.split("\n", -1);
        StringBuilder sb = new StringBuilder(strM23604.length());
        for (String str : strArrSplit) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(strTrim);
            }
        }
        String string = sb.toString();
        return string.isEmpty() ? strM23604.trim() : string;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15136 m33107(int i, int i2, int i3, CharSequence charSequence) {
        int iMax = Math.max(0, Math.min(i, charSequence.length()));
        int iMax2 = Math.max(iMax, Math.min(i2, charSequence.length()));
        while (iMax < iMax2 && charSequence.charAt(iMax) <= ' ') {
            iMax++;
        }
        while (iMax2 > iMax && charSequence.charAt(iMax2 - 1) <= ' ') {
            iMax2--;
        }
        if (iMax >= iMax2) {
            return null;
        }
        int iCodePointCount = Character.codePointCount(charSequence, iMax, iMax2);
        return new C15136(iCodePointCount <= i3 ? C10127.m23604(iMax, iMax2, i3, charSequence) : null, iCodePointCount);
    }
}
