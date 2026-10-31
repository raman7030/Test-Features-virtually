package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.᩸ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S135 */
/* JADX INFO: loaded from: classes.dex */
public final class C21686 implements InterfaceC15334 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MessageDigest f69562;

    public C21686(String str) {
        try {
            this.f69562 = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC15334
    /* JADX INFO: renamed from: ֫ */
    public final void mo4061(C18864 c18864) {
        this.f69562.update(c18864.m43573(), 0, c18864.m43574());
    }

    @Override // l.InterfaceC15334
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo4062() {
        return this.f69562.digest();
    }

    public final String toString() {
        return this.f69562.getAlgorithm();
    }
}
