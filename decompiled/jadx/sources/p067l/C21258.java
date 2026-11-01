package p067l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩶ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67V1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21258 implements InterfaceC5005 {

    /* JADX INFO: renamed from: ֫ */
    public MessageDigest f66804;

    @Override // p067l.InterfaceC5005
    public final int getBlockSize() {
        return 64;
    }

    @Override // p067l.InterfaceC5005
    public final String name() {
        return "SHA512";
    }

    @Override // p067l.InterfaceC5005
    public final void init() {
        this.f66804 = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final void mo3552(int i, byte[] bArr) {
        this.f66804.update(bArr, 0, i);
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo3553() {
        return this.f66804.digest();
    }
}
