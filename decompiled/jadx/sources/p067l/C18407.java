package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܽ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18407 implements InterfaceC15784, InterfaceC17263, InterfaceC5195, Serializable {
    public static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a */
    public final transient InterfaceC15114 f54963a;

    /* JADX INFO: renamed from: b */
    public final transient C9257 f54964b;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int compareTo(InterfaceC15784 interfaceC15784) {
        return AbstractC24029.m53234c(this, interfaceC15784);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Object mo6950T(C10500 c10500) {
        return AbstractC24029.m53239h(this, c10500);
    }

    @Override // p067l.InterfaceC15784
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ long mo35854r(C19550 c19550) {
        return AbstractC24029.m53241j(this, c19550);
    }

    /* JADX INFO: renamed from: V */
    public static C18407 m41908V(InterfaceC4997 interfaceC4997, InterfaceC17263 interfaceC17263) {
        C18407 c18407 = (C18407) interfaceC17263;
        if (interfaceC4997.equals(c18407.f54963a.mo16126a())) {
            return c18407;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC4997.mo10584k() + ", actual: " + c18407.f54963a.mo16126a().mo10584k());
    }

    public C18407(InterfaceC15114 interfaceC15114, C9257 c9257) {
        C12826.requireNonNull(interfaceC15114, "date");
        C12826.requireNonNull(c9257, "time");
        this.f54963a = interfaceC15114;
        this.f54964b = c9257;
    }

    /* JADX INFO: renamed from: Z */
    public final C18407 m41912Z(InterfaceC17263 interfaceC17263, C9257 c9257) {
        InterfaceC15114 interfaceC15114 = this.f54963a;
        return (interfaceC15114 == interfaceC17263 && this.f54964b == c9257) ? this : new C18407(AbstractC13774.m31405V(interfaceC15114.mo16126a(), interfaceC17263), c9257);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return m41908V(this.f54963a.mo16126a(), AbstractC7877.m18194b(this, j, enumC10559));
    }

    @Override // p067l.InterfaceC15784
    /* JADX INFO: renamed from: a */
    public final InterfaceC4997 mo35851a() {
        return this.f54963a.mo16126a();
    }

    @Override // p067l.InterfaceC15784
    /* JADX INFO: renamed from: f */
    public final InterfaceC15114 mo35853f() {
        return this.f54963a;
    }

    public final int hashCode() {
        return this.f54963a.hashCode() ^ this.f54964b.hashCode();
    }

    public final String toString() {
        return this.f54963a.toString() + "T" + this.f54964b.toString();
    }

    @Override // p067l.InterfaceC15784
    /* JADX INFO: renamed from: b */
    public final C9257 mo35852b() {
        return this.f54964b;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901 != null && interfaceC11901.mo3654l(this);
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        return enumC19947.isDateBased() || enumC19947.m45274V();
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            if (!((EnumC19947) interfaceC11901).m45274V()) {
                return this.f54963a.mo6953n(interfaceC11901);
            }
            C9257 c9257 = this.f54964b;
            c9257.getClass();
            return AbstractC7877.m18196d(c9257, interfaceC11901);
        }
        return interfaceC11901.mo3655m(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return ((EnumC19947) interfaceC11901).m45274V() ? this.f54964b.mo6952l(interfaceC11901) : this.f54963a.mo6952l(interfaceC11901);
        }
        return mo6953n(interfaceC11901).m53121a(mo6949G(interfaceC11901), interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return ((EnumC19947) interfaceC11901).m45274V() ? this.f54964b.mo6949G(interfaceC11901) : this.f54963a.mo6949G(interfaceC11901);
        }
        return interfaceC11901.mo3652C(this);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return m41912Z(c20480, this.f54964b);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C18407 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            if (((EnumC19947) interfaceC11901).m45274V()) {
                return m41912Z(this.f54963a, this.f54964b.mo7152c(j, interfaceC11901));
            }
            return m41912Z(this.f54963a.mo7152c(j, interfaceC11901), this.f54964b);
        }
        return m41908V(this.f54963a.mo16126a(), interfaceC11901.mo3653G(this, j));
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C18407 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (!(interfaceC5865 instanceof EnumC10559)) {
            return m41908V(this.f54963a.mo16126a(), interfaceC5865.mo13170m(this, j));
        }
        switch (AbstractC4326.f9651a[((EnumC10559) interfaceC5865).ordinal()]) {
            case 1:
                return m41910X(this.f54963a, 0L, 0L, 0L, j);
            case 2:
                C18407 c18407M41912Z = m41912Z(this.f54963a.mo7153d(j / 86400000000L, (InterfaceC5865) EnumC10559.DAYS), this.f54964b);
                return c18407M41912Z.m41910X(c18407M41912Z.f54963a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C18407 c18407M41912Z2 = m41912Z(this.f54963a.mo7153d(j / 86400000, (InterfaceC5865) EnumC10559.DAYS), this.f54964b);
                return c18407M41912Z2.m41910X(c18407M41912Z2.f54963a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return m41910X(this.f54963a, 0L, 0L, j, 0L);
            case 5:
                return m41910X(this.f54963a, 0L, j, 0L, 0L);
            case 6:
                return m41910X(this.f54963a, j, 0L, 0L, 0L);
            case 7:
                C18407 c18407M41912Z3 = m41912Z(this.f54963a.mo7153d(j / 256, (InterfaceC5865) EnumC10559.DAYS), this.f54964b);
                return c18407M41912Z3.m41910X(c18407M41912Z3.f54963a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return m41912Z(this.f54963a.mo7153d(j, interfaceC5865), this.f54964b);
        }
    }

    /* JADX INFO: renamed from: X */
    public final C18407 m41910X(InterfaceC15114 interfaceC15114, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return m41912Z(interfaceC15114, this.f54964b);
        }
        long j5 = j / 24;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jM21356h0 = this.f54964b.m21356h0();
        long j7 = j6 + jM21356h0;
        long jM53257z = AbstractC24029.m53257z(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jM53225O = AbstractC24029.m53225O(j7, 86400000000000L);
        return m41912Z(interfaceC15114.mo7153d(jM53257z, (InterfaceC5865) EnumC10559.DAYS), jM53225O == jM21356h0 ? this.f54964b : C9257.m21347a0(jM53225O));
    }

    @Override // p067l.InterfaceC15784
    /* JADX INFO: renamed from: D */
    public final InterfaceC23832 mo35849D(AbstractC7739 abstractC7739) {
        return C11032.m25440V(abstractC7739, null, this);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        int i;
        C12826.requireNonNull(interfaceC17263, "endExclusive");
        InterfaceC15784 interfaceC15784Mo10578J = this.f54963a.mo16126a().mo10578J(interfaceC17263);
        if (!(interfaceC5865 instanceof EnumC10559)) {
            C12826.requireNonNull(interfaceC5865, "unit");
            return interfaceC5865.mo13169l(this, interfaceC15784Mo10578J);
        }
        EnumC10559 enumC10559 = (EnumC10559) interfaceC5865;
        EnumC10559 enumC105510 = EnumC10559.DAYS;
        if (enumC10559.compareTo(enumC105510) >= 0) {
            InterfaceC15114 interfaceC15114Mo35853f = interfaceC15784Mo10578J.mo35853f();
            if (interfaceC15784Mo10578J.mo35852b().compareTo(this.f54964b) < 0) {
                interfaceC15114Mo35853f = interfaceC15114Mo35853f.mo16131w(1L, enumC105510);
            }
            return this.f54963a.mo7155g(interfaceC15114Mo35853f, interfaceC5865);
        }
        EnumC19947 enumC19947 = EnumC19947.EPOCH_DAY;
        long jMo6949G = interfaceC15784Mo10578J.mo6949G(enumC19947) - this.f54963a.mo6949G(enumC19947);
        switch (AbstractC4326.f9651a[enumC10559.ordinal()]) {
            case 1:
                jMo6949G = AbstractC24029.m53227Q(jMo6949G, 86400000000000L);
                break;
            case 2:
                jMo6949G = AbstractC24029.m53227Q(jMo6949G, 86400000000L);
                break;
            case 3:
                jMo6949G = AbstractC24029.m53227Q(jMo6949G, 86400000L);
                break;
            case 4:
                i = 86400;
                jMo6949G = AbstractC24029.m53227Q(jMo6949G, i);
                break;
            case 5:
                i = 1440;
                jMo6949G = AbstractC24029.m53227Q(jMo6949G, i);
                break;
            case 6:
                i = 24;
                jMo6949G = AbstractC24029.m53227Q(jMo6949G, i);
                break;
            case 7:
                i = 2;
                jMo6949G = AbstractC24029.m53227Q(jMo6949G, i);
                break;
        }
        return AbstractC24029.m53226P(jMo6949G, this.f54964b.mo7155g(interfaceC15784Mo10578J.mo35852b(), interfaceC5865));
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(mo35853f().mo16118H(), EnumC19947.EPOCH_DAY).mo7152c(mo35852b().m21356h0(), EnumC19947.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new C9750((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC15784) && AbstractC24029.m53234c(this, (InterfaceC15784) obj) == 0;
    }
}
