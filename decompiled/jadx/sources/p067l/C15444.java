package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܰۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15444 implements InterfaceC20276, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ */
    public static final C15444 f44128 = new C15444(C17259.f51368, C11226.f31218);

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ int f44129 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC5861 f44130;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC5861 f44131;

    /* JADX INFO: renamed from: ܿ */
    public static C15444 m35184() {
        return new C15444(new C10555(0), new C10555(0));
    }

    /* JADX INFO: renamed from: ܽ */
    public static C15444 m35183(Comparable comparable) {
        return new C15444(C17259.f51368, AbstractC5861.m13145(comparable));
    }

    @Override // p067l.InterfaceC20276
    @Deprecated
    public final boolean apply(Object obj) {
        return m35188((Comparable) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15444 m35179(AbstractC5861 abstractC5861, AbstractC5861 abstractC5862) {
        return new C15444(abstractC5861, abstractC5862);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15444 m35182(Integer num, Integer num2) {
        return new C15444(AbstractC5861.m13146(num), new C4520(num2));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15444 m35181(Comparable comparable, EnumC5901 enumC5901) {
        int i = C13434.f37729[enumC5901.ordinal()];
        if (i == 1) {
            return new C15444(C17259.f51368, AbstractC5861.m13146(comparable));
        }
        if (i == 2) {
            return m35183(comparable);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15444 m35180(Comparable comparable) {
        return new C15444(AbstractC5861.m13146(comparable), C11226.f31218);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15444 m35176(Comparable comparable, EnumC5901 enumC5901) {
        int i = C13434.f37729[enumC5901.ordinal()];
        if (i == 1) {
            return new C15444(AbstractC5861.m13145(comparable), C11226.f31218);
        }
        if (i == 2) {
            return m35180(comparable);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C15444 m35185() {
        return f44128;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15444 m35178(Integer num, Integer num2) {
        return new C15444(new C4520(num), new C10555(num2));
    }

    public C15444(AbstractC5861 abstractC5861, AbstractC5861 abstractC5862) {
        abstractC5861.getClass();
        this.f44130 = abstractC5861;
        abstractC5862.getClass();
        this.f44131 = abstractC5862;
        if (abstractC5861.compareTo(abstractC5862) > 0 || abstractC5861 == C11226.f31218 || abstractC5862 == C17259.f51368) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            abstractC5861.mo9570(sb2);
            sb2.append("..");
            abstractC5862.mo9573(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final Comparable m35190() {
        return this.f44130.mo13148();
    }

    /* JADX INFO: renamed from: ܽ */
    public final Comparable m35192() {
        return this.f44131.mo13148();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35187() {
        return this.f44130.equals(this.f44131);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35189(C15444 c15444) {
        return this.f44130.compareTo(c15444.f44130) <= 0 && this.f44131.compareTo(c15444.f44131) >= 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m35193(C15444 c15444) {
        return this.f44130.compareTo(c15444.f44131) <= 0 && c15444.f44130.compareTo(this.f44131) <= 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15444 m35191(C15444 c15444) {
        AbstractC5861 abstractC5861 = c15444.f44130;
        AbstractC5861 abstractC5862 = this.f44130;
        int iMo13147 = abstractC5862.compareTo(abstractC5861);
        AbstractC5861 abstractC5863 = c15444.f44131;
        AbstractC5861 abstractC5864 = this.f44131;
        int iMo13148 = abstractC5864.compareTo(abstractC5863);
        if (iMo13147 >= 0 && iMo13148 <= 0) {
            return this;
        }
        if (iMo13147 <= 0 && iMo13148 >= 0) {
            return c15444;
        }
        if (iMo13147 < 0) {
            abstractC5862 = c15444.f44130;
        }
        if (iMo13148 <= 0) {
            abstractC5863 = abstractC5864;
        }
        C6194.m14031(abstractC5862.compareTo(abstractC5863) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, c15444);
        return new C15444(abstractC5862, abstractC5863);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C15444 m35194(C15444 c15444) {
        AbstractC5861 abstractC5861 = c15444.f44130;
        AbstractC5861 abstractC5862 = this.f44130;
        int iMo13147 = abstractC5862.compareTo(abstractC5861);
        AbstractC5861 abstractC5863 = c15444.f44131;
        AbstractC5861 abstractC5864 = this.f44131;
        int iMo13148 = abstractC5864.compareTo(abstractC5863);
        if (iMo13147 <= 0 && iMo13148 >= 0) {
            return this;
        }
        if (iMo13147 >= 0 && iMo13148 <= 0) {
            return c15444;
        }
        if (iMo13147 > 0) {
            abstractC5862 = c15444.f44130;
        }
        if (iMo13148 >= 0) {
            abstractC5863 = abstractC5864;
        }
        return new C15444(abstractC5862, abstractC5863);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15444) {
            C15444 c15444 = (C15444) obj;
            if (this.f44130.equals(c15444.f44130) && this.f44131.equals(c15444.f44131)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f44130.hashCode() * 31) + this.f44131.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f44130.mo9570(sb);
        sb.append("..");
        this.f44131.mo9573(sb);
        return sb.toString();
    }

    public Object readResolve() {
        C15444 c15444 = f44128;
        return equals(c15444) ? c15444 : this;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15444 m35177(Comparable comparable, EnumC5901 enumC5901, Comparable comparable2, EnumC5901 enumC5902) {
        enumC5901.getClass();
        enumC5902.getClass();
        EnumC5901 enumC5903 = EnumC5901.OPEN;
        return new C15444(enumC5901 == enumC5903 ? AbstractC5861.m13145(comparable) : AbstractC5861.m13146(comparable), enumC5902 == enumC5903 ? AbstractC5861.m13146(comparable2) : AbstractC5861.m13145(comparable2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15444 m35186(AbstractC20614 abstractC20614) {
        abstractC20614.getClass();
        AbstractC5861 abstractC5861 = this.f44130;
        AbstractC5861 abstractC5861Mo13149 = abstractC5861.mo13149(abstractC20614);
        AbstractC5861 abstractC5862 = this.f44131;
        AbstractC5861 abstractC5861Mo131410 = abstractC5862.mo13149(abstractC20614);
        return (abstractC5861Mo13149 == abstractC5861 && abstractC5861Mo131410 == abstractC5862) ? this : new C15444(abstractC5861Mo13149, abstractC5861Mo131410);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35188(Comparable comparable) {
        comparable.getClass();
        return this.f44130.mo9571(comparable) && !this.f44131.mo9571(comparable);
    }
}
