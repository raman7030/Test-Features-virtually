package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes4.dex */
public final class C20913 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8918 f67631;

    public C20913(C8918 c8918) {
        this.f67631 = c8918;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f67631.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f67631.write(i);
    }
}
