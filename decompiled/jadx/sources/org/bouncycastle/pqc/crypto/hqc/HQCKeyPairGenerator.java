package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class HQCKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public HQCKeyGenerationParameters hqcKeyGenerationParameters;
    public SecureRandom random;

    private AsymmetricCipherKeyPair genKeyPair() {
        HQCEngine engine = this.hqcKeyGenerationParameters.getParameters().getEngine();
        byte[] bArr = new byte[this.hqcKeyGenerationParameters.getParameters().getPublicKeyBytes()];
        byte[] bArr2 = new byte[this.hqcKeyGenerationParameters.getParameters().getSecretKeyBytes()];
        engine.genKeyPair(bArr, bArr2, this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new HQCPublicKeyParameters(this.hqcKeyGenerationParameters.getParameters(), bArr), (AsymmetricKeyParameter) new HQCPrivateKeyParameters(this.hqcKeyGenerationParameters.getParameters(), bArr2));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.hqcKeyGenerationParameters = (HQCKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
    }
}
