package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S2LM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18145 extends OutputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f56434;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f56435;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC0300 f56436;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC5240 f56437;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f56438 = Integer.MAX_VALUE;

    public C18145(C19373 c19373, C7385 c7385) {
        this.f56436 = c19373;
        this.f56437 = c7385;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42253(int i) {
        if (this.f56435 || this.f56434 + ((long) i) <= this.f56438) {
            return;
        }
        this.f56435 = true;
        this.f56436.accept(this);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
        ((OutputStream) this.f56437.mo15127(this)).close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((OutputStream) this.f56437.mo15127(this)).flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        m42253(bArr.length);
        ((OutputStream) this.f56437.mo15127(this)).write(bArr);
        this.f56434 += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m42253(i2);
        ((OutputStream) this.f56437.mo15127(this)).write(bArr, i, i2);
        this.f56434 += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m42253(1);
        ((OutputStream) this.f56437.mo15127(this)).write(i);
        this.f56434++;
    }
}
