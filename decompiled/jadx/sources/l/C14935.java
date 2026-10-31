package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܶۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H95A */
/* JADX INFO: loaded from: classes4.dex */
public final class C14935 implements InterfaceC2774 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MessageDigest f45528;

    @Override // l.InterfaceC2774
    public final int getBlockSize() {
        return 28;
    }

    @Override // l.InterfaceC2774
    public final String name() {
        return "SHA224";
    }

    @Override // l.InterfaceC2774
    public final void init() {
        this.f45528 = MessageDigest.getInstance("SHA-224");
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫ */
    public final void mo1151(int i, byte[] bArr) {
        this.f45528.update(bArr, 0, i);
    }

    @Override // l.InterfaceC2774
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo1152() {
        return this.f45528.digest();
    }
}
