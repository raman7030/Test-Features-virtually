package l;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7EM */
/* JADX INFO: loaded from: classes4.dex */
public final class C11013 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f33124;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C11013(FileInputStream fileInputStream) {
        super(fileInputStream);
    }

    public final int size() {
        return this.f33124;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 > 0) {
            this.f33124 += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        this.f33124++;
        return i;
    }
}
