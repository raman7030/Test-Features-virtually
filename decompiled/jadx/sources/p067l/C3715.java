package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3715 implements InterfaceC17263, InterfaceC23832, Serializable {
    public static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a */
    public final C24009 f7863a;

    /* JADX INFO: renamed from: b */
    public final C19550 f7864b;

    /* JADX INFO: renamed from: c */
    public final AbstractC7739 f7865c;

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: U */
    public final /* synthetic */ long mo7147U() {
        return AbstractC24029.m53242k(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC24029.m53235d(this, (InterfaceC23832) obj);
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: a */
    public final InterfaceC4997 mo7150a() {
        return ((C20480) mo7154f()).mo16126a();
    }

    /* JADX INFO: renamed from: W */
    public static C3715 m7142W(C24009 c24009, AbstractC7739 abstractC7739, C19550 c19550) {
        C12826.requireNonNull(c24009, "localDateTime");
        C12826.requireNonNull(abstractC7739, "zone");
        if (abstractC7739 instanceof C19550) {
            return new C3715(c24009, abstractC7739, (C19550) abstractC7739);
        }
        C17537 c17537Mo17864W = abstractC7739.mo17864W();
        List listM39918f = c17537Mo17864W.m39918f(c24009);
        if (listM39918f.size() == 1) {
            c19550 = (C19550) listM39918f.get(0);
        } else if (listM39918f.size() != 0) {
            if (c19550 == null || !listM39918f.contains(c19550)) {
                c19550 = (C19550) C12826.requireNonNull((C19550) listM39918f.get(0), "offset");
            }
        } else {
            Object objM39917e = c17537Mo17864W.m39917e(c24009);
            C8821 c8821 = objM39917e instanceof C8821 ? (C8821) objM39917e : null;
            c24009 = c24009.m53187b0(C5057.ofSeconds(c8821.f23950d.f59520b - c8821.f23949c.f59520b).f11851a);
            c19550 = c8821.f23950d;
        }
        return new C3715(c24009, abstractC7739, c19550);
    }

    public static C3715 ofInstant(C6398 c6398, AbstractC7739 abstractC7739) {
        C12826.requireNonNull(c6398, "instant");
        C12826.requireNonNull(abstractC7739, "zone");
        return m7143s(c6398.getEpochSecond(), c6398.getNano(), abstractC7739);
    }

    /* JADX INFO: renamed from: s */
    public static C3715 m7143s(long j, int i, AbstractC7739 abstractC7739) {
        C19550 c19550M39916d = abstractC7739.mo17864W().m39916d(C6398.ofEpochSecond(j, i));
        return new C3715(C24009.m53183Z(j, i, c19550M39916d), abstractC7739, c19550M39916d);
    }

    @Override // p067l.InterfaceC23832
    public final C6398 toInstant() {
        return C6398.ofEpochSecond(mo7147U(), mo7151b().f25136d);
    }

    /* JADX INFO: renamed from: V */
    public static C3715 m7141V(InterfaceC4524 interfaceC4524) {
        if (interfaceC4524 instanceof C3715) {
            return (C3715) interfaceC4524;
        }
        try {
            AbstractC7739 abstractC7739M17860V = AbstractC7739.m17860V(interfaceC4524);
            EnumC19947 enumC19947 = EnumC19947.INSTANT_SECONDS;
            if (!interfaceC4524.mo6951e(enumC19947)) {
                return m7142W(C24009.m53182Y(C20480.m46185X(interfaceC4524), C9257.m21345X(interfaceC4524)), abstractC7739M17860V, null);
            }
            return m7143s(interfaceC4524.mo6949G(enumC19947), interfaceC4524.mo6952l(EnumC19947.NANO_OF_SECOND), abstractC7739M17860V);
        } catch (C17796 e) {
            throw new C17796("Unable to obtain ZonedDateTime from TemporalAccessor: " + interfaceC4524 + " of type " + interfaceC4524.getClass().getName(), e);
        }
    }

    public C3715(C24009 c24009, AbstractC7739 abstractC7739, C19550 c19550) {
        this.f7863a = c24009;
        this.f7864b = c19550;
        this.f7865c = abstractC7739;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return true;
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            if (interfaceC11901 == EnumC19947.INSTANT_SECONDS || interfaceC11901 == EnumC19947.OFFSET_SECONDS) {
                return ((EnumC19947) interfaceC11901).f60552b;
            }
            return this.f7863a.mo6953n(interfaceC11901);
        }
        return interfaceC11901.mo3655m(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            int i = AbstractC16196.f47672a[((EnumC19947) interfaceC11901).ordinal()];
            if (i == 1) {
                throw new C13242("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f7864b.f59520b;
            }
            return this.f7863a.mo6952l(interfaceC11901);
        }
        return AbstractC24029.m53236e(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3652C(this);
        }
        int i = AbstractC16196.f47672a[((EnumC19947) interfaceC11901).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f7863a.mo6949G(interfaceC11901) : this.f7864b.f59520b;
        }
        return AbstractC24029.m53242k(this);
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: h */
    public final C19550 mo7156h() {
        return this.f7864b;
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: F */
    public final AbstractC7739 mo7146F() {
        return this.f7865c;
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: A */
    public final InterfaceC23832 mo7144A(AbstractC7739 abstractC7739) {
        C12826.requireNonNull(abstractC7739, "zone");
        return this.f7865c.equals(abstractC7739) ? this : m7142W(this.f7863a, abstractC7739, this.f7864b);
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C3715 mo7157i(AbstractC7739 abstractC7739) {
        C12826.requireNonNull(abstractC7739, "zone");
        if (this.f7865c.equals(abstractC7739)) {
            return this;
        }
        C24009 c24009 = this.f7863a;
        C19550 c19550 = this.f7864b;
        c24009.getClass();
        return m7143s(AbstractC24029.m53241j(c24009, c19550), this.f7863a.f76254b.f25136d, abstractC7739);
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: t */
    public final InterfaceC15784 mo7159t() {
        return this.f7863a;
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: f */
    public final InterfaceC15114 mo7154f() {
        return this.f7863a.f76253a;
    }

    @Override // p067l.InterfaceC23832
    /* JADX INFO: renamed from: b */
    public final C9257 mo7151b() {
        return this.f7863a.f76254b;
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return m7142W(C24009.m53182Y(c20480, this.f7863a.f76254b), this.f7865c, this.f7864b);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: c */
    public final InterfaceC17263 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
            int i = AbstractC16196.f47672a[enumC19947.ordinal()];
            if (i == 1) {
                return m7143s(j, this.f7863a.f76254b.f25136d, this.f7865c);
            }
            if (i != 2) {
                return m7142W(this.f7863a.mo7152c(j, interfaceC11901), this.f7865c, this.f7864b);
            }
            C19550 c19550M44395e0 = C19550.m44395e0(enumC19947.f60552b.m53121a(j, enumC19947));
            return (c19550M44395e0.equals(this.f7864b) || !this.f7865c.mo17864W().m39918f(this.f7863a).contains(c19550M44395e0)) ? this : new C3715(this.f7863a, this.f7865c, c19550M44395e0);
        }
        return (C3715) interfaceC11901.mo3653G(this, j);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C3715 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (!(interfaceC5865 instanceof EnumC10559)) {
            return (C3715) interfaceC5865.mo13170m(this, j);
        }
        EnumC10559 enumC10559 = (EnumC10559) interfaceC5865;
        if (enumC10559.compareTo(EnumC10559.DAYS) >= 0 && enumC10559 != EnumC10559.FOREVER) {
            return m7142W(this.f7863a.mo7153d(j, interfaceC5865), this.f7865c, this.f7864b);
        }
        C24009 c24009M53186a0 = this.f7863a.mo7153d(j, interfaceC5865);
        C19550 c19550 = this.f7864b;
        AbstractC7739 abstractC7739 = this.f7865c;
        C12826.requireNonNull(c24009M53186a0, "localDateTime");
        C12826.requireNonNull(c19550, "offset");
        C12826.requireNonNull(abstractC7739, "zone");
        if (abstractC7739.mo17864W().m39918f(c24009M53186a0).contains(c19550)) {
            return new C3715(c24009M53186a0, abstractC7739, c19550);
        }
        c24009M53186a0.getClass();
        return m7143s(AbstractC24029.m53241j(c24009M53186a0, c19550), c24009M53186a0.f76254b.f25136d, abstractC7739);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return j == Long.MIN_VALUE ? mo7153d(C14849.FOREVER_NS, enumC10559).mo7153d(1L, enumC10559) : mo7153d(-j, enumC10559);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20684f) {
            return this.f7863a.f76253a;
        }
        return AbstractC24029.m53240i(this, c10500);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        C3715 c3715M7141V = m7141V(interfaceC17263);
        if (interfaceC5865 instanceof EnumC10559) {
            C3715 c3715Mo7157i = c3715M7141V.mo7157i(this.f7865c);
            EnumC10559 enumC10559 = (EnumC10559) interfaceC5865;
            if (enumC10559.compareTo(EnumC10559.DAYS) >= 0 && enumC10559 != EnumC10559.FOREVER) {
                return this.f7863a.mo7155g(c3715Mo7157i.f7863a, interfaceC5865);
            }
            return new C21151(this.f7863a, this.f7864b).mo7155g(new C21151(c3715Mo7157i.f7863a, c3715Mo7157i.f7864b), interfaceC5865);
        }
        return interfaceC5865.mo13169l(this, c3715M7141V);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3715) {
            C3715 c3715 = (C3715) obj;
            if (this.f7863a.equals(c3715.f7863a) && this.f7864b.equals(c3715.f7864b) && this.f7865c.equals(c3715.f7865c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f7863a.hashCode() ^ this.f7864b.f59520b) ^ Integer.rotateLeft(this.f7865c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f7863a.toString() + this.f7864b.f59521c;
        C19550 c19550 = this.f7864b;
        AbstractC7739 abstractC7739 = this.f7865c;
        if (c19550 == abstractC7739) {
            return str;
        }
        return str + "[" + abstractC7739.toString() + "]";
    }

    private Object writeReplace() {
        return new C21959((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
