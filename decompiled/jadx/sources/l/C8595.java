package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۡۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4Z8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8595 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InputStream f26247;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26245 = 16777215;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f26248 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f26246 = new int[256];

    public C8595(InputStream inputStream) {
        this.f26247 = inputStream;
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>= 1;
                if (i4 != 0) {
                    i2 ^= -306675152;
                }
            }
            this.f26246[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m22307() {
        return this.f26245;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22302() {
        return m22304() == this.f26245;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m22308() {
        this.f26245 = 16777215;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m22306() throws IOException {
        int i = this.f26247.read();
        if (this.f26248 && i != -1) {
            i = (~i) & 255;
        }
        int i2 = this.f26245;
        this.f26245 = (i2 >> 8) ^ this.f26246[(i2 ^ i) & 255];
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22305() {
        this.f26248 = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22303() throws IOException {
        this.f26247.close();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m22304() {
        return (m22306() & 255) | ((m22306() & 255) << 8) | ((m22306() & 255) << 16) | ((m22306() & 255) << 24);
    }
}
