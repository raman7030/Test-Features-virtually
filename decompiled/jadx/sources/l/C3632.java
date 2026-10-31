package l;

/* JADX INFO: renamed from: l.ۘ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8LH */
/* JADX INFO: loaded from: classes3.dex */
public final class C3632 implements InterfaceC9546, InterfaceC20835 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f11480;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9546 f11481;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f11482;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2221[] f11483 = new C2221[0];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f11484;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC20835 f11485;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0103 f11486;

    @Override // l.InterfaceC19588
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11119(InterfaceC0536 interfaceC0536) {
        InterfaceC20835 interfaceC20835 = this.f11485;
        interfaceC20835.getClass();
        interfaceC20835.mo11119((InterfaceC0536) this);
    }

    public C3632(InterfaceC9546 interfaceC9546, boolean z, long j, long j2) {
        this.f11481 = interfaceC9546;
        this.f11480 = z ? j : -9223372036854775807L;
        this.f11482 = j;
        this.f11484 = j2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11123(long j) {
        this.f11482 = 0L;
        this.f11484 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11118(C0103 c0103) {
        this.f11486 = c0103;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11121(InterfaceC20835 interfaceC20835, long j) {
        this.f11485 = interfaceC20835;
        this.f11481.mo11121(this, j);
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo11124() throws C0103 {
        C0103 c0103 = this.f11486;
        if (c0103 != null) {
            throw c0103;
        }
        this.f11481.mo11124();
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6181 mo11126() {
        return this.f11481.mo11126();
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo11116(InterfaceC9731[] interfaceC9731Arr, boolean[] zArr, InterfaceC18882[] interfaceC18882Arr, boolean[] zArr2, long j) {
        long j2;
        this.f11483 = new C2221[interfaceC18882Arr.length];
        InterfaceC18882[] interfaceC18882Arr2 = new InterfaceC18882[interfaceC18882Arr.length];
        for (int i = 0; i < interfaceC18882Arr.length; i++) {
            C2221[] c2221Arr = this.f11483;
            C2221 c2221 = (C2221) interfaceC18882Arr[i];
            c2221Arr[i] = c2221;
            interfaceC18882Arr2[i] = c2221 != null ? c2221.f7269 : null;
        }
        long jMo11116 = this.f11481.mo11116(interfaceC9731Arr, zArr, interfaceC18882Arr2, zArr2, j);
        long j3 = this.f11484;
        long jMax = Math.max(jMo11116, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (m11125()) {
            if (jMo11116 >= j) {
                if (jMo11116 != 0) {
                    int length = interfaceC9731Arr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            InterfaceC9731 interfaceC9731 = interfaceC9731Arr[i2];
                            if (interfaceC9731 != null) {
                                C8353 c8353Mo2382 = interfaceC9731.mo2382();
                                if (!C9786.m24798(c8353Mo2382.f25614, c8353Mo2382.f25619)) {
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
        this.f11480 = j2;
        for (int i3 = 0; i3 < interfaceC18882Arr.length; i3++) {
            InterfaceC18882 interfaceC18882 = interfaceC18882Arr2[i3];
            if (interfaceC18882 == null) {
                this.f11483[i3] = null;
            } else {
                C2221[] c2221Arr2 = this.f11483;
                C2221 c2222 = c2221Arr2[i3];
                if (c2222 == null || c2222.f7269 != interfaceC18882) {
                    c2221Arr2[i3] = new C2221(this, interfaceC18882);
                }
            }
            interfaceC18882Arr[i3] = this.f11483[i3];
        }
        return jMax;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11117(long j, boolean z) {
        this.f11481.mo11117(j, z);
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final void mo2268(long j) {
        this.f11481.mo2268(j);
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long mo11122() {
        if (m11125()) {
            long j = this.f11480;
            this.f11480 = -9223372036854775807L;
            long jMo11122 = mo11122();
            return jMo11122 != -9223372036854775807L ? jMo11122 : j;
        }
        long jMo11123 = this.f11481.mo11122();
        if (jMo11123 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f11482;
        long j3 = this.f11484;
        long jMax = Math.max(jMo11123, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۜ */
    public final long mo2266() {
        long jMo2266 = this.f11481.mo2266();
        if (jMo2266 != Long.MIN_VALUE) {
            long j = this.f11484;
            if (j == Long.MIN_VALUE || jMo2266 < j) {
                return jMo2266;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo11114(long j) {
        this.f11480 = -9223372036854775807L;
        for (C2221 c2221 : this.f11483) {
            if (c2221 != null) {
                c2221.m7396();
            }
        }
        long jMo11114 = this.f11481.mo11114(j);
        long j2 = this.f11482;
        long j3 = this.f11484;
        long jMax = Math.max(jMo11114, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo11115(long j, C9599 c9599) {
        long j2 = this.f11482;
        if (j == j2) {
            return j2;
        }
        long jM11016 = C3603.m11016(c9599.f29130, 0L, j - j2);
        long j3 = c9599.f29129;
        long j4 = this.f11484;
        long jM11017 = C3603.m11016(j3, 0L, j4 == Long.MIN_VALUE ? C13132.FOREVER_NS : j4 - j);
        if (jM11016 != c9599.f29130 || jM11017 != c9599.f29129) {
            c9599 = new C9599(jM11016, jM11017);
        }
        return this.f11481.mo11115(j, c9599);
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final long mo2267() {
        long jMo2267 = this.f11481.mo2267();
        if (jMo2267 != Long.MIN_VALUE) {
            long j = this.f11484;
            if (j == Long.MIN_VALUE || jMo2267 < j) {
                return jMo2267;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2265(C11469 c11469) {
        return this.f11481.mo2265(c11469);
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2264() {
        return this.f11481.mo2264();
    }

    @Override // l.InterfaceC20835
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11120(InterfaceC9546 interfaceC9546) {
        if (this.f11486 != null) {
            return;
        }
        InterfaceC20835 interfaceC20835 = this.f11485;
        interfaceC20835.getClass();
        interfaceC20835.mo11120((InterfaceC9546) this);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m11125() {
        return this.f11480 != -9223372036854775807L;
    }
}
