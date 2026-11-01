package org.bouncycastle.pqc.crypto.mayo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Longs;

/* JADX INFO: loaded from: classes2.dex */
public class MayoKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: p */
    public MayoParameters f81660p;
    public SecureRandom random;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int mVecLimbs = this.f81660p.getMVecLimbs();
        int m = this.f81660p.getM();
        int v = this.f81660p.getV();
        int o = this.f81660p.getO();
        int oBytes = this.f81660p.getOBytes();
        int p1Limbs = this.f81660p.getP1Limbs();
        int p3Limbs = this.f81660p.getP3Limbs();
        int pkSeedBytes = this.f81660p.getPkSeedBytes();
        int skSeedBytes = this.f81660p.getSkSeedBytes();
        byte[] bArr = new byte[this.f81660p.getCpkBytes()];
        byte[] bArr2 = new byte[this.f81660p.getCskBytes()];
        int i = oBytes + pkSeedBytes;
        byte[] bArr3 = new byte[i];
        long[] jArr = new long[this.f81660p.getP2Limbs() + p1Limbs];
        int i2 = v * o;
        byte[] bArr4 = new byte[i2];
        this.random.nextBytes(bArr2);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr2, 0, skSeedBytes);
        sHAKEDigest.doFinal(bArr3, 0, i);
        GF16.decode(bArr3, pkSeedBytes, bArr4, 0, i2);
        Utils.expandP1P2(this.f81660p, jArr, bArr3);
        long[] jArr2 = new long[o * o * mVecLimbs];
        GF16Utils.mulAddMUpperTriangularMatXMat(mVecLimbs, jArr, bArr4, jArr, p1Limbs, v, o);
        GF16Utils.mulAddMatTransXMMat(mVecLimbs, bArr4, jArr, p1Limbs, jArr2, v, o);
        System.arraycopy(bArr3, 0, bArr, 0, pkSeedBytes);
        long[] jArr3 = new long[p3Limbs];
        int i3 = o * mVecLimbs;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < o) {
            int i8 = i4;
            int i9 = i5;
            int i10 = i7;
            while (true) {
                int i11 = o;
                if (i8 < o) {
                    long[] jArr4 = jArr2;
                    System.arraycopy(jArr4, i5 + i10, jArr3, i6, mVecLimbs);
                    if (i4 != i8) {
                        Longs.xorTo(mVecLimbs, jArr4, i9 + i7, jArr3, i6);
                    }
                    i6 += mVecLimbs;
                    i8++;
                    i10 += mVecLimbs;
                    i9 += i3;
                    jArr2 = jArr4;
                    o = i11;
                }
            }
            i4++;
            i5 += i3;
            i7 += mVecLimbs;
        }
        Utils.packMVecs(jArr3, bArr, pkSeedBytes, p3Limbs / mVecLimbs, m);
        Arrays.clear(bArr4);
        Arrays.clear(jArr2);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new MayoPublicKeyParameters(this.f81660p, bArr), (AsymmetricKeyParameter) new MayoPrivateKeyParameters(this.f81660p, bArr2));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f81660p = ((MayoKeyGenerationParameters) keyGenerationParameters).getParameters();
        this.random = keyGenerationParameters.getRandom();
    }
}
