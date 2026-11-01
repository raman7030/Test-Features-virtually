package p067l;

/* JADX INFO: renamed from: l.۫ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8M4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14278 implements InterfaceC11441, InterfaceC22170 {

    /* JADX INFO: renamed from: ᩶ */
    public final long f40673;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC22170 f40674;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC11441 f40675;

    @Override // p067l.InterfaceC20985
    /* JADX INFO: renamed from: ֫ */
    public final void mo13095(InterfaceC2878 interfaceC2878) {
        InterfaceC22170 interfaceC22170 = this.f40674;
        interfaceC22170.getClass();
        interfaceC22170.mo13095((InterfaceC2878) this);
    }

    public C14278(InterfaceC11441 interfaceC11441, long j) {
        this.f40675 = interfaceC11441;
        this.f40673 = j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC11441 m32809() {
        return this.f40675;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13097(InterfaceC22170 interfaceC22170, long j) {
        this.f40674 = interfaceC22170;
        this.f40675.mo13097(this, j - this.f40673);
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܿ */
    public final void mo13100() {
        this.f40675.mo13100();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ᩻ */
    public final C8243 mo13102() {
        return this.f40675.mo13102();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13092(InterfaceC11617[] interfaceC11617Arr, boolean[] zArr, InterfaceC20314[] interfaceC20314Arr, boolean[] zArr2, long j) {
        InterfaceC20314[] interfaceC20314Arr2 = new InterfaceC20314[interfaceC20314Arr.length];
        int i = 0;
        while (true) {
            InterfaceC20314 interfaceC20314M34195 = null;
            if (i >= interfaceC20314Arr.length) {
                break;
            }
            C14948 c14948 = (C14948) interfaceC20314Arr[i];
            if (c14948 != null) {
                interfaceC20314M34195 = c14948.m34195();
            }
            interfaceC20314Arr2[i] = interfaceC20314M34195;
            i++;
        }
        InterfaceC11441 interfaceC11441 = this.f40675;
        long j2 = this.f40673;
        long jMo13092 = interfaceC11441.mo13092(interfaceC11617Arr, zArr, interfaceC20314Arr2, zArr2, j - j2);
        for (int i2 = 0; i2 < interfaceC20314Arr.length; i2++) {
            InterfaceC20314 interfaceC20314 = interfaceC20314Arr2[i2];
            if (interfaceC20314 == null) {
                interfaceC20314Arr[i2] = null;
            } else {
                InterfaceC20314 interfaceC20315 = interfaceC20314Arr[i2];
                if (interfaceC20315 == null || ((C14948) interfaceC20315).m34195() != interfaceC20314) {
                    interfaceC20314Arr[i2] = new C14948(interfaceC20314, j2);
                }
            }
        }
        return jMo13092 + j2;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13093(long j, boolean z) {
        this.f40675.mo13093(j - this.f40673, z);
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܽ */
    public final long mo13098() {
        long jMo13098 = this.f40675.mo13098();
        if (jMo13098 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo13098 + this.f40673;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13090(long j) {
        long j2 = this.f40673;
        return this.f40675.mo13090(j - j2) + j2;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13091(long j, C11491 c11491) {
        long j2 = this.f40673;
        return this.f40675.mo13091(j - j2, c11491) + j2;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۜ */
    public final long mo4633() {
        long jMo4633 = this.f40675.mo4633();
        if (jMo4633 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo4633 + this.f40673;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final long mo4634() {
        long jMo4634 = this.f40675.mo4634();
        if (jMo4634 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo4634 + this.f40673;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4632(C13268 c13268) {
        C7903 c7903M30319 = c13268.m30319();
        c7903M30319.m18255(c13268.f37251 - this.f40673);
        return this.f40675.mo4632(c7903M30319.m18252());
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4631() {
        return this.f40675.mo4631();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final void mo4635(long j) {
        this.f40675.mo4635(j - this.f40673);
    }

    @Override // p067l.InterfaceC22170
    /* JADX INFO: renamed from: ֫ */
    public final void mo13096(InterfaceC11441 interfaceC11441) {
        InterfaceC22170 interfaceC22170 = this.f40674;
        interfaceC22170.getClass();
        interfaceC22170.mo13096((InterfaceC11441) this);
    }
}
