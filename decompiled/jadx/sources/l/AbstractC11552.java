package l;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.DESedeParameters;

/* JADX INFO: renamed from: l.ۨ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11552 implements InterfaceC19314 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public BufferedBlockCipher f34478;

    public AbstractC11552(BufferedBlockCipher bufferedBlockCipher) {
        this.f34478 = bufferedBlockCipher;
    }

    @Override // l.InterfaceC19314
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28433(EnumC18608 enumC18608, byte[] bArr) {
        this.f34478.init(enumC18608 == EnumC18608.ENCRYPT, new DESedeParameters(bArr));
    }

    @Override // l.InterfaceC19314
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo28432(int i, byte[] bArr, byte[] bArr2) {
        return this.f34478.processBytes(bArr, 0, i, bArr2, 0);
    }

    @Override // l.InterfaceC19314
    public final int doFinal(byte[] bArr, int i) throws C8024 {
        try {
            return this.f34478.doFinal(bArr, i);
        } catch (InvalidCipherTextException e) {
            throw new C8024(e);
        }
    }
}
