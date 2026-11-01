package p067l;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۙܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7W7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6876 implements InterfaceC24727 {

    /* JADX INFO: renamed from: ֫ */
    public Cipher f17880;

    @Override // p067l.InterfaceC24727
    public final int getBlockSize() {
        return 16;
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
        if (bArr.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            bArr = bArr3;
        }
        try {
            this.f17880 = Cipher.getInstance("RC4");
            this.f17880.init(i == 0 ? 1 : 2, new SecretKeySpec(bArr, "RC4"));
        } catch (Exception e) {
            this.f17880 = null;
            throw e;
        }
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final void mo4570(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f17880.update(bArr, i, i2, bArr2, i3);
    }
}
