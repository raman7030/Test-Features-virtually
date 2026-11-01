package p067l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: l.۫ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAPU */
/* JADX INFO: loaded from: classes3.dex */
public class C13890 extends FilterOutputStream {

    /* JADX INFO: renamed from: ۗ */
    public static final AtomicReference f39218 = new AtomicReference();

    /* JADX INFO: renamed from: ۙ */
    public boolean f39219;

    /* JADX INFO: renamed from: ᩶ */
    public Deflater f39220;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f39221;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f39222;

    public void finish() {
        throw null;
    }

    public C13890(OutputStream outputStream, Deflater deflater) {
        super(outputStream);
        this.f39222 = false;
        this.f39219 = false;
        if (outputStream == null) {
            throw null;
        }
        this.f39220 = deflater;
        byte[] bArr = (byte[]) f39218.getAndSet(null);
        this.f39221 = bArr == null ? new byte[512] : bArr;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) (i & 255)}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        Deflater deflater = this.f39220;
        if (deflater.finished()) {
            throw new IOException("write beyond end of stream");
        }
        int i3 = i + i2;
        if ((i | i2 | i3 | (bArr.length - i3)) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0 || deflater.finished()) {
            return;
        }
        deflater.setInput(bArr, i, i2);
        while (!deflater.needsInput()) {
            while (true) {
                byte[] bArr2 = this.f39221;
                int iDeflate = deflater.deflate(bArr2, 0, bArr2.length);
                if (iDeflate > 0) {
                    ((FilterOutputStream) this).out.write(this.f39221, 0, iDeflate);
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        AtomicReference atomicReference;
        if (this.f39222) {
            return;
        }
        finish();
        if (this.f39219) {
            this.f39220.end();
        }
        ((FilterOutputStream) this).out.close();
        this.f39222 = true;
        byte[] bArr = this.f39221;
        do {
            atomicReference = f39218;
            if (atomicReference.compareAndSet(null, bArr)) {
                break;
            }
        } while (atomicReference.get() == null);
        this.f39221 = null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }
}
