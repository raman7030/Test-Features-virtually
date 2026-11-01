package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8BI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20810 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f65391;

    /* JADX INFO: renamed from: ᩹ */
    public final C20689 f65392;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C20810(InputStream inputStream, C20689 c20689, boolean z) {
        super(inputStream);
        this.f65392 = c20689;
        this.f65391 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20689 m46980() {
        return this.f65392;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (this.f65391 && i != -1) {
            this.f65392.m46754(1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (this.f65391 && jSkip > 0) {
            this.f65392.m46752(jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (this.f65391 && i3 != -1) {
            this.f65392.m46754(i3);
        }
        return i3;
    }
}
