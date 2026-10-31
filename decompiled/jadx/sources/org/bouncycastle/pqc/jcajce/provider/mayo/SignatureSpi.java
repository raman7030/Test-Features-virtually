package org.bouncycastle.pqc.jcajce.provider.mayo;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import l.C19370;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.mayo.MayoParameters;
import org.bouncycastle.pqc.crypto.mayo.MayoPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mayo.MayoSigner;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureSpi extends Signature {
    public final ByteArrayOutputStream bOut;
    public final MayoParameters parameters;
    public SecureRandom random;
    public final MayoSigner signer;

    public class Base extends SignatureSpi {
        public Base() {
            super(new MayoSigner());
        }
    }

    public class Mayo1 extends SignatureSpi {
        public Mayo1() {
            super(new MayoSigner(), MayoParameters.mayo1);
        }
    }

    public class Mayo2 extends SignatureSpi {
        public Mayo2() {
            super(new MayoSigner(), MayoParameters.mayo2);
        }
    }

    public class Mayo3 extends SignatureSpi {
        public Mayo3() {
            super(new MayoSigner(), MayoParameters.mayo3);
        }
    }

    public class Mayo5 extends SignatureSpi {
        public Mayo5() {
            super(new MayoSigner(), MayoParameters.mayo5);
        }
    }

    public SignatureSpi(MayoSigner mayoSigner) {
        super("Mayo");
        this.bOut = new ByteArrayOutputStream();
        this.signer = mayoSigner;
        this.parameters = null;
    }

    public SignatureSpi(MayoSigner mayoSigner, MayoParameters mayoParameters) {
        super(Strings.toUpperCase(mayoParameters.getName()));
        this.parameters = mayoParameters;
        this.bOut = new ByteArrayOutputStream();
        this.signer = mayoSigner;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCMayoPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to Mayo");
        }
        BCMayoPrivateKey bCMayoPrivateKey = (BCMayoPrivateKey) privateKey;
        MayoPrivateKeyParameters keyParams = bCMayoPrivateKey.getKeyParams();
        MayoParameters mayoParameters = this.parameters;
        if (mayoParameters != null) {
            String upperCase = Strings.toUpperCase(mayoParameters.getName());
            if (!upperCase.equals(bCMayoPrivateKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            this.signer.init(true, new ParametersWithRandom(keyParams, secureRandom));
        } else {
            this.signer.init(true, keyParams);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            return this.signer.generateSignature(byteArray);
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        this.bOut.write(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.bOut.write(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        byte[] byteArray = this.bOut.toByteArray();
        this.bOut.reset();
        return this.signer.verifySignature(byteArray, bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCMayoPublicKey)) {
            try {
                publicKey = new BCMayoPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeyException(C19370.m44629(e, new StringBuilder("unknown public key passed to Mayo: ")));
            }
        }
        BCMayoPublicKey bCMayoPublicKey = (BCMayoPublicKey) publicKey;
        MayoParameters mayoParameters = this.parameters;
        if (mayoParameters != null) {
            String upperCase = Strings.toUpperCase(mayoParameters.getName());
            if (!upperCase.equals(bCMayoPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        this.signer.init(false, bCMayoPublicKey.getKeyParams());
    }
}
