package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;

/* JADX INFO: loaded from: classes2.dex */
public class MLKEMExtractor implements EncapsulatedSecretExtractor {
    public final MLKEMEngine engine;
    public final MLKEMPrivateKeyParameters privateKey;

    public MLKEMExtractor(MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters) {
        if (mLKEMPrivateKeyParameters == null) {
            throw new NullPointerException("'privateKey' cannot be null");
        }
        this.privateKey = mLKEMPrivateKeyParameters;
        this.engine = mLKEMPrivateKeyParameters.getParameters().getEngine();
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        return this.engine.kemDecrypt(this.privateKey, bArr);
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.engine.getCryptoCipherTextBytes();
    }
}
