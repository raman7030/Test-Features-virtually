package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3269 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10325 f10302;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C3269(C10325 c10325) {
        this.f10302 = c10325;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f10302.m26095() & 255;
        } catch (C13146 e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            this.f10302.m26087(bArr.length, bArr);
            return bArr.length;
        } catch (C13146 e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        this.f10302.f31073 = (int) j;
        return j;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10302.m26092();
    }
}
