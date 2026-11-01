package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBSE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7559 extends InputStream implements InterfaceC3535, InterfaceC16534 {
    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public void readFully(byte[] bArr) throws IOException {
        read(bArr);
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        read(bArr, i, i2);
    }
}
