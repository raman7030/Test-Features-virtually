package p067l;

import android.util.Base64OutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes3.dex */
public final class C13121 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18588 f36869;

    /* JADX INFO: renamed from: ᩹ */
    public final Base64OutputStream f36870;

    public C13121(Base64OutputStream base64OutputStream, InterfaceC18588 interfaceC18588) {
        this.f36870 = base64OutputStream;
        this.f36869 = interfaceC18588;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f36869.mo3924()) {
            this.f36870.write(i);
            return;
        }
        throw new C18484();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f36869.mo3924()) {
            this.f36870.write(bArr, i, i2);
            return;
        }
        throw new C18484();
    }
}
