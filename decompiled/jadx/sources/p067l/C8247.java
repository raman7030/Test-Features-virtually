package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C8247 {
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX INFO: renamed from: ֫ */
    public static C12271 m19039(String str, String str2, C20989 c20989) {
        int i;
        String strM47322 = c20989.m47322();
        String strM47321 = c20989.m47321();
        if (str.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        for (int i5 = 0; i2 < str2.length() && i5 < strM47321.length(); i5++) {
            char cCharAt = str2.charAt(i2);
            char cCharAt2 = strM47321.charAt(i5);
            char cCharAt3 = strM47322.charAt(i5);
            if (cCharAt == cCharAt2) {
                arrayList.add(Integer.valueOf(i5));
                int iMax = Math.max(15 - i5, 0);
                int iM53892 = iMax + 10;
                if (i5 == 0) {
                    iM53892 = iMax + 30;
                } else {
                    char cCharAt4 = strM47322.charAt(i5);
                    char cCharAt5 = strM47322.charAt(i5 - 1);
                    if ((Character.isLowerCase(cCharAt5) && Character.isUpperCase(cCharAt4)) || (!Character.isLetterOrDigit(cCharAt5) && Character.isLetterOrDigit(cCharAt4))) {
                        iM53892 = iMax + 30;
                    }
                }
                if (z) {
                    iM53892 = C24420.m53892(i4, 5, 15, iM53892);
                }
                i3 += iM53892;
                if (str.charAt(i2) == cCharAt3 && Character.isUpperCase(cCharAt3)) {
                    i3 += 5;
                }
                i2++;
                i4++;
                z = true;
            } else {
                z = false;
                i4 = 0;
            }
        }
        if (i2 < str2.length()) {
            return null;
        }
        int[] array = C7480.stream(arrayList).mapToInt(new C14223()).toArray();
        if (strM47321.startsWith(str2)) {
            i = strM47322.startsWith(str) ? 80 : 50;
        } else {
            i = 0;
        }
        int iMax2 = Math.max(50 - strM47322.length(), 0) + i;
        if (str.equalsIgnoreCase(strM47322)) {
            iMax2 += 100;
        }
        if (array.length > 1) {
            iMax2 += ((array.length * 100) / ((array[array.length - 1] - array[0]) + 1)) / 10;
        }
        return new C12271(strM47322, i3 + iMax2, array);
    }
}
