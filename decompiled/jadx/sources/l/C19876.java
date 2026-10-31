package l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩶ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67V1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19876 implements InterfaceC2774 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MessageDigest f64168;

    @Override // l.InterfaceC2774
    public final int getBlockSize() {
        return 64;
    }

    @Override // l.InterfaceC2774
    public final String name() {
        return "SHA512";
    }

    @Override // l.InterfaceC2774
    public final void init() {
        this.f64168 = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫ */
    public final void mo1151(int i, byte[] bArr) {
        this.f64168.update(bArr, 0, i);
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo1152() {
        return this.f64168.digest();
    }
}
