package p067l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.۠ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: OADV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9857 implements InterfaceC5005 {

    /* JADX INFO: renamed from: ֫ */
    public MessageDigest f27338;

    @Override // p067l.InterfaceC5005
    public final int getBlockSize() {
        return 20;
    }

    @Override // p067l.InterfaceC5005
    public final String name() {
        return "SHA1";
    }

    @Override // p067l.InterfaceC5005
    public final void init() {
        this.f27338 = MessageDigest.getInstance("SHA-1");
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final void mo3552(int i, byte[] bArr) {
        this.f27338.update(bArr, 0, i);
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo3553() {
        return this.f27338.digest();
    }
}
