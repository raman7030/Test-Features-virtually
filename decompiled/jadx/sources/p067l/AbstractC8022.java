package p067l;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMExtractor;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPublicKeyParameters;

/* JADX INFO: renamed from: l.ۛۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7YC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8022 implements InterfaceC12737 {

    /* JADX INFO: renamed from: ֫ */
    public MLKEMExtractor f21101;

    /* JADX INFO: renamed from: ۧ */
    public MLKEMParameters f21102;

    /* JADX INFO: renamed from: ܽ */
    public MLKEMPublicKeyParameters f21103;

    @Override // p067l.InterfaceC12737
    public void init() {
        MLKEMKeyPairGenerator mLKEMKeyPairGenerator = new MLKEMKeyPairGenerator();
        mLKEMKeyPairGenerator.init(new MLKEMKeyGenerationParameters(new SecureRandom(), this.f21102));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = mLKEMKeyPairGenerator.generateKeyPair();
        this.f21101 = new MLKEMExtractor((MLKEMPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate());
        this.f21103 = (MLKEMPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
    }
}
