package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: l.۫ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAPU */
/* JADX INFO: loaded from: classes3.dex */
public class C12123 extends FilterOutputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f36206 = new AtomicReference();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f36207;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Deflater f36208;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f36209;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f36210;

    public void finish() {
        throw null;
    }

    public C12123(OutputStream outputStream, Deflater deflater) {
        super(outputStream);
        this.f36210 = false;
        this.f36207 = false;
        if (outputStream == null) {
            throw null;
        }
        this.f36208 = deflater;
        byte[] bArr = (byte[]) f36206.getAndSet(null);
        this.f36209 = bArr == null ? new byte[512] : bArr;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) (i & 255)}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        Deflater deflater = this.f36208;
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
                byte[] bArr2 = this.f36209;
                int iDeflate = deflater.deflate(bArr2, 0, bArr2.length);
                if (iDeflate > 0) {
                    ((FilterOutputStream) this).out.write(this.f36209, 0, iDeflate);
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        AtomicReference atomicReference;
        if (this.f36210) {
            return;
        }
        finish();
        if (this.f36207) {
            this.f36208.end();
        }
        ((FilterOutputStream) this).out.close();
        this.f36210 = true;
        byte[] bArr = this.f36209;
        do {
            atomicReference = f36206;
            if (atomicReference.compareAndSet(null, bArr)) {
                break;
            }
        } while (atomicReference.get() == null);
        this.f36209 = null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }
}
