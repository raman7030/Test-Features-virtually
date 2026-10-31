package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes3.dex */
public final class C4174 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19697 f13611;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e) {
            this.f13611.m45307(e);
            throw e;
        }
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4174(C19697 c19697, InputStream inputStream) {
        super(inputStream);
        this.f13611 = c19697;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        try {
            return ((FilterInputStream) this).in.read();
        } catch (IOException e) {
            this.f13611.m45307(e);
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return ((FilterInputStream) this).in.read(bArr);
        } catch (IOException e) {
            this.f13611.m45307(e);
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return ((FilterInputStream) this).in.read(bArr, i, i2);
        } catch (IOException e) {
            this.f13611.m45307(e);
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            this.f13611.m45307(e);
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e) {
            this.f13611.m45307(e);
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13611.m45381();
        this.f13611.f63631.set(false);
        ((FilterInputStream) this).in.close();
    }
}
