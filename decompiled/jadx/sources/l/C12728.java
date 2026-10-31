package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P784 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12728 {
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x013f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31022(C11418 c11418, C1965 c1965, C23528 c23528) {
        int i = c1965.f6591;
        boolean z = c23528.f75549;
        int i2 = c23528.f75546;
        if (!z || i2 <= 0 || i < 0) {
            return null;
        }
        int iM21644 = C8163.m21644(i, c11418);
        int i3 = c1965.f6586;
        if (i3 > i) {
            i = i3 - 1;
        }
        int iM21643 = C8163.m21643(i, c11418);
        ArrayList arrayList = new ArrayList();
        int iMax = Math.max(0, Math.min(iM21644, c11418.length()));
        int iMax2 = Math.max(iMax, Math.min(iM21643, c11418.length()));
        while (iMax <= iMax2 && iMax < c11418.length()) {
            int iM21645 = C8163.m21643(iMax, c11418);
            C13433 c13433M31023 = m31023(iMax, iM21645, i2, c11418);
            if (c13433M31023 != null) {
                arrayList.add(c13433M31023);
            }
            if (iM21645 >= iMax2 || iM21645 >= c11418.length()) {
                break;
            }
            iMax = iM21645 + 1;
        }
        if (arrayList.isEmpty()) {
            return m31021((CharSequence) c11418, c1965, c23528);
        }
        ArrayList arrayList2 = new ArrayList();
        int iMax3 = Math.max(0, Math.min(iM21644, c11418.length()));
        while (iMax3 > 0 && arrayList2.size() < 2) {
            int i4 = iMax3 - 1;
            int i5 = iMax3 - 2;
            while (true) {
                if (i5 < 0) {
                    iMax3 = 0;
                    break;
                }
                if (c11418.charAt(i5) == '\n') {
                    iMax3 = i5 + 1;
                    break;
                }
                i5--;
            }
            C13433 c13433M31024 = m31023(iMax3, i4, i2, c11418);
            if (c13433M31024 != null) {
                arrayList2.add(0, c13433M31024);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int length = iM21643 < c11418.length() ? iM21643 + 1 : c11418.length();
        while (length < c11418.length() && arrayList3.size() < 2) {
            int iM21646 = C8163.m21643(length, c11418);
            C13433 c13433M31025 = m31023(length, iM21646, i2, c11418);
            if (c13433M31025 != null) {
                arrayList3.add(c13433M31025);
            }
            if (iM21646 >= c11418.length()) {
                break;
            }
            length = iM21646 + 1;
        }
        String strM31020 = m31020(i2, arrayList2, arrayList, arrayList3);
        if (strM31020 == null) {
            ArrayList arrayList4 = new ArrayList(arrayList2);
            ArrayList arrayList5 = new ArrayList(arrayList3);
            C13433 c13433 = arrayList4.size() >= 2 ? (C13433) arrayList4.get(0) : null;
            C13433 c13434 = arrayList5.size() >= 2 ? (C13433) C18566.m43105(arrayList5, 1) : null;
            if (c13433 == null && c13434 == null) {
                if (arrayList2.size() > 1) {
                    arrayList2 = new ArrayList(arrayList2.subList(arrayList2.size() - 1, arrayList2.size()));
                }
                if (arrayList3.size() > 1) {
                    arrayList3 = new ArrayList(arrayList3.subList(0, 1));
                }
                strM31020 = m31020(i2, arrayList2, arrayList, arrayList3);
            } else {
                if (c13433 == null || (c13434 != null && c13433.f40144 <= c13434.f40144)) {
                    C18473.m42953(arrayList5, 1);
                } else {
                    arrayList4.remove(0);
                }
                strM31020 = m31020(i2, arrayList4, arrayList, arrayList5);
                if (strM31020 == null) {
                    if (arrayList2.size() > 1) {
                        arrayList2 = new ArrayList(arrayList2.subList(arrayList2.size() - 1, arrayList2.size()));
                    }
                    if (arrayList3.size() > 1) {
                        arrayList3 = new ArrayList(arrayList3.subList(0, 1));
                    }
                    strM31020 = m31020(i2, arrayList2, arrayList, arrayList3);
                }
            }
        }
        return strM31020 != null ? strM31020 : m31021((CharSequence) c11418, c1965, c23528);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31020(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ArrayList arrayList4 = new ArrayList(arrayList3.size() + arrayList2.size() + arrayList.size());
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        if (arrayList4.isEmpty()) {
            return null;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            i2 += ((C13433) arrayList4.get(i3)).f40144;
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
            String str = ((C13433) arrayList4.get(i4)).f40145;
            if (str == null) {
                return null;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31021(CharSequence charSequence, C1965 c1965, C23528 c23528) {
        int iMax = Math.max(0, Math.min(c1965.f6591, charSequence.length()));
        int iCodePointCount = Character.codePointCount(charSequence, iMax, Math.max(iMax, Math.min(c1965.f6586, charSequence.length())));
        int i = c23528.f75546;
        String strM21635 = C8163.m21635(C8163.m21642(iMax, -(iCodePointCount >= i ? 0 : Math.min(i - iCodePointCount, i / 3)), charSequence), charSequence.length(), i, charSequence);
        String[] strArrSplit = strM21635.split("\n", -1);
        StringBuilder sb = new StringBuilder(strM21635.length());
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
        return string.isEmpty() ? strM21635.trim() : string;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13433 m31023(int i, int i2, int i3, CharSequence charSequence) {
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
        return new C13433(iCodePointCount <= i3 ? C8163.m21635(iMax, iMax2, i3, charSequence) : null, iCodePointCount);
    }
}
