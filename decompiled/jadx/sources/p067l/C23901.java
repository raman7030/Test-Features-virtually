package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩺֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes.dex */
public final class C23901 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public long f75894;

    /* JADX INFO: renamed from: ᩹ */
    public final long f75895;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C23901(C21412 c21412) {
        super(c21412);
        this.f75895 = 2097152L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i == -1) {
            return -1;
        }
        long j = this.f75894 + 1;
        this.f75894 = j;
        if (j <= this.f75895) {
            return i;
        }
        throw new C12699();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f75894;
        long j2 = this.f75895;
        int i3 = super.read(bArr, i, (int) Math.max(1L, Math.min(i2, (j2 - j) + 1)));
        if (i3 > 0) {
            long j3 = this.f75894 + ((long) i3);
            this.f75894 = j3;
            if (j3 > j2) {
                throw new C12699();
            }
        }
        return i3;
    }
}
