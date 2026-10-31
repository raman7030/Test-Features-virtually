package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3690 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5101 f11640;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3690(InputStream inputStream, C5101 c5101) {
        super(inputStream);
        this.f11640 = c5101;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11640.close();
    }
}
