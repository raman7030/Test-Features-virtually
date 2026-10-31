package l;

import java.nio.ByteBuffer;
import javax.crypto.AEADBadTagException;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: renamed from: l.᩹ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37WC */
/* JADX INFO: loaded from: classes.dex */
public final class C22177 implements InterfaceC23526 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public KeyParameter f71956;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public KeyParameter f71957;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Poly1305 f71958;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ChaChaEngine f71959;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f71960;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ChaChaEngine f71961;

    @Override // l.InterfaceC23526
    public final int getBlockSize() {
        return 64;
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
    public final int mo2207() {
        return 16;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo2209() {
        return true;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo2210() {
        return true;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ᩳ */
    public final int mo2211() {
        return 8;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final void mo2204(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr.length > 64) {
            byte[] bArr3 = new byte[64];
            System.arraycopy(bArr, 0, bArr3, 0, 64);
            bArr = bArr3;
        }
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        System.arraycopy(bArr, 32, bArr4, 0, 32);
        System.arraycopy(bArr, 0, bArr5, 0, 32);
        this.f71960 = i;
        try {
            this.f71956 = new KeyParameter(bArr4, 0, 32);
            this.f71957 = new KeyParameter(bArr5, 0, 32);
            this.f71959 = new ChaChaEngine();
            this.f71961 = new ChaChaEngine();
            this.f71958 = new Poly1305();
        } catch (Exception e) {
            this.f71959 = null;
            this.f71961 = null;
            this.f71956 = null;
            this.f71957 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final void mo2202(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(0, i);
        this.f71959.init(this.f71960 == 0, new ParametersWithIV(this.f71956, byteBufferAllocate.array(), 0, byteBufferAllocate.array().length));
        this.f71961.init(this.f71960 == 0, new ParametersWithIV(this.f71957, byteBufferAllocate.array(), 0, byteBufferAllocate.array().length));
        byte[] bArr = new byte[64];
        this.f71961.processBytes(bArr, 0, 64, bArr, 0);
        this.f71958.init(new KeyParameter(bArr, 0, 32));
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final void mo2203(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        this.f71959.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ۧ */
    public final void mo2208(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws AEADBadTagException {
        if (this.f71960 == 1) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr, i2, bArr3, 0, 16);
            byte[] bArr4 = new byte[16];
            if (i < 0) {
                this.f71958.update(bArr, i + 4, i2);
            } else {
                this.f71958.update(bArr, i, i2);
            }
            this.f71958.doFinal(bArr4, 0);
            int i4 = 0;
            for (int i5 = 0; i5 < 16; i5++) {
                i4 |= bArr3[i5] ^ bArr4[i5];
            }
            if (i4 != 0) {
                throw new AEADBadTagException("Tag mismatch");
            }
        }
        if (i < 0) {
            this.f71961.processBytes(bArr, i + 4, (i2 - 4) - i, bArr2, i3 + 4 + i);
        } else {
            this.f71961.processBytes(bArr, i + 4, i2 - 4, bArr2, i3 + 4);
        }
        if (this.f71960 == 0) {
            this.f71958.update(bArr2, i3, i2);
            this.f71958.doFinal(bArr2, i2);
        }
    }
}
