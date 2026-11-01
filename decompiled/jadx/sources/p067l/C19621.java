package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C19621 implements Closeable {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC12916 f59665;

    /* JADX INFO: renamed from: ᩹ */
    public InputStream f59666;

    public C19621(InterfaceC12916 interfaceC12916) {
        this.f59665 = interfaceC12916;
        InputStream inputStreamMo12627 = interfaceC12916.mo12627();
        this.f59666 = inputStreamMo12627;
        inputStreamMo12627.mark(1048576);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m44522(boolean z) throws IOException {
        InputStream inputStream = this.f59666;
        if (inputStream != null) {
            try {
                inputStream.reset();
            } catch (IOException unused) {
                close();
            }
        }
        if (this.f59666 == null) {
            this.f59666 = this.f59665.mo12627();
        }
        this.f59666.mark(z ? 1048576 : 0);
        return this.f59666;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f59666;
        this.f59666 = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
