package p067l;

import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.engines.CAST5Engine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: renamed from: l.ܶۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27W6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16738 implements InterfaceC24727 {

    /* JADX INFO: renamed from: ֫ */
    public DefaultBufferedBlockCipher f49355;

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
        return 8;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final void mo4571(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 8) {
            byte[] bArr3 = new byte[8];
            System.arraycopy(bArr2, 0, bArr3, 0, 8);
            bArr2 = bArr3;
        }
        if (bArr.length > 16) {
            byte[] bArr4 = new byte[16];
            System.arraycopy(bArr, 0, bArr4, 0, 16);
            bArr = bArr4;
        }
        try {
            ParametersWithIV parametersWithIV = new ParametersWithIV(new KeyParameter(bArr, 0, bArr.length), bArr2, 0, bArr2.length);
            DefaultBufferedBlockCipher defaultBufferedBlockCipher = new DefaultBufferedBlockCipher(CBCBlockCipher.newInstance(new CAST5Engine()));
            this.f49355 = defaultBufferedBlockCipher;
            defaultBufferedBlockCipher.init(i == 0, parametersWithIV);
        } catch (Exception e) {
            this.f49355 = null;
            throw e;
        }
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final void mo4570(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        this.f49355.processBytes(bArr, i, i2, bArr2, i3);
    }
}
