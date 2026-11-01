package p067l;

import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.᩺۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24075 implements InterfaceC20724 {

    /* JADX INFO: renamed from: ֫ */
    public RC4Engine f76455;

    public AbstractC24075(RC4Engine rC4Engine) {
        this.f76455 = rC4Engine;
    }

    @Override // p067l.InterfaceC20724
    /* JADX INFO: renamed from: ֫ */
    public final void mo30479(EnumC20053 enumC20053, byte[] bArr) {
        this.f76455.init(enumC20053 == EnumC20053.ENCRYPT, new KeyParameter(bArr));
    }

    @Override // p067l.InterfaceC20724
    /* JADX INFO: renamed from: ֫ */
    public final int mo30478(int i, byte[] bArr, byte[] bArr2) {
        return this.f76455.processBytes(bArr, 0, i, bArr2, 0);
    }

    @Override // p067l.InterfaceC20724
    public final int doFinal(byte[] bArr, int i) {
        this.f76455.reset();
        return 0;
    }
}
