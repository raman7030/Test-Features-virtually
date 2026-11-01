package p067l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩶۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K8MX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21412 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final C5318 f67574;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC22753 f67576;

    /* JADX INFO: renamed from: ۙ */
    public boolean f67573 = false;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f67575 = false;

    /* JADX INFO: renamed from: ۗ */
    public final byte[] f67572 = new byte[1];

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C21412(InterfaceC22753 interfaceC22753, C5318 c5318) {
        this.f67576 = interfaceC22753;
        this.f67574 = c5318;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f67572;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C23877.m52960(!this.f67575);
        boolean z = this.f67573;
        InterfaceC22753 interfaceC22753 = this.f67576;
        if (!z) {
            interfaceC22753.mo4020(this.f67574);
            this.f67573 = true;
        }
        int i3 = interfaceC22753.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f67575) {
            return;
        }
        this.f67576.close();
        this.f67575 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48549() {
        if (this.f67573) {
            return;
        }
        this.f67576.mo4020(this.f67574);
        this.f67573 = true;
    }
}
