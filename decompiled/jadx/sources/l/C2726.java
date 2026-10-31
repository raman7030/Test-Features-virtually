package l;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2726 extends BufferedInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f8499;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f8500;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1654 f8501;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        return super.read(bArr, i, Math.min(i2, EnumC5983.f18409));
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2726(C18954 c18954, InputStream inputStream, InputStream inputStream2, C1654 c1654) {
        super(inputStream, 32768);
        this.f8499 = inputStream2;
        this.f8501 = c1654;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8500) {
            return;
        }
        C0349.m1793(this.f8499);
        int i = C18954.f59772;
        C2998.m9138(this.f8501);
        this.f8500 = true;
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
