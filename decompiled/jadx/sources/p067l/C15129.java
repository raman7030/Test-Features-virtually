package p067l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T61X */
/* JADX INFO: loaded from: classes4.dex */
public final class C15129 extends AbstractC14459 {
    /* JADX INFO: renamed from: ֫ */
    public static int m34546(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m34552(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m34548(long j) {
        int i = (int) j;
        C6194.m14025(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m34547(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m34551(Collection collection) {
        if (collection instanceof C5742) {
            C5742 c5742 = (C5742) collection;
            return Arrays.copyOfRange(c5742.f14088, c5742.f14087, c5742.f14089);
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

    /* JADX INFO: renamed from: ֫ */
    public static List m34550(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new C5742(0, iArr.length, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX INFO: renamed from: ֫ */
    public static Integer m34549(String str) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                int iM28663 = C12448.m28663(str.charAt(i));
                if (iM28663 >= 0 && iM28663 < 10) {
                    long j = -iM28663;
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
                        int iM28664 = C12448.m28663(str.charAt(i2));
                        if (iM28664 >= 0 && iM28664 < 10 && j >= j3) {
                            long j4 = j * j2;
                            long j5 = iM28664;
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
