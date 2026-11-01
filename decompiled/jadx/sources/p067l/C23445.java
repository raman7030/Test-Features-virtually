package p067l;

import java.nio.ByteBuffer;
import javax.crypto.AEADBadTagException;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: renamed from: l.᩹ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37WC */
/* JADX INFO: loaded from: classes.dex */
public final class C23445 implements InterfaceC24727 {

    /* JADX INFO: renamed from: ֫ */
    public KeyParameter f74677;

    /* JADX INFO: renamed from: ۧ */
    public KeyParameter f74678;

    /* JADX INFO: renamed from: ܳ */
    public Poly1305 f74679;

    /* JADX INFO: renamed from: ܽ */
    public ChaChaEngine f74680;

    /* JADX INFO: renamed from: ܿ */
    public int f74681;

    /* JADX INFO: renamed from: ᩳ */
    public ChaChaEngine f74682;

    @Override // p067l.InterfaceC24727
    public final int getBlockSize() {
        return 64;
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
    public final int mo4574() {
        return 16;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4576() {
        return true;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo4577() {
        return true;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ᩳ */
    public final int mo4578() {
        return 8;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final void mo4571(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr.length > 64) {
            byte[] bArr3 = new byte[64];
            System.arraycopy(bArr, 0, bArr3, 0, 64);
            bArr = bArr3;
        }
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        System.arraycopy(bArr, 32, bArr4, 0, 32);
        System.arraycopy(bArr, 0, bArr5, 0, 32);
        this.f74681 = i;
        try {
            this.f74677 = new KeyParameter(bArr4, 0, 32);
            this.f74678 = new KeyParameter(bArr5, 0, 32);
            this.f74680 = new ChaChaEngine();
            this.f74682 = new ChaChaEngine();
            this.f74679 = new Poly1305();
        } catch (Exception e) {
            this.f74680 = null;
            this.f74682 = null;
            this.f74677 = null;
            this.f74678 = null;
            throw e;
        }
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final void mo4569(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(0, i);
        this.f74680.init(this.f74681 == 0, new ParametersWithIV(this.f74677, byteBufferAllocate.array(), 0, byteBufferAllocate.array().length));
        this.f74682.init(this.f74681 == 0, new ParametersWithIV(this.f74678, byteBufferAllocate.array(), 0, byteBufferAllocate.array().length));
        byte[] bArr = new byte[64];
        this.f74682.processBytes(bArr, 0, 64, bArr, 0);
        this.f74679.init(new KeyParameter(bArr, 0, 32));
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final void mo4570(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        this.f74680.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ۧ */
    public final void mo4575(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws AEADBadTagException {
        if (this.f74681 == 1) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr, i2, bArr3, 0, 16);
            byte[] bArr4 = new byte[16];
            if (i < 0) {
                this.f74679.update(bArr, i + 4, i2);
            } else {
                this.f74679.update(bArr, i, i2);
            }
            this.f74679.doFinal(bArr4, 0);
            int i4 = 0;
            for (int i5 = 0; i5 < 16; i5++) {
                i4 |= bArr3[i5] ^ bArr4[i5];
            }
            if (i4 != 0) {
                throw new AEADBadTagException("Tag mismatch");
            }
        }
        if (i < 0) {
            this.f74682.processBytes(bArr, i + 4, (i2 - 4) - i, bArr2, i3 + 4 + i);
        } else {
            this.f74682.processBytes(bArr, i + 4, i2 - 4, bArr2, i3 + 4);
        }
        if (this.f74681 == 0) {
            this.f74679.update(bArr2, i3, i2);
            this.f74679.doFinal(bArr2, i2);
        }
    }
}
