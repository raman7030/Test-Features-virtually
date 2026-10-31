package l;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* JADX INFO: renamed from: l.ᩴ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes4.dex */
public final class C19085 extends PipedOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2857 f60124;

    public C19085(PipedInputStream pipedInputStream, boolean z) {
        super(pipedInputStream);
        this.f60124 = null;
        if (z) {
            this.f60124 = (C2857) pipedInputStream;
        }
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        C2857 c2857 = this.f60124;
        if (c2857 != null) {
            c2857.m8745(1);
        }
        super.write(i);
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C2857 c2857 = this.f60124;
        if (c2857 != null) {
            c2857.m8745(i2);
        }
        super.write(bArr, i, i2);
    }
}
