package l;

import javax.crypto.spec.GCMParameterSpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;

/* JADX INFO: renamed from: l.ۙ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4496 implements InterfaceC3791 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AEADBlockCipher f14304;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AEADParameters mo13244(byte[] bArr, GCMParameterSpec gCMParameterSpec);

    public AbstractC4496(AEADBlockCipher aEADBlockCipher) {
        this.f14304 = aEADBlockCipher;
    }

    @Override // l.InterfaceC3791
    /* JADX INFO: renamed from: ֫ */
    public final void mo11448(EnumC18608 enumC18608, byte[] bArr, GCMParameterSpec gCMParameterSpec) {
        this.f14304.init(enumC18608 == EnumC18608.ENCRYPT, mo13244(bArr, gCMParameterSpec));
    }

    @Override // l.InterfaceC3791
    /* JADX INFO: renamed from: ֫ */
    public final void mo11449(byte[] bArr) {
        this.f14304.processAADBytes(bArr, 0, 32);
    }

    @Override // l.InterfaceC3791
    public final byte[] update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[this.f14304.getUpdateOutputSize(i2)];
        this.f14304.processBytes(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    @Override // l.InterfaceC3791
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo11450(int i, byte[] bArr) throws C8024 {
        AEADBlockCipher aEADBlockCipher = this.f14304;
        byte[] bArr2 = new byte[aEADBlockCipher.getOutputSize(i)];
        try {
            aEADBlockCipher.doFinal(bArr2, aEADBlockCipher.processBytes(bArr, 0, i, bArr2, 0));
            return bArr2;
        } catch (InvalidCipherTextException e) {
            throw new C8024(e);
        }
    }
}
