package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2R9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0349 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1793(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                C5368.m15342(autoCloseable);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m1795(InputStream inputStream, int i) throws IOException {
        try {
            if (i <= 0) {
                i = 32;
            }
            C0521 c0521 = new C0521(i);
            C22194.m49852(inputStream, c0521);
            byte[] bArr = c0521.f2176;
            int length = bArr.length;
            int i2 = c0521.f2177;
            if (length == i2) {
                if (inputStream != null) {
                    inputStream.close();
                }
                return bArr;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            if (inputStream != null) {
                inputStream.close();
            }
            return bArrCopyOf;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m1794(long j, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[UMErrorCode.E_UM_BE_DEFLATE_FAILED];
        C22194.m49857(inputStream, bArr, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        int iM37744 = C15972.m37744(52, bArr);
        C0521 c0521 = new C0521(iM37744 + 208);
        c0521.write(bArr, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        int iMin = (int) (Math.min(iM37744 + 4, j) - ((long) UMErrorCode.E_UM_BE_DEFLATE_FAILED));
        byte[] bArr2 = new byte[4096];
        while (iMin > 0) {
            int i = inputStream.read(bArr2, 0, Math.min(4096, iMin));
            if (i == -1) {
                throw new EOFException();
            }
            c0521.write(bArr2, 0, i);
            iMin -= i;
        }
        int iM37745 = C15972.m37744(c0521.f2177 - 4, c0521.f2176) * 12;
        while (iM37745 > 0) {
            int i2 = inputStream.read(bArr2, 0, Math.min(4096, iM37745));
            if (i2 == -1) {
                throw new EOFException();
            }
            c0521.write(bArr2, 0, i2);
            iM37745 -= i2;
        }
        byte[] bArr3 = c0521.f2176;
        int length = bArr3.length;
        int i3 = c0521.f2177;
        if (length == i3) {
            return bArr3;
        }
        C9876.m24968(bArr3.length, 0, i3);
        byte[] bArr4 = i3 == 0 ? C5659.f17466 : new byte[i3];
        System.arraycopy(bArr3, 0, bArr4, 0, i3);
        return bArr4;
    }
}
