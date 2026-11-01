package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7277 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public long f19001;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C7277(long j) {
        this.f19001 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f19001;
        if (j <= 0) {
            return -1;
        }
        this.f19001 = j - 1;
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f19001;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        Arrays.fill(bArr, i, i + i2, (byte) 0);
        this.f19001 -= (long) i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        long j = this.f19001;
        if (65535 > j) {
            return (int) j;
        }
        return 65535;
    }
}
