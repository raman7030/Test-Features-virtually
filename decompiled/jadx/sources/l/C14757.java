package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14757 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f45072;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23930 f45073;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C14757(C23930 c23930, int i) {
        this.f45073 = c23930;
        this.f45072 = i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f45072 == 0) {
            return -1;
        }
        int i = this.f45073.readByte();
        this.f45072--;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f45072;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f45073.read(bArr, i, Math.min(i3, i2));
        if (i4 < 0) {
            throw new EOFException("Truncated legacy UTF field");
        }
        this.f45072 -= i4;
        return i4;
    }
}
