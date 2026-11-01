package p067l;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۛܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAEU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8217 implements InterfaceC3348 {

    /* JADX INFO: renamed from: ֫ */
    public String f21785;

    /* JADX INFO: renamed from: ۧ */
    public int f21786;

    /* JADX INFO: renamed from: ܽ */
    public boolean f21787;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f21788 = new byte[4];

    /* JADX INFO: renamed from: ᩳ */
    public Mac f21789;

    @Override // p067l.InterfaceC3348
    public void init(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        int length = bArr.length;
        int i = this.f21786;
        if (length > i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, this.f21785);
        Mac mac = Mac.getInstance(this.f21785);
        this.f21789 = mac;
        mac.init(secretKeySpec);
    }

    @Override // p067l.InterfaceC3348
    /* JADX INFO: renamed from: ֫ */
    public void mo5847(int i) {
        byte[] bArr = this.f21788;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        mo5848(4, bArr);
    }

    @Override // p067l.InterfaceC3348
    /* JADX INFO: renamed from: ֫ */
    public void mo5848(int i, byte[] bArr) {
        this.f21789.update(bArr, 0, i);
    }

    @Override // p067l.InterfaceC3348
    /* JADX INFO: renamed from: ۧ */
    public void mo5850(int i, byte[] bArr) {
        try {
            this.f21789.doFinal(bArr, i);
        } catch (ShortBufferException unused) {
            C21769.m49092().getClass();
        }
    }
}
