package p067l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۚܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes2.dex */
public final class C7578 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ MessageDigest f19859;

    public C7578(MessageDigest messageDigest) {
        this.f19859 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f19859.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f19859.update(bArr, i, i2);
    }
}
