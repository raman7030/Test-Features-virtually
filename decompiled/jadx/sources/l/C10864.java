package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X7RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10864 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f32636;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f32637;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final OutputStream f32638;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27167(boolean z) throws IOException {
        int i = this.f32637 + 1;
        int i2 = ((z ? 1 : 0) << (32 - i)) | this.f32636;
        if (i == 8) {
            this.f32638.write(i2 >>> 24);
            i = 0;
            i2 = 0;
        }
        this.f32636 = i2;
        this.f32637 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27166(int i, int i2) throws IOException {
        int i3 = this.f32637;
        int i4 = ((i2 << (32 - i)) >>> i3) | this.f32636;
        int i5 = i3 + i;
        while (i5 >= 8) {
            this.f32638.write(i4 >>> 24);
            i4 <<= 8;
            i5 -= 8;
        }
        this.f32636 = i4;
        this.f32637 = i5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27165() throws IOException {
        int i = this.f32637;
        if (i > 0) {
            m27166(8 - i, 0);
        }
    }

    public C10864(OutputStream outputStream) {
        this.f32638 = outputStream;
    }
}
