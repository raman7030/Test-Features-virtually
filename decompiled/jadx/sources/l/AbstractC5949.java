package l;

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
public abstract class AbstractC5949 implements InterfaceC10910 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MLKEMExtractor f18246;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public MLKEMParameters f18247;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public MLKEMPublicKeyParameters f18248;

    @Override // l.InterfaceC10910
    public void init() {
        MLKEMKeyPairGenerator mLKEMKeyPairGenerator = new MLKEMKeyPairGenerator();
        mLKEMKeyPairGenerator.init(new MLKEMKeyGenerationParameters(new SecureRandom(), this.f18247));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = mLKEMKeyPairGenerator.generateKeyPair();
        this.f18246 = new MLKEMExtractor((MLKEMPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate());
        this.f18248 = (MLKEMPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
    }
}
