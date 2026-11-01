package org.bouncycastle.pqc.crypto.mlkem;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

/* JADX INFO: loaded from: classes2.dex */
public class MLKEMGenerator implements EncapsulatedSecretGenerator {

    /* JADX INFO: renamed from: sr */
    public final SecureRandom f81675sr;

    public MLKEMGenerator(SecureRandom secureRandom) {
        this.f81675sr = secureRandom;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        byte[] bArr = new byte[32];
        this.f81675sr.nextBytes(bArr);
        return internalGenerateEncapsulated(asymmetricKeyParameter, bArr);
    }

    public SecretWithEncapsulation internalGenerateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr) {
        MLKEMPublicKeyParameters mLKEMPublicKeyParameters = (MLKEMPublicKeyParameters) asymmetricKeyParameter;
        MLKEMEngine engine = mLKEMPublicKeyParameters.getParameters().getEngine();
        engine.init(this.f81675sr);
        byte[][] bArrKemEncrypt = engine.kemEncrypt(mLKEMPublicKeyParameters, bArr);
        return new SecretWithEncapsulationImpl(bArrKemEncrypt[0], bArrKemEncrypt[1]);
    }
}
