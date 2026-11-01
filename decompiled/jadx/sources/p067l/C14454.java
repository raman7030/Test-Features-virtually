package p067l;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C14454 extends OutputStream {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ FileOutputStream f41294;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C12443 f41295;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13784 f41296;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC18588 f41297;

    public C14454(C13784 c13784, C12443 c12443, InterfaceC18588 interfaceC18588, FileOutputStream fileOutputStream) {
        this.f41296 = c13784;
        this.f41295 = c12443;
        this.f41297 = interfaceC18588;
        this.f41294 = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C13784.m31433(this.f41296, this.f41295, 1, this.f41297);
        this.f41294.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        C13784.m31433(this.f41296, this.f41295, i2, this.f41297);
        this.f41294.write(bArr, i, i2);
    }
}
