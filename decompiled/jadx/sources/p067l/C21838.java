package p067l;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩶᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes5.dex */
public final class C21838 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public long f68716;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f68717;

    /* JADX INFO: renamed from: ᩹ */
    public final CRC32 f68718;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C21838(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
        this.f68718 = new CRC32();
        this.f68717 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (this.f68717 && i >= 0) {
            this.f68718.update(i);
        }
        if (i >= 0) {
            this.f68716++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (this.f68717 && i3 > 0) {
            this.f68718.update(bArr, i, i3);
        }
        if (i3 > 0) {
            this.f68716 += (long) i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m49259() {
        return this.f68718.getValue();
    }

    public final long getPosition() {
        return this.f68716;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m49260() {
        this.f68717 = false;
    }
}
