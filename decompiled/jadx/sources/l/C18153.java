package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18153 implements Closeable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC11098 f56450;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InputStream f56451;

    public C18153(InterfaceC11098 interfaceC11098) {
        this.f56450 = interfaceC11098;
        InputStream inputStreamMo10616 = interfaceC11098.mo10616();
        this.f56451 = inputStreamMo10616;
        inputStreamMo10616.mark(1048576);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m42261(boolean z) throws IOException {
        InputStream inputStream = this.f56451;
        if (inputStream != null) {
            try {
                inputStream.reset();
            } catch (IOException unused) {
                close();
            }
        }
        if (this.f56451 == null) {
            this.f56451 = this.f56450.mo10616();
        }
        this.f56451.mark(z ? 1048576 : 0);
        return this.f56451;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f56451;
        this.f56451 = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
