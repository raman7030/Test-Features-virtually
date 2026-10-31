package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩺֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes.dex */
public final class C22657 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f73168;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f73169;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C22657(C20038 c20038) {
        super(c20038);
        this.f73169 = 2097152L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i == -1) {
            return -1;
        }
        long j = this.f73168 + 1;
        this.f73168 = j;
        if (j <= this.f73169) {
            return i;
        }
        throw new C10870();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f73168;
        long j2 = this.f73169;
        int i3 = super.read(bArr, i, (int) Math.max(1L, Math.min(i2, (j2 - j) + 1)));
        if (i3 > 0) {
            long j3 = this.f73168 + ((long) i3);
            this.f73168 = j3;
            if (j3 > j2) {
                throw new C10870();
            }
        }
        return i3;
    }
}
