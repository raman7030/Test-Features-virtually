package p067l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.۠ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1SL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9972 extends AbstractC7290 {

    /* JADX INFO: renamed from: ܽ */
    public final MessageDigest f27622;

    public C9972() {
        this.f19050 = 32;
        this.f19049 = XMSSKeyParameters.SHA_256;
        this.f27622 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
    }

    @Override // p067l.AbstractC7290
    /* JADX INFO: renamed from: ֫ */
    public final void mo3895(byte[] bArr, int i, int i2) {
        this.f27622.update(bArr, i, i2);
    }

    @Override // p067l.AbstractC7290
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo3896() {
        MessageDigest messageDigest = this.f27622;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.reset();
        return bArrDigest;
    }
}
