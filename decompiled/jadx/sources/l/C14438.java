package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes4.dex */
public final class C14438 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18621 f44253;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14438(InputStream inputStream, C18621 c18621) {
        super(inputStream);
        this.f44253 = c18621;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f44253.close();
    }
}
