package l;

import java.security.SignatureException;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.۟ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7VV */
/* JADX INFO: loaded from: classes4.dex */
public final class C7360 extends AbstractC11094 {
    @Override // l.AbstractC11094
    /* JADX INFO: renamed from: ֫ */
    public final String mo6335() {
        return EdDSAParameterSpec.Ed25519;
    }

    @Override // l.AbstractC11094
    /* JADX INFO: renamed from: ۧ */
    public final String mo6336() {
        return OpenSSHPublicKeyUtil.ED_25519;
    }

    @Override // l.InterfaceC17944
    public final byte[] sign() throws SignatureException {
        try {
            return this.f33301.generateSignature();
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }

    @Override // l.InterfaceC17944
    public final void update(byte[] bArr) throws SignatureException {
        try {
            this.f33301.update(bArr, 0, bArr.length);
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }
}
