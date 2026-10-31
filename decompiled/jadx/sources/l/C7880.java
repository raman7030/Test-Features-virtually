package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.۠ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: OADV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7880 implements InterfaceC2774 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MessageDigest f24422;

    @Override // l.InterfaceC2774
    public final int getBlockSize() {
        return 20;
    }

    @Override // l.InterfaceC2774
    public final String name() {
        return "SHA1";
    }

    @Override // l.InterfaceC2774
    public final void init() {
        this.f24422 = MessageDigest.getInstance("SHA-1");
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫ */
    public final void mo1151(int i, byte[] bArr) {
        this.f24422.update(bArr, 0, i);
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo1152() {
        return this.f24422.digest();
    }
}
