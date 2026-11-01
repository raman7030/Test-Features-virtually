package p067l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54YN */
/* JADX INFO: loaded from: classes2.dex */
public final class C3160 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public long f5784;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC9866 f5785;

    public C3160(long j, C24618 c24618) {
        this.f5784 = j;
        this.f5785 = c24618;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        long j = this.f5784;
        InterfaceC9866 interfaceC9866 = this.f5785;
        interfaceC9866.seek(j);
        this.f5784++;
        interfaceC9866.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        long j = this.f5784;
        InterfaceC9866 interfaceC9866 = this.f5785;
        interfaceC9866.seek(j);
        this.f5784 += (long) bArr.length;
        interfaceC9866.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        long j = this.f5784;
        InterfaceC9866 interfaceC9866 = this.f5785;
        interfaceC9866.seek(j);
        this.f5784 += (long) i2;
        interfaceC9866.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f5785.flush();
    }
}
