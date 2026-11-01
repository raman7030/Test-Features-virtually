package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11032 implements InterfaceC23832, Serializable {
    public static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a */
    public final transient C18407 f30564a;

    /* JADX INFO: renamed from: b */
    public final transient C19550 f30565b;

    /* JADX INFO: renamed from: c */
    public final transient AbstractC7739 f30566c;

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Object mo6950T(C10500 c10500) {
        return AbstractC24029.m53240i(this, c10500);
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: U */
    public final /* synthetic */ long mo7147U() {
        return AbstractC24029.m53242k(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int mo6952l(InterfaceC11901 interfaceC11901) {
        return AbstractC24029.m53236e(this, interfaceC11901);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC24029.m53235d(this, (InterfaceC23832) obj);
    }

    /* JADX INFO: renamed from: V */
    public static C11032 m25440V(AbstractC7739 abstractC7739, C19550 c19550, C18407 c18407) {
        C12826.requireNonNull(c18407, "localDateTime");
        C12826.requireNonNull(abstractC7739, "zone");
        if (abstractC7739 instanceof C19550) {
            return new C11032(abstractC7739, (C19550) abstractC7739, c18407);
        }
        C17537 c17537Mo17864W = abstractC7739.mo17864W();
        C24009 c24009M53181W = C24009.m53181W(c18407);
        List listM39918f = c17537Mo17864W.m39918f(c24009M53181W);
        if (listM39918f.size() == 1) {
            c19550 = (C19550) listM39918f.get(0);
        } else if (listM39918f.size() != 0) {
            if (c19550 == null || !listM39918f.contains(c19550)) {
                c19550 = (C19550) listM39918f.get(0);
            }
        } else {
            Object objM39917e = c17537Mo17864W.m39917e(c24009M53181W);
            C8821 c8821 = objM39917e instanceof C8821 ? (C8821) objM39917e : null;
            c18407 = c18407.m41910X(c18407.f54963a, 0L, 0L, C5057.ofSeconds(c8821.f23950d.f59520b - c8821.f23949c.f59520b).f11851a, 0L);
            c19550 = c8821.f23950d;
        }
        C12826.requireNonNull(c19550, "offset");
        return new C11032(abstractC7739, c19550, c18407);
    }

    /* JADX INFO: renamed from: W */
    public static C11032 m25441W(InterfaceC4997 interfaceC4997, C6398 c6398, AbstractC7739 abstractC7739) {
        C19550 c19550M39916d = abstractC7739.mo17864W().m39916d(c6398);
        C12826.requireNonNull(c19550M39916d, "offset");
        return new C11032(abstractC7739, c19550M39916d, (C18407) interfaceC4997.mo10578J(C24009.m53183Z(c6398.getEpochSecond(), c6398.getNano(), c19550M39916d)));
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            if (interfaceC11901 != EnumC19947.INSTANT_SECONDS && interfaceC11901 != EnumC19947.OFFSET_SECONDS) {
                return ((C18407) mo7159t()).mo6953n(interfaceC11901);
            }
            return ((EnumC19947) interfaceC11901).f60552b;
        }
        return interfaceC11901.mo3655m(this);
    }

    /* JADX INFO: renamed from: s */
    public static C11032 m25442s(InterfaceC4997 interfaceC4997, InterfaceC17263 interfaceC17263) {
        C11032 c11032 = (C11032) interfaceC17263;
        if (interfaceC4997.equals(c11032.mo7150a())) {
            return c11032;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC4997.mo10584k() + ", actual: " + c11032.mo7150a().mo10584k());
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            int i = AbstractC25113.f80363a[((EnumC19947) interfaceC11901).ordinal()];
            if (i == 1) {
                return mo7147U();
            }
            if (i != 2) {
                return ((C18407) mo7159t()).mo6949G(interfaceC11901);
            }
            return mo7156h().f59520b;
        }
        return interfaceC11901.mo3652C(this);
    }

    public C11032(AbstractC7739 abstractC7739, C19550 c19550, C18407 c18407) {
        this.f30564a = (C18407) C12826.requireNonNull(c18407, "dateTime");
        this.f30565b = (C19550) C12826.requireNonNull(c19550, "offset");
        this.f30566c = (AbstractC7739) C12826.requireNonNull(abstractC7739, "zone");
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: h */
    public final C19550 mo7156h() {
        return this.f30565b;
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: f */
    public final InterfaceC15114 mo7154f() {
        return ((C18407) mo7159t()).mo35853f();
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: b */
    public final C9257 mo7151b() {
        return ((C18407) mo7159t()).mo35852b();
    }

    public final int hashCode() {
        return (this.f30564a.hashCode() ^ this.f30565b.f59520b) ^ Integer.rotateLeft(this.f30566c.hashCode(), 3);
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: t */
    public final InterfaceC15784 mo7159t() {
        return this.f30564a;
    }

    public final String toString() {
        String str = this.f30564a.toString() + this.f30565b.f59521c;
        C19550 c19550 = this.f30565b;
        AbstractC7739 abstractC7739 = this.f30566c;
        if (c19550 == abstractC7739) {
            return str;
        }
        return str + "[" + abstractC7739.toString() + "]";
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: F */
    public final AbstractC7739 mo7146F() {
        return this.f30566c;
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: a */
    public final InterfaceC4997 mo7150a() {
        return mo7154f().mo16126a();
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: A */
    public final InterfaceC23832 mo7144A(AbstractC7739 abstractC7739) {
        return m25440V(abstractC7739, this.f30565b, this.f30564a);
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: i */
    public final InterfaceC23832 mo7157i(AbstractC7739 abstractC7739) {
        C12826.requireNonNull(abstractC7739, "zone");
        if (this.f30566c.equals(abstractC7739)) {
            return this;
        }
        C18407 c18407 = this.f30564a;
        C19550 c19550 = this.f30565b;
        c18407.getClass();
        return m25441W(mo7150a(), AbstractC24029.m53243l(c18407, c19550), abstractC7739);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return true;
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: c */
    public final InterfaceC17263 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return m25442s(mo7150a(), interfaceC11901.mo3653G(this, j));
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        int i = AbstractC22432.f70783a[enumC19947.ordinal()];
        if (i == 1) {
            return mo7153d(j - AbstractC24029.m53242k(this), EnumC10559.SECONDS);
        }
        if (i != 2) {
            return m25440V(this.f30566c, this.f30565b, this.f30564a.mo7152c(j, interfaceC11901));
        }
        C19550 c19550M44395e0 = C19550.m44395e0(enumC19947.f60552b.m53121a(j, enumC19947));
        C18407 c18407 = this.f30564a;
        c18407.getClass();
        return m25441W(mo7150a(), AbstractC24029.m53243l(c18407, c19550M44395e0), this.f30566c);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C11032 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (interfaceC5865 instanceof EnumC10559) {
            return m25442s(mo7150a(), this.f30564a.mo7153d(j, interfaceC5865).mo6954s(this));
        }
        return m25442s(mo7150a(), interfaceC5865.mo13170m(this, j));
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        C12826.requireNonNull(interfaceC17263, "endExclusive");
        InterfaceC23832 interfaceC23832Mo10586p = mo7150a().mo10586p(interfaceC17263);
        if (interfaceC5865 instanceof EnumC10559) {
            return this.f30564a.mo7155g(interfaceC23832Mo10586p.mo7157i(this.f30565b).mo7159t(), interfaceC5865);
        }
        C12826.requireNonNull(interfaceC5865, "unit");
        return interfaceC5865.mo13169l(this, interfaceC23832Mo10586p);
    }

    private Object writeReplace() {
        return new C9750((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC23832) && AbstractC24029.m53235d(this, (InterfaceC23832) obj) == 0;
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return m25442s(mo7150a(), c20480.mo6954s(this));
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return m25442s(mo7150a(), AbstractC7877.m18194b(this, j, enumC10559));
    }

    @Override // p067l.InterfaceC23832
    public final C6398 toInstant() {
        return C6398.ofEpochSecond(mo7147U(), mo7151b().f25136d);
    }
}
