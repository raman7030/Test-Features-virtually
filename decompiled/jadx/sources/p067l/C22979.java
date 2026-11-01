package p067l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.᩸ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S135 */
/* JADX INFO: loaded from: classes.dex */
public final class C22979 implements InterfaceC16942 {

    /* JADX INFO: renamed from: ֫ */
    public final MessageDigest f72267;

    public C22979(String str) {
        try {
            this.f72267 = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p067l.InterfaceC16942
    /* JADX INFO: renamed from: ֫ */
    public final void mo6305(C20297 c20297) {
        this.f72267.update(c20297.m45839(), 0, c20297.m45840());
    }

    @Override // p067l.InterfaceC16942
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo6306() {
        return this.f72267.digest();
    }

    public final String toString() {
        return this.f72267.getAlgorithm();
    }
}
