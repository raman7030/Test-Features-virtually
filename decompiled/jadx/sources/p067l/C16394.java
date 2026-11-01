package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16394 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public int f48185;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C25112 f48186;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C16394(C25112 c25112, int i) {
        this.f48186 = c25112;
        this.f48185 = i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f48185 == 0) {
            return -1;
        }
        int i = this.f48186.readByte();
        this.f48185--;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f48185;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f48186.read(bArr, i, Math.min(i3, i2));
        if (i4 < 0) {
            throw new EOFException("Truncated legacy UTF field");
        }
        this.f48185 -= i4;
        return i4;
    }
}
