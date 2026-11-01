package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۨ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13774 implements InterfaceC15114, InterfaceC17263, InterfaceC5195, Serializable {
    public static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ int compareTo(InterfaceC15114 interfaceC15114) {
        return AbstractC24029.m53233b(this, interfaceC15114);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Object mo6950T(C10500 c10500) {
        return AbstractC24029.m53238g(this, c10500);
    }

    /* JADX INFO: renamed from: X */
    public abstract InterfaceC15114 mo16123X(long j);

    /* JADX INFO: renamed from: Y */
    public abstract InterfaceC15114 mo16124Y(long j);

    /* JADX INFO: renamed from: Z */
    public abstract InterfaceC15114 mo16125Z(long j);

    @Override // p067l.InterfaceC15114, p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean mo6951e(InterfaceC11901 interfaceC11901) {
        return AbstractC24029.m53237f(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int mo6952l(InterfaceC11901 interfaceC11901) {
        return AbstractC7877.m18193a(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public /* synthetic */ C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        return AbstractC7877.m18196d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return AbstractC24029.m53232a(this, interfaceC17263);
    }

    /* JADX INFO: renamed from: V */
    public static InterfaceC15114 m31405V(InterfaceC4997 interfaceC4997, InterfaceC17263 interfaceC17263) {
        InterfaceC15114 interfaceC15114 = (InterfaceC15114) interfaceC17263;
        if (interfaceC4997.equals(interfaceC15114.mo16126a())) {
            return interfaceC15114;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + interfaceC4997.mo10584k() + ", actual: " + interfaceC15114.mo16126a().mo10584k());
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: I */
    public InterfaceC15784 mo16119I(C9257 c9257) {
        return new C18407(this, c9257);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: d */
    public InterfaceC15114 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        boolean z = interfaceC5865 instanceof EnumC10559;
        if (!z) {
            if (!z) {
                return m31405V(mo16126a(), interfaceC5865.mo13170m(this, j));
            }
            throw new C13242("Unsupported unit: " + interfaceC5865);
        }
        switch (AbstractC12433.f34761a[((EnumC10559) interfaceC5865).ordinal()]) {
            case 1:
                return mo16123X(j);
            case 2:
                return mo16123X(AbstractC24029.m53227Q(j, 7));
            case 3:
                return mo16124Y(j);
            case 4:
                return mo16125Z(j);
            case 5:
                return mo16125Z(AbstractC24029.m53227Q(j, 10));
            case 6:
                return mo16125Z(AbstractC24029.m53227Q(j, 100));
            case 7:
                return mo16125Z(AbstractC24029.m53227Q(j, 1000));
            case 8:
                EnumC19947 enumC19947 = EnumC19947.ERA;
                return mo7152c(AbstractC24029.m53226P(mo6949G(enumC19947), j), (InterfaceC11901) enumC19947);
            default:
                throw new C13242("Unsupported unit: " + interfaceC5865);
        }
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: K */
    public InterfaceC6338 mo16120K() {
        return mo16126a().mo10590y(AbstractC7877.m18193a(this, EnumC19947.ERA));
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: u */
    public boolean mo17797u() {
        return mo16126a().mo10582S(mo6949G(EnumC19947.YEAR));
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: Q */
    public int mo16122Q() {
        return mo17797u() ? 366 : 365;
    }

    @Override // p067l.InterfaceC15114, p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        C12826.requireNonNull(interfaceC17263, "endExclusive");
        InterfaceC15114 interfaceC15114Mo10577E = mo16126a().mo10577E(interfaceC17263);
        if (!(interfaceC5865 instanceof EnumC10559)) {
            C12826.requireNonNull(interfaceC5865, "unit");
            return interfaceC5865.mo13169l(this, interfaceC15114Mo10577E);
        }
        switch (AbstractC12433.f34761a[((EnumC10559) interfaceC5865).ordinal()]) {
            case 1:
                return interfaceC15114Mo10577E.mo16118H() - mo16118H();
            case 2:
                return (interfaceC15114Mo10577E.mo16118H() - mo16118H()) / 7;
            case 3:
                return m31407W(interfaceC15114Mo10577E);
            case 4:
                return m31407W(interfaceC15114Mo10577E) / 12;
            case 5:
                return m31407W(interfaceC15114Mo10577E) / 120;
            case 6:
                return m31407W(interfaceC15114Mo10577E) / 1200;
            case 7:
                return m31407W(interfaceC15114Mo10577E) / 12000;
            case 8:
                EnumC19947 enumC19947 = EnumC19947.ERA;
                return interfaceC15114Mo10577E.mo6949G(enumC19947) - mo6949G(enumC19947);
            default:
                throw new C13242("Unsupported unit: " + interfaceC5865);
        }
    }

    /* JADX INFO: renamed from: W */
    public final long m31407W(InterfaceC15114 interfaceC15114) {
        if (mo16126a().mo10588v(EnumC19947.MONTH_OF_YEAR).f76159d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        EnumC19947 enumC19947 = EnumC19947.PROLEPTIC_MONTH;
        long jMo6949G = mo6949G(enumC19947) * 32;
        EnumC19947 enumC19948 = EnumC19947.DAY_OF_MONTH;
        return (((interfaceC15114.mo6949G(enumC19947) * 32) + ((long) interfaceC15114.mo6952l(enumC19948))) - (jMo6949G + ((long) AbstractC7877.m18193a(this, enumC19948)))) / 32;
    }

    @Override // p067l.InterfaceC15114
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC15114) && AbstractC24029.m53233b(this, (InterfaceC15114) obj) == 0;
    }

    @Override // p067l.InterfaceC15114
    public int hashCode() {
        long jMo16118H = mo16118H();
        return mo16126a().hashCode() ^ ((int) (jMo16118H ^ (jMo16118H >>> 32)));
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: B */
    public InterfaceC15114 mo7158m(InterfaceC5195 interfaceC5195) {
        return m31405V(mo16126a(), interfaceC5195.mo6954s(this));
    }

    @Override // p067l.InterfaceC15114
    public final String toString() {
        long jMo6949G = mo6949G(EnumC19947.YEAR_OF_ERA);
        long jMo6949G2 = mo6949G(EnumC19947.MONTH_OF_YEAR);
        long jMo6949G3 = mo6949G(EnumC19947.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(mo16126a().toString());
        sb.append(" ");
        sb.append(mo16120K());
        sb.append(" ");
        sb.append(jMo6949G);
        sb.append(jMo6949G2 < 10 ? "-0" : "-");
        sb.append(jMo6949G2);
        sb.append(jMo6949G3 < 10 ? "-0" : "-");
        sb.append(jMo6949G3);
        return sb.toString();
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: c */
    public InterfaceC15114 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        return m31405V(mo16126a(), interfaceC11901.mo3653G(this, j));
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: N */
    public InterfaceC15114 mo16121N(InterfaceC13912 interfaceC13912) {
        return m31405V(mo16126a(), interfaceC13912.mo10794l(this));
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: w */
    public InterfaceC15114 mo16131w(long j, InterfaceC5865 interfaceC5865) {
        return m31405V(mo16126a(), AbstractC7877.m18194b(this, j, interfaceC5865));
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: H */
    public long mo16118H() {
        return mo6949G(EnumC19947.EPOCH_DAY);
    }
}
