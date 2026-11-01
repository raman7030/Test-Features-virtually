package p067l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܶۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H95A */
/* JADX INFO: loaded from: classes4.dex */
public final class C16562 implements InterfaceC5005 {

    /* JADX INFO: renamed from: ֫ */
    public MessageDigest f48643;

    @Override // p067l.InterfaceC5005
    public final int getBlockSize() {
        return 28;
    }

    @Override // p067l.InterfaceC5005
    public final String name() {
        return "SHA224";
    }

    @Override // p067l.InterfaceC5005
    public final void init() {
        this.f48643 = MessageDigest.getInstance("SHA-224");
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final void mo3552(int i, byte[] bArr) {
        this.f48643.update(bArr, 0, i);
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo3553() {
        return this.f48643.digest();
    }
}
