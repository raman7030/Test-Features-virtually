package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R70I */
/* JADX INFO: loaded from: classes2.dex */
public final class C0579 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9047 f2291;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m2391() {
        C9047 c9047 = this.f2291;
        if (c9047 == null) {
            return 0;
        }
        return c9047.f27431;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2393(OutputStream outputStream, int i) throws IOException {
        C9005.m23246(m2391(), 0, i);
        int iMin = Math.min(1048576, Math.max(1, i));
        byte[] bArr = new byte[iMin];
        int i2 = 0;
        while (i > 0) {
            int iMin2 = Math.min(iMin, i);
            m2392(i2, iMin2, bArr);
            outputStream.write(bArr, 0, iMin2);
            i2 += iMin2;
            i -= iMin2;
        }
    }

    public C0579(C9047 c9047) {
        this.f2291 = c9047;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2392(int i, int i2, byte[] bArr) {
        C19631.m45125(i, 0, i2, this.f2291, bArr);
    }
}
