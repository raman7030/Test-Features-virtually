package org.bouncycastle.pqc.crypto.slhdsa;

import java.io.IOException;
import java.security.SecureRandom;
import l.C20094;
import l.C5127;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.DigestUtils;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class HashSLHDSASigner implements Signer {
    public Digest digest;
    public byte[] msgPrefix;
    public SLHDSAPrivateKeyParameters privKey;
    public SLHDSAPublicKeyParameters pubKey;
    public SecureRandom random;

    public static Digest createDigest(SLHDSAParameters sLHDSAParameters) {
        int type = sLHDSAParameters.getType();
        if (type == 0) {
            if (sLHDSAParameters.getName().startsWith("sha2")) {
                return (SLHDSAParameters.sha2_128f == sLHDSAParameters || SLHDSAParameters.sha2_128s == sLHDSAParameters) ? SHA256Digest.newInstance() : new SHA512Digest();
            }
            return (SLHDSAParameters.shake_128f == sLHDSAParameters || SLHDSAParameters.shake_128s == sLHDSAParameters) ? new SHAKEDigest(128) : new SHAKEDigest(256);
        }
        if (type == 1) {
            return SHA256Digest.newInstance();
        }
        if (type == 2) {
            return new SHA512Digest();
        }
        if (type == 3) {
            return new SHAKEDigest(128);
        }
        if (type == 4) {
            return new SHAKEDigest(256);
        }
        throw new IllegalArgumentException("unknown parameters type");
    }

    public static byte[] internalGenerateSignature(SLHDSAPrivateKeyParameters sLHDSAPrivateKeyParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SLHDSAEngine engine = sLHDSAPrivateKeyParameters.getParameters().getEngine();
        engine.init(sLHDSAPrivateKeyParameters.pk.seed);
        Fors fors = new Fors(engine);
        byte[] bArrPRF_msg = engine.PRF_msg(sLHDSAPrivateKeyParameters.sk.prf, bArr3, bArr, bArr2);
        PK pk = sLHDSAPrivateKeyParameters.pk;
        IndexedDigest indexedDigestH_msg = engine.H_msg(bArrPRF_msg, pk.seed, pk.root, bArr, bArr2);
        byte[] bArr4 = indexedDigestH_msg.digest;
        long j = indexedDigestH_msg.idx_tree;
        int i = indexedDigestH_msg.idx_leaf;
        ADRS adrs = new ADRS();
        adrs.setTypeAndClear(3);
        adrs.setTreeAddress(j);
        adrs.setKeyPairAddress(i);
        SIG_FORS[] sig_forsArrSign = fors.sign(bArr4, sLHDSAPrivateKeyParameters.sk.seed, sLHDSAPrivateKeyParameters.pk.seed, adrs);
        ADRS adrs2 = new ADRS();
        adrs2.setTypeAndClear(3);
        adrs2.setTreeAddress(j);
        adrs2.setKeyPairAddress(i);
        byte[] bArrPkFromSig = fors.pkFromSig(sig_forsArrSign, bArr4, sLHDSAPrivateKeyParameters.pk.seed, adrs2);
        new ADRS().setTypeAndClear(2);
        byte[] bArrSign = new HT(engine, sLHDSAPrivateKeyParameters.getSeed(), sLHDSAPrivateKeyParameters.getPublicSeed()).sign(bArrPkFromSig, j, i);
        int length = sig_forsArrSign.length;
        byte[][] bArr5 = new byte[length + 2][];
        int i2 = 0;
        bArr5[0] = bArrPRF_msg;
        while (i2 != sig_forsArrSign.length) {
            int i3 = i2 + 1;
            SIG_FORS sig_fors = sig_forsArrSign[i2];
            bArr5[i3] = Arrays.concatenate(sig_fors.sk, Arrays.concatenate(sig_fors.authPath));
            i2 = i3;
        }
        bArr5[length + 1] = bArrSign;
        return Arrays.concatenate(bArr5);
    }

    public static boolean internalVerifySignature(SLHDSAPublicKeyParameters sLHDSAPublicKeyParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SLHDSAEngine engine = sLHDSAPublicKeyParameters.getParameters().getEngine();
        engine.init(sLHDSAPublicKeyParameters.getSeed());
        ADRS adrs = new ADRS();
        int i = engine.K;
        int i2 = engine.A;
        int iM46314 = C20094.m46314(i2, 1, i, 1) + engine.H;
        int i3 = engine.D;
        int i4 = engine.WOTS_LEN;
        int i5 = engine.N;
        if (((i3 * i4) + iM46314) * i5 != bArr3.length) {
            return false;
        }
        SIG sig = new SIG(i5, i, i2, i3, engine.H_PRIME, i4, bArr3);
        byte[] r = sig.getR();
        SIG_FORS[] sig_fors = sig.getSIG_FORS();
        SIG_XMSS[] sig_ht = sig.getSIG_HT();
        IndexedDigest indexedDigestH_msg = engine.H_msg(r, sLHDSAPublicKeyParameters.getSeed(), sLHDSAPublicKeyParameters.getRoot(), bArr, bArr2);
        byte[] bArr4 = indexedDigestH_msg.digest;
        long j = indexedDigestH_msg.idx_tree;
        int i6 = indexedDigestH_msg.idx_leaf;
        adrs.setTypeAndClear(3);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j);
        adrs.setKeyPairAddress(i6);
        byte[] bArrPkFromSig = new Fors(engine).pkFromSig(sig_fors, bArr4, sLHDSAPublicKeyParameters.getSeed(), adrs);
        adrs.setTypeAndClear(2);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j);
        adrs.setKeyPairAddress(i6);
        return new HT(engine, null, sLHDSAPublicKeyParameters.getSeed()).verify(bArrPkFromSig, sig_ht, sLHDSAPublicKeyParameters.getSeed(), j, i6, sLHDSAPublicKeyParameters.getRoot());
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        SLHDSAEngine engine = this.privKey.getParameters().getEngine();
        engine.init(this.privKey.pk.seed);
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        int i = engine.N;
        byte[] bArr2 = new byte[i];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            System.arraycopy(this.privKey.pk.seed, 0, bArr2, 0, i);
        }
        return internalGenerateSignature(this.privKey, this.msgPrefix, bArr, bArr2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        ParametersWithContext parametersWithContext;
        SLHDSAParameters parameters;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext2 = (ParametersWithContext) cipherParameters;
            CipherParameters parameters2 = parametersWithContext2.getParameters();
            if (parametersWithContext2.getContextLength() > 255) {
                throw new IllegalArgumentException("context too long");
            }
            parametersWithContext = parametersWithContext2;
            cipherParameters = parameters2;
        } else {
            parametersWithContext = null;
        }
        if (z) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (SLHDSAPrivateKeyParameters) parametersWithRandom.getParameters();
                this.random = parametersWithRandom.getRandom();
            } else {
                this.privKey = (SLHDSAPrivateKeyParameters) cipherParameters;
                this.random = null;
            }
            parameters = this.privKey.getParameters();
        } else {
            SLHDSAPublicKeyParameters sLHDSAPublicKeyParameters = (SLHDSAPublicKeyParameters) cipherParameters;
            this.pubKey = sLHDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            parameters = sLHDSAPublicKeyParameters.getParameters();
        }
        initDigest(parameters, parametersWithContext);
    }

    public byte[] internalGenerateSignature(byte[] bArr, byte[] bArr2) {
        return internalGenerateSignature(this.privKey, null, bArr, bArr2);
    }

    public boolean internalVerifySignature(byte[] bArr, byte[] bArr2) {
        return internalVerifySignature(this.pubKey, null, bArr, bArr2);
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
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        return internalVerifySignature(this.pubKey, this.msgPrefix, bArr2, bArr);
    }

    private void initDigest(SLHDSAParameters sLHDSAParameters, ParametersWithContext parametersWithContext) {
        Digest digestCreateDigest = createDigest(sLHDSAParameters);
        this.digest = digestCreateDigest;
        try {
            byte[] encoded = DigestUtils.getDigestOid(digestCreateDigest.getAlgorithmName()).getEncoded(ASN1Encoding.DER);
            int contextLength = parametersWithContext == null ? 0 : parametersWithContext.getContextLength();
            int i = contextLength + 2;
            byte[] bArr = new byte[encoded.length + i];
            this.msgPrefix = bArr;
            bArr[0] = 1;
            bArr[1] = (byte) contextLength;
            if (parametersWithContext != null) {
                parametersWithContext.copyContextTo(bArr, 2, contextLength);
            }
            System.arraycopy(encoded, 0, this.msgPrefix, i, encoded.length);
        } catch (IOException e) {
            throw new IllegalStateException(C5127.m14678(e, new StringBuilder("oid encoding failed: ")));
        }
    }
}
