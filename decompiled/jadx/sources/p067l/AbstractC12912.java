package p067l;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.crypto.signers.Ed448Signer;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.ۧܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7VX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12912 implements InterfaceC24786 {

    /* JADX INFO: renamed from: ֫ */
    public Signer f36303;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo8508();

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo8509();

    @Override // p067l.InterfaceC19422
    public void init() throws NoSuchAlgorithmException {
        if (!mo8508().equals(EdDSAParameterSpec.Ed25519) && !mo8508().equals(EdDSAParameterSpec.Ed448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(mo8508()));
        }
        if (mo8508().equals(EdDSAParameterSpec.Ed25519)) {
            this.f36303 = new Ed25519Signer();
        } else {
            this.f36303 = new Ed448Signer(new byte[0]);
        }
    }

    @Override // p067l.InterfaceC24786
    /* JADX INFO: renamed from: ۧ */
    public void mo29591(byte[] bArr) throws InvalidKeyException {
        try {
            if (mo8508().equals(EdDSAParameterSpec.Ed25519)) {
                this.f36303.init(false, new Ed25519PublicKeyParameters(bArr, 0));
            } else {
                this.f36303.init(false, new Ed448PublicKeyParameters(bArr, 0));
            }
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // p067l.InterfaceC24786
    /* JADX INFO: renamed from: ֫ */
    public void mo29590(byte[] bArr) throws InvalidKeyException {
        try {
            if (mo8508().equals(EdDSAParameterSpec.Ed25519)) {
                this.f36303.init(true, new Ed25519PrivateKeyParameters(bArr, 0));
            } else {
                this.f36303.init(true, new Ed448PrivateKeyParameters(bArr, 0));
            }
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // p067l.InterfaceC19422
    public boolean verify(byte[] bArr) throws SignatureException {
        C17823 c17823 = new C17823(bArr);
        if (new String(c17823.m40471(), StandardCharsets.UTF_8).equals(mo8509())) {
            int iM40464 = c17823.m40464();
            byte[] bArr2 = new byte[iM40464];
            System.arraycopy(bArr, c17823.m40472(), bArr2, 0, iM40464);
            bArr = bArr2;
        }
        try {
            return this.f36303.verifySignature(bArr);
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }
}
