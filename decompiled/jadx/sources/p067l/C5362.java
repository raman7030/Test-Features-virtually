package p067l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5362 extends OutputStream {

    /* JADX INFO: renamed from: ᩶ */
    public final FilterOutputStream f12643;

    /* JADX INFO: renamed from: ᩸ */
    public long f12644;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f12645 = true;

    public C5362(FilterOutputStream filterOutputStream) {
        this.f12643 = filterOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.f12643.write(i);
            this.f12644++;
        } catch (IOException e) {
            this.f12645 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f12645 = false;
            throw e2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f12643.write(bArr, i, i2);
            this.f12644 += (long) i2;
        } catch (IOException e) {
            this.f12645 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f12645 = false;
            throw e2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f12643.flush();
        } catch (IOException e) {
            this.f12645 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f12645 = false;
            throw e2;
        }
    }
}
