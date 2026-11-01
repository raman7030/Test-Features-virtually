package p067l;

import java.lang.reflect.Constructor;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeKEMExtractor;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeKeyPairGenerator;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePublicKeyParameters;

/* JADX INFO: renamed from: l.ܰۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37X7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15397 implements InterfaceC12737 {

    /* JADX INFO: renamed from: ֫ */
    public SNTRUPrimeKEMExtractor f43996;

    /* JADX INFO: renamed from: ۧ */
    public SNTRUPrimePublicKeyParameters f43997;

    @Override // p067l.InterfaceC12737
    public final void init() throws NoSuchMethodException {
        SNTRUPrimeKeyPairGenerator sNTRUPrimeKeyPairGenerator = new SNTRUPrimeKeyPairGenerator();
        SecureRandom secureRandom = new SecureRandom();
        SNTRUPrimeParameters sNTRUPrimeParameters = SNTRUPrimeParameters.sntrup761;
        if (sNTRUPrimeParameters.getSessionKeySize() != 256) {
            Class cls = Integer.TYPE;
            Constructor declaredConstructor = SNTRUPrimeParameters.class.getDeclaredConstructor(String.class, cls, cls, cls, cls, cls, cls, cls, cls);
            declaredConstructor.setAccessible(true);
            sNTRUPrimeParameters = (SNTRUPrimeParameters) declaredConstructor.newInstance("sntrup761", 761, 4591, 286, 1158, 1007, 1158, 1763, 32);
        }
        sNTRUPrimeKeyPairGenerator.init(new SNTRUPrimeKeyGenerationParameters(secureRandom, sNTRUPrimeParameters));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = sNTRUPrimeKeyPairGenerator.generateKeyPair();
        this.f43996 = new SNTRUPrimeKEMExtractor((SNTRUPrimePrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate());
        this.f43997 = (SNTRUPrimePublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
    }

    @Override // p067l.InterfaceC12737
    public final byte[] getPublicKey() {
        return this.f43997.getEncoded();
    }

    @Override // p067l.InterfaceC12737
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo27605(byte[] bArr) {
        return this.f43996.extractSecret(bArr);
    }
}
