package p067l;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F1TL */
/* JADX INFO: loaded from: classes3.dex */
public final class C3660 extends AbstractC7684 {

    /* JADX INFO: renamed from: ܽ */
    public final byte[] f7723;

    /* JADX INFO: renamed from: ᩳ */
    public int f7724;

    public C3660(C6422 c6422) {
        byte[] bArrMo7199 = c6422.mo7199(65531);
        this.f7723 = bArrMo7199;
        this.f7724 = bArrMo7199.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7012(C6422 c6422) {
        c6422.mo7197(this.f7723);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7011(int i, DataInputStream dataInputStream) throws IOException {
        if (i < 5) {
            throw new C23856();
        }
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new C23856();
        }
        this.f20150 = dataInputStream.readInt();
        this.f20151 = -1;
        int i2 = i - 5;
        byte[] bArr = this.f7723;
        int length = bArr.length - i2;
        this.f7724 = length;
        dataInputStream.readFully(bArr, length, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m7013() {
        return this.f7724 == this.f7723.length && this.f20150 == 0;
    }

    @Override // p067l.AbstractC7684
    /* JADX INFO: renamed from: ֫ */
    public final void mo7010() throws C23856 {
        int i = this.f20151;
        if (((-16777216) & i) == 0) {
            try {
                int i2 = this.f20150 << 8;
                byte[] bArr = this.f7723;
                int i3 = this.f7724;
                this.f7724 = i3 + 1;
                this.f20150 = i2 | (bArr[i3] & 255);
                this.f20151 = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C23856();
            }
        }
    }
}
