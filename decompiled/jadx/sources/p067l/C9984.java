package p067l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAOJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9984 {

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f27655 = {1701707776, 1701741568};

    /* JADX INFO: renamed from: ֫ */
    public static final char[] f27654 = {'e', 'n'};

    /* JADX INFO: renamed from: ֫ */
    public static int m23292(char[] cArr, char[] cArr2) {
        return ((cArr[1] & 255) << 16) | ((cArr[0] & 255) << 24) | ((cArr2[0] & 255) << 8) | (cArr2[1] & 255);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m23294(int[] iArr, C22725 c22725, int i, String str, int[] iArr2, int i2) {
        int i3 = 0;
        do {
            if (iArr != null) {
                iArr[i3] = i;
            }
            i3++;
            for (int i4 = 0; i4 < i2; i4++) {
                if (iArr2[i4] == i) {
                    c22725.m50879(Long.valueOf(i4));
                    return i3;
                }
            }
            if ((65535 & i) != 0) {
                Iterator it = C16688.f49134.entrySet().iterator();
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
        c22725.m50879(-1L);
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23296(int i, String str) {
        return C16688.f49137.contains(Long.valueOf((((long) str.charAt(3)) & 255) | (((long) i) << 32) | ((((long) str.charAt(0)) & 255) << 24) | ((((long) str.charAt(1)) & 255) << 16) | ((((long) str.charAt(2)) & 255) << 8)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m23293(char[] cArr, char[] cArr2, char[] cArr3, String str, char[] cArr4) {
        int i;
        int i2;
        if (cArr[0] == cArr2[0] && cArr[1] == cArr2[1]) {
            return 0;
        }
        int iM23292 = m23292(cArr3, cArr);
        int iM23293 = m23292(cArr3, cArr2);
        int iM23294 = m23292(cArr3, cArr4);
        boolean z = iM23292 == 1702057299 || iM23292 == 1702055256;
        boolean z2 = iM23293 == 1702057299 || iM23293 == 1702055256;
        if (z && !z2 && iM23293 != 1702077476) {
            i2 = iM23293;
            i = 1702077476;
        } else if (!z2 || z || iM23292 == 1702077476) {
            i = iM23292;
            i2 = iM23293;
        } else {
            i = iM23292;
            i2 = 1702077476;
        }
        int[] iArr = new int[4];
        C22725 c22725 = new C22725();
        int iM23295 = m23294(iArr, c22725, iM23294, str, new int[]{i, i2}, 2);
        if (((Long) c22725.m50878()).longValue() == 0) {
            return 1;
        }
        if (((Long) c22725.m50878()).longValue() == 1) {
            return -1;
        }
        C22725 c22726 = new C22725();
        int iLongValue = (int) ((((Long) c22726.m50878()).longValue() + ((long) m23294(null, c22726, i, str, iArr, iM23295))) - 1);
        C22725 c22727 = new C22725();
        int iLongValue2 = (int) ((((Long) c22727.m50878()).longValue() + ((long) m23294(null, c22727, i2, str, iArr, iM23295))) - 1);
        if (iLongValue != iLongValue2) {
            return iLongValue2 - iLongValue;
        }
        boolean zM23296 = m23296(i, str);
        boolean zM23297 = m23296(i2, str);
        return zM23296 != zM23297 ? (zM23296 ? 1 : 0) - (zM23297 ? 1 : 0) : i2 - i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23295(char[] cArr, char[] cArr2, char[] cArr3) {
        Character ch;
        if (cArr2[0] == 0) {
            Arrays.fill(cArr, (char) 0);
            return;
        }
        int iM23292 = m23292(cArr2, cArr3);
        Map map = C16688.f49135;
        Character ch2 = (Character) map.get(Integer.valueOf(iM23292));
        if (ch2 == null) {
            if (cArr3[0] != 0 && (ch = (Character) map.get(Integer.valueOf(iM23292 & (-65536)))) != null) {
                System.arraycopy(C16688.f49136[ch.charValue()], 0, cArr, 0, 4);
                return;
            } else {
                Arrays.fill(cArr, (char) 0);
                return;
            }
        }
        System.arraycopy(C16688.f49136[ch2.charValue()], 0, cArr, 0, 4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23297(char[] cArr) {
        int iM23292 = m23292(f27654, cArr);
        C22725 c22725 = new C22725();
        m23294(null, c22725, iM23292, "Latn", f27655, 2);
        return ((Long) c22725.m50878()).longValue() == 0;
    }
}
