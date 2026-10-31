package l;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۘܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7YS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4038 implements InterfaceC23526 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Cipher f12812;

    @Override // l.InterfaceC23526
    public final int getBlockSize() {
        return 16;
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
        return true;
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
        return 16;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final void mo2204(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            bArr2 = bArr3;
        }
        if (bArr.length > 16) {
            byte[] bArr4 = new byte[16];
            System.arraycopy(bArr, 0, bArr4, 0, 16);
            bArr = bArr4;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            this.f12812 = cipher;
            cipher.init(i == 0 ? 1 : 2, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (Exception e) {
            this.f12812 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final void mo2203(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f12812.update(bArr, i, i2, bArr2, i3);
    }
}
