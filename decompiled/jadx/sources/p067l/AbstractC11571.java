package p067l;

import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: renamed from: l.ۢܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07ZJ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11571 implements InterfaceC24727 {

    /* JADX INFO: renamed from: ֫ */
    public CTRModeCipher f32241;

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4569(int i) {
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4572(byte[] bArr) {
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
    /* JADX INFO: renamed from: ֫ */
    public void mo4571(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            bArr2 = bArr3;
        }
        int blockSize = getBlockSize();
        if (bArr.length > blockSize) {
            byte[] bArr4 = new byte[blockSize];
            System.arraycopy(bArr, 0, bArr4, 0, blockSize);
            bArr = bArr4;
        }
        try {
            ParametersWithIV parametersWithIV = new ParametersWithIV(new KeyParameter(bArr, 0, bArr.length), bArr2, 0, bArr2.length);
            CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(new TwofishEngine());
            this.f32241 = cTRModeCipherNewInstance;
            cTRModeCipherNewInstance.init(i == 0, parametersWithIV);
        } catch (Exception e) {
            this.f32241 = null;
            throw e;
        }
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public void mo4570(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        this.f32241.processBytes(bArr, i, i2, bArr2, i3);
    }
}
