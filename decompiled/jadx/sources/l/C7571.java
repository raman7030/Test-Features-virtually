package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.۟ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7571 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23383;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f23384 = new C17714(8);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20296(C16184 c16184) throws EOFException, InterruptedIOException {
        long length = c16184.getLength();
        long j = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        if (length != -1 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            j = length;
        }
        int i = (int) j;
        C17714 c17714 = this.f23384;
        c16184.mo22068(false, 0, 4, c17714.m41482());
        this.f23383 = 4;
        for (long jM41479 = c17714.m41479(); jM41479 != 440786851; jM41479 = ((jM41479 << 8) & (-256)) | ((long) (c17714.m41482()[0] & 255))) {
            int i2 = this.f23383 + 1;
            this.f23383 = i2;
            if (i2 == i) {
                return false;
            }
            c16184.mo22068(false, 0, 1, c17714.m41482());
        }
        long jM20295 = m20295(c16184);
        long j2 = this.f23383;
        if (jM20295 != Long.MIN_VALUE && (length == -1 || j2 + jM20295 < length)) {
            while (true) {
                long j3 = this.f23383;
                long j4 = j2 + jM20295;
                if (j3 < j4) {
                    if (m20295(c16184) == Long.MIN_VALUE) {
                        break;
                    }
                    long jM20296 = m20295(c16184);
                    if (jM20296 < 0 || jM20296 > 2147483647L) {
                        break;
                    }
                    if (jM20296 != 0) {
                        int i3 = (int) jM20296;
                        c16184.mo22067(i3, false);
                        this.f23383 += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private long m20295(C16184 c16184) {
        C17714 c17714 = this.f23384;
        int i = 0;
        c16184.mo22068(false, 0, 1, c17714.m41482());
        int i2 = c17714.m41482()[0] & 255;
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
        c16184.mo22068(false, 1, i4, c17714.m41482());
        while (i < i4) {
            i++;
            i5 = (c17714.m41482()[i] & 255) + (i5 << 8);
        }
        this.f23383 = i4 + 1 + this.f23383;
        return i5;
    }
}
