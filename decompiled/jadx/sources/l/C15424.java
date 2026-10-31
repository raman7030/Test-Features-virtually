package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89V */
/* JADX INFO: loaded from: classes4.dex */
public final class C15424 extends FilterInputStream implements InterfaceC14905 {
    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C15424(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return super.read(bArr, i, Math.min(i2, 8192));
    }
}
