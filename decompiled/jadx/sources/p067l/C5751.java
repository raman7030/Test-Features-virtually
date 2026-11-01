package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 41SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5751 implements InterfaceC12457, InterfaceC14468 {

    /* JADX INFO: renamed from: ֫ */
    public final int f14105;

    @Override // p067l.InterfaceC12457
    /* JADX INFO: renamed from: ֫ */
    public final int mo12821() {
        return 1;
    }

    @Override // p067l.InterfaceC14468
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo12823() {
        return true;
    }

    @Override // p067l.InterfaceC14468
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12824() {
        return false;
    }

    @Override // p067l.InterfaceC14468
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo12825() {
        return false;
    }

    public C5751(byte[] bArr) throws C11314 {
        if (bArr.length != 1) {
            throw new C11314("Unsupported Delta filter properties");
        }
        this.f14105 = (bArr[0] & 255) + 1;
    }

    @Override // p067l.InterfaceC12457
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo12822(InputStream inputStream, C6422 c6422) {
        return new C15138(inputStream, this.f14105);
    }
}
