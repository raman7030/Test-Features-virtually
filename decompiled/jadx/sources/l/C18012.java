package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8U5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18012 implements InterfaceC9546, InterfaceC20835 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC3901 f56173;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC9546 f56174;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f56175;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f56176 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f56177;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15894 f56178;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC21725 f56179;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC20835 f56180;

    @Override // l.InterfaceC19588
    /* JADX INFO: renamed from: ֫ */
    public final void mo11119(InterfaceC0536 interfaceC0536) {
        InterfaceC20835 interfaceC20835 = this.f56180;
        String str = C3603.f11424;
        interfaceC20835.mo11119((InterfaceC0536) this);
    }

    public C18012(C15894 c15894, InterfaceC21725 interfaceC21725, long j) {
        this.f56178 = c15894;
        this.f56179 = interfaceC21725;
        this.f56175 = j;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m42063() {
        return this.f56175;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m42064(long j) {
        this.f56176 = j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m42065() {
        return this.f56176;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42061(InterfaceC3901 interfaceC3901) {
        C22632.m50634(this.f56173 == null);
        this.f56173 = interfaceC3901;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42066() {
        if (this.f56174 != null) {
            InterfaceC3901 interfaceC3901 = this.f56173;
            interfaceC3901.getClass();
            interfaceC3901.mo9821(this.f56174);
        }
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final void mo11121(InterfaceC20835 interfaceC20835, long j) {
        this.f56180 = interfaceC20835;
        InterfaceC9546 interfaceC9546 = this.f56174;
        if (interfaceC9546 != null) {
            long j2 = this.f56176;
            if (j2 == -9223372036854775807L) {
                j2 = this.f56175;
            }
            interfaceC9546.mo11121(this, j2);
        }
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ܿ */
    public final void mo11124() throws IOException {
        try {
            InterfaceC9546 interfaceC9546 = this.f56174;
            if (interfaceC9546 != null) {
                interfaceC9546.mo11124();
                return;
            }
            InterfaceC3901 interfaceC3901 = this.f56173;
            if (interfaceC3901 != null) {
                interfaceC3901.mo9823();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ᩻ */
    public final C6181 mo11126() {
        InterfaceC9546 interfaceC9546 = this.f56174;
        String str = C3603.f11424;
        return interfaceC9546.mo11126();
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11116(InterfaceC9731[] interfaceC9731Arr, boolean[] zArr, InterfaceC18882[] interfaceC18882Arr, boolean[] zArr2, long j) {
        long j2 = this.f56176;
        long j3 = (j2 == -9223372036854775807L || j != this.f56175) ? j : j2;
        this.f56176 = -9223372036854775807L;
        InterfaceC9546 interfaceC9546 = this.f56174;
        String str = C3603.f11424;
        return interfaceC9546.mo11116(interfaceC9731Arr, zArr, interfaceC18882Arr, zArr2, j3);
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final void mo11117(long j, boolean z) {
        InterfaceC9546 interfaceC9546 = this.f56174;
        String str = C3603.f11424;
        interfaceC9546.mo11117(j, z);
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ܽ */
    public final long mo11122() {
        InterfaceC9546 interfaceC9546 = this.f56174;
        String str = C3603.f11424;
        return interfaceC9546.mo11122();
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۜ */
    public final long mo2266() {
        InterfaceC9546 interfaceC9546 = this.f56174;
        String str = C3603.f11424;
        return interfaceC9546.mo2266();
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11114(long j) {
        InterfaceC9546 interfaceC9546 = this.f56174;
        String str = C3603.f11424;
        return interfaceC9546.mo11114(j);
    }

    @Override // l.InterfaceC9546
    /* JADX INFO: renamed from: ֫ */
    public final long mo11115(long j, C9599 c9599) {
        InterfaceC9546 interfaceC9546 = this.f56174;
        String str = C3603.f11424;
        return interfaceC9546.mo11115(j, c9599);
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final long mo2267() {
        InterfaceC9546 interfaceC9546 = this.f56174;
        String str = C3603.f11424;
        return interfaceC9546.mo2267();
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final void mo2268(long j) {
        InterfaceC9546 interfaceC9546 = this.f56174;
        String str = C3603.f11424;
        interfaceC9546.mo2268(j);
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2265(C11469 c11469) {
        InterfaceC9546 interfaceC9546 = this.f56174;
        return interfaceC9546 != null && interfaceC9546.mo2265(c11469);
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2264() {
        InterfaceC9546 interfaceC9546 = this.f56174;
        return interfaceC9546 != null && interfaceC9546.mo2264();
    }

    @Override // l.InterfaceC20835
    /* JADX INFO: renamed from: ֫ */
    public final void mo11120(InterfaceC9546 interfaceC9546) {
        InterfaceC20835 interfaceC20835 = this.f56180;
        String str = C3603.f11424;
        interfaceC20835.mo11120((InterfaceC9546) this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42062(C15894 c15894) {
        long j = this.f56176;
        if (j == -9223372036854775807L) {
            j = this.f56175;
        }
        InterfaceC3901 interfaceC3901 = this.f56173;
        interfaceC3901.getClass();
        InterfaceC9546 interfaceC9546Mo9816 = interfaceC3901.mo9816(c15894, this.f56179, j);
        this.f56174 = interfaceC9546Mo9816;
        if (this.f56180 != null) {
            interfaceC9546Mo9816.mo11121(this, j);
        }
    }
}
