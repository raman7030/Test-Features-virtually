package p067l;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C20418 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21089 f63099;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20418(C21089 c21089, BufferedOutputStream bufferedOutputStream) {
        super(bufferedOutputStream);
        this.f63099 = c21089;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(i);
        } catch (IOException e) {
            this.f63099.m47604(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr);
        } catch (IOException e) {
            this.f63099.m47604(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } catch (IOException e) {
            this.f63099.m47604(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e) {
            this.f63099.m47604(e);
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C21089 c21089 = this.f63099;
        c21089.m47678();
        c21089.f66252.set(false);
        ((FilterOutputStream) this).out.close();
    }
}
