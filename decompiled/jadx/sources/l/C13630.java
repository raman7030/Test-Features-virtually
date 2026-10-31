package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7JL */
/* JADX INFO: loaded from: classes3.dex */
public class C13630 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f40644;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32766(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32770(byte[] bArr) {
        if (bArr.length < 18) {
            return false;
        }
        int i = bArr[1] & 255;
        int i2 = bArr[2] & 255;
        int i3 = ((bArr[6] & 255) << 8) | (bArr[5] & 255);
        int i4 = bArr[7] & 255;
        int i5 = ((bArr[13] & 255) << 8) | (bArr[12] & 255);
        int i6 = ((bArr[15] & 255) << 8) | (bArr[14] & 255);
        int i7 = bArr[16] & 255;
        if (i != 0 && i != 1) {
            return false;
        }
        if ((i2 != 1 && i2 != 2 && i2 != 3 && i2 != 9 && i2 != 10 && i2 != 11) || i5 == 0 || i6 == 0) {
            return false;
        }
        if (i2 == 1 || i2 == 9) {
            if (i != 1) {
                return false;
            }
        } else if (i != 0) {
            return false;
        }
        if (i == 1) {
            if (i3 <= 0) {
                return false;
            }
            if (i4 != 15 && i4 != 16 && i4 != 24 && i4 != 32) {
                return false;
            }
        }
        if (i2 == 1 || i2 == 9) {
            if (i7 != 8 && i7 != 16) {
                return false;
            }
        } else if (i2 == 2 || i2 == 10) {
            if (i7 != 15 && i7 != 16 && i7 != 24 && i7 != 32) {
                return false;
            }
        } else {
            if (i2 != 3 && i2 != 11) {
                return false;
            }
            if (i7 != 8 && i7 != 16) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32769() {
        try {
            Field declaredField = C4369.class.getDeclaredField("֫");
            Field declaredField2 = C4369.class.getDeclaredField("ۧ");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            Object obj = declaredField.get(null);
            C11003.requireNonNull(obj);
            Object obj2 = declaredField2.get(null);
            C11003.requireNonNull(obj2);
            Map map = (Map) obj2;
            synchronized (obj) {
                map.clear();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC11716 m32773(C8894 c8894) {
        try {
            int i = c8894.read();
            byte b = (byte) i;
            EnumC23004 enumC23004M51147 = EnumC23004.m51147(b);
            EnumC0426 enumC0426M1966 = EnumC0426.m1966(b);
            int i2 = i & 31;
            if (i2 <= 30) {
                return AbstractC11716.m28608(enumC23004M51147, i2).m28610(enumC0426M1966);
            }
            int i3 = c8894.read();
            if ((i3 & 127) == 0) {
                throw new C2544("corrupted stream - invalid high tag number found");
            }
            int i4 = 0;
            while (i3 >= 0 && (i3 & 128) != 0) {
                i4 = ((i3 & 127) | i4) << 7;
                i3 = c8894.read();
            }
            if (i3 < 0) {
                throw new C2544("EOF found inside tag value.");
            }
            return AbstractC11716.m28608(enumC23004M51147, (i3 & 127) | i4).m28610(enumC0426M1966);
        } catch (IOException e) {
            throw new C2544("Unable to parse ASN.1 tag", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32767(C8894 c8894) {
        try {
            int i = c8894.read();
            if (i <= 127) {
                return i;
            }
            int i2 = i & 127;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                i3 = (i3 << 8) + c8894.read();
            }
            if (i3 != 0) {
                return i3;
            }
            throw new C2544("The indefinite length form is not (yet) supported!");
        } catch (IOException e) {
            throw new C2544("Unable to read the length of the ASN.1 object.", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m32771(int i, C8894 c8894) {
        try {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = c8894.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            }
            return bArr;
        } catch (IOException e) {
            throw new C2544("Unable to read the value of the ASN.1 object", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m32768(long j) {
        return 1 << (64 - Long.numberOfLeadingZeros(j - 1));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m32772(float f, int i) {
        return Math.min((int) Math.ceil(((double) i) * ((double) f)), i - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32765(float f, int i) {
        long jMax = Math.max(2L, m32768((long) Math.ceil(((double) i) / ((double) f))));
        if (jMax <= 1073741824) {
            return (int) jMax;
        }
        throw new IllegalArgumentException("Too large (" + i + " expected elements with load factor " + f + MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
