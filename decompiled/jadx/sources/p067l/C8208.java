package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۛܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8208 implements InterfaceC22232, AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public final C8820 f21777;

    /* JADX INFO: renamed from: ᩹ */
    public InputStream f21778;

    @Override // p067l.InterfaceC22232
    /* JADX INFO: renamed from: ֫ */
    public final synchronized InputStream mo15961() {
        InputStream inputStream;
        inputStream = this.f21778;
        if (inputStream == null) {
            throw new IOException("Prepared text input is closed or already opened");
        }
        this.f21778 = null;
        return inputStream;
    }

    public C8208(C8820 c8820, InputStream inputStream) {
        this.f21777 = c8820;
        this.f21778 = inputStream;
    }

    @Override // p067l.InterfaceC22232
    public final C8820 identity() {
        return this.f21777;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f21778;
            this.f21778 = null;
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
