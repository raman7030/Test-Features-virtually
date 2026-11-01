package org.bouncycastle.pqc.crypto.slhdsa;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class SLHDSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public SLHDSAParameters parameters;
    public SecureRandom random;

    private AsymmetricCipherKeyPair implGenerateKeyPair(SLHDSAEngine sLHDSAEngine, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C2372SK c2372sk = new C2372SK(bArr, bArr2);
        sLHDSAEngine.init(bArr3);
        C2371PK c2371pk = new C2371PK(bArr3, new C2370HT(sLHDSAEngine, c2372sk.seed, bArr3).htPubKey);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new SLHDSAPublicKeyParameters(this.parameters, c2371pk), (AsymmetricKeyParameter) new SLHDSAPrivateKeyParameters(this.parameters, c2372sk, c2371pk));
    }

    private byte[] sec_rand(int i) {
        byte[] bArr = new byte[i];
        this.random.nextBytes(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        SLHDSAEngine engine = this.parameters.getEngine();
        return implGenerateKeyPair(engine, sec_rand(engine.f81730N), sec_rand(engine.f81730N), sec_rand(engine.f81730N));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.parameters = ((SLHDSAKeyGenerationParameters) keyGenerationParameters).getParameters();
    }

    public AsymmetricCipherKeyPair internalGenerateKeyPair(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return implGenerateKeyPair(this.parameters.getEngine(), bArr, bArr2, bArr3);
    }
}
