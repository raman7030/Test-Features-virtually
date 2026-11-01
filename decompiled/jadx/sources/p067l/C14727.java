package p067l;

import java.security.NoSuchAlgorithmException;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.۬ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37ZK */
/* JADX INFO: loaded from: classes4.dex */
public final class C14727 implements InterfaceC17429 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f41977;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f41978;

    @Override // p067l.InterfaceC17429
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo33659() {
        return this.f41977;
    }

    @Override // p067l.InterfaceC17429
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo33658() {
        return this.f41978;
    }

    @Override // p067l.InterfaceC17429
    /* JADX INFO: renamed from: ֫ */
    public final void mo33657(String str, byte[] bArr) throws NoSuchAlgorithmException {
        if (!str.equals(EdDSAParameterSpec.Ed25519) && !str.equals(EdDSAParameterSpec.Ed448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(str));
        }
        if (str.equals(EdDSAParameterSpec.Ed25519)) {
            Ed25519PrivateKeyParameters ed25519PrivateKeyParameters = new Ed25519PrivateKeyParameters(bArr);
            this.f41978 = ed25519PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f41977 = ed25519PrivateKeyParameters.getEncoded();
        } else {
            Ed448PrivateKeyParameters ed448PrivateKeyParameters = new Ed448PrivateKeyParameters(bArr);
            this.f41978 = ed448PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f41977 = ed448PrivateKeyParameters.getEncoded();
        }
        int length = this.f41977.length;
    }
}
