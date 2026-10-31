package l;

import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۛۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7Z6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5764 extends AbstractC11409 {
    @Override // l.AbstractC11409
    /* JADX INFO: renamed from: ֫ */
    public final String mo5387() {
        return OpenSSHPublicKeyUtil.RSA;
    }

    @Override // l.InterfaceC17944
    public final byte[] sign() {
        return this.f34108.sign();
    }
}
