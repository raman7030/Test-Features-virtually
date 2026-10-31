package l;

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
public abstract class AbstractC11094 implements InterfaceC23588 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Signer f33301;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo6335();

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo6336();

    @Override // l.InterfaceC17944
    public void init() throws NoSuchAlgorithmException {
        if (!mo6335().equals(EdDSAParameterSpec.Ed25519) && !mo6335().equals(EdDSAParameterSpec.Ed448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(mo6335()));
        }
        if (mo6335().equals(EdDSAParameterSpec.Ed25519)) {
            this.f33301 = new Ed25519Signer();
        } else {
            this.f33301 = new Ed448Signer(new byte[0]);
        }
    }

    @Override // l.InterfaceC23588
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo27529(byte[] bArr) throws InvalidKeyException {
        try {
            if (mo6335().equals(EdDSAParameterSpec.Ed25519)) {
                this.f33301.init(false, new Ed25519PublicKeyParameters(bArr, 0));
            } else {
                this.f33301.init(false, new Ed448PublicKeyParameters(bArr, 0));
            }
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // l.InterfaceC23588
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo27528(byte[] bArr) throws InvalidKeyException {
        try {
            if (mo6335().equals(EdDSAParameterSpec.Ed25519)) {
                this.f33301.init(true, new Ed25519PrivateKeyParameters(bArr, 0));
            } else {
                this.f33301.init(true, new Ed448PrivateKeyParameters(bArr, 0));
            }
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // l.InterfaceC17944
    public boolean verify(byte[] bArr) throws SignatureException {
        C16261 c16261 = new C16261(bArr);
        if (new String(c16261.m38257(), StandardCharsets.UTF_8).equals(mo6336())) {
            int iM38250 = c16261.m38250();
            byte[] bArr2 = new byte[iM38250];
            System.arraycopy(bArr, c16261.m38258(), bArr2, 0, iM38250);
            bArr = bArr2;
        }
        try {
            return this.f33301.verifySignature(bArr);
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }
}
