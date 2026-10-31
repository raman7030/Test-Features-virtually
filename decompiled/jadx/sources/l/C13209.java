package l;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.۬ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7YQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13209 implements InterfaceC23526 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Cipher f39557;

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
    public final void mo2204(int i, byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr2.length > 8) {
            byte[] bArr3 = new byte[8];
            System.arraycopy(bArr2, 0, bArr3, 0, 8);
            bArr2 = bArr3;
        }
        if (bArr.length > 32) {
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 0, bArr4, 0, 32);
            bArr = bArr4;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish/CTR/NoPadding");
        this.f39557 = cipher;
        cipher.init(i == 0 ? 1 : 2, secretKeySpec, new IvParameterSpec(bArr2));
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final void mo2203(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f39557.update(bArr, i, i2, bArr2, i3);
    }
}
