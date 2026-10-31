package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes3.dex */
public final class C9862 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f29835;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f29835++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f29835 += (long) i2;
    }
}
