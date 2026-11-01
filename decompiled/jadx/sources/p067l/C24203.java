package p067l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩺ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes.dex */
public final class C24203 extends AbstractC22509 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ MessageDigest f76713;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24203(InterfaceC18588 interfaceC18588, MessageDigest messageDigest) {
        super(interfaceC18588);
        this.f76713 = messageDigest;
    }

    @Override // p067l.AbstractC22509
    /* JADX INFO: renamed from: ֫ */
    public final void mo35230(byte[] bArr, int i, int i2) {
        this.f76713.update(bArr, i, i2);
    }
}
