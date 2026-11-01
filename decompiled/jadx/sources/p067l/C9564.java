package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.۟ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9564 {

    /* JADX INFO: renamed from: ֫ */
    public int f26295;

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f26296 = new C19203(8);

    /* JADX INFO: renamed from: ֫ */
    public final boolean m22273(C17750 c17750) throws EOFException, InterruptedIOException {
        long length = c17750.getLength();
        long j = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        if (length != -1 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            j = length;
        }
        int i = (int) j;
        C19203 c19203 = this.f26296;
        c17750.mo24038(false, 0, 4, c19203.m43728());
        this.f26295 = 4;
        for (long jM43725 = c19203.m43725(); jM43725 != 440786851; jM43725 = ((jM43725 << 8) & (-256)) | ((long) (c19203.m43728()[0] & 255))) {
            int i2 = this.f26295 + 1;
            this.f26295 = i2;
            if (i2 == i) {
                return false;
            }
            c17750.mo24038(false, 0, 1, c19203.m43728());
        }
        long jM22272 = m22272(c17750);
        long j2 = this.f26295;
        if (jM22272 != Long.MIN_VALUE && (length == -1 || j2 + jM22272 < length)) {
            while (true) {
                long j3 = this.f26295;
                long j4 = j2 + jM22272;
                if (j3 < j4) {
                    if (m22272(c17750) == Long.MIN_VALUE) {
                        break;
                    }
                    long jM22273 = m22272(c17750);
                    if (jM22273 < 0 || jM22273 > 2147483647L) {
                        break;
                    }
                    if (jM22273 != 0) {
                        int i3 = (int) jM22273;
                        c17750.mo24037(i3, false);
                        this.f26295 += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private long m22272(C17750 c17750) {
        C19203 c19203 = this.f26296;
        int i = 0;
        c17750.mo24038(false, 0, 1, c19203.m43728());
        int i2 = c19203.m43728()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c17750.mo24038(false, 1, i4, c19203.m43728());
        while (i < i4) {
            i++;
            i5 = (c19203.m43728()[i] & 255) + (i5 << 8);
        }
        this.f26295 = i4 + 1 + this.f26295;
        return i5;
    }
}
