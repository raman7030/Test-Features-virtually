package p067l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ᩴܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20339 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ MessageDigest f62819;

    public C20339(MessageDigest messageDigest) {
        this.f62819 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f62819.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f62819.update(bArr, i, i2);
    }
}
