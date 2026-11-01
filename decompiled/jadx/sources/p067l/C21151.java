package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩵᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21151 implements InterfaceC17263, InterfaceC5195, Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f66456c = 0;
    public static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a */
    public final C24009 f66457a;

    /* JADX INFO: renamed from: b */
    public final C19550 f66458b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        C21151 c21151 = (C21151) obj;
        if (this.f66458b.equals(c21151.f66458b)) {
            iCompare = this.f66457a.compareTo(c21151.f66457a);
        } else {
            C24009 c24009 = this.f66457a;
            C19550 c19550 = this.f66458b;
            c24009.getClass();
            long jM53241j = AbstractC24029.m53241j(c24009, c19550);
            C24009 c240010 = c21151.f66457a;
            C19550 c19551 = c21151.f66458b;
            c240010.getClass();
            iCompare = Long.compare(jM53241j, AbstractC24029.m53241j(c240010, c19551));
            if (iCompare == 0) {
                iCompare = this.f66457a.f76254b.f25136d - c21151.f66457a.f76254b.f25136d;
            }
        }
        return iCompare == 0 ? this.f66457a.compareTo(c21151.f66457a) : iCompare;
    }

    static {
        C24009 c24009 = C24009.f76251c;
        C19550 c19550 = C19550.f59519h;
        c24009.getClass();
        new C21151(c24009, c19550);
        C24009 c240010 = C24009.f76252d;
        C19550 c19551 = C19550.f59518g;
        c240010.getClass();
        new C21151(c240010, c19551);
    }

    /* JADX INFO: renamed from: W */
    public static C21151 m47768W(C6398 c6398, AbstractC7739 abstractC7739) {
        C12826.requireNonNull(c6398, "instant");
        C12826.requireNonNull(abstractC7739, "zone");
        C19550 c19550M39916d = abstractC7739.mo17864W().m39916d(c6398);
        return new C21151(C24009.m53183Z(c6398.getEpochSecond(), c6398.getNano(), c19550M39916d), c19550M39916d);
    }

    /* JADX INFO: renamed from: V */
    public static C21151 m47767V(InterfaceC4524 interfaceC4524) {
        if (interfaceC4524 instanceof C21151) {
            return (C21151) interfaceC4524;
        }
        try {
            C19550 c19550M44392b0 = C19550.m44392b0(interfaceC4524);
            C20480 c20480 = (C20480) interfaceC4524.mo6950T(AbstractC7877.f20684f);
            C9257 c9257 = (C9257) interfaceC4524.mo6950T(AbstractC7877.f20685g);
            if (c20480 != null && c9257 != null) {
                return new C21151(C24009.m53182Y(c20480, c9257), c19550M44392b0);
            }
            return m47768W(C6398.m14641W(interfaceC4524), c19550M44392b0);
        } catch (C17796 e) {
            throw new C17796("Unable to obtain OffsetDateTime from TemporalAccessor: " + interfaceC4524 + " of type " + interfaceC4524.getClass().getName(), e);
        }
    }

    public static C21151 parse(CharSequence charSequence) {
        String string;
        C8349 c8349 = C8349.f22319g;
        C12826.requireNonNull(c8349, "formatter");
        C10500 c10500 = new C10500(1);
        c8349.getClass();
        C12826.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C12826.requireNonNull(c10500, "query");
        try {
            return (C21151) c8349.m19269a(charSequence).mo6950T(c10500);
        } catch (C14621 e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            C14621 c14621 = new C14621("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw c14621;
        }
    }

    public C21151(C24009 c24009, C19550 c19550) {
        this.f66457a = (C24009) C12826.requireNonNull(c24009, "dateTime");
        this.f66458b = (C19550) C12826.requireNonNull(c19550, "offset");
    }

    /* JADX INFO: renamed from: Y */
    public final C21151 m47770Y(C24009 c24009, C19550 c19550) {
        return (this.f66457a == c24009 && this.f66458b.equals(c19550)) ? this : new C21151(c24009, c19550);
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
            if (interfaceC11901 != EnumC19947.INSTANT_SECONDS && interfaceC11901 != EnumC19947.OFFSET_SECONDS) {
                return this.f66457a.mo6953n(interfaceC11901);
            }
            return ((EnumC19947) interfaceC11901).f60552b;
        }
        return interfaceC11901.mo3655m(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            int i = AbstractC18605.f55571a[((EnumC19947) interfaceC11901).ordinal()];
            if (i == 1) {
                throw new C13242("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f66458b.f59520b;
            }
            return this.f66457a.mo6952l(interfaceC11901);
        }
        return AbstractC7877.m18193a(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3652C(this);
        }
        int i = AbstractC18605.f55571a[((EnumC19947) interfaceC11901).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f66457a.mo6949G(interfaceC11901) : this.f66458b.f59520b;
        }
        C24009 c24009 = this.f66457a;
        C19550 c19550 = this.f66458b;
        c24009.getClass();
        return AbstractC24029.m53241j(c24009, c19550);
    }

    public int getNano() {
        return this.f66457a.f76254b.f25136d;
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        C24009 c24009 = this.f66457a;
        return m47770Y(c24009.m53190e0(c20480, c24009.f76254b), this.f66458b);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: c */
    public final InterfaceC17263 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
            int i = AbstractC18605.f55571a[enumC19947.ordinal()];
            if (i == 1) {
                return m47768W(C6398.ofEpochSecond(j, getNano()), this.f66458b);
            }
            if (i == 2) {
                return m47770Y(this.f66457a, C19550.m44395e0(enumC19947.f60552b.m53121a(j, enumC19947)));
            }
            return m47770Y(this.f66457a.mo7152c(j, interfaceC11901), this.f66458b);
        }
        return (C21151) interfaceC11901.mo3653G(this, j);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C21151 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (interfaceC5865 instanceof EnumC10559) {
            return m47770Y(this.f66457a.mo7153d(j, interfaceC5865), this.f66458b);
        }
        return (C21151) interfaceC5865.mo13170m(this, j);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return j == Long.MIN_VALUE ? mo7153d(C14849.FOREVER_NS, enumC10559).mo7153d(1L, enumC10559) : mo7153d(-j, enumC10559);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20682d || c10500 == AbstractC7877.f20683e) {
            return this.f66458b;
        }
        if (c10500 == AbstractC7877.f20679a) {
            return null;
        }
        if (c10500 == AbstractC7877.f20684f) {
            return this.f66457a.f76253a;
        }
        if (c10500 == AbstractC7877.f20685g) {
            return this.f66457a.f76254b;
        }
        if (c10500 == AbstractC7877.f20680b) {
            return C10361.f28676c;
        }
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.NANOS;
        }
        return c10500.m24242h(this);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(this.f66457a.f76253a.mo16118H(), EnumC19947.EPOCH_DAY).mo7152c(this.f66457a.f76254b.m21356h0(), EnumC19947.NANO_OF_DAY).mo7152c(this.f66458b.f59520b, EnumC19947.OFFSET_SECONDS);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        C21151 c21151M47767V = m47767V(interfaceC17263);
        if (interfaceC5865 instanceof EnumC10559) {
            C19550 c19550 = this.f66458b;
            if (!c19550.equals(c21151M47767V.f66458b)) {
                c21151M47767V = new C21151(c21151M47767V.f66457a.m53187b0(c19550.f59520b - c21151M47767V.f66458b.f59520b), c19550);
            }
            return this.f66457a.mo7155g(c21151M47767V.f66457a, interfaceC5865);
        }
        return interfaceC5865.mo13169l(this, c21151M47767V);
    }

    public C6398 toInstant() {
        C24009 c24009 = this.f66457a;
        C19550 c19550 = this.f66458b;
        c24009.getClass();
        return AbstractC24029.m53243l(c24009, c19550);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21151) {
            C21151 c21151 = (C21151) obj;
            if (this.f66457a.equals(c21151.f66457a) && this.f66458b.equals(c21151.f66458b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f66457a.hashCode() ^ this.f66458b.f59520b;
    }

    public final String toString() {
        return this.f66457a.toString() + this.f66458b.f59521c;
    }

    private Object writeReplace() {
        return new C21959((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
