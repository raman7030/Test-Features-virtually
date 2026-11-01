package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18450 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19121 f55160;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C12377 f55161;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18450(C19121 c19121, InputStream inputStream, C12377 c12377) {
        super(inputStream);
        this.f55160 = c19121;
        this.f55161 = c12377;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        C19121 c19121 = this.f55160;
        boolean zM35471 = c19121.m35471();
        C12377 c12377 = this.f55161;
        if (zM35471 && c19121.f57043.m3890(c12377)) {
            return;
        }
        C2700.m4192(c12377);
    }
}
