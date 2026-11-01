package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class BIKEKEMGenerator implements EncapsulatedSecretGenerator {

    /* JADX INFO: renamed from: sr */
    public final SecureRandom f81571sr;

    public BIKEKEMGenerator(SecureRandom secureRandom) {
        this.f81571sr = secureRandom;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        BIKEPublicKeyParameters bIKEPublicKeyParameters = (BIKEPublicKeyParameters) asymmetricKeyParameter;
        BIKEEngine engine = bIKEPublicKeyParameters.getParameters().getEngine();
        byte[] bArr = new byte[bIKEPublicKeyParameters.getParameters().getLByte()];
        byte[] bArr2 = new byte[bIKEPublicKeyParameters.getParameters().getRByte()];
        byte[] bArr3 = new byte[bIKEPublicKeyParameters.getParameters().getLByte()];
        engine.encaps(bArr2, bArr3, bArr, bIKEPublicKeyParameters.publicKey, this.f81571sr);
        return new SecretWithEncapsulationImpl(Arrays.copyOfRange(bArr, 0, bIKEPublicKeyParameters.getParameters().getSessionKeySize() / 8), Arrays.concatenate(bArr2, bArr3));
    }
}
