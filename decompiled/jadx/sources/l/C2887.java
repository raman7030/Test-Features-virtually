package l;

/* JADX INFO: renamed from: l.ۗ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes2.dex */
public final class C2887 implements InterfaceC12764 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f9216 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f9218 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f9215 = new byte[8];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float[] f9217 = new float[16];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m8829() {
        return this.f9216 == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8822() {
        return this.f9216;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8820(byte b) {
        int i = this.f9216;
        byte[] bArr = this.f9215;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f9215 = bArr2;
        }
        byte[] bArr3 = this.f9215;
        int i2 = this.f9216;
        this.f9216 = i2 + 1;
        bArr3[i2] = b;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8821(int i) {
        float[] fArr = this.f9217;
        if (fArr.length < this.f9218 + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f9217 = fArr2;
        }
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8823(float f, float f2) {
        m8820((byte) 0);
        m8821(2);
        float[] fArr = this.f9217;
        int i = this.f9218;
        int i2 = i + 1;
        this.f9218 = i2;
        fArr[i] = f;
        this.f9218 = i + 2;
        fArr[i2] = f2;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8828(float f, float f2) {
        m8820((byte) 1);
        m8821(2);
        float[] fArr = this.f9217;
        int i = this.f9218;
        int i2 = i + 1;
        this.f9218 = i2;
        fArr[i] = f;
        this.f9218 = i + 2;
        fArr[i2] = f2;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8825(float f, float f2, float f3, float f4, float f5, float f6) {
        m8820((byte) 2);
        m8821(6);
        float[] fArr = this.f9217;
        int i = this.f9218;
        int i2 = i + 1;
        this.f9218 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f9218 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f9218 = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.f9218 = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.f9218 = i6;
        fArr[i5] = f5;
        this.f9218 = i + 6;
        fArr[i6] = f6;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8824(float f, float f2, float f3, float f4) {
        m8820((byte) 3);
        m8821(4);
        float[] fArr = this.f9217;
        int i = this.f9218;
        int i2 = i + 1;
        this.f9218 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f9218 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f9218 = i4;
        fArr[i3] = f3;
        this.f9218 = i + 4;
        fArr[i4] = f4;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8826(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        m8820((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        m8821(5);
        float[] fArr = this.f9217;
        int i = this.f9218;
        int i2 = i + 1;
        this.f9218 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f9218 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f9218 = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.f9218 = i5;
        fArr[i4] = f4;
        this.f9218 = i + 5;
        fArr[i5] = f5;
    }

    @Override // l.InterfaceC12764
    public final void close() {
        m8820((byte) 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8827(InterfaceC12764 interfaceC12764) {
        int i = 0;
        for (int i2 = 0; i2 < this.f9216; i2++) {
            byte b = this.f9215[i2];
            if (b == 0) {
                float[] fArr = this.f9217;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                interfaceC12764.mo8823(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = this.f9217;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                interfaceC12764.mo8828(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = this.f9217;
                float f3 = fArr3[i];
                float f4 = fArr3[i + 1];
                float f5 = fArr3[i + 2];
                float f6 = fArr3[i + 3];
                int i5 = i + 5;
                float f7 = fArr3[i + 4];
                i += 6;
                interfaceC12764.mo8825(f3, f4, f5, f6, f7, fArr3[i5]);
            } else if (b == 3) {
                float[] fArr4 = this.f9217;
                float f8 = fArr4[i];
                float f9 = fArr4[i + 1];
                int i6 = i + 3;
                float f10 = fArr4[i + 2];
                i += 4;
                interfaceC12764.mo8824(f8, f9, f10, fArr4[i6]);
            } else if (b == 8) {
                interfaceC12764.close();
            } else {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = this.f9217;
                float f11 = fArr5[i];
                float f12 = fArr5[i + 1];
                float f13 = fArr5[i + 2];
                int i7 = i + 4;
                float f14 = fArr5[i + 3];
                i += 5;
                interfaceC12764.mo8826(f11, f12, f13, z, z2, f14, fArr5[i7]);
            }
        }
    }
}
