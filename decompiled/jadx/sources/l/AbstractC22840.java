package l;

import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.᩺۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22840 implements InterfaceC19314 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public RC4Engine f73723;

    public AbstractC22840(RC4Engine rC4Engine) {
        this.f73723 = rC4Engine;
    }

    @Override // l.InterfaceC19314
    /* JADX INFO: renamed from: ֫ */
    public final void mo28433(EnumC18608 enumC18608, byte[] bArr) {
        this.f73723.init(enumC18608 == EnumC18608.ENCRYPT, new KeyParameter(bArr));
    }

    @Override // l.InterfaceC19314
    /* JADX INFO: renamed from: ֫ */
    public final int mo28432(int i, byte[] bArr, byte[] bArr2) {
        return this.f73723.processBytes(bArr, 0, i, bArr2, 0);
    }

    @Override // l.InterfaceC19314
    public final int doFinal(byte[] bArr, int i) {
        this.f73723.reset();
        return 0;
    }
}
