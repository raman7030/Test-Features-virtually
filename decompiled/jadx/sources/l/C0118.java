package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.֡ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53K */
/* JADX INFO: loaded from: classes2.dex */
public final class C0118 implements InterfaceC2774 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MessageDigest f1118;

    @Override // l.InterfaceC2774
    public final int getBlockSize() {
        return 16;
    }

    @Override // l.InterfaceC2774
    public final String name() {
        return "MD5";
    }

    @Override // l.InterfaceC2774
    public final void init() {
        this.f1118 = MessageDigest.getInstance("MD5");
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1151(int i, byte[] bArr) {
        this.f1118.update(bArr, 0, i);
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo1152() {
        return this.f1118.digest();
    }
}
