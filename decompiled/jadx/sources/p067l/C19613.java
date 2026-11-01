package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S2LM */
/* JADX INFO: loaded from: classes4.dex */
public final class C19613 extends OutputStream {

    /* JADX INFO: renamed from: ۗ */
    public long f59649;

    /* JADX INFO: renamed from: ۙ */
    public boolean f59650;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC2653 f59651;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC7348 f59652;

    /* JADX INFO: renamed from: ᩹ */
    public final int f59653 = Integer.MAX_VALUE;

    public C19613(C20780 c20780, C9387 c9387) {
        this.f59651 = c20780;
        this.f59652 = c9387;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44514(int i) {
        if (this.f59650 || this.f59649 + ((long) i) <= this.f59653) {
            return;
        }
        this.f59650 = true;
        this.f59651.accept(this);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
        ((OutputStream) this.f59652.mo17030(this)).close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((OutputStream) this.f59652.mo17030(this)).flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        m44514(bArr.length);
        ((OutputStream) this.f59652.mo17030(this)).write(bArr);
        this.f59649 += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m44514(i2);
        ((OutputStream) this.f59652.mo17030(this)).write(bArr, i, i2);
        this.f59649 += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m44514(1);
        ((OutputStream) this.f59652.mo17030(this)).write(i);
        this.f59649++;
    }
}
