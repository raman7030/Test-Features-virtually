package l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩸ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1SL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21287 implements InterfaceC2774 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MessageDigest f68642;

    @Override // l.InterfaceC2774
    public final int getBlockSize() {
        return 32;
    }

    @Override // l.InterfaceC2774
    public final String name() {
        return "SHA256";
    }

    @Override // l.InterfaceC2774
    public final void init() {
        this.f68642 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫ */
    public final void mo1151(int i, byte[] bArr) {
        this.f68642.update(bArr, 0, i);
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo1152() {
        return this.f68642.digest();
    }
}
