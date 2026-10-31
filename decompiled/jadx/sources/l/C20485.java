package l;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩶᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes5.dex */
public final class C20485 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f66039;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f66040;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CRC32 f66041;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C20485(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
        this.f66041 = new CRC32();
        this.f66040 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (this.f66040 && i >= 0) {
            this.f66041.update(i);
        }
        if (i >= 0) {
            this.f66039++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (this.f66040 && i3 > 0) {
            this.f66041.update(bArr, i, i3);
        }
        if (i3 > 0) {
            this.f66039 += (long) i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m46936() {
        return this.f66041.getValue();
    }

    public final long getPosition() {
        return this.f66039;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46937() {
        this.f66040 = false;
    }
}
