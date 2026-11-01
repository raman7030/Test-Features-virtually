package p067l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩸ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1SL */
/* JADX INFO: loaded from: classes5.dex */
public final class C22599 implements InterfaceC5005 {

    /* JADX INFO: renamed from: ֫ */
    public MessageDigest f71334;

    @Override // p067l.InterfaceC5005
    public final int getBlockSize() {
        return 32;
    }

    @Override // p067l.InterfaceC5005
    public final String name() {
        return "SHA256";
    }

    @Override // p067l.InterfaceC5005
    public final void init() {
        this.f71334 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final void mo3552(int i, byte[] bArr) {
        this.f71334.update(bArr, 0, i);
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo3553() {
        return this.f71334.digest();
    }
}
