package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5475 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C12181 f13110;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C5475(C12181 c12181) {
        this.f13110 = c12181;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f13110.m28120() & 255;
        } catch (C14862 e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            this.f13110.m28112(bArr.length, bArr);
            return bArr.length;
        } catch (C14862 e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        this.f13110.f34036 = (int) j;
        return j;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f13110.m28117();
    }
}
