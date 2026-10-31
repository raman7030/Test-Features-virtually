package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۜ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6997 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f21600;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9114 f21601;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f21603;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f21604;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f21599 = new byte[8192];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f21602 = -1;

    public C6997(C9114 c9114, long j) {
        this.f21601 = c9114;
        this.f21604 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m18925(long j) {
        if (j >= 0) {
            long j2 = this.f21604;
            long j3 = this.f21603;
            if (j <= j2 - j3) {
                return j3 + j;
            }
        }
        throw new EOFException("Invalid legacy state field boundary");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18929(long j) {
        this.f21603 = m18925(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18923() {
        m18925(1L);
        long j = this.f21603;
        long j2 = this.f21602;
        byte[] bArr = this.f21599;
        if (j < j2 || j >= j2 + ((long) this.f21600)) {
            this.f21602 = j;
            int i = this.f21601.f27613.read(ByteBuffer.wrap(bArr), this.f21603);
            this.f21600 = i;
            if (i <= 0) {
                throw new EOFException("Truncated legacy state");
            }
        }
        long j3 = this.f21603;
        this.f21603 = 1 + j3;
        return bArr[(int) (j3 - this.f21602)] & 255;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m18927() {
        return m18923() | (m18923() << 8) | (m18923() << 16) | (m18923() << 24);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18928(int i) {
        if (m18927() != i) {
            throw new IOException("Invalid legacy state magic");
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m18931() {
        m18929(m18927());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18924(int i) {
        int iM18927 = m18927();
        if (iM18927 < 0 || iM18927 > (this.f21604 - this.f21603) / ((long) i)) {
            throw new IOException("Invalid legacy state item count");
        }
        return iM18927;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18932() {
        if (this.f21603 != this.f21604) {
            throw new IOException("Trailing bytes in legacy state record");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18926(int[] iArr) {
        int iM18924 = m18924(12);
        int i = iArr[0];
        if (iM18924 > 100000 - i) {
            throw new IOException("Legacy history record limit exceeded");
        }
        iArr[0] = i + iM18924;
        for (int i2 = 0; i2 < iM18924; i2++) {
            int iM18925 = m18924(28);
            if (iM18925 > 0) {
                int i3 = iArr[1];
                if (iM18925 <= 100000 - i3) {
                    iArr[1] = i3 + iM18925;
                    for (int i4 = 0; i4 < iM18925; i4++) {
                        m18929(20L);
                        m18931();
                        m18931();
                    }
                    m18929(8L);
                }
            }
            throw new IOException("Invalid legacy history change count");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9820 m18930() {
        long j = this.f21603;
        if (this.f21604 - j >= 4) {
            int iM18927 = m18927();
            this.f21603 = j;
            if (iM18927 == -1568513661) {
                m18929(4L);
                m18929(((long) (m18923() | (m18923() << 8))) * 8);
            }
        }
        return this.f21601.m23479(j, this.f21603);
    }
}
