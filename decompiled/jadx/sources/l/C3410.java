package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes2.dex */
public final class C3410 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19277 f10787;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C3410(InputStream inputStream, C19277 c19277) {
        super(inputStream);
        this.f10787 = c19277;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        C19277 c19277;
        int i = super.read();
        if (i != -1 && (c19277 = this.f10787) != null) {
            c19277.m44460(1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C19277 c19277;
        int i3 = super.read(bArr, i, i2);
        if (i3 > 0 && (c19277 = this.f10787) != null) {
            c19277.m44460(i3);
        }
        return i3;
    }
}
