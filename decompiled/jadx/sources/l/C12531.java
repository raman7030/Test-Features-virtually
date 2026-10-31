package l;

/* JADX INFO: renamed from: l.۫ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8M4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12531 implements InterfaceC9546, InterfaceC20835 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f37649;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC20835 f37650;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC9546 f37651;

    @Override // l.InterfaceC19588
    /* JADX INFO: renamed from: ֫ */
    public final void mo11119(InterfaceC0536 interfaceC0536) {
        InterfaceC20835 interfaceC20835 = this.f37650;
        interfaceC20835.getClass();
        interfaceC20835.mo11119((InterfaceC0536) this);
    }

    public C12531(InterfaceC9546 interfaceC9546, long j) {
        this.f37651 = interfaceC9546;
        this.f37649 = j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9546 m30737() {
        return this.f37651;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final void mo11121(InterfaceC20835 interfaceC20835, long j) {
        this.f37650 = interfaceC20835;
        this.f37651.mo11121(this, j - this.f37649);
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ܿ */
    public final void mo11124() {
        this.f37651.mo11124();
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ᩻ */
    public final C6181 mo11126() {
        return this.f37651.mo11126();
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11116(InterfaceC9731[] interfaceC9731Arr, boolean[] zArr, InterfaceC18882[] interfaceC18882Arr, boolean[] zArr2, long j) {
        InterfaceC18882[] interfaceC18882Arr2 = new InterfaceC18882[interfaceC18882Arr.length];
        int i = 0;
        while (true) {
            InterfaceC18882 interfaceC18882M32097 = null;
            if (i >= interfaceC18882Arr.length) {
                break;
            }
            C13236 c13236 = (C13236) interfaceC18882Arr[i];
            if (c13236 != null) {
                interfaceC18882M32097 = c13236.m32097();
            }
            interfaceC18882Arr2[i] = interfaceC18882M32097;
            i++;
        }
        InterfaceC9546 interfaceC9546 = this.f37651;
        long j2 = this.f37649;
        long jMo11116 = interfaceC9546.mo11116(interfaceC9731Arr, zArr, interfaceC18882Arr2, zArr2, j - j2);
        for (int i2 = 0; i2 < interfaceC18882Arr.length; i2++) {
            InterfaceC18882 interfaceC18882 = interfaceC18882Arr2[i2];
            if (interfaceC18882 == null) {
                interfaceC18882Arr[i2] = null;
            } else {
                InterfaceC18882 interfaceC18883 = interfaceC18882Arr[i2];
                if (interfaceC18883 == null || ((C13236) interfaceC18883).m32097() != interfaceC18882) {
                    interfaceC18882Arr[i2] = new C13236(interfaceC18882, j2);
                }
            }
        }
        return jMo11116 + j2;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final void mo11117(long j, boolean z) {
        this.f37651.mo11117(j - this.f37649, z);
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ܽ */
    public final long mo11122() {
        long jMo11122 = this.f37651.mo11122();
        if (jMo11122 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo11122 + this.f37649;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11114(long j) {
        long j2 = this.f37649;
        return this.f37651.mo11114(j - j2) + j2;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11115(long j, C9599 c9599) {
        long j2 = this.f37649;
        return this.f37651.mo11115(j - j2, c9599) + j2;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۜ */
    public final long mo2266() {
        long jMo2266 = this.f37651.mo2266();
        if (jMo2266 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo2266 + this.f37649;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final long mo2267() {
        long jMo2267 = this.f37651.mo2267();
        if (jMo2267 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo2267 + this.f37649;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2265(C11469 c11469) {
        C5824 c5824M28275 = c11469.m28275();
        c5824M28275.m16330(c11469.f34255 - this.f37649);
        return this.f37651.mo2265(c5824M28275.m16327());
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2264() {
        return this.f37651.mo2264();
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final void mo2268(long j) {
        this.f37651.mo2268(j - this.f37649);
    }

    @Override // l.InterfaceC20835
    /* JADX INFO: renamed from: ֫ */
    public final void mo11120(InterfaceC9546 interfaceC9546) {
        InterfaceC20835 interfaceC20835 = this.f37650;
        interfaceC20835.getClass();
        interfaceC20835.mo11120((InterfaceC9546) this);
    }
}
