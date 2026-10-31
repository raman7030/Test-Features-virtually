package l;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C18991 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19697 f59871;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18991(C19697 c19697, BufferedOutputStream bufferedOutputStream) {
        super(bufferedOutputStream);
        this.f59871 = c19697;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(i);
        } catch (IOException e) {
            this.f59871.m45307(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr);
        } catch (IOException e) {
            this.f59871.m45307(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } catch (IOException e) {
            this.f59871.m45307(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e) {
            this.f59871.m45307(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C19697 c19697 = this.f59871;
        c19697.m45381();
        c19697.f63631.set(false);
        ((FilterOutputStream) this).out.close();
    }
}
