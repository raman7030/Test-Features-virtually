package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2R9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2700 {
    /* JADX INFO: renamed from: ֫ */
    public static void m4192(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                C7470.m17251(autoCloseable);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m4194(InputStream inputStream, int i) throws IOException {
        try {
            if (i <= 0) {
                i = 32;
            }
            C2864 c2864 = new C2864(i);
            C23461.m52179(inputStream, c2864);
            byte[] bArr = c2864.f4949;
            int length = bArr.length;
            int i2 = c2864.f4950;
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m4193(long j, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[UMErrorCode.E_UM_BE_DEFLATE_FAILED];
        C23461.m52184(inputStream, bArr, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        int iM39928 = C17548.m39928(52, bArr);
        C2864 c2864 = new C2864(iM39928 + 208);
        c2864.write(bArr, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        int iMin = (int) (Math.min(iM39928 + 4, j) - ((long) UMErrorCode.E_UM_BE_DEFLATE_FAILED));
        byte[] bArr2 = new byte[4096];
        while (iMin > 0) {
            int i = inputStream.read(bArr2, 0, Math.min(4096, iMin));
            if (i == -1) {
                throw new EOFException();
            }
            c2864.write(bArr2, 0, i);
            iMin -= i;
        }
        int iM39929 = C17548.m39928(c2864.f4950 - 4, c2864.f4949) * 12;
        while (iM39929 > 0) {
            int i2 = inputStream.read(bArr2, 0, Math.min(4096, iM39929));
            if (i2 == -1) {
                throw new EOFException();
            }
            c2864.write(bArr2, 0, i2);
            iM39929 -= i2;
        }
        byte[] bArr3 = c2864.f4949;
        int length = bArr3.length;
        int i3 = c2864.f4950;
        if (length == i3) {
            return bArr3;
        }
        C11755.m26983(bArr3.length, 0, i3);
        byte[] bArr4 = i3 == 0 ? C7747.f20313 : new byte[i3];
        System.arraycopy(bArr3, 0, bArr4, 0, i3);
        return bArr4;
    }
}
