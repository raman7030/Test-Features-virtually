package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class LMOtsPrivateKey {
    public final byte[] I;
    public final byte[] masterSecret;
    public final LMOtsParameters parameter;
    public final int q;

    public LMOtsPrivateKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.I = bArr;
        this.q = i;
        this.masterSecret = bArr2;
    }

    public SeedDerive getDerivationFunction() {
        SeedDerive seedDerive = new SeedDerive(this.I, this.masterSecret, DigestUtil.getDigest(this.parameter));
        seedDerive.setQ(this.q);
        return seedDerive;
    }

    public byte[] getI() {
        return this.I;
    }

    public byte[] getMasterSecret() {
        return this.masterSecret;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.q;
    }

    public LMSContext getSignatureContext(LMSigParameters lMSigParameters, byte[][] bArr) {
        byte[] bArr2 = new byte[this.parameter.getN()];
        SeedDerive derivationFunction = getDerivationFunction();
        derivationFunction.setJ(-3);
        derivationFunction.deriveSeed(bArr2, false);
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(getI(), digest);
        LmsUtils.u32str(getQ(), digest);
        LmsUtils.u16str(LM_OTS.D_MESG, digest);
        LmsUtils.byteArray(bArr2, digest);
        return new LMSContext(this, lMSigParameters, digest, bArr2, bArr);
    }
}
