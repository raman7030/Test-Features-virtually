package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۛܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6144 implements InterfaceC20900, AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6788 f18920;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InputStream f18921;

    @Override // l.InterfaceC20900
    /* JADX INFO: renamed from: ֫ */
    public final synchronized InputStream mo14081() {
        InputStream inputStream;
        inputStream = this.f18921;
        if (inputStream == null) {
            throw new IOException("Prepared text input is closed or already opened");
        }
        this.f18921 = null;
        return inputStream;
    }

    public C6144(C6788 c6788, InputStream inputStream) {
        this.f18920 = c6788;
        this.f18921 = inputStream;
    }

    @Override // l.InterfaceC20900
    public final C6788 identity() {
        return this.f18920;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f18921;
            this.f18921 = null;
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
