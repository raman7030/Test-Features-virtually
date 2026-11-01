package p067l;

import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۛۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7Z6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7846 extends AbstractC13211 {
    @Override // p067l.AbstractC13211
    /* JADX INFO: renamed from: ֫ */
    public final String mo7616() {
        return OpenSSHPublicKeyUtil.RSA;
    }

    @Override // p067l.InterfaceC19422
    public final byte[] sign() {
        return this.f37105.sign();
    }
}
