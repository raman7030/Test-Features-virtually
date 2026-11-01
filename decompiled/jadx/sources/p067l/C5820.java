package p067l;

/* JADX INFO: renamed from: l.ۘ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8LH */
/* JADX INFO: loaded from: classes3.dex */
public final class C5820 implements InterfaceC11441, InterfaceC22170 {

    /* JADX INFO: renamed from: ۗ */
    public long f14285;

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11441 f14286;

    /* JADX INFO: renamed from: ۫ */
    public long f14287;

    /* JADX INFO: renamed from: ۬ */
    public C4479[] f14288 = new C4479[0];

    /* JADX INFO: renamed from: ᩶ */
    public long f14289;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC22170 f14290;

    /* JADX INFO: renamed from: ᩹ */
    public C2466 f14291;

    @Override // p067l.InterfaceC20985
    /* JADX INFO: renamed from: ֫ */
    public final void mo13095(InterfaceC2878 interfaceC2878) {
        InterfaceC22170 interfaceC22170 = this.f14290;
        interfaceC22170.getClass();
        interfaceC22170.mo13095((InterfaceC2878) this);
    }

    public C5820(InterfaceC11441 interfaceC11441, boolean z, long j, long j2) {
        this.f14286 = interfaceC11441;
        this.f14285 = z ? j : -9223372036854775807L;
        this.f14287 = j;
        this.f14289 = j2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m13099(long j) {
        this.f14287 = 0L;
        this.f14289 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13094(C2466 c2466) {
        this.f14291 = c2466;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13097(InterfaceC22170 interfaceC22170, long j) {
        this.f14290 = interfaceC22170;
        this.f14286.mo13097(this, j);
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܿ */
    public final void mo13100() throws C2466 {
        C2466 c2466 = this.f14291;
        if (c2466 != null) {
            throw c2466;
        }
        this.f14286.mo13100();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ᩻ */
    public final C8243 mo13102() {
        return this.f14286.mo13102();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13092(InterfaceC11617[] interfaceC11617Arr, boolean[] zArr, InterfaceC20314[] interfaceC20314Arr, boolean[] zArr2, long j) {
        long j2;
        this.f14288 = new C4479[interfaceC20314Arr.length];
        InterfaceC20314[] interfaceC20314Arr2 = new InterfaceC20314[interfaceC20314Arr.length];
        for (int i = 0; i < interfaceC20314Arr.length; i++) {
            C4479[] c4479Arr = this.f14288;
            C4479 c4479 = (C4479) interfaceC20314Arr[i];
            c4479Arr[i] = c4479;
            interfaceC20314Arr2[i] = c4479 != null ? c4479.f10057 : null;
        }
        long jMo13092 = this.f14286.mo13092(interfaceC11617Arr, zArr, interfaceC20314Arr2, zArr2, j);
        long j3 = this.f14289;
        long jMax = Math.max(jMo13092, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (m13101()) {
            if (jMo13092 >= j) {
                if (jMo13092 != 0) {
                    int length = interfaceC11617Arr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            InterfaceC11617 interfaceC11617 = interfaceC11617Arr[i2];
                            if (interfaceC11617 != null) {
                                C10307 c10307Mo4753 = interfaceC11617.mo4753();
                                if (!C11669.m26813(c10307Mo4753.f28528, c10307Mo4753.f28533)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f14285 = j2;
        for (int i3 = 0; i3 < interfaceC20314Arr.length; i3++) {
            InterfaceC20314 interfaceC20314 = interfaceC20314Arr2[i3];
            if (interfaceC20314 == null) {
                this.f14288[i3] = null;
            } else {
                C4479[] c4479Arr2 = this.f14288;
                C4479 c44710 = c4479Arr2[i3];
                if (c44710 == null || c44710.f10057 != interfaceC20314) {
                    c4479Arr2[i3] = new C4479(this, interfaceC20314);
                }
            }
            interfaceC20314Arr[i3] = this.f14288[i3];
        }
        return jMax;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13093(long j, boolean z) {
        this.f14286.mo13093(j, z);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final void mo4635(long j) {
        this.f14286.mo4635(j);
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܽ */
    public final long mo13098() {
        if (m13101()) {
            long j = this.f14285;
            this.f14285 = -9223372036854775807L;
            long jMo13098 = mo13098();
            return jMo13098 != -9223372036854775807L ? jMo13098 : j;
        }
        long jMo13099 = this.f14286.mo13098();
        if (jMo13099 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f14287;
        long j3 = this.f14289;
        long jMax = Math.max(jMo13099, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۜ */
    public final long mo4633() {
        long jMo4633 = this.f14286.mo4633();
        if (jMo4633 != Long.MIN_VALUE) {
            long j = this.f14289;
            if (j == Long.MIN_VALUE || jMo4633 < j) {
                return jMo4633;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13090(long j) {
        this.f14285 = -9223372036854775807L;
        for (C4479 c4479 : this.f14288) {
            if (c4479 != null) {
                c4479.m9479();
            }
        }
        long jMo13090 = this.f14286.mo13090(j);
        long j2 = this.f14287;
        long j3 = this.f14289;
        long jMax = Math.max(jMo13090, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13091(long j, C11491 c11491) {
        long j2 = this.f14287;
        if (j == j2) {
            return j2;
        }
        long jM12992 = C5792.m12992(c11491.f32077, 0L, j - j2);
        long j3 = c11491.f32076;
        long j4 = this.f14289;
        long jM12993 = C5792.m12992(j3, 0L, j4 == Long.MIN_VALUE ? C14849.FOREVER_NS : j4 - j);
        if (jM12992 != c11491.f32077 || jM12993 != c11491.f32076) {
            c11491 = new C11491(jM12992, jM12993);
        }
        return this.f14286.mo13091(j, c11491);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final long mo4634() {
        long jMo4634 = this.f14286.mo4634();
        if (jMo4634 != Long.MIN_VALUE) {
            long j = this.f14289;
            if (j == Long.MIN_VALUE || jMo4634 < j) {
                return jMo4634;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4632(C13268 c13268) {
        return this.f14286.mo4632(c13268);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4631() {
        return this.f14286.mo4631();
    }

    @Override // p067l.InterfaceC22170
    /* JADX INFO: renamed from: ֫ */
    public final void mo13096(InterfaceC11441 interfaceC11441) {
        if (this.f14291 != null) {
            return;
        }
        InterfaceC22170 interfaceC22170 = this.f14290;
        interfaceC22170.getClass();
        interfaceC22170.mo13096((InterfaceC11441) this);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m13101() {
        return this.f14285 != -9223372036854775807L;
    }
}
