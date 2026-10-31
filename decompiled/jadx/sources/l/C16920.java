package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16920 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17626 f51979;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10531 f51980;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16920(C17626 c17626, InputStream inputStream, C10531 c10531) {
        super(inputStream);
        this.f51979 = c17626;
        this.f51980 = c10531;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        C17626 c17626 = this.f51979;
        boolean zM33352 = c17626.m33352();
        C10531 c10531 = this.f51980;
        if (zM33352 && c17626.f53850.m1477(c10531)) {
            return;
        }
        C0349.m1793(c10531);
    }
}
