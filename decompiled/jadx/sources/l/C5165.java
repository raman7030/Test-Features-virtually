package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5165 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f16162;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C5165(long j) {
        this.f16162 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f16162;
        if (j <= 0) {
            return -1;
        }
        this.f16162 = j - 1;
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f16162;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        Arrays.fill(bArr, i, i + i2, (byte) 0);
        this.f16162 -= (long) i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        long j = this.f16162;
        if (65535 > j) {
            return (int) j;
        }
        return 65535;
    }
}
