package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8BI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19404 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f62780;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19277 f62781;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C19404(InputStream inputStream, C19277 c19277, boolean z) {
        super(inputStream);
        this.f62781 = c19277;
        this.f62780 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19277 m44686() {
        return this.f62781;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (this.f62780 && i != -1) {
            this.f62781.m44460(1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (this.f62780 && jSkip > 0) {
            this.f62781.m44458(jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (this.f62780 && i3 != -1) {
            this.f62781.m44460(i3);
        }
        return i3;
    }
}
