package p067l;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes2.dex */
public final class C4960 extends BufferedInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InputStream f11294;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f11295;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3940 f11296;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        return super.read(bArr, i, Math.min(i2, EnumC8055.f21261));
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4960(C20383 c20383, InputStream inputStream, InputStream inputStream2, C3940 c3940) {
        super(inputStream, 32768);
        this.f11294 = inputStream2;
        this.f11296 = c3940;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11295) {
            return;
        }
        C2700.m4192(this.f11294);
        int i = C20383.f63001;
        C5218.m11189(this.f11296);
        this.f11295 = true;
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
