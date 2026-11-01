package p067l;

/* JADX INFO: renamed from: l.ۗ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes2.dex */
public final class C5112 implements InterfaceC14499 {

    /* JADX INFO: renamed from: ۧ */
    public int f12014 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f12016 = 0;

    /* JADX INFO: renamed from: ֫ */
    public byte[] f12013 = new byte[8];

    /* JADX INFO: renamed from: ܽ */
    public float[] f12015 = new float[16];

    /* JADX INFO: renamed from: ۧ */
    public final boolean m10896() {
        return this.f12014 == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10889() {
        return this.f12014;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10887(byte b) {
        int i = this.f12014;
        byte[] bArr = this.f12013;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f12013 = bArr2;
        }
        byte[] bArr3 = this.f12013;
        int i2 = this.f12014;
        this.f12014 = i2 + 1;
        bArr3[i2] = b;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10888(int i) {
        float[] fArr = this.f12015;
        if (fArr.length < this.f12016 + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f12015 = fArr2;
        }
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10890(float f, float f2) {
        m10887((byte) 0);
        m10888(2);
        float[] fArr = this.f12015;
        int i = this.f12016;
        int i2 = i + 1;
        this.f12016 = i2;
        fArr[i] = f;
        this.f12016 = i + 2;
        fArr[i2] = f2;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ۧ */
    public final void mo10895(float f, float f2) {
        m10887((byte) 1);
        m10888(2);
        float[] fArr = this.f12015;
        int i = this.f12016;
        int i2 = i + 1;
        this.f12016 = i2;
        fArr[i] = f;
        this.f12016 = i + 2;
        fArr[i2] = f2;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10892(float f, float f2, float f3, float f4, float f5, float f6) {
        m10887((byte) 2);
        m10888(6);
        float[] fArr = this.f12015;
        int i = this.f12016;
        int i2 = i + 1;
        this.f12016 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f12016 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f12016 = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.f12016 = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.f12016 = i6;
        fArr[i5] = f5;
        this.f12016 = i + 6;
        fArr[i6] = f6;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10891(float f, float f2, float f3, float f4) {
        m10887((byte) 3);
        m10888(4);
        float[] fArr = this.f12015;
        int i = this.f12016;
        int i2 = i + 1;
        this.f12016 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f12016 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f12016 = i4;
        fArr[i3] = f3;
        this.f12016 = i + 4;
        fArr[i4] = f4;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10893(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        m10887((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        m10888(5);
        float[] fArr = this.f12015;
        int i = this.f12016;
        int i2 = i + 1;
        this.f12016 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f12016 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f12016 = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.f12016 = i5;
        fArr[i4] = f4;
        this.f12016 = i + 5;
        fArr[i5] = f5;
    }

    @Override // p067l.InterfaceC14499
    public final void close() {
        m10887((byte) 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10894(InterfaceC14499 interfaceC14499) {
        int i = 0;
        for (int i2 = 0; i2 < this.f12014; i2++) {
            byte b = this.f12013[i2];
            if (b == 0) {
                float[] fArr = this.f12015;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                interfaceC14499.mo10890(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = this.f12015;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                interfaceC14499.mo10895(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = this.f12015;
                float f3 = fArr3[i];
                float f4 = fArr3[i + 1];
                float f5 = fArr3[i + 2];
                float f6 = fArr3[i + 3];
                int i5 = i + 5;
                float f7 = fArr3[i + 4];
                i += 6;
                interfaceC14499.mo10892(f3, f4, f5, f6, f7, fArr3[i5]);
            } else if (b == 3) {
                float[] fArr4 = this.f12015;
                float f8 = fArr4[i];
                float f9 = fArr4[i + 1];
                int i6 = i + 3;
                float f10 = fArr4[i + 2];
                i += 4;
                interfaceC14499.mo10891(f8, f9, f10, fArr4[i6]);
            } else if (b == 8) {
                interfaceC14499.close();
            } else {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = this.f12015;
                float f11 = fArr5[i];
                float f12 = fArr5[i + 1];
                float f13 = fArr5[i + 2];
                int i7 = i + 4;
                float f14 = fArr5[i + 3];
                i += 5;
                interfaceC14499.mo10893(f11, f12, f13, z, z2, f14, fArr5[i7]);
            }
        }
    }
}
