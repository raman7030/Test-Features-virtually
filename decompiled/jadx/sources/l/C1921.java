package l;

import java.security.SignatureException;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.֫ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7VS */
/* JADX INFO: loaded from: classes3.dex */
public final class C1921 extends AbstractC11094 {
    @Override // l.AbstractC11094
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo6335() {
        return EdDSAParameterSpec.Ed448;
    }

    @Override // l.AbstractC11094
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo6336() {
        return "ssh-ed448";
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
