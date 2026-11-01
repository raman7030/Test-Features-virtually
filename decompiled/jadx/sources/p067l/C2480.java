package p067l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.֡ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53K */
/* JADX INFO: loaded from: classes2.dex */
public final class C2480 implements InterfaceC5005 {

    /* JADX INFO: renamed from: ֫ */
    public MessageDigest f3894;

    @Override // p067l.InterfaceC5005
    public final int getBlockSize() {
        return 16;
    }

    @Override // p067l.InterfaceC5005
    public final String name() {
        return "MD5";
    }

    @Override // p067l.InterfaceC5005
    public final void init() {
        this.f3894 = MessageDigest.getInstance("MD5");
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final void mo3552(int i, byte[] bArr) {
        this.f3894.update(bArr, 0, i);
    }

    @Override // p067l.InterfaceC5005
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo3553() {
        return this.f3894.digest();
    }
}
