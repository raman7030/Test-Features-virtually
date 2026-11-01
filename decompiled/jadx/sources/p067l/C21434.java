package p067l;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.᩶ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7XH */
/* JADX INFO: loaded from: classes5.dex */
public class C21434 implements InterfaceC3348 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f67620;

    /* JADX INFO: renamed from: ܽ */
    public HMac f67621;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f67622 = new byte[4];

    /* JADX INFO: renamed from: ֫ */
    public RIPEMD160Digest f67619 = new RIPEMD160Digest();

    @Override // p067l.InterfaceC3348
    public final int getBlockSize() {
        return 20;
    }

    @Override // p067l.InterfaceC3348
    public final void init(byte[] bArr) {
        if (bArr.length > 20) {
            byte[] bArr2 = new byte[20];
            System.arraycopy(bArr, 0, bArr2, 0, 20);
            bArr = bArr2;
        }
        KeyParameter keyParameter = new KeyParameter(bArr, 0, bArr.length);
        HMac hMac = new HMac(this.f67619);
        this.f67621 = hMac;
        hMac.init(keyParameter);
    }

    @Override // p067l.InterfaceC3348
    /* JADX INFO: renamed from: ֫ */
    public final void mo5847(int i) {
        byte[] bArr = this.f67622;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        mo5848(4, bArr);
    }

    @Override // p067l.InterfaceC3348
    /* JADX INFO: renamed from: ֫ */
    public final void mo5848(int i, byte[] bArr) {
        this.f67621.update(bArr, 0, i);
    }

    @Override // p067l.InterfaceC3348
    /* JADX INFO: renamed from: ۧ */
    public final void mo5850(int i, byte[] bArr) {
        this.f67621.doFinal(bArr, i);
    }

    @Override // p067l.InterfaceC3348
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5849() {
        return this.f67620;
    }
}
