package l;

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
public final class C8977 implements InterfaceC0304 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f27273;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f27274;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f27275;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AsymmetricKeyParameter f27276;

    @Override // l.InterfaceC0304
    /* JADX INFO: renamed from: ֫ */
    public final void mo1674(int i, String str) throws NoSuchAlgorithmException {
        if (!str.equals(XDHParameterSpec.X25519) && !str.equals(XDHParameterSpec.X448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(str));
        }
        this.f27274 = i;
        this.f27275 = str;
        if (str.equals(XDHParameterSpec.X25519)) {
            X25519PrivateKeyParameters x25519PrivateKeyParameters = new X25519PrivateKeyParameters(new SecureRandom());
            this.f27273 = x25519PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f27276 = x25519PrivateKeyParameters;
        } else {
            X448PrivateKeyParameters x448PrivateKeyParameters = new X448PrivateKeyParameters(new SecureRandom());
            this.f27273 = x448PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f27276 = x448PrivateKeyParameters;
        }
    }

    @Override // l.InterfaceC0304
    public final byte[] getQ() {
        return this.f27273;
    }

    @Override // l.InterfaceC0304
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo1675(byte[] bArr) throws InvalidKeyException {
        byte[] bArr2 = new byte[this.f27274];
        if (this.f27275.equals(XDHParameterSpec.X25519)) {
            try {
                try {
                    ((X25519PrivateKeyParameters) this.f27276).generateSecret(new X25519PublicKeyParameters(bArr, 0), bArr2, 0);
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
                ((X448PrivateKeyParameters) this.f27276).generateSecret(new X448PublicKeyParameters(bArr, 0), bArr2, 0);
                return bArr2;
            } catch (Exception e3) {
                throw new IllegalStateException(e3);
            }
        } catch (Exception e4) {
            throw new InvalidKeyException(e4);
        }
    }

    @Override // l.InterfaceC0304
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo1676(byte[] bArr) {
        return bArr.length == this.f27274;
    }
}
