package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P712 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6134 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m13923(char c) {
        return c == '.' || c == ',' || c == '_' || c == '-' || c == ':' || c == '#' || c == '$' || c == '{' || c == '}' || c == '(' || c == ')' || c == '[' || c == ']';
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m13925(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'a' || c > 'f') {
            return c >= 'A' && c <= 'F';
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m13924(List list) {
        ?? r6;
        boolean z;
        byte b;
        int i;
        int i2;
        int i3;
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (!((InterfaceC19370) it.next()).mo39147()) {
                i4++;
            }
        }
        int iMax = Math.max(1, (int) (i4 * 0.75f));
        Iterator it2 = list.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it2.next();
            if (!interfaceC19370.mo39147()) {
                String name = interfaceC19370.getName();
                int length = name.length();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (i6 < length) {
                        char cCharAt = name.charAt(i6);
                        if (m13925(cCharAt)) {
                            i7++;
                            if (i8 > 0) {
                                i8++;
                                if ((cCharAt >= 'a' && cCharAt <= 'f') || (cCharAt >= 'A' && cCharAt <= 'F')) {
                                    i9++;
                                }
                            } else if (i6 == 0 || m13923(name.charAt(i6 - 1))) {
                                i9 = ((cCharAt < 'a' || cCharAt > 'f') && (cCharAt < 'A' || cCharAt > 'F')) ? 0 : 1;
                                i8 = 1;
                            }
                        } else if ((i7 < 16 && (i8 < 16 || i9 < 2)) || !m13923(cCharAt)) {
                            if ((cCharAt == '-' || cCharAt == '_' || cCharAt == ':') && (i3 = i6 + 1) < length && m13925(name.charAt(i3))) {
                                i7 = 0;
                            } else {
                                i7 = 0;
                                i8 = 0;
                                i9 = 0;
                            }
                        }
                        i6++;
                    } else if (i7 >= 16 || (i8 >= 16 && i9 >= 2)) {
                    }
                    i5++;
                    if (i5 >= iMax) {
                        return true;
                    }
                }
            }
        }
        HashMap map = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            InterfaceC19370 interfaceC19371 = (InterfaceC19370) it3.next();
            if (!interfaceC19371.mo39147()) {
                ?? name2 = interfaceC19371.getName();
                ?? StartsWith = name2.startsWith(".");
                int iIndexOf = name2.indexOf(46, StartsWith);
                if (iIndexOf <= StartsWith) {
                    iIndexOf = name2.length();
                }
                ?? r7 = iIndexOf - StartsWith;
                if (r7 < 20) {
                    r6 = StartsWith;
                    i2 = 0;
                    break;
                }
                boolean z2 = false;
                boolean z3 = false;
                int i10 = 0;
                byte b2 = -1;
                while (true) {
                    if (r6 >= iIndexOf) {
                        if (!z2 || !z3) {
                            break;
                        }
                        i2 = r7;
                        if (i10 >= 4) {
                            break;
                        }
                        break;
                    }
                    char cCharAt2 = name2.charAt(r6);
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        r6 = StartsWith;
                        if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || (cCharAt2 >= 'A' && cCharAt2 <= 'Z')) {
                            byte b3 = cCharAt2 <= 'Z' ? (byte) 2 : (byte) 1;
                            z = z3;
                            b = b3;
                            z2 = true;
                        } else if (cCharAt2 == '-' || cCharAt2 == '_') {
                        }
                        r6++;
                    } else {
                        b = 0;
                        z = true;
                    }
                    boolean z4 = (b2 == 2 && b == 1) || (b2 == 1 && b == 2 && (i = r6 + 1) < iIndexOf && ((name2.charAt(i) >= 'a' && name2.charAt(i) <= 'z') || (name2.charAt(i) >= '0' && name2.charAt(i) <= '9')));
                    if (b2 != -1 && b2 != b && !z4) {
                        i10++;
                    }
                    b2 = b;
                    z3 = z;
                    r6++;
                    r6 = StartsWith;
                    i2 = 0;
                    break;
                }
                if (i2 > 0) {
                    ((ArrayList) C15525.computeIfAbsent(map, Integer.valueOf(i2), new C7929(2))).add(name2);
                }
            }
        }
        int iMax2 = Math.max(4, iMax);
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            ArrayList<String> arrayList = (ArrayList) entry.getValue();
            int size = arrayList.size();
            if (size >= iMax2) {
                int[] iArr = new int[128];
                int i11 = 0;
                for (int i12 = 0; i12 < iIntValue; i12++) {
                    int iMax3 = 0;
                    for (String str : arrayList) {
                        char cCharAt3 = str.charAt((str.charAt(0) == '.' ? 1 : 0) + i12);
                        int i13 = iArr[cCharAt3] + 1;
                        iArr[cCharAt3] = i13;
                        iMax3 = Math.max(iMax3, i13);
                    }
                    if (iMax3 * 2 <= size) {
                        i11++;
                    }
                    Arrays.fill(iArr, 0);
                }
                if (i11 * 2 >= iIntValue) {
                    return true;
                }
            }
        }
        return false;
    }
}
