package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;
import org.bouncycastle.pqc.crypto.mldsa.HashMLDSASigner;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;

/* JADX INFO: loaded from: classes.dex */
public class HashSignatureSpi extends BaseDeterministicOrRandomSignature {
    public MLDSAParameters parameters;
    public HashMLDSASigner signer;

    /* JADX INFO: loaded from: classes2.dex */
    public class MLDSA extends HashSignatureSpi {
        public MLDSA() {
            super(new HashMLDSASigner());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class MLDSA44 extends HashSignatureSpi {
        public MLDSA44() {
            super(new HashMLDSASigner(), MLDSAParameters.ml_dsa_44_with_sha512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class MLDSA65 extends HashSignatureSpi {
        public MLDSA65() {
            super(new HashMLDSASigner(), MLDSAParameters.ml_dsa_65_with_sha512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class MLDSA87 extends HashSignatureSpi {
        public MLDSA87() {
            super(new HashMLDSASigner(), MLDSAParameters.ml_dsa_87_with_sha512);
        }
    }

    public HashSignatureSpi(HashMLDSASigner hashMLDSASigner) {
        super("HashMLDSA");
        this.signer = hashMLDSASigner;
        this.parameters = null;
    }

    public HashSignatureSpi(HashMLDSASigner hashMLDSASigner, MLDSAParameters mLDSAParameters) {
        super(MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName());
        this.signer = hashMLDSASigner;
        this.parameters = mLDSAParameters;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.signer.generateSignature();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        return this.signer.verifySignature(bArr);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z, CipherParameters cipherParameters) {
        this.signer.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void signInit(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        ((java.security.SignatureSpi) this).appRandom = secureRandom;
        if (!(privateKey instanceof BCMLDSAPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to ML-DSA");
        }
        BCMLDSAPrivateKey bCMLDSAPrivateKey = (BCMLDSAPrivateKey) privateKey;
        this.keyParams = bCMLDSAPrivateKey.getKeyParams();
        MLDSAParameters mLDSAParameters = this.parameters;
        if (mLDSAParameters != null) {
            String name = MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName();
            if (!name.equals(bCMLDSAPrivateKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(name));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte b) {
        this.signer.update(b);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte[] bArr, int i, int i2) {
        this.signer.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void verifyInit(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCMLDSAPublicKey)) {
            throw new InvalidKeyException("unknown public key passed to ML-DSA");
        }
        BCMLDSAPublicKey bCMLDSAPublicKey = (BCMLDSAPublicKey) publicKey;
        this.keyParams = bCMLDSAPublicKey.getKeyParams();
        MLDSAParameters mLDSAParameters = this.parameters;
        if (mLDSAParameters != null) {
            String name = MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName();
            if (!name.equals(bCMLDSAPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(name));
            }
        }
    }
}
