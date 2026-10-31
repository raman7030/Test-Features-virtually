package l;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12716 extends OutputStream {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileOutputStream f38265;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10600 f38266;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12011 f38267;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17066 f38268;

    public C12716(C12011 c12011, C10600 c10600, InterfaceC17066 interfaceC17066, FileOutputStream fileOutputStream) {
        this.f38267 = c12011;
        this.f38266 = c10600;
        this.f38268 = interfaceC17066;
        this.f38265 = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C12011.m29373(this.f38267, this.f38266, 1, this.f38268);
        this.f38265.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        C12011.m29373(this.f38267, this.f38266, i2, this.f38268);
        this.f38265.write(bArr, i, i2);
    }
}
