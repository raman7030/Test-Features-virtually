package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۜ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes2.dex */
public final class C9019 {

    /* JADX INFO: renamed from: ۧ */
    public int f24480;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C11031 f24481;

    /* JADX INFO: renamed from: ܿ */
    public long f24483;

    /* JADX INFO: renamed from: ᩳ */
    public long f24484;

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f24479 = new byte[8192];

    /* JADX INFO: renamed from: ܽ */
    public long f24482 = -1;

    public C9019(C11031 c11031, long j) {
        this.f24481 = c11031;
        this.f24484 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m20879(long j) {
        if (j >= 0) {
            long j2 = this.f24484;
            long j3 = this.f24483;
            if (j <= j2 - j3) {
                return j3 + j;
            }
        }
        throw new EOFException("Invalid legacy state field boundary");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20883(long j) {
        this.f24483 = m20879(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m20877() {
        m20879(1L);
        long j = this.f24483;
        long j2 = this.f24482;
        byte[] bArr = this.f24479;
        if (j < j2 || j >= j2 + ((long) this.f24480)) {
            this.f24482 = j;
            int i = this.f24481.f30550.read(ByteBuffer.wrap(bArr), this.f24483);
            this.f24480 = i;
            if (i <= 0) {
                throw new EOFException("Truncated legacy state");
            }
        }
        long j3 = this.f24483;
        this.f24483 = 1 + j3;
        return bArr[(int) (j3 - this.f24482)] & 255;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m20881() {
        return m20877() | (m20877() << 8) | (m20877() << 16) | (m20877() << 24);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20882(int i) {
        if (m20881() != i) {
            throw new IOException("Invalid legacy state magic");
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m20885() {
        m20883(m20881());
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m20878(int i) {
        int iM20881 = m20881();
        if (iM20881 < 0 || iM20881 > (this.f24484 - this.f24483) / ((long) i)) {
            throw new IOException("Invalid legacy state item count");
        }
        return iM20881;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m20886() {
        if (this.f24483 != this.f24484) {
            throw new IOException("Trailing bytes in legacy state record");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20880(int[] iArr) {
        int iM20878 = m20878(12);
        int i = iArr[0];
        if (iM20878 > 100000 - i) {
            throw new IOException("Legacy history record limit exceeded");
        }
        iArr[0] = i + iM20878;
        for (int i2 = 0; i2 < iM20878; i2++) {
            int iM20879 = m20878(28);
            if (iM20879 > 0) {
                int i3 = iArr[1];
                if (iM20879 <= 100000 - i3) {
                    iArr[1] = i3 + iM20879;
                    for (int i4 = 0; i4 < iM20879; i4++) {
                        m20883(20L);
                        m20885();
                        m20885();
                    }
                    m20883(8L);
                }
            }
            throw new IOException("Invalid legacy history change count");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C11702 m20884() {
        long j = this.f24483;
        if (this.f24484 - j >= 4) {
            int iM20881 = m20881();
            this.f24483 = j;
            if (iM20881 == -1568513661) {
                m20883(4L);
                m20883(((long) (m20877() | (m20877() << 8))) * 8);
            }
        }
        return this.f24481.m25426(j, this.f24483);
    }
}
