package p067l;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* JADX INFO: renamed from: l.ۡܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10900 implements InterfaceC2657 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f30208;

    /* JADX INFO: renamed from: ۧ */
    public int f30209;

    /* JADX INFO: renamed from: ܽ */
    public String f30210;

    /* JADX INFO: renamed from: ᩳ */
    public AsymmetricKeyParameter f30211;

    @Override // p067l.InterfaceC2657
    /* JADX INFO: renamed from: ֫ */
    public final void mo4072(int i, String str) throws NoSuchAlgorithmException {
        if (!str.equals(XDHParameterSpec.X25519) && !str.equals(XDHParameterSpec.X448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(str));
        }
        this.f30209 = i;
        this.f30210 = str;
        if (str.equals(XDHParameterSpec.X25519)) {
            X25519PrivateKeyParameters x25519PrivateKeyParameters = new X25519PrivateKeyParameters(new SecureRandom());
            this.f30208 = x25519PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f30211 = x25519PrivateKeyParameters;
        } else {
            X448PrivateKeyParameters x448PrivateKeyParameters = new X448PrivateKeyParameters(new SecureRandom());
            this.f30208 = x448PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f30211 = x448PrivateKeyParameters;
        }
    }

    @Override // p067l.InterfaceC2657
    public final byte[] getQ() {
        return this.f30208;
    }

    @Override // p067l.InterfaceC2657
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo4073(byte[] bArr) throws InvalidKeyException {
        byte[] bArr2 = new byte[this.f30209];
        if (this.f30210.equals(XDHParameterSpec.X25519)) {
            try {
                try {
                    ((X25519PrivateKeyParameters) this.f30211).generateSecret(new X25519PublicKeyParameters(bArr, 0), bArr2, 0);
                    return bArr2;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            } catch (Exception e2) {
                throw new InvalidKeyException(e2);
            }
        }
        try {
            try {
                ((X448PrivateKeyParameters) this.f30211).generateSecret(new X448PublicKeyParameters(bArr, 0), bArr2, 0);
                return bArr2;
            } catch (Exception e3) {
                throw new IllegalStateException(e3);
            }
        } catch (Exception e4) {
            throw new InvalidKeyException(e4);
        }
    }

    @Override // p067l.InterfaceC2657
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4074(byte[] bArr) {
        return bArr.length == this.f30209;
    }
}
