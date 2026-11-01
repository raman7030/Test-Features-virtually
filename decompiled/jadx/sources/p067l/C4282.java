package p067l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֫ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 439X */
/* JADX INFO: loaded from: classes2.dex */
public final class C4282 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C13000 f9504;

    /* JADX INFO: renamed from: ᩸ */
    public int f9505 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public int f9506 = 0;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C4282(C13000 c13000) {
        this.f9504 = c13000;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f9505;
        C13000 c13000 = this.f9504;
        if (i >= c13000.f36577) {
            return -1;
        }
        int iM29809 = c13000.m29809(this.f9505);
        this.f9505++;
        return iM29809;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        C13000 c13000 = this.f9504;
        int i3 = c13000.f36577 - this.f9505;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(c13000.f36576, this.f9505, bArr, i, i2);
        this.f9505 += i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9504.f36577 - this.f9505;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f9506 = this.f9505;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f9505 = this.f9506;
    }
}
