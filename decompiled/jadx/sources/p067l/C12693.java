package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X7RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12693 {

    /* JADX INFO: renamed from: ֫ */
    public int f35613;

    /* JADX INFO: renamed from: ۧ */
    public int f35614;

    /* JADX INFO: renamed from: ܽ */
    public final OutputStream f35615;

    /* JADX INFO: renamed from: ֫ */
    public final void m29212(boolean z) throws IOException {
        int i = this.f35614 + 1;
        int i2 = ((z ? 1 : 0) << (32 - i)) | this.f35613;
        if (i == 8) {
            this.f35615.write(i2 >>> 24);
            i = 0;
            i2 = 0;
        }
        this.f35613 = i2;
        this.f35614 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29211(int i, int i2) throws IOException {
        int i3 = this.f35614;
        int i4 = ((i2 << (32 - i)) >>> i3) | this.f35613;
        int i5 = i3 + i;
        while (i5 >= 8) {
            this.f35615.write(i4 >>> 24);
            i4 <<= 8;
            i5 -= 8;
        }
        this.f35613 = i4;
        this.f35614 = i5;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29210() throws IOException {
        int i = this.f35614;
        if (i > 0) {
            m29211(8 - i, 0);
        }
    }

    public C12693(OutputStream outputStream) {
        this.f35615 = outputStream;
    }
}
