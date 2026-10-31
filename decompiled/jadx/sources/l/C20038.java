package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩶۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K8MX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20038 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3104 f64932;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f64934;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64931 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f64933 = false;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f64930 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C20038(InterfaceC21449 interfaceC21449, C3104 c3104) {
        this.f64934 = interfaceC21449;
        this.f64932 = c3104;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f64930;
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
        C22632.m50634(!this.f64933);
        boolean z = this.f64931;
        InterfaceC21449 interfaceC21449 = this.f64934;
        if (!z) {
            interfaceC21449.mo1620(this.f64932);
            this.f64931 = true;
        }
        int i3 = interfaceC21449.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f64933) {
            return;
        }
        this.f64934.close();
        this.f64933 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46233() {
        if (this.f64931) {
            return;
        }
        this.f64934.mo1620(this.f64932);
        this.f64931 = true;
    }
}
