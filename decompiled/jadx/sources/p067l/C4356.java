package p067l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4356 implements InterfaceC11649 {

    /* JADX INFO: renamed from: ֫ */
    public final C15574 f9751;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f9752;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC11649 f9753;

    /* JADX INFO: renamed from: ܽ */
    public int f9754;

    /* JADX INFO: renamed from: ܿ */
    public final long f9755;

    /* JADX INFO: renamed from: ᩳ */
    public final int f9756;

    /* JADX INFO: renamed from: ᩻ */
    public int f9757;

    public C4356(InterfaceC11649 interfaceC11649, byte[] bArr, int i, long j, C15574 c15574) {
        this.f9753 = interfaceC11649;
        this.f9752 = bArr;
        this.f9756 = i;
        this.f9755 = j;
        this.f9751 = c15574;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C15574 c15574 = this.f9751;
        c15574.m35424();
        if (i2 != 0) {
            int i3 = this.f9754;
            long j = this.f9755;
            int i4 = this.f9756;
            if (i3 != i4) {
                int iMin = Math.min(i2, i4 - i3);
                int i5 = this.f9753.read(bArr, i, iMin);
                if (i5 == -1) {
                    if (this.f9754 < j) {
                        throw new EOFException("MPEG-TS preview source ended before declared length");
                    }
                } else {
                    if (i5 < 0 || i5 > iMin) {
                        throw new IOException("MPEG-TS data source returned an invalid read result");
                    }
                    if (i5 != 0) {
                        this.f9757 = 0;
                        System.arraycopy(bArr, i, this.f9752, this.f9754, i5);
                        this.f9754 += i5;
                        c15574.m35424();
                        return i5;
                    }
                    int i6 = this.f9757 + 1;
                    this.f9757 = i6;
                    if (i6 >= 16) {
                        throw new IOException("MPEG-TS data source returned too many zero-byte reads");
                    }
                }
            } else if (i3 < j) {
                throw new C18437(C20778.m46922(i4, "MPEG-TS preview scan budget was exhausted: "));
            }
            return -1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m8996() {
        return this.f9754;
    }
}
