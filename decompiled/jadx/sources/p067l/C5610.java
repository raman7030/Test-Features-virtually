package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes2.dex */
public final class C5610 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final C20689 f13593;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C5610(InputStream inputStream, C20689 c20689) {
        super(inputStream);
        this.f13593 = c20689;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        C20689 c20689;
        int i = super.read();
        if (i != -1 && (c20689 = this.f13593) != null) {
            c20689.m46754(1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C20689 c20689;
        int i3 = super.read(bArr, i, i2);
        if (i3 > 0 && (c20689 = this.f13593) != null) {
            c20689.m46754(i3);
        }
        return i3;
    }
}
