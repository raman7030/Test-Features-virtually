package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ۙ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7008 extends AbstractC13774 {

    /* JADX INFO: renamed from: d */
    public static final C20480 f18257d = C20480.m46187h0(1873, 1, 1);
    public static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a */
    public final transient C20480 f18258a;

    /* JADX INFO: renamed from: b */
    public final transient C5667 f18259b;

    /* JADX INFO: renamed from: c */
    public final transient int f18260c;

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: I */
    public final InterfaceC15784 mo16119I(C9257 c9257) {
        return new C18407(this, c9257);
    }

    public C7008(C20480 c20480) {
        if (c20480.m46196c0(f18257d)) {
            throw new C17796("JapaneseDate before Meiji 6 is not supported");
        }
        C5667 c5667M12624j = C5667.m12624j(c20480);
        this.f18259b = c5667M12624j;
        this.f18260c = (c20480.f63259a - c5667M12624j.f13789b.f63259a) + 1;
        this.f18258a = c20480;
    }

    public C7008(C5667 c5667, int i, C20480 c20480) {
        if (c20480.m46196c0(f18257d)) {
            throw new C17796("JapaneseDate before Meiji 6 is not supported");
        }
        this.f18259b = c5667;
        this.f18260c = i;
        this.f18258a = c20480;
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: a */
    public final InterfaceC4997 mo16126a() {
        return C23772.f75602c;
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    public final int hashCode() {
        C23772.f75602c.getClass();
        return this.f18258a.hashCode() ^ (-688086063);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: K */
    public final InterfaceC6338 mo16120K() {
        return this.f18259b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: Q */
    public final int mo16122Q() {
        int iMo16122Q;
        C5667 c5667M12626k = this.f18259b.m12626k();
        if (c5667M12626k != null) {
            C20480 c20480 = c5667M12626k.f13789b;
            if (c20480.f63259a == this.f18258a.f63259a) {
                iMo16122Q = c20480.m46194a0() - 1;
            } else {
                iMo16122Q = this.f18258a.mo16122Q();
            }
        } else {
            iMo16122Q = this.f18258a.mo16122Q();
        }
        return this.f18260c == 1 ? iMo16122Q - (this.f18259b.f13789b.m46194a0() - 1) : iMo16122Q;
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114, p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.ALIGNED_DAY_OF_WEEK_IN_MONTH || interfaceC11901 == EnumC19947.ALIGNED_DAY_OF_WEEK_IN_YEAR || interfaceC11901 == EnumC19947.ALIGNED_WEEK_OF_MONTH || interfaceC11901 == EnumC19947.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (interfaceC11901 instanceof EnumC19947) {
            return ((EnumC19947) interfaceC11901).isDateBased();
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3655m(this);
        }
        if (!mo6951e(interfaceC11901)) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        int i = AbstractC21761.f68515a[enumC19947.ordinal()];
        if (i == 1) {
            return C23970.m53119f(1L, this.f18258a.m46197d0());
        }
        if (i == 2) {
            return C23970.m53119f(1L, mo16122Q());
        }
        if (i != 3) {
            return C23772.f75602c.mo10588v(enumC19947);
        }
        C5667 c5667 = this.f18259b;
        int i2 = c5667.f13789b.f63259a;
        C5667 c5667M12626k = c5667.m12626k();
        return c5667M12626k != null ? C23970.m53119f(1L, (c5667M12626k.f13789b.f63259a - i2) + 1) : C23970.m53119f(1L, 999999999 - i2);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3652C(this);
        }
        switch (AbstractC21761.f68515a[((EnumC19947) interfaceC11901).ordinal()]) {
            case 2:
                return this.f18260c == 1 ? (this.f18258a.m46194a0() - this.f18259b.f13789b.m46194a0()) + 1 : this.f18258a.m46194a0();
            case 3:
                return this.f18260c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
            case 8:
                return this.f18259b.f13788a;
            default:
                return this.f18258a.mo6949G(interfaceC11901);
        }
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C7008 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
            if (mo6949G(enumC19947) == j) {
                return this;
            }
            int[] iArr = AbstractC21761.f68515a;
            int i = iArr[enumC19947.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                C23772 c23772 = C23772.f75602c;
                int iM53121a = c23772.mo10588v(enumC19947).m53121a(j, enumC19947);
                int i2 = iArr[enumC19947.ordinal()];
                if (i2 == 3) {
                    return m16130d0(this.f18258a.m46207s0(c23772.mo10591z(this.f18259b, iM53121a)));
                }
                if (i2 == 8) {
                    return m16130d0(this.f18258a.m46207s0(c23772.mo10591z(C5667.m12625o(iM53121a), this.f18260c)));
                }
                if (i2 == 9) {
                    return m16130d0(this.f18258a.m46207s0(iM53121a));
                }
            }
            return m16130d0(this.f18258a.mo7152c(j, interfaceC11901));
        }
        return (C7008) super.mo7152c(j, interfaceC11901);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: B */
    public final InterfaceC15114 mo7158m(InterfaceC5195 interfaceC5195) {
        return (C7008) super.mo7158m(interfaceC5195);
    }

    /* JADX INFO: renamed from: c0 */
    public final C7008 m16129c0(C10500 c10500) {
        return (C7008) super.mo7158m(c10500);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return (C7008) super.mo7158m(c20480);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: N */
    public final InterfaceC15114 mo16121N(InterfaceC13912 interfaceC13912) {
        return (C7008) super.mo16121N(interfaceC13912);
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: Z */
    public final InterfaceC15114 mo16125Z(long j) {
        return m16130d0(this.f18258a.m46204o0(j));
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: Y */
    public final InterfaceC15114 mo16124Y(long j) {
        return m16130d0(this.f18258a.m46202m0(j));
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: X */
    public final InterfaceC15114 mo16123X(long j) {
        return m16130d0(this.f18258a.m46201l0(j));
    }

    /* JADX INFO: renamed from: a0 */
    public final C7008 m16127a0(long j, EnumC10559 enumC10559) {
        return (C7008) super.mo7153d(j, (InterfaceC5865) enumC10559);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114, p067l.InterfaceC17263
    /* JADX INFO: renamed from: d */
    public final InterfaceC15114 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        return (C7008) super.mo7153d(j, interfaceC5865);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: d */
    public final InterfaceC17263 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        return (C7008) super.mo7153d(j, interfaceC5865);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return (C7008) super.mo16131w(j, enumC10559);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: w */
    public final InterfaceC15114 mo16131w(long j, InterfaceC5865 interfaceC5865) {
        return (C7008) super.mo16131w(j, interfaceC5865);
    }

    /* JADX INFO: renamed from: d0 */
    public final C7008 m16130d0(C20480 c20480) {
        return c20480.equals(this.f18258a) ? this : new C7008(c20480);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: H */
    public final long mo16118H() {
        return this.f18258a.mo16118H();
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7008) {
            return this.f18258a.equals(((C7008) obj).f18258a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C9750((byte) 4, this);
    }
}
