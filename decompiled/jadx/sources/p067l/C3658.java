package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ZE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3658 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19561 f7686;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C2582 f7687;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3658(InputStream inputStream, C2582 c2582, C19561 c19561) {
        super(inputStream);
        this.f7687 = c2582;
        this.f7686 = c19561;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        C2582 c2582 = this.f7687;
        C19561 c19561 = this.f7686;
        if (c2582.m3890(c19561)) {
            return;
        }
        C2700.m4192(c19561);
    }
}
