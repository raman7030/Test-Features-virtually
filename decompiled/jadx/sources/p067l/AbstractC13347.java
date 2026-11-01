package p067l;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.DESedeParameters;

/* JADX INFO: renamed from: l.ۨ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13347 implements InterfaceC20724 {

    /* JADX INFO: renamed from: ֫ */
    public BufferedBlockCipher f37475;

    public AbstractC13347(BufferedBlockCipher bufferedBlockCipher) {
        this.f37475 = bufferedBlockCipher;
    }

    @Override // p067l.InterfaceC20724
    /* JADX INFO: renamed from: ֫ */
    public final void mo30479(EnumC20053 enumC20053, byte[] bArr) {
        this.f37475.init(enumC20053 == EnumC20053.ENCRYPT, new DESedeParameters(bArr));
    }

    @Override // p067l.InterfaceC20724
    /* JADX INFO: renamed from: ֫ */
    public final int mo30478(int i, byte[] bArr, byte[] bArr2) {
        return this.f37475.processBytes(bArr, 0, i, bArr2, 0);
    }

    @Override // p067l.InterfaceC20724
    public final int doFinal(byte[] bArr, int i) throws C9994 {
        try {
            return this.f37475.doFinal(bArr, i);
        } catch (InvalidCipherTextException e) {
            throw new C9994(e);
        }
    }
}
