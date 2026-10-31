package l;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩶ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20266 implements InterfaceC23526 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Cipher f65500;

    @Override // l.InterfaceC23526
    public final int getBlockSize() {
        return 32;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2202(int i) {
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2205(byte[] bArr) {
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2206() {
        return false;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int mo2207() {
        return 0;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo2208(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo2209() {
        return false;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ boolean mo2210() {
        return false;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ᩳ */
    public final int mo2211() {
        return 8;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final void mo2204(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr.length > 32) {
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr, 0, bArr3, 0, 32);
            bArr = bArr3;
        }
        try {
            this.f65500 = Cipher.getInstance("RC4");
            this.f65500.init(i == 0 ? 1 : 2, new SecretKeySpec(bArr, "RC4"));
            byte[] bArr4 = new byte[1];
            for (int i2 = 0; i2 < 1536; i2++) {
                this.f65500.update(bArr4, 0, 1, bArr4, 0);
            }
        } catch (Exception e) {
            this.f65500 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final void mo2203(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f65500.update(bArr, i, i2, bArr2, i3);
    }
}
