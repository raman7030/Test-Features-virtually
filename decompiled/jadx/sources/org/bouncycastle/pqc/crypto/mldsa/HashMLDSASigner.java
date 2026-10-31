package org.bouncycastle.pqc.crypto.mldsa;

import java.io.IOException;
import java.security.SecureRandom;
import l.C5127;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.DigestUtils;

/* JADX INFO: loaded from: classes2.dex */
public class HashMLDSASigner implements Signer {
    public static final byte[] EMPTY_CONTEXT = new byte[0];
    public Digest digest;
    public byte[] digestOIDEncoding;
    public MLDSAEngine engine;
    public MLDSAPrivateKeyParameters privKey;
    public MLDSAPublicKeyParameters pubKey;
    public SecureRandom random;

    public static Digest createDigest(MLDSAParameters mLDSAParameters) {
        int type = mLDSAParameters.getType();
        if (type == 0 || type == 1) {
            return new SHA512Digest();
        }
        throw new IllegalArgumentException("unknown parameters type");
    }

    private SHAKEDigest finishPreHash() {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.digest.doFinal(bArr, 0);
        SHAKEDigest shake256Digest = this.engine.getShake256Digest();
        byte[] bArr2 = this.digestOIDEncoding;
        shake256Digest.update(bArr2, 0, bArr2.length);
        shake256Digest.update(bArr, 0, digestSize);
        return shake256Digest;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        SHAKEDigest sHAKEDigestFinishPreHash = finishPreHash();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        byte[] bArrGenerateMu = this.engine.generateMu(sHAKEDigestFinishPreHash);
        MLDSAEngine mLDSAEngine = this.engine;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        return mLDSAEngine.generateSignature(bArrGenerateMu, sHAKEDigestFinishPreHash, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.k, mLDSAPrivateKeyParameters.t0, mLDSAPrivateKeyParameters.s1, mLDSAPrivateKeyParameters.s2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        MLDSAParameters parameters;
        byte[] context = EMPTY_CONTEXT;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext = (ParametersWithContext) cipherParameters;
            context = parametersWithContext.getContext();
            cipherParameters = parametersWithContext.getParameters();
            if (context.length > 255) {
                throw new IllegalArgumentException("context too long");
            }
        }
        if (z) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (MLDSAPrivateKeyParameters) parametersWithRandom.getParameters();
                this.random = parametersWithRandom.getRandom();
            } else {
                this.privKey = (MLDSAPrivateKeyParameters) cipherParameters;
                this.random = null;
            }
            parameters = this.privKey.getParameters();
            MLDSAEngine engine = parameters.getEngine(this.random);
            this.engine = engine;
            engine.initSign(this.privKey.tr, true, context);
        } else {
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters = (MLDSAPublicKeyParameters) cipherParameters;
            this.pubKey = mLDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            parameters = mLDSAPublicKeyParameters.getParameters();
            MLDSAEngine engine2 = parameters.getEngine(null);
            this.engine = engine2;
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters2 = this.pubKey;
            engine2.initVerify(mLDSAPublicKeyParameters2.rho, mLDSAPublicKeyParameters2.t1, true, context);
        }
        initDigest(parameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.digest.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        SHAKEDigest sHAKEDigestFinishPreHash = finishPreHash();
        MLDSAEngine mLDSAEngine = this.engine;
        int length = bArr.length;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        return mLDSAEngine.verifyInternal(bArr, length, sHAKEDigestFinishPreHash, mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.t1);
    }

    private void initDigest(MLDSAParameters mLDSAParameters) {
        Digest digestCreateDigest = createDigest(mLDSAParameters);
        this.digest = digestCreateDigest;
        try {
            this.digestOIDEncoding = DigestUtils.getDigestOid(digestCreateDigest.getAlgorithmName()).getEncoded(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new IllegalStateException(C5127.m14678(e, new StringBuilder("oid encoding failed: ")));
        }
    }
}
