package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۡۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4Z8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10537 {

    /* JADX INFO: renamed from: ܽ */
    public InputStream f29164;

    /* JADX INFO: renamed from: ֫ */
    public int f29162 = 16777215;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f29165 = true;

    /* JADX INFO: renamed from: ۧ */
    public int[] f29163 = new int[256];

    public C10537(InputStream inputStream) {
        this.f29164 = inputStream;
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>= 1;
                if (i4 != 0) {
                    i2 ^= -306675152;
                }
            }
            this.f29163[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m24276() {
        return this.f29162;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24271() {
        return m24273() == this.f29162;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m24277() {
        this.f29162 = 16777215;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m24275() throws IOException {
        int i = this.f29164.read();
        if (this.f29165 && i != -1) {
            i = (~i) & 255;
        }
        int i2 = this.f29162;
        this.f29162 = (i2 >> 8) ^ this.f29163[(i2 ^ i) & 255];
        return i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24274() {
        this.f29165 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24272() throws IOException {
        this.f29164.close();
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m24273() {
        return (m24275() & 255) | ((m24275() & 255) << 8) | ((m24275() & 255) << 16) | ((m24275() & 255) << 24);
    }
}
