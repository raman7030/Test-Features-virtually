package org.bouncycastle.pqc.crypto.sphincsplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class SPHINCSPlusKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public SPHINCSPlusParameters parameters;
    public SecureRandom random;

    private byte[] sec_rand(int i) {
        byte[] bArr = new byte[i];
        this.random.nextBytes(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        C2375SK c2375sk;
        byte[] bArrSec_rand;
        SPHINCSPlusEngine engine = this.parameters.getEngine();
        if (engine instanceof SPHINCSPlusEngine.HarakaSEngine) {
            byte[] bArrSec_rand2 = sec_rand(engine.f81764N * 3);
            int i = engine.f81764N;
            byte[] bArr = new byte[i];
            byte[] bArr2 = new byte[i];
            bArrSec_rand = new byte[i];
            System.arraycopy(bArrSec_rand2, 0, bArr, 0, i);
            int i2 = engine.f81764N;
            System.arraycopy(bArrSec_rand2, i2, bArr2, 0, i2);
            int i3 = engine.f81764N;
            System.arraycopy(bArrSec_rand2, i3 << 1, bArrSec_rand, 0, i3);
            c2375sk = new C2375SK(bArr, bArr2);
        } else {
            c2375sk = new C2375SK(sec_rand(engine.f81764N), sec_rand(engine.f81764N));
            bArrSec_rand = sec_rand(engine.f81764N);
        }
        engine.init(bArrSec_rand);
        C2374PK c2374pk = new C2374PK(bArrSec_rand, new C2373HT(engine, c2375sk.seed, bArrSec_rand).htPubKey);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new SPHINCSPlusPublicKeyParameters(this.parameters, c2374pk), (AsymmetricKeyParameter) new SPHINCSPlusPrivateKeyParameters(this.parameters, c2375sk, c2374pk));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.parameters = ((SPHINCSPlusKeyGenerationParameters) keyGenerationParameters).getParameters();
    }
}
