package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܰۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13758 implements InterfaceC18842, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C13758 f41050 = new C13758(C15668.f48229, C9320.f28269);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f41051 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC3675 f41052;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC3675 f41053;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C13758 m33069() {
        return new C13758(new C8614(0), new C8614(0));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C13758 m33068(Comparable comparable) {
        return new C13758(C15668.f48229, AbstractC3675.m11185(comparable));
    }

    @Override // l.InterfaceC18842
    @Deprecated
    public final boolean apply(Object obj) {
        return m33073((Comparable) obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13758 m33064(AbstractC3675 abstractC3675, AbstractC3675 abstractC3676) {
        return new C13758(abstractC3675, abstractC3676);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13758 m33067(Integer num, Integer num2) {
        return new C13758(AbstractC3675.m11186(num), new C2264(num2));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13758 m33066(Comparable comparable, EnumC3717 enumC3717) {
        int i = C11643.f34732[enumC3717.ordinal()];
        if (i == 1) {
            return new C13758(C15668.f48229, AbstractC3675.m11186(comparable));
        }
        if (i == 2) {
            return m33068(comparable);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13758 m33065(Comparable comparable) {
        return new C13758(AbstractC3675.m11186(comparable), C9320.f28269);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13758 m33061(Comparable comparable, EnumC3717 enumC3717) {
        int i = C11643.f34732[enumC3717.ordinal()];
        if (i == 1) {
            return new C13758(AbstractC3675.m11185(comparable), C9320.f28269);
        }
        if (i == 2) {
            return m33065(comparable);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C13758 m33070() {
        return f41050;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13758 m33063(Integer num, Integer num2) {
        return new C13758(new C2264(num), new C8614(num2));
    }

    public C13758(AbstractC3675 abstractC3675, AbstractC3675 abstractC3676) {
        abstractC3675.getClass();
        this.f41052 = abstractC3675;
        abstractC3676.getClass();
        this.f41053 = abstractC3676;
        if (abstractC3675.compareTo(abstractC3676) > 0 || abstractC3675 == C9320.f28269 || abstractC3676 == C15668.f48229) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            abstractC3675.mo7488(sb2);
            sb2.append("..");
            abstractC3676.mo7491(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Comparable m33075() {
        return this.f41052.mo11188();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Comparable m33077() {
        return this.f41053.mo11188();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33072() {
        return this.f41052.equals(this.f41053);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33074(C13758 c13758) {
        return this.f41052.compareTo(c13758.f41052) <= 0 && this.f41053.compareTo(c13758.f41053) >= 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m33078(C13758 c13758) {
        return this.f41052.compareTo(c13758.f41053) <= 0 && c13758.f41052.compareTo(this.f41053) <= 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13758 m33076(C13758 c13758) {
        AbstractC3675 abstractC3675 = c13758.f41052;
        AbstractC3675 abstractC3676 = this.f41052;
        int iMo11187 = abstractC3676.compareTo(abstractC3675);
        AbstractC3675 abstractC3677 = c13758.f41053;
        AbstractC3675 abstractC3678 = this.f41053;
        int iMo11188 = abstractC3678.compareTo(abstractC3677);
        if (iMo11187 >= 0 && iMo11188 <= 0) {
            return this;
        }
        if (iMo11187 <= 0 && iMo11188 >= 0) {
            return c13758;
        }
        if (iMo11187 < 0) {
            abstractC3676 = c13758.f41052;
        }
        if (iMo11188 <= 0) {
            abstractC3677 = abstractC3678;
        }
        C4025.m12111(abstractC3676.compareTo(abstractC3677) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, c13758);
        return new C13758(abstractC3676, abstractC3677);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13758 m33079(C13758 c13758) {
        AbstractC3675 abstractC3675 = c13758.f41052;
        AbstractC3675 abstractC3676 = this.f41052;
        int iMo11187 = abstractC3676.compareTo(abstractC3675);
        AbstractC3675 abstractC3677 = c13758.f41053;
        AbstractC3675 abstractC3678 = this.f41053;
        int iMo11188 = abstractC3678.compareTo(abstractC3677);
        if (iMo11187 <= 0 && iMo11188 >= 0) {
            return this;
        }
        if (iMo11187 >= 0 && iMo11188 <= 0) {
            return c13758;
        }
        if (iMo11187 > 0) {
            abstractC3676 = c13758.f41052;
        }
        if (iMo11188 >= 0) {
            abstractC3677 = abstractC3678;
        }
        return new C13758(abstractC3676, abstractC3677);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13758) {
            C13758 c13758 = (C13758) obj;
            if (this.f41052.equals(c13758.f41052) && this.f41053.equals(c13758.f41053)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f41052.hashCode() * 31) + this.f41053.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f41052.mo7488(sb);
        sb.append("..");
        this.f41053.mo7491(sb);
        return sb.toString();
    }

    public Object readResolve() {
        C13758 c13758 = f41050;
        return equals(c13758) ? c13758 : this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13758 m33062(Comparable comparable, EnumC3717 enumC3717, Comparable comparable2, EnumC3717 enumC3718) {
        enumC3717.getClass();
        enumC3718.getClass();
        EnumC3717 enumC3719 = EnumC3717.OPEN;
        return new C13758(enumC3717 == enumC3719 ? AbstractC3675.m11185(comparable) : AbstractC3675.m11186(comparable), enumC3718 == enumC3719 ? AbstractC3675.m11186(comparable2) : AbstractC3675.m11185(comparable2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13758 m33071(AbstractC19198 abstractC19198) {
        abstractC19198.getClass();
        AbstractC3675 abstractC3675 = this.f41052;
        AbstractC3675 abstractC3675Mo11189 = abstractC3675.mo11189(abstractC19198);
        AbstractC3675 abstractC3676 = this.f41053;
        AbstractC3675 abstractC3675Mo111810 = abstractC3676.mo11189(abstractC19198);
        return (abstractC3675Mo11189 == abstractC3675 && abstractC3675Mo111810 == abstractC3676) ? this : new C13758(abstractC3675Mo11189, abstractC3675Mo111810);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33073(Comparable comparable) {
        comparable.getClass();
        return this.f41052.mo7489(comparable) && !this.f41053.mo7489(comparable);
    }
}
