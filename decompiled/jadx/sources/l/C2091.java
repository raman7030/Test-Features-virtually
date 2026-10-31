package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2091 implements InterfaceC9765 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13895 f6967;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f6968;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9765 f6969;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6970;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f6971;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f6972;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f6973;

    public C2091(InterfaceC9765 interfaceC9765, byte[] bArr, int i, long j, C13895 c13895) {
        this.f6969 = interfaceC9765;
        this.f6968 = bArr;
        this.f6972 = i;
        this.f6971 = j;
        this.f6967 = c13895;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C13895 c13895 = this.f6967;
        c13895.m33305();
        if (i2 != 0) {
            int i3 = this.f6970;
            long j = this.f6971;
            int i4 = this.f6972;
            if (i3 != i4) {
                int iMin = Math.min(i2, i4 - i3);
                int i5 = this.f6969.read(bArr, i, iMin);
                if (i5 == -1) {
                    if (this.f6970 < j) {
                        throw new EOFException("MPEG-TS preview source ended before declared length");
                    }
                } else {
                    if (i5 < 0 || i5 > iMin) {
                        throw new IOException("MPEG-TS data source returned an invalid read result");
                    }
                    if (i5 != 0) {
                        this.f6973 = 0;
                        System.arraycopy(bArr, i, this.f6968, this.f6970, i5);
                        this.f6970 += i5;
                        c13895.m33305();
                        return i5;
                    }
                    int i6 = this.f6973 + 1;
                    this.f6973 = i6;
                    if (i6 >= 16) {
                        throw new IOException("MPEG-TS data source returned too many zero-byte reads");
                    }
                }
            } else if (i3 < j) {
                throw new C16907(C19370.m44628(i4, "MPEG-TS preview scan budget was exhausted: "));
            }
            return -1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m6870() {
        return this.f6970;
    }
}
