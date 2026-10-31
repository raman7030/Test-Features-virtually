package l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۚܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes2.dex */
public final class C5481 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MessageDigest f17018;

    public C5481(MessageDigest messageDigest) {
        this.f17018 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f17018.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f17018.update(bArr, i, i2);
    }
}
