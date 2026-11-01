package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;

/* JADX INFO: renamed from: l.ۧ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13051 extends AbstractC16402 {

    /* JADX INFO: renamed from: ܳ */
    public final int f36704;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f36705;

    /* JADX INFO: renamed from: ᩻ */
    public int f36706;

    public AbstractC13051(int i) {
        super(0);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f36705 = new byte[iMax];
        this.f36704 = iMax;
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final int mo29874() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m29876(int i, int i2) {
        m29879((i << 3) | i2);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m29879(int i) {
        boolean z = AbstractC16402.f48201;
        byte[] bArr = this.f36705;
        if (z) {
            while ((i & C0184a.f879g) != 0) {
                int i2 = this.f36706;
                this.f36706 = i2 + 1;
                C22558.m50563(bArr, i2, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i3 = this.f36706;
            this.f36706 = i3 + 1;
            C22558.m50563(bArr, i3, (byte) i);
            return;
        }
        while ((i & C0184a.f879g) != 0) {
            int i4 = this.f36706;
            this.f36706 = i4 + 1;
            bArr[i4] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i5 = this.f36706;
        this.f36706 = i5 + 1;
        bArr[i5] = (byte) i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m29877(long j) {
        boolean z = AbstractC16402.f48201;
        byte[] bArr = this.f36705;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.f36706;
                this.f36706 = i + 1;
                C22558.m50563(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.f36706;
            this.f36706 = i2 + 1;
            C22558.m50563(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.f36706;
            this.f36706 = i3 + 1;
            bArr[i3] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i4 = this.f36706;
        this.f36706 = i4 + 1;
        bArr[i4] = (byte) j;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m29875(int i) {
        int i2 = this.f36706;
        int i3 = i2 + 1;
        this.f36706 = i3;
        byte[] bArr = this.f36705;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f36706 = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f36706 = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f36706 = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m29878(long j) {
        int i = this.f36706;
        int i2 = i + 1;
        this.f36706 = i2;
        byte[] bArr = this.f36705;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f36706 = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f36706 = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f36706 = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f36706 = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f36706 = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f36706 = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f36706 = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }
}
