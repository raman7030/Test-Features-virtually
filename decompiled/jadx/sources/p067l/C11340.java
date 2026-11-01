package p067l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11340 extends AbstractC16032 {

    /* JADX INFO: renamed from: ֫ */
    public final long f31573;

    /* JADX INFO: renamed from: ۧ */
    public long f31574;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C10669 f31575;

    public C11340(C10669 c10669, long j) {
        this.f31575 = c10669;
        this.f31573 = j;
    }

    @Override // p067l.AbstractC16032
    /* JADX INFO: renamed from: ܽ */
    public final EnumC17373 mo20102() {
        return this.f31574 < this.f31573 ? EnumC17373.STORED : EnumC17373.INITIAL;
    }

    @Override // p067l.AbstractC16032
    /* JADX INFO: renamed from: ֫ */
    public final int mo20100(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.f31573 - this.f31574, i2);
        while (i4 < iMin) {
            C10669 c10669 = this.f31575;
            if (c10669.f29517.m33974() > 0) {
                byte bM24549 = (byte) C10669.m24549(c10669, 8);
                c10669.f29518.m54411(bM24549);
                bArr[i + i4] = bM24549;
                i3 = 1;
            } else {
                int i5 = i + i4;
                int i6 = c10669.f29520.read(bArr, i5, iMin - i4);
                if (i6 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                C24750 c24750 = c10669.f29518;
                for (int i7 = i5; i7 < i5 + i6; i7++) {
                    c24750.m54411(bArr[i7]);
                }
                i3 = i6;
            }
            this.f31574 += (long) i3;
            i4 += i3;
        }
        return iMin;
    }

    @Override // p067l.AbstractC16032
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo20101() {
        return this.f31574 < this.f31573;
    }

    @Override // p067l.AbstractC16032
    /* JADX INFO: renamed from: ֫ */
    public final int mo20099() {
        return (int) Math.min(this.f31573 - this.f31574, this.f31575.f29517.m33973() / 8);
    }
}
