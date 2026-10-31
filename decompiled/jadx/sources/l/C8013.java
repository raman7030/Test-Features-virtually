package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAOJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8013 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f24741 = {1701707776, 1701741568};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f24740 = {'e', 'n'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21326(char[] cArr, char[] cArr2) {
        return ((cArr[1] & 255) << 16) | ((cArr[0] & 255) << 24) | ((cArr2[0] & 255) << 8) | (cArr2[1] & 255);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21328(int[] iArr, C21419 c21419, int i, String str, int[] iArr2, int i2) {
        int i3 = 0;
        do {
            if (iArr != null) {
                iArr[i3] = i;
            }
            i3++;
            for (int i4 = 0; i4 < i2; i4++) {
                if (iArr2[i4] == i) {
                    c21419.m48543(Long.valueOf(i4));
                    return i3;
                }
            }
            if ((65535 & i) != 0) {
                Iterator it = C15067.f46016.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (str.equals(entry.getKey())) {
                            Integer num = (Integer) ((Map) entry.getValue()).get(Integer.valueOf(i));
                            if (num != null) {
                                i = num.intValue();
                                break;
                            }
                        }
                    }
                    i &= -65536;
                    break;
                }
            }
            i = 0;
        } while (i != 0);
        c21419.m48543(-1L);
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21330(int i, String str) {
        return C15067.f46019.contains(Long.valueOf((((long) str.charAt(3)) & 255) | (((long) i) << 32) | ((((long) str.charAt(0)) & 255) << 24) | ((((long) str.charAt(1)) & 255) << 16) | ((((long) str.charAt(2)) & 255) << 8)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21327(char[] cArr, char[] cArr2, char[] cArr3, String str, char[] cArr4) {
        int i;
        int i2;
        if (cArr[0] == cArr2[0] && cArr[1] == cArr2[1]) {
            return 0;
        }
        int iM21326 = m21326(cArr3, cArr);
        int iM21327 = m21326(cArr3, cArr2);
        int iM21328 = m21326(cArr3, cArr4);
        boolean z = iM21326 == 1702057299 || iM21326 == 1702055256;
        boolean z2 = iM21327 == 1702057299 || iM21327 == 1702055256;
        if (z && !z2 && iM21327 != 1702077476) {
            i2 = iM21327;
            i = 1702077476;
        } else if (!z2 || z || iM21326 == 1702077476) {
            i = iM21326;
            i2 = iM21327;
        } else {
            i = iM21326;
            i2 = 1702077476;
        }
        int[] iArr = new int[4];
        C21419 c21419 = new C21419();
        int iM21329 = m21328(iArr, c21419, iM21328, str, new int[]{i, i2}, 2);
        if (((Long) c21419.m48542()).longValue() == 0) {
            return 1;
        }
        if (((Long) c21419.m48542()).longValue() == 1) {
            return -1;
        }
        C21419 c214110 = new C21419();
        int iLongValue = (int) ((((Long) c214110.m48542()).longValue() + ((long) m21328(null, c214110, i, str, iArr, iM21329))) - 1);
        C21419 c214111 = new C21419();
        int iLongValue2 = (int) ((((Long) c214111.m48542()).longValue() + ((long) m21328(null, c214111, i2, str, iArr, iM21329))) - 1);
        if (iLongValue != iLongValue2) {
            return iLongValue2 - iLongValue;
        }
        boolean zM21330 = m21330(i, str);
        boolean zM21331 = m21330(i2, str);
        return zM21330 != zM21331 ? (zM21330 ? 1 : 0) - (zM21331 ? 1 : 0) : i2 - i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21329(char[] cArr, char[] cArr2, char[] cArr3) {
        Character ch;
        if (cArr2[0] == 0) {
            Arrays.fill(cArr, (char) 0);
            return;
        }
        int iM21326 = m21326(cArr2, cArr3);
        Map map = C15067.f46017;
        Character ch2 = (Character) map.get(Integer.valueOf(iM21326));
        if (ch2 == null) {
            if (cArr3[0] != 0 && (ch = (Character) map.get(Integer.valueOf(iM21326 & (-65536)))) != null) {
                System.arraycopy(C15067.f46018[ch.charValue()], 0, cArr, 0, 4);
                return;
            } else {
                Arrays.fill(cArr, (char) 0);
                return;
            }
        }
        System.arraycopy(C15067.f46018[ch2.charValue()], 0, cArr, 0, 4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21331(char[] cArr) {
        int iM21326 = m21326(f24740, cArr);
        C21419 c21419 = new C21419();
        m21328(null, c21419, iM21326, "Latn", f24741, 2);
        return ((Long) c21419.m48542()).longValue() == 0;
    }
}
