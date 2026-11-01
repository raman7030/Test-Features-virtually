package p067l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes3.dex */
public final class C11742 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public long f32788;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f32788++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f32788 += (long) i2;
    }
}
