package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R70I */
/* JADX INFO: loaded from: classes2.dex */
public final class C2919 {

    /* JADX INFO: renamed from: ֫ */
    public final C10967 f5066;

    /* JADX INFO: renamed from: ֫ */
    public final int m4762() {
        C10967 c10967 = this.f5066;
        if (c10967 == null) {
            return 0;
        }
        return c10967.f30368;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4764(OutputStream outputStream, int i) throws IOException {
        C10927.m25190(m4762(), 0, i);
        int iMin = Math.min(1048576, Math.max(1, i));
        byte[] bArr = new byte[iMin];
        int i2 = 0;
        while (i > 0) {
            int iMin2 = Math.min(iMin, i);
            m4763(i2, iMin2, bArr);
            outputStream.write(bArr, 0, iMin2);
            i2 += iMin2;
            i -= iMin2;
        }
    }

    public C2919(C10967 c10967) {
        this.f5066 = c10967;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4763(int i, int i2, byte[] bArr) {
        C21026.m47421(i, 0, i2, this.f5066, bArr);
    }
}
