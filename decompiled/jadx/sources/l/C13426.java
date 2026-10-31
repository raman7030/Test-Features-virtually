package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T61X */
/* JADX INFO: loaded from: classes4.dex */
public final class C13426 extends AbstractC12721 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32444(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m32450(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32446(long j) {
        int i = (int) j;
        C4025.m12105(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32445(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m32449(Collection collection) {
        if (collection instanceof C3549) {
            C3549 c3549 = (C3549) collection;
            return Arrays.copyOfRange(c3549.f11282, c3549.f11281, c3549.f11283);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m32448(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new C3549(0, iArr.length, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m32447(String str) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                int iM26624 = C10605.m26624(str.charAt(i));
                if (iM26624 >= 0 && iM26624 < 10) {
                    long j = -iM26624;
                    long j2 = 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        int iM26625 = C10605.m26624(str.charAt(i2));
                        if (iM26625 >= 0 && iM26625 < 10 && j >= j3) {
                            long j4 = j * j2;
                            long j5 = iM26625;
                            if (j4 >= j5 - Long.MIN_VALUE) {
                                j = j4 - j5;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }
}
