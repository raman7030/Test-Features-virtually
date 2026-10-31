package l;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.᩶ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7XH */
/* JADX INFO: loaded from: classes5.dex */
public class C20061 implements InterfaceC1031 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f64979;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HMac f64980;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f64981 = new byte[4];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public RIPEMD160Digest f64978 = new RIPEMD160Digest();

    @Override // l.InterfaceC1031
    public final int getBlockSize() {
        return 20;
    }

    @Override // l.InterfaceC1031
    public final void init(byte[] bArr) {
        if (bArr.length > 20) {
            byte[] bArr2 = new byte[20];
            System.arraycopy(bArr, 0, bArr2, 0, 20);
            bArr = bArr2;
        }
        KeyParameter keyParameter = new KeyParameter(bArr, 0, bArr.length);
        HMac hMac = new HMac(this.f64978);
        this.f64980 = hMac;
        hMac.init(keyParameter);
    }

    @Override // l.InterfaceC1031
    /* JADX INFO: renamed from: ֫ */
    public final void mo3560(int i) {
        byte[] bArr = this.f64981;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        mo3561(4, bArr);
    }

    @Override // l.InterfaceC1031
    /* JADX INFO: renamed from: ֫ */
    public final void mo3561(int i, byte[] bArr) {
        this.f64980.update(bArr, 0, i);
    }

    @Override // l.InterfaceC1031
    /* JADX INFO: renamed from: ۧ */
    public final void mo3563(int i, byte[] bArr) {
        this.f64980.doFinal(bArr, i);
    }

    @Override // l.InterfaceC1031
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3562() {
        return this.f64979;
    }
}
