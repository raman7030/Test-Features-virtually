package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩺ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24009 implements InterfaceC17263, InterfaceC5195, InterfaceC15784, Serializable {

    /* JADX INFO: renamed from: c */
    public static final C24009 f76251c = m53182Y(C20480.f63257d, C9257.f25129e);

    /* JADX INFO: renamed from: d */
    public static final C24009 f76252d = m53182Y(C20480.f63258e, C9257.f25130f);
    public static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a */
    public final C20480 f76253a;

    /* JADX INFO: renamed from: b */
    public final C9257 f76254b;

    @Override // p067l.InterfaceC15784
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ long mo35854r(C19550 c19550) {
        return AbstractC24029.m53241j(this, c19550);
    }

    @Override // p067l.InterfaceC15784
    /* JADX INFO: renamed from: a */
    public final InterfaceC4997 mo35851a() {
        return ((C20480) mo35853f()).mo16126a();
    }

    @Override // p067l.InterfaceC15784
    /* JADX INFO: renamed from: D */
    public final InterfaceC23832 mo35849D(AbstractC7739 abstractC7739) {
        return C3715.m7142W(this, abstractC7739, null);
    }

    /* JADX INFO: renamed from: Y */
    public static C24009 m53182Y(C20480 c20480, C9257 c9257) {
        C12826.requireNonNull(c20480, "date");
        C12826.requireNonNull(c9257, "time");
        return new C24009(c20480, c9257);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(((C20480) mo35853f()).mo16118H(), EnumC19947.EPOCH_DAY).mo7152c(mo35852b().m21356h0(), EnumC19947.NANO_OF_DAY);
    }

    /* JADX INFO: renamed from: Z */
    public static C24009 m53183Z(long j, int i, C19550 c19550) {
        C12826.requireNonNull(c19550, "offset");
        long j2 = i;
        EnumC19947.NANO_OF_SECOND.m45273T(j2);
        long j3 = j + ((long) c19550.f59520b);
        long j4 = 86400;
        return new C24009(C20480.m46188i0(AbstractC24029.m53257z(j3, j4)), C9257.m21347a0((((long) ((int) AbstractC24029.m53225O(j3, j4))) * 1000000000) + j2));
    }

    /* JADX INFO: renamed from: W */
    public static C24009 m53181W(InterfaceC4524 interfaceC4524) {
        if (interfaceC4524 instanceof C24009) {
            return (C24009) interfaceC4524;
        }
        if (!(interfaceC4524 instanceof C3715)) {
            if (!(interfaceC4524 instanceof C21151)) {
                try {
                    return new C24009(C20480.m46185X(interfaceC4524), C9257.m21345X(interfaceC4524));
                } catch (C17796 e) {
                    throw new C17796("Unable to obtain LocalDateTime from TemporalAccessor: " + interfaceC4524 + " of type " + interfaceC4524.getClass().getName(), e);
                }
            }
            return ((C21151) interfaceC4524).f66457a;
        }
        return ((C3715) interfaceC4524).f7863a;
    }

    public C24009(C20480 c20480, C9257 c9257) {
        this.f76253a = c20480;
        this.f76254b = c9257;
    }

    /* JADX INFO: renamed from: e0 */
    public final C24009 m53190e0(C20480 c20480, C9257 c9257) {
        return (this.f76253a == c20480 && this.f76254b == c9257) ? this : new C24009(c20480, c9257);
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
            if (((EnumC19947) interfaceC11901).m45274V()) {
                C9257 c9257 = this.f76254b;
                c9257.getClass();
                return AbstractC7877.m18196d(c9257, interfaceC11901);
            }
            return this.f76253a.mo6953n(interfaceC11901);
        }
        return interfaceC11901.mo3655m(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return ((EnumC19947) interfaceC11901).m45274V() ? this.f76254b.mo6952l(interfaceC11901) : this.f76253a.mo6952l(interfaceC11901);
        }
        return AbstractC7877.m18193a(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return ((EnumC19947) interfaceC11901).m45274V() ? this.f76254b.mo6949G(interfaceC11901) : this.f76253a.mo6949G(interfaceC11901);
        }
        return interfaceC11901.mo3652C(this);
    }

    @Override // p067l.InterfaceC15784
    /* JADX INFO: renamed from: f */
    public final InterfaceC15114 mo35853f() {
        return this.f76253a;
    }

    @Override // p067l.InterfaceC15784
    /* JADX INFO: renamed from: b */
    public final C9257 mo35852b() {
        return this.f76254b;
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return m53190e0(c20480, this.f76254b);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final C24009 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            if (((EnumC19947) interfaceC11901).m45274V()) {
                return m53190e0(this.f76253a, this.f76254b.mo7152c(j, interfaceC11901));
            }
            return m53190e0(this.f76253a.mo7152c(j, interfaceC11901), this.f76254b);
        }
        return (C24009) interfaceC11901.mo3653G(this, j);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C24009 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (!(interfaceC5865 instanceof EnumC10559)) {
            return (C24009) interfaceC5865.mo13170m(this, j);
        }
        switch (AbstractC13281.f37289a[((EnumC10559) interfaceC5865).ordinal()]) {
            case 1:
                return m53188c0(this.f76253a, 0L, 0L, 0L, j);
            case 2:
                C24009 c24009M53190e0 = m53190e0(this.f76253a.m46201l0(j / 86400000000L), this.f76254b);
                return c24009M53190e0.m53188c0(c24009M53190e0.f76253a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C24009 c24009M53190e1 = m53190e0(this.f76253a.m46201l0(j / 86400000), this.f76254b);
                return c24009M53190e1.m53188c0(c24009M53190e1.f76253a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return m53187b0(j);
            case 5:
                return m53188c0(this.f76253a, 0L, j, 0L, 0L);
            case 6:
                return m53188c0(this.f76253a, j, 0L, 0L, 0L);
            case 7:
                C24009 c24009M53190e2 = m53190e0(this.f76253a.m46201l0(j / 256), this.f76254b);
                return c24009M53190e2.m53188c0(c24009M53190e2.f76253a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return m53190e0(this.f76253a.mo7153d(j, interfaceC5865), this.f76254b);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final C24009 m53187b0(long j) {
        return m53188c0(this.f76253a, 0L, 0L, j, 0L);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return j == Long.MIN_VALUE ? mo7153d(C14849.FOREVER_NS, enumC10559).mo7153d(1L, enumC10559) : mo7153d(-j, enumC10559);
    }

    /* JADX INFO: renamed from: c0 */
    public final C24009 m53188c0(C20480 c20480, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return m53190e0(c20480, this.f76254b);
        }
        long j5 = 1;
        long jM21356h0 = this.f76254b.m21356h0();
        long j6 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j5) + jM21356h0;
        long jM53257z = AbstractC24029.m53257z(j6, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j5);
        long jM53225O = AbstractC24029.m53225O(j6, 86400000000000L);
        return m53190e0(c20480.m46201l0(jM53257z), jM53225O == jM21356h0 ? this.f76254b : C9257.m21347a0(jM53225O));
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20684f) {
            return this.f76253a;
        }
        return AbstractC24029.m53239h(this, c10500);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        long jM53227Q;
        long j;
        C24009 c24009M53181W = m53181W(interfaceC17263);
        if (!(interfaceC5865 instanceof EnumC10559)) {
            return interfaceC5865.mo13169l(this, c24009M53181W);
        }
        EnumC10559 enumC10559 = (EnumC10559) interfaceC5865;
        if (enumC10559.compareTo(EnumC10559.DAYS) >= 0) {
            C20480 c20480M46201l0 = c24009M53181W.f76253a;
            C20480 c20480 = this.f76253a;
            if (c20480 == null) {
                if (c20480M46201l0.mo16118H() > c20480.mo16118H()) {
                    if (c24009M53181W.f76254b.compareTo(this.f76254b) < 0) {
                        c20480M46201l0 = c20480M46201l0.m46201l0(-1L);
                    }
                }
                return this.f76253a.mo7155g(c20480M46201l0, interfaceC5865);
            }
            c20480M46201l0.getClass();
            if (c20480M46201l0.m46191V(c20480) > 0) {
                if (c24009M53181W.f76254b.compareTo(this.f76254b) < 0) {
                    c20480M46201l0 = c20480M46201l0.m46201l0(-1L);
                }
            }
            return this.f76253a.mo7155g(c20480M46201l0, interfaceC5865);
            if (c20480M46201l0.m46196c0(this.f76253a) && c24009M53181W.f76254b.compareTo(this.f76254b) > 0) {
                c20480M46201l0 = c20480M46201l0.m46201l0(1L);
            }
            return this.f76253a.mo7155g(c20480M46201l0, interfaceC5865);
        }
        C20480 c20481 = this.f76253a;
        C20480 c20482 = c24009M53181W.f76253a;
        c20481.getClass();
        long jMo16118H = c20482.mo16118H() - c20481.mo16118H();
        if (jMo16118H == 0) {
            return this.f76254b.mo7155g(c24009M53181W.f76254b, interfaceC5865);
        }
        long jM21356h0 = c24009M53181W.f76254b.m21356h0() - this.f76254b.m21356h0();
        if (jMo16118H > 0) {
            jM53227Q = jMo16118H - 1;
            j = jM21356h0 + 86400000000000L;
        } else {
            jM53227Q = jMo16118H + 1;
            j = jM21356h0 - 86400000000000L;
        }
        switch (AbstractC13281.f37289a[enumC10559.ordinal()]) {
            case 1:
                jM53227Q = AbstractC24029.m53227Q(jM53227Q, 86400000000000L);
                break;
            case 2:
                jM53227Q = AbstractC24029.m53227Q(jM53227Q, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jM53227Q = AbstractC24029.m53227Q(jM53227Q, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jM53227Q = AbstractC24029.m53227Q(jM53227Q, 86400);
                j /= 1000000000;
                break;
            case 5:
                jM53227Q = AbstractC24029.m53227Q(jM53227Q, 1440);
                j /= 60000000000L;
                break;
            case 6:
                jM53227Q = AbstractC24029.m53227Q(jM53227Q, 24);
                j /= 3600000000000L;
                break;
            case 7:
                jM53227Q = AbstractC24029.m53227Q(jM53227Q, 2);
                j /= 43200000000000L;
                break;
        }
        return AbstractC24029.m53226P(jM53227Q, j);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC15784 interfaceC15784) {
        if (interfaceC15784 instanceof C24009) {
            return m53184V((C24009) interfaceC15784);
        }
        return AbstractC24029.m53234c(this, interfaceC15784);
    }

    /* JADX INFO: renamed from: V */
    public final int m53184V(C24009 c24009) {
        int iM46191V = this.f76253a.m46191V(c24009.f76253a);
        return iM46191V == 0 ? this.f76254b.compareTo(c24009.f76254b) : iM46191V;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m53185X(InterfaceC15784 interfaceC15784) {
        if (interfaceC15784 instanceof C24009) {
            return m53184V((C24009) interfaceC15784) < 0;
        }
        long jMo16118H = this.f76253a.mo16118H();
        long jMo16118H2 = interfaceC15784.mo35853f().mo16118H();
        if (jMo16118H >= jMo16118H2) {
            return jMo16118H == jMo16118H2 && this.f76254b.m21356h0() < interfaceC15784.mo35852b().m21356h0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C24009) {
            C24009 c24009 = (C24009) obj;
            if (this.f76253a.equals(c24009.f76253a) && this.f76254b.equals(c24009.f76254b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f76253a.hashCode() ^ this.f76254b.hashCode();
    }

    public final String toString() {
        return this.f76253a.toString() + "T" + this.f76254b.toString();
    }

    private Object writeReplace() {
        return new C21959((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
