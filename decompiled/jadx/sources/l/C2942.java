package l;

import java.security.SignatureException;

/* JADX INFO: renamed from: l.ۗۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2942 extends AbstractC9998 {
    @Override // l.AbstractC9998
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo8965() {
        return "ecdsa-sha2-nistp256";
    }

    @Override // l.InterfaceC17944
    public final void update(byte[] bArr) throws SignatureException {
        this.f30124.update(bArr);
    }
}
