package l;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۙ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes2.dex */
public final class C4962 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6101 f15628;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f15629;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CRC32 f15630;

    public C4962(BufferedOutputStream bufferedOutputStream, C6101 c6101) {
        super(bufferedOutputStream);
        this.f15630 = new CRC32();
        this.f15629 = true;
        this.f15628 = c6101;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m14400() {
        return this.f15630.getValue();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14401() {
        this.f15629 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        C6101 c6101 = this.f15628;
        if (c6101 != null) {
            c6101.m17019();
        }
        ((FilterOutputStream) this).out.write(i);
        if (this.f15629) {
            this.f15630.update(i);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C6101 c6101 = this.f15628;
        if (c6101 != null) {
            c6101.m17019();
        }
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        if (this.f15629) {
            this.f15630.update(bArr, i, i2);
        }
    }
}
