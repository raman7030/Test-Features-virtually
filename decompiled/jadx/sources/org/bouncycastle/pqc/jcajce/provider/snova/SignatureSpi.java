package org.bouncycastle.pqc.jcajce.provider.snova;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.snova.SnovaParameters;
import org.bouncycastle.pqc.crypto.snova.SnovaPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.snova.SnovaSigner;
import org.bouncycastle.util.Strings;
import p067l.C20778;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureSpi extends Signature {
    public final ByteArrayOutputStream bOut;
    public final SnovaParameters parameters;
    public SecureRandom random;
    public final SnovaSigner signer;

    public class Base extends SignatureSpi {
        public Base() {
            super(new SnovaSigner());
        }
    }

    public class SNOVA_24_5_4_ESK extends SignatureSpi {
        public SNOVA_24_5_4_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_4_ESK);
        }
    }

    public class SNOVA_24_5_4_SHAKE_ESK extends SignatureSpi {
        public SNOVA_24_5_4_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_4_SHAKE_ESK);
        }
    }

    public class SNOVA_24_5_4_SHAKE_SSK extends SignatureSpi {
        public SNOVA_24_5_4_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_4_SHAKE_SSK);
        }
    }

    public class SNOVA_24_5_4_SSK extends SignatureSpi {
        public SNOVA_24_5_4_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_4_SSK);
        }
    }

    public class SNOVA_24_5_5_ESK extends SignatureSpi {
        public SNOVA_24_5_5_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_5_ESK);
        }
    }

    public class SNOVA_24_5_5_SHAKE_ESK extends SignatureSpi {
        public SNOVA_24_5_5_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_5_SHAKE_ESK);
        }
    }

    public class SNOVA_24_5_5_SHAKE_SSK extends SignatureSpi {
        public SNOVA_24_5_5_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_5_SHAKE_SSK);
        }
    }

    public class SNOVA_24_5_5_SSK extends SignatureSpi {
        public SNOVA_24_5_5_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_24_5_5_SSK);
        }
    }

    public class SNOVA_25_8_3_ESK extends SignatureSpi {
        public SNOVA_25_8_3_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_25_8_3_ESK);
        }
    }

    public class SNOVA_25_8_3_SHAKE_ESK extends SignatureSpi {
        public SNOVA_25_8_3_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_25_8_3_SHAKE_ESK);
        }
    }

    public class SNOVA_25_8_3_SHAKE_SSK extends SignatureSpi {
        public SNOVA_25_8_3_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_25_8_3_SHAKE_SSK);
        }
    }

    public class SNOVA_25_8_3_SSK extends SignatureSpi {
        public SNOVA_25_8_3_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_25_8_3_SSK);
        }
    }

    public class SNOVA_29_6_5_ESK extends SignatureSpi {
        public SNOVA_29_6_5_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_29_6_5_ESK);
        }
    }

    public class SNOVA_29_6_5_SHAKE_ESK extends SignatureSpi {
        public SNOVA_29_6_5_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_29_6_5_SHAKE_ESK);
        }
    }

    public class SNOVA_29_6_5_SHAKE_SSK extends SignatureSpi {
        public SNOVA_29_6_5_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_29_6_5_SHAKE_SSK);
        }
    }

    public class SNOVA_29_6_5_SSK extends SignatureSpi {
        public SNOVA_29_6_5_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_29_6_5_SSK);
        }
    }

    public class SNOVA_37_17_2_ESK extends SignatureSpi {
        public SNOVA_37_17_2_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_17_2_ESK);
        }
    }

    public class SNOVA_37_17_2_SHAKE_ESK extends SignatureSpi {
        public SNOVA_37_17_2_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_17_2_SHAKE_ESK);
        }
    }

    public class SNOVA_37_17_2_SHAKE_SSK extends SignatureSpi {
        public SNOVA_37_17_2_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_17_2_SHAKE_SSK);
        }
    }

    public class SNOVA_37_17_2_SSK extends SignatureSpi {
        public SNOVA_37_17_2_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_17_2_SSK);
        }
    }

    public class SNOVA_37_8_4_ESK extends SignatureSpi {
        public SNOVA_37_8_4_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_8_4_ESK);
        }
    }

    public class SNOVA_37_8_4_SHAKE_ESK extends SignatureSpi {
        public SNOVA_37_8_4_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_8_4_SHAKE_ESK);
        }
    }

    public class SNOVA_37_8_4_SHAKE_SSK extends SignatureSpi {
        public SNOVA_37_8_4_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_8_4_SHAKE_SSK);
        }
    }

    public class SNOVA_37_8_4_SSK extends SignatureSpi {
        public SNOVA_37_8_4_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_37_8_4_SSK);
        }
    }

    public class SNOVA_49_11_3_ESK extends SignatureSpi {
        public SNOVA_49_11_3_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_49_11_3_ESK);
        }
    }

    public class SNOVA_49_11_3_SHAKE_ESK extends SignatureSpi {
        public SNOVA_49_11_3_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_49_11_3_SHAKE_ESK);
        }
    }

    public class SNOVA_49_11_3_SHAKE_SSK extends SignatureSpi {
        public SNOVA_49_11_3_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_49_11_3_SHAKE_SSK);
        }
    }

    public class SNOVA_49_11_3_SSK extends SignatureSpi {
        public SNOVA_49_11_3_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_49_11_3_SSK);
        }
    }

    public class SNOVA_56_25_2_ESK extends SignatureSpi {
        public SNOVA_56_25_2_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_56_25_2_ESK);
        }
    }

    public class SNOVA_56_25_2_SHAKE_ESK extends SignatureSpi {
        public SNOVA_56_25_2_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_56_25_2_SHAKE_ESK);
        }
    }

    public class SNOVA_56_25_2_SHAKE_SSK extends SignatureSpi {
        public SNOVA_56_25_2_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_56_25_2_SHAKE_SSK);
        }
    }

    public class SNOVA_56_25_2_SSK extends SignatureSpi {
        public SNOVA_56_25_2_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_56_25_2_SSK);
        }
    }

    public class SNOVA_60_10_4_ESK extends SignatureSpi {
        public SNOVA_60_10_4_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_60_10_4_ESK);
        }
    }

    public class SNOVA_60_10_4_SHAKE_ESK extends SignatureSpi {
        public SNOVA_60_10_4_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_60_10_4_SHAKE_ESK);
        }
    }

    public class SNOVA_60_10_4_SHAKE_SSK extends SignatureSpi {
        public SNOVA_60_10_4_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_60_10_4_SHAKE_SSK);
        }
    }

    public class SNOVA_60_10_4_SSK extends SignatureSpi {
        public SNOVA_60_10_4_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_60_10_4_SSK);
        }
    }

    public class SNOVA_66_15_3_ESK extends SignatureSpi {
        public SNOVA_66_15_3_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_66_15_3_ESK);
        }
    }

    public class SNOVA_66_15_3_SHAKE_ESK extends SignatureSpi {
        public SNOVA_66_15_3_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_66_15_3_SHAKE_ESK);
        }
    }

    public class SNOVA_66_15_3_SHAKE_SSK extends SignatureSpi {
        public SNOVA_66_15_3_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_66_15_3_SHAKE_SSK);
        }
    }

    public class SNOVA_66_15_3_SSK extends SignatureSpi {
        public SNOVA_66_15_3_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_66_15_3_SSK);
        }
    }

    public class SNOVA_75_33_2_ESK extends SignatureSpi {
        public SNOVA_75_33_2_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_75_33_2_ESK);
        }
    }

    public class SNOVA_75_33_2_SHAKE_ESK extends SignatureSpi {
        public SNOVA_75_33_2_SHAKE_ESK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_75_33_2_SHAKE_ESK);
        }
    }

    public class SNOVA_75_33_2_SHAKE_SSK extends SignatureSpi {
        public SNOVA_75_33_2_SHAKE_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_75_33_2_SHAKE_SSK);
        }
    }

    public class SNOVA_75_33_2_SSK extends SignatureSpi {
        public SNOVA_75_33_2_SSK() {
            super(new SnovaSigner(), SnovaParameters.SNOVA_75_33_2_SSK);
        }
    }

    public SignatureSpi(SnovaSigner snovaSigner) {
        super("Snova");
        this.bOut = new ByteArrayOutputStream();
        this.signer = snovaSigner;
        this.parameters = null;
    }

    public SignatureSpi(SnovaSigner snovaSigner, SnovaParameters snovaParameters) {
        super(Strings.toUpperCase(snovaParameters.getName()));
        this.parameters = snovaParameters;
        this.bOut = new ByteArrayOutputStream();
        this.signer = snovaSigner;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCSnovaPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to Snova");
        }
        BCSnovaPrivateKey bCSnovaPrivateKey = (BCSnovaPrivateKey) privateKey;
        SnovaPrivateKeyParameters keyParams = bCSnovaPrivateKey.getKeyParams();
        SnovaParameters snovaParameters = this.parameters;
        if (snovaParameters != null) {
            String upperCase = Strings.toUpperCase(snovaParameters.getName());
            if (!upperCase.equals(bCSnovaPrivateKey.getAlgorithm())) {
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
        if (!(publicKey instanceof BCSnovaPublicKey)) {
            try {
                publicKey = new BCSnovaPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeyException(C20778.m46923(e, new StringBuilder("unknown public key passed to Snova: ")));
            }
        }
        BCSnovaPublicKey bCSnovaPublicKey = (BCSnovaPublicKey) publicKey;
        SnovaParameters snovaParameters = this.parameters;
        if (snovaParameters != null) {
            String upperCase = Strings.toUpperCase(snovaParameters.getName());
            if (!upperCase.equals(bCSnovaPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        this.signer.init(false, bCSnovaPublicKey.getKeyParams());
    }
}
