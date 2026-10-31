package l;

import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3939 implements InterfaceC0345 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m11984(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11990(long j, long j2) {
        return j - j2 <= 80000;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11985(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (".^$[]*+?|(){}\\".indexOf(cCharAt) >= 0) {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11986(String str, CharSequence... charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        for (CharSequence charSequence : charSequenceArr) {
            if (sb.length() > 0) {
                sb.append((CharSequence) str);
            }
            sb.append(charSequence);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11982(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i3 = length - length2;
        int i4 = i2 - 1;
        if (i4 <= i3) {
            i3 = i4;
        }
        if (i3 < i) {
            return -1;
        }
        if (length2 == 0) {
            return i3;
        }
        int i5 = length2 - 1;
        char cCharAt = charSequence2.charAt(i5);
        int i6 = i + i5;
        int i7 = i3 + i5;
        while (true) {
            if (i7 < i6 || charSequence.charAt(i7) == cCharAt) {
                if (i7 < i6) {
                    return -1;
                }
                int i8 = i7 - 1;
                int i9 = i7 - i5;
                int i10 = length2 - 2;
                while (i8 >= i9) {
                    int i11 = i8 - 1;
                    int i12 = i10 - 1;
                    if (charSequence.charAt(i8) == charSequence2.charAt(i10)) {
                        i8 = i11;
                        i10 = i12;
                    }
                }
                return i9;
            }
            i7--;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11983(ByteBuffer byteBuffer) {
        int i;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b = byteBuffer.get(26);
            int i2 = 28;
            int i3 = 28;
            for (int i4 = 0; i4 < b; i4++) {
                i3 += byteBuffer.get(i4 + 27);
            }
            byte b2 = byteBuffer.get(i3 + 26);
            for (int i5 = 0; i5 < b2; i5++) {
                i2 += byteBuffer.get(i3 + 27 + i5);
            }
            i = i3 + i2;
        }
        int i6 = byteBuffer.get(i + 26) + 27 + i;
        return (int) ((m11984(byteBuffer.get(i6), byteBuffer.limit() - i6 > 1 ? byteBuffer.get(i6 + 1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11989(StringBuilder sb, Throwable th) {
        PrintWriter printWriter = new PrintWriter(new C16733(sb));
        th.printStackTrace(printWriter);
        printWriter.flush();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11987(Throwable th) {
        StringBuilder sb = new StringBuilder();
        PrintWriter printWriter = new PrintWriter(new C16733(sb));
        th.printStackTrace(printWriter);
        printWriter.flush();
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m11991(ByteBuffer byteBuffer) {
        return (int) ((m11984(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m11992(byte[] bArr) {
        return m11984(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m11988(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }
}
