package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9440 extends AbstractC14377 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f28626;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f28627;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8734 f28628;

    public C9440(C8734 c8734, long j) {
        this.f28628 = c8734;
        this.f28626 = j;
    }

    @Override // l.AbstractC14377
    /* JADX INFO: renamed from: ܽ */
    public final EnumC15788 mo18150() {
        return this.f28627 < this.f28626 ? EnumC15788.STORED : EnumC15788.INITIAL;
    }

    @Override // l.AbstractC14377
    /* JADX INFO: renamed from: ֫ */
    public final int mo18148(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.f28626 - this.f28627, i2);
        while (i4 < iMin) {
            C8734 c8734 = this.f28628;
            if (c8734.f26592.m31881() > 0) {
                byte bM22580 = (byte) C8734.m22580(c8734, 8);
                c8734.f26593.m52009(bM22580);
                bArr[i + i4] = bM22580;
                i3 = 1;
            } else {
                int i5 = i + i4;
                int i6 = c8734.f26595.read(bArr, i5, iMin - i4);
                if (i6 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                C23550 c23550 = c8734.f26593;
                for (int i7 = i5; i7 < i5 + i6; i7++) {
                    c23550.m52009(bArr[i7]);
                }
                i3 = i6;
            }
            this.f28627 += (long) i3;
            i4 += i3;
        }
        return iMin;
    }

    @Override // l.AbstractC14377
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo18149() {
        return this.f28627 < this.f28626;
    }

    @Override // l.AbstractC14377
    /* JADX INFO: renamed from: ֫ */
    public final int mo18147() {
        return (int) Math.min(this.f28626 - this.f28627, this.f28628.f26592.m31880() / 8);
    }
}
