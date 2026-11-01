package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ۛ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8409 extends AbstractC13774 {
    public static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a */
    public final transient C20480 f22550a;

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: I */
    public final InterfaceC15784 mo16119I(C9257 c9257) {
        return new C18407(this, c9257);
    }

    public C8409(C20480 c20480) {
        C12826.requireNonNull(c20480, "isoDate");
        this.f22550a = c20480;
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: a */
    public final InterfaceC4997 mo16126a() {
        return C5727.f14028c;
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    public final int hashCode() {
        C5727.f14028c.getClass();
        return this.f22550a.hashCode() ^ (-1990173233);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: K */
    public final InterfaceC6338 mo16120K() {
        return m19590a0() >= 1 ? EnumC24502.ROC : EnumC24502.BEFORE_ROC;
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3655m(this);
        }
        if (!AbstractC24029.m53237f(this, interfaceC11901)) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        int i = AbstractC14444.f41271a[enumC19947.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.f22550a.mo6953n(interfaceC11901);
        }
        if (i != 4) {
            return C5727.f14028c.mo10588v(enumC19947);
        }
        C23970 c23970 = EnumC19947.YEAR.f60552b;
        return C23970.m53119f(1L, m19590a0() <= 0 ? (-c23970.f76156a) + 1912 : c23970.f76159d - 1911);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            int i = AbstractC14444.f41271a[((EnumC19947) interfaceC11901).ordinal()];
            if (i == 4) {
                int iM19590a0 = m19590a0();
                if (iM19590a0 < 1) {
                    iM19590a0 = 1 - iM19590a0;
                }
                return iM19590a0;
            }
            if (i == 5) {
                return ((((long) m19590a0()) * 12) + ((long) this.f22550a.f63260b)) - 1;
            }
            if (i == 6) {
                return m19590a0();
            }
            if (i != 7) {
                return this.f22550a.mo6949G(interfaceC11901);
            }
            return m19590a0() < 1 ? 0 : 1;
        }
        return interfaceC11901.mo3652C(this);
    }

    /* JADX INFO: renamed from: a0 */
    public final int m19590a0() {
        return this.f22550a.f63259a - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C8409 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        int iM53121a;
        int i;
        int i2;
        if (interfaceC11901 instanceof EnumC19947) {
            EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
            if (mo6949G(enumC19947) == j) {
                return this;
            }
            int[] iArr = AbstractC14444.f41271a;
            int i3 = iArr[enumC19947.ordinal()];
            if (i3 == 4) {
                iM53121a = C5727.f14028c.mo10588v(enumC19947).m53121a(j, enumC19947);
                i = iArr[enumC19947.ordinal()];
                if (i != 4) {
                    C20480 c20480 = this.f22550a;
                    if (m19590a0() >= 1) {
                        i2 = iM53121a + 1911;
                    } else {
                        i2 = 1912 - iM53121a;
                    }
                    return m19592c0(c20480.m46207s0(i2));
                }
                if (i != 6) {
                    return m19592c0(this.f22550a.m46207s0(iM53121a + 1911));
                }
                if (i == 7) {
                    return m19592c0(this.f22550a.m46207s0(1912 - m19590a0()));
                }
            } else {
                if (i3 == 5) {
                    C5727.f14028c.mo10588v(enumC19947).m53122b(j, enumC19947);
                    long jM19590a0 = ((long) m19590a0()) * 12;
                    C20480 c20481 = this.f22550a;
                    return m19592c0(c20481.m46202m0(j - ((jM19590a0 + ((long) c20481.f63260b)) - 1)));
                }
                if (i3 == 6 || i3 == 7) {
                    iM53121a = C5727.f14028c.mo10588v(enumC19947).m53121a(j, enumC19947);
                    i = iArr[enumC19947.ordinal()];
                    if (i != 4) {
                        C20480 c20482 = this.f22550a;
                        if (m19590a0() >= 1) {
                            i2 = iM53121a + 1911;
                        } else {
                            i2 = 1912 - iM53121a;
                        }
                        return m19592c0(c20482.m46207s0(i2));
                    }
                    if (i != 6) {
                        return m19592c0(this.f22550a.m46207s0(iM53121a + 1911));
                    }
                    if (i == 7) {
                        return m19592c0(this.f22550a.m46207s0(1912 - m19590a0()));
                    }
                }
            }
            return m19592c0(this.f22550a.mo7152c(j, interfaceC11901));
        }
        return (C8409) super.mo7152c(j, interfaceC11901);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: B */
    public final InterfaceC15114 mo7158m(InterfaceC5195 interfaceC5195) {
        return (C8409) super.mo7158m(interfaceC5195);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return (C8409) super.mo7158m(c20480);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: N */
    public final InterfaceC15114 mo16121N(InterfaceC13912 interfaceC13912) {
        return (C8409) super.mo16121N(interfaceC13912);
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: Z */
    public final InterfaceC15114 mo16125Z(long j) {
        return m19592c0(this.f22550a.m46204o0(j));
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: Y */
    public final InterfaceC15114 mo16124Y(long j) {
        return m19592c0(this.f22550a.m46202m0(j));
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: X */
    public final InterfaceC15114 mo16123X(long j) {
        return m19592c0(this.f22550a.m46201l0(j));
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114, p067l.InterfaceC17263
    /* JADX INFO: renamed from: d */
    public final InterfaceC15114 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        return (C8409) super.mo7153d(j, interfaceC5865);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: d */
    public final InterfaceC17263 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        return (C8409) super.mo7153d(j, interfaceC5865);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return (C8409) super.mo16131w(j, enumC10559);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: w */
    public final InterfaceC15114 mo16131w(long j, InterfaceC5865 interfaceC5865) {
        return (C8409) super.mo16131w(j, interfaceC5865);
    }

    /* JADX INFO: renamed from: c0 */
    public final C8409 m19592c0(C20480 c20480) {
        return c20480.equals(this.f22550a) ? this : new C8409(c20480);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: H */
    public final long mo16118H() {
        return this.f22550a.mo16118H();
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8409) {
            return this.f22550a.equals(((C8409) obj).f22550a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C9750((byte) 7, this);
    }
}
