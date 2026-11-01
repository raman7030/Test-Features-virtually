package p067l;

import java.security.SignatureException;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.֫ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7VS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4194 extends AbstractC12912 {
    @Override // p067l.AbstractC12912
    /* JADX INFO: renamed from: ֫ */
    public final String mo8508() {
        return EdDSAParameterSpec.Ed448;
    }

    @Override // p067l.AbstractC12912
    /* JADX INFO: renamed from: ۧ */
    public final String mo8509() {
        return "ssh-ed448";
    }

    @Override // p067l.InterfaceC19422
    public final byte[] sign() throws SignatureException {
        try {
            return this.f36303.generateSignature();
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }

    @Override // p067l.InterfaceC19422
    public final void update(byte[] bArr) throws SignatureException {
        try {
            this.f36303.update(bArr, 0, bArr.length);
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }
}
