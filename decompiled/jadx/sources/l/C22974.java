package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩺ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes.dex */
public final class C22974 extends AbstractC21191 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MessageDigest f73982;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22974(InterfaceC17066 interfaceC17066, MessageDigest messageDigest) {
        super(interfaceC17066);
        this.f73982 = messageDigest;
    }

    @Override // l.AbstractC21191
    /* JADX INFO: renamed from: ֫ */
    public final void mo33114(byte[] bArr, int i, int i2) {
        this.f73982.update(bArr, i, i2);
    }
}
