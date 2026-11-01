package p067l;

import javax.crypto.spec.GCMParameterSpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;

/* JADX INFO: renamed from: l.ۙ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6641 implements InterfaceC5971 {

    /* JADX INFO: renamed from: ֫ */
    public AEADBlockCipher f17131;

    /* JADX INFO: renamed from: ֫ */
    public abstract AEADParameters mo15127(byte[] bArr, GCMParameterSpec gCMParameterSpec);

    public AbstractC6641(AEADBlockCipher aEADBlockCipher) {
        this.f17131 = aEADBlockCipher;
    }

    @Override // p067l.InterfaceC5971
    /* JADX INFO: renamed from: ֫ */
    public final void mo13384(EnumC20053 enumC20053, byte[] bArr, GCMParameterSpec gCMParameterSpec) {
        this.f17131.init(enumC20053 == EnumC20053.ENCRYPT, mo15127(bArr, gCMParameterSpec));
    }

    @Override // p067l.InterfaceC5971
    /* JADX INFO: renamed from: ֫ */
    public final void mo13385(byte[] bArr) {
        this.f17131.processAADBytes(bArr, 0, 32);
    }

    @Override // p067l.InterfaceC5971
    public final byte[] update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[this.f17131.getUpdateOutputSize(i2)];
        this.f17131.processBytes(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    @Override // p067l.InterfaceC5971
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo13386(int i, byte[] bArr) throws C9994 {
        AEADBlockCipher aEADBlockCipher = this.f17131;
        byte[] bArr2 = new byte[aEADBlockCipher.getOutputSize(i)];
        try {
            aEADBlockCipher.doFinal(bArr2, aEADBlockCipher.processBytes(bArr, 0, i, bArr2, 0));
            return bArr2;
        } catch (InvalidCipherTextException e) {
            throw new C9994(e);
        }
    }
}
