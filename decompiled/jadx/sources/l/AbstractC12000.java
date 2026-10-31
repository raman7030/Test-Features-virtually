package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۨ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12000 implements InterfaceC13410, InterfaceC15672, InterfaceC2974, Serializable {
    public static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ int compareTo(InterfaceC13410 interfaceC13410) {
        return AbstractC22791.b(this, interfaceC13410);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ Object T(C8556 c8556) {
        return AbstractC22791.g(this, c8556);
    }

    public abstract InterfaceC13410 X(long j);

    public abstract InterfaceC13410 Y(long j);

    public abstract InterfaceC13410 Z(long j);

    @Override // l.InterfaceC13410, l.InterfaceC2268
    public /* synthetic */ boolean e(InterfaceC10030 interfaceC10030) {
        return AbstractC22791.f(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ int l(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.a(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public /* synthetic */ C22729 n(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2974
    public final /* synthetic */ InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return AbstractC22791.a(this, interfaceC15672);
    }

    public static InterfaceC13410 V(InterfaceC2765 interfaceC2765, InterfaceC15672 interfaceC15672) {
        InterfaceC13410 interfaceC13410 = (InterfaceC13410) interfaceC15672;
        if (interfaceC2765.equals(interfaceC13410.a())) {
            return interfaceC13410;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + interfaceC2765.k() + ", actual: " + interfaceC13410.a().k());
    }

    @Override // l.InterfaceC13410
    public InterfaceC14115 I(C7248 c7248) {
        return new C16875(this, c7248);
    }

    @Override // l.InterfaceC15672
    public InterfaceC13410 d(long j, InterfaceC3679 interfaceC3679) {
        boolean z = interfaceC3679 instanceof EnumC8618;
        if (!z) {
            if (!z) {
                return V(a(), interfaceC3679.m(this, j));
            }
            throw new C11441("Unsupported unit: " + interfaceC3679);
        }
        switch (AbstractC10589.a[((EnumC8618) interfaceC3679).ordinal()]) {
            case 1:
                return X(j);
            case 2:
                return X(AbstractC22791.Q(j, 7));
            case 3:
                return Y(j);
            case 4:
                return Z(j);
            case 5:
                return Z(AbstractC22791.Q(j, 10));
            case 6:
                return Z(AbstractC22791.Q(j, 100));
            case 7:
                return Z(AbstractC22791.Q(j, 1000));
            case 8:
                EnumC18496 enumC18496 = EnumC18496.ERA;
                return c(AbstractC22791.P(G(enumC18496), j), (InterfaceC10030) enumC18496);
            default:
                throw new C11441("Unsupported unit: " + interfaceC3679);
        }
    }

    @Override // l.InterfaceC13410
    public InterfaceC4176 K() {
        return a().y(AbstractC5796.a(this, EnumC18496.ERA));
    }

    @Override // l.InterfaceC13410
    public boolean u() {
        return a().S(G(EnumC18496.YEAR));
    }

    @Override // l.InterfaceC13410
    public int Q() {
        return u() ? 366 : 365;
    }

    @Override // l.InterfaceC13410, l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        C11003.requireNonNull(interfaceC15672, "endExclusive");
        InterfaceC13410 interfaceC13410E = a().E(interfaceC15672);
        if (!(interfaceC3679 instanceof EnumC8618)) {
            C11003.requireNonNull(interfaceC3679, "unit");
            return interfaceC3679.l(this, interfaceC13410E);
        }
        switch (AbstractC10589.a[((EnumC8618) interfaceC3679).ordinal()]) {
            case 1:
                return interfaceC13410E.H() - H();
            case 2:
                return (interfaceC13410E.H() - H()) / 7;
            case 3:
                return W(interfaceC13410E);
            case 4:
                return W(interfaceC13410E) / 12;
            case 5:
                return W(interfaceC13410E) / 120;
            case 6:
                return W(interfaceC13410E) / 1200;
            case 7:
                return W(interfaceC13410E) / 12000;
            case 8:
                EnumC18496 enumC18496 = EnumC18496.ERA;
                return interfaceC13410E.G(enumC18496) - G(enumC18496);
            default:
                throw new C11441("Unsupported unit: " + interfaceC3679);
        }
    }

    public final long W(InterfaceC13410 interfaceC13410) {
        if (a().v(EnumC18496.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        EnumC18496 enumC18496 = EnumC18496.PROLEPTIC_MONTH;
        long jG = G(enumC18496) * 32;
        EnumC18496 enumC18497 = EnumC18496.DAY_OF_MONTH;
        return (((interfaceC13410.G(enumC18496) * 32) + ((long) interfaceC13410.l(enumC18497))) - (jG + ((long) AbstractC5796.a(this, enumC18497)))) / 32;
    }

    @Override // l.InterfaceC13410
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC13410) && AbstractC22791.b(this, (InterfaceC13410) obj) == 0;
    }

    @Override // l.InterfaceC13410
    public int hashCode() {
        long jH = H();
        return a().hashCode() ^ ((int) (jH ^ (jH >>> 32)));
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: B */
    public InterfaceC13410 m(InterfaceC2974 interfaceC2974) {
        return V(a(), interfaceC2974.s(this));
    }

    @Override // l.InterfaceC13410
    public final String toString() {
        long jG = G(EnumC18496.YEAR_OF_ERA);
        long jG2 = G(EnumC18496.MONTH_OF_YEAR);
        long jG3 = G(EnumC18496.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(K());
        sb.append(" ");
        sb.append(jG);
        sb.append(jG2 < 10 ? "-0" : "-");
        sb.append(jG2);
        sb.append(jG3 < 10 ? "-0" : "-");
        sb.append(jG3);
        return sb.toString();
    }

    @Override // l.InterfaceC15672
    public InterfaceC13410 c(long j, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        return V(a(), interfaceC10030.G(this, j));
    }

    @Override // l.InterfaceC13410
    public InterfaceC13410 N(InterfaceC12146 interfaceC12146) {
        return V(a(), interfaceC12146.l(this));
    }

    @Override // l.InterfaceC15672
    public InterfaceC13410 w(long j, InterfaceC3679 interfaceC3679) {
        return V(a(), AbstractC5796.b(this, j, interfaceC3679));
    }

    @Override // l.InterfaceC13410
    public long H() {
        return G(EnumC18496.EPOCH_DAY);
    }
}
