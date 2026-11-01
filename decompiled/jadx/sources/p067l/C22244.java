package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes4.dex */
public final class C22244 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C10844 f70316;

    public C22244(C10844 c10844) {
        this.f70316 = c10844;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f70316.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f70316.write(i);
    }
}
