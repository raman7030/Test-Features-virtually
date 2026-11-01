package p067l;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩶ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21629 implements InterfaceC24727 {

    /* JADX INFO: renamed from: ֫ */
    public Cipher f68175;

    @Override // p067l.InterfaceC24727
    public final int getBlockSize() {
        return 32;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4569(int i) {
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4572(byte[] bArr) {
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4573() {
        return false;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int mo4574() {
        return 0;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4575(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo4576() {
        return false;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ boolean mo4577() {
        return false;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ᩳ */
    public final int mo4578() {
        return 8;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final void mo4571(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr.length > 32) {
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr, 0, bArr3, 0, 32);
            bArr = bArr3;
        }
        try {
            this.f68175 = Cipher.getInstance("RC4");
            this.f68175.init(i == 0 ? 1 : 2, new SecretKeySpec(bArr, "RC4"));
            byte[] bArr4 = new byte[1];
            for (int i2 = 0; i2 < 1536; i2++) {
                this.f68175.update(bArr4, 0, 1, bArr4, 0);
            }
        } catch (Exception e) {
            this.f68175 = null;
            throw e;
        }
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final void mo4570(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f68175.update(bArr, i, i2, bArr2, i3);
    }
}
