package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6SP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8408 extends FilterInputStream implements InterfaceC14905 {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C8408(InputStream inputStream) {
        super(inputStream);
    }
}
