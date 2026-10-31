package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ZE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1356 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18090 f4914;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0225 f4915;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356(InputStream inputStream, C0225 c0225, C18090 c18090) {
        super(inputStream);
        this.f4915 = c0225;
        this.f4914 = c18090;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        C0225 c0225 = this.f4915;
        C18090 c18090 = this.f4914;
        if (c0225.m1477(c18090)) {
            return;
        }
        C0349.m1793(c18090);
    }
}
