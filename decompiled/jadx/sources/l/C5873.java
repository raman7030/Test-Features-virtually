package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5873 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19277 f18017;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5873(InputStream inputStream, C19277 c19277) {
        super(inputStream);
        this.f18017 = c19277;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        this.f18017.m44460(1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        this.f18017.m44460(i3);
        return i3;
    }
}
