package p067l;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* JADX INFO: renamed from: l.ᩴ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes4.dex */
public final class C20507 extends PipedOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public C5084 f63358;

    public C20507(PipedInputStream pipedInputStream, boolean z) {
        super(pipedInputStream);
        this.f63358 = null;
        if (z) {
            this.f63358 = (C5084) pipedInputStream;
        }
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        C5084 c5084 = this.f63358;
        if (c5084 != null) {
            c5084.m10812(1);
        }
        super.write(i);
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C5084 c5084 = this.f63358;
        if (c5084 != null) {
            c5084.m10812(i2);
        }
        super.write(bArr, i, i2);
    }
}
