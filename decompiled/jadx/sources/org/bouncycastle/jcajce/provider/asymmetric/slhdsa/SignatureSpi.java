package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPublicKeyParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSASigner;

/* JADX INFO: loaded from: classes.dex */
public class SignatureSpi extends BaseDeterministicOrRandomSignature {
    public final ByteArrayOutputStream bOut;
    public final SLHDSASigner signer;

    /* JADX INFO: loaded from: classes2.dex */
    public class Direct extends SignatureSpi {
        public Direct() {
            super(new SLHDSASigner());
        }
    }

    public SignatureSpi(SLHDSASigner sLHDSASigner) {
        super("SLH-DSA");
        this.bOut = new ByteArrayOutputStream();
        this.signer = sLHDSASigner;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        if (!(this.keyParams instanceof SLHDSAPrivateKeyParameters)) {
            throw new SignatureException("engine initialized for verification");
        }
        try {
            try {
                byte[] bArrGenerateSignature = this.signer.generateSignature(this.bOut.toByteArray());
                this.isInitState = true;
                this.bOut.reset();
                return bArrGenerateSignature;
            } catch (Exception e) {
                throw new SignatureException(e.toString());
            }
        } catch (Throwable th) {
            this.isInitState = true;
            this.bOut.reset();
            throw th;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        if (!(this.keyParams instanceof SLHDSAPublicKeyParameters)) {
            throw new SignatureException("engine initialized for signing");
        }
        try {
            return this.signer.verifySignature(this.bOut.toByteArray(), bArr);
        } finally {
            this.isInitState = true;
            this.bOut.reset();
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z, CipherParameters cipherParameters) {
        this.signer.init(z, cipherParameters);
        this.bOut.reset();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void signInit(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        ((java.security.SignatureSpi) this).appRandom = secureRandom;
        if (!(privateKey instanceof BCSLHDSAPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to SLH-DSA");
        }
        this.keyParams = ((BCSLHDSAPrivateKey) privateKey).getKeyParams();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte b) {
        this.bOut.write(b);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte[] bArr, int i, int i2) {
        this.bOut.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void verifyInit(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCSLHDSAPublicKey)) {
            throw new InvalidKeyException("unknown public key passed to SLH-DSA");
        }
        this.keyParams = ((BCSLHDSAPublicKey) publicKey).getKeyParams();
    }
}
