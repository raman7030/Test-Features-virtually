package p067l;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۙ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes2.dex */
public final class C7085 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩶ */
    public final C8167 f18462;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f18463;

    /* JADX INFO: renamed from: ᩹ */
    public final CRC32 f18464;

    public C7085(BufferedOutputStream bufferedOutputStream, C8167 c8167) {
        super(bufferedOutputStream);
        this.f18464 = new CRC32();
        this.f18463 = true;
        this.f18462 = c8167;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m16303() {
        return this.f18464.getValue();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m16304() {
        this.f18463 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        C8167 c8167 = this.f18462;
        if (c8167 != null) {
            c8167.m18950();
        }
        ((FilterOutputStream) this).out.write(i);
        if (this.f18463) {
            this.f18464.update(i);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C8167 c8167 = this.f18462;
        if (c8167 != null) {
            c8167.m18950();
        }
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        if (this.f18463) {
            this.f18464.update(bArr, i, i2);
        }
    }
}
