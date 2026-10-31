package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩹ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87Y6 */
/* JADX INFO: loaded from: classes.dex */
public final class C21992 implements InterfaceC2774 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MessageDigest f70416;

    @Override // l.InterfaceC2774
    public final int getBlockSize() {
        return 48;
    }

    @Override // l.InterfaceC2774
    public final String name() {
        return "SHA384";
    }

    @Override // l.InterfaceC2774
    public final void init() {
        this.f70416 = MessageDigest.getInstance("SHA-384");
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫ */
    public final void mo1151(int i, byte[] bArr) {
        this.f70416.update(bArr, 0, i);
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo1152() {
        return this.f70416.digest();
    }
}
