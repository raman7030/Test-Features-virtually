package p067l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩹ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87Y6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23269 implements InterfaceC5005 {

    /* JADX INFO: renamed from: ֫ */
    public MessageDigest f73131;

    @Override // p067l.InterfaceC5005
    public final int getBlockSize() {
        return 48;
    }

    @Override // p067l.InterfaceC5005
    public final String name() {
        return "SHA384";
    }

    @Override // p067l.InterfaceC5005
    public final void init() {
        this.f73131 = MessageDigest.getInstance("SHA-384");
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final void mo3552(int i, byte[] bArr) {
        this.f73131.update(bArr, 0, i);
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo3553() {
        return this.f73131.digest();
    }
}
