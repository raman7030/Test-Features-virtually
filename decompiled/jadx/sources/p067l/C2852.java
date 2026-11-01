package p067l;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.֡ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7ZR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2852 implements InterfaceC24727 {

    /* JADX INFO: renamed from: ֫ */
    public Cipher f4913;

    @Override // p067l.InterfaceC24727
    public final int getBlockSize() {
        return 24;
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
        return true;
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
        return 16;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final void mo4571(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            bArr2 = bArr3;
        }
        if (bArr.length > 24) {
            byte[] bArr4 = new byte[24];
            System.arraycopy(bArr, 0, bArr4, 0, 24);
            bArr = bArr4;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            this.f4913 = cipher;
            cipher.init(i == 0 ? 1 : 2, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (Exception e) {
            this.f4913 = null;
            throw e;
        }
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final void mo4570(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f4913.update(bArr, i, i2, bArr2, i3);
    }
}
