package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ܰ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R1SI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15808 extends AbstractC24526 implements InterfaceC12457 {

    /* JADX INFO: renamed from: ֫ */
    public int f45774;

    public C15808(byte[] bArr) throws C11314 {
        if (bArr.length == 1) {
            byte b = bArr[0];
            if ((b & 255) <= 37) {
                int i = (b & 1) | 2;
                this.f45774 = i;
                this.f45774 = i << ((b >>> 1) + 11);
                return;
            }
        }
        throw new C11314("Unsupported LZMA2 properties");
    }

    @Override // p067l.InterfaceC12457
    /* JADX INFO: renamed from: ֫ */
    public final int mo12821() {
        return C3937.m7779(this.f45774);
    }

    @Override // p067l.InterfaceC12457
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo12822(InputStream inputStream, C6422 c6422) {
        return new C3937(inputStream, this.f45774, c6422);
    }
}
