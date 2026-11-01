package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ۜ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9020 extends AbstractC13774 {
    public static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a */
    public final transient C20480 f24485a;

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: I */
    public final InterfaceC15784 mo16119I(C9257 c9257) {
        return new C18407(this, c9257);
    }

    public C9020(C20480 c20480) {
        C12826.requireNonNull(c20480, "isoDate");
        this.f24485a = c20480;
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: a */
    public final InterfaceC4997 mo16126a() {
        return C19749.f60075c;
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    public final int hashCode() {
        C19749.f60075c.getClass();
        return this.f24485a.hashCode() ^ 146118545;
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: K */
    public final InterfaceC6338 mo16120K() {
        return m20887a0() >= 1 ? EnumC11703.f32630BE : EnumC11703.BEFORE_BE;
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
        int i = AbstractC16395.f48187a[enumC19947.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.f24485a.mo6953n(interfaceC11901);
        }
        if (i != 4) {
            return C19749.f60075c.mo10588v(enumC19947);
        }
        C23970 c23970 = EnumC19947.YEAR.f60552b;
        return C23970.m53119f(1L, m20887a0() <= 0 ? (-(c23970.f76156a + 543)) + 1 : 543 + c23970.f76159d);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            int i = AbstractC16395.f48187a[((EnumC19947) interfaceC11901).ordinal()];
            if (i == 4) {
                int iM20887a0 = m20887a0();
                if (iM20887a0 < 1) {
                    iM20887a0 = 1 - iM20887a0;
                }
                return iM20887a0;
            }
            if (i == 5) {
                return ((((long) m20887a0()) * 12) + ((long) this.f24485a.f63260b)) - 1;
            }
            if (i == 6) {
                return m20887a0();
            }
            if (i != 7) {
                return this.f24485a.mo6949G(interfaceC11901);
            }
            return m20887a0() < 1 ? 0 : 1;
        }
        return interfaceC11901.mo3652C(this);
    }

    /* JADX INFO: renamed from: a0 */
    public final int m20887a0() {
        return this.f24485a.f63259a + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C9020 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        int iM53121a;
        int i;
        if (interfaceC11901 instanceof EnumC19947) {
            EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
            if (mo6949G(enumC19947) == j) {
                return this;
            }
            int[] iArr = AbstractC16395.f48187a;
            int i2 = iArr[enumC19947.ordinal()];
            if (i2 == 4) {
                iM53121a = C19749.f60075c.mo10588v(enumC19947).m53121a(j, enumC19947);
                i = iArr[enumC19947.ordinal()];
                if (i != 4) {
                    C20480 c20480 = this.f24485a;
                    if (m20887a0() < 1) {
                        iM53121a = 1 - iM53121a;
                    }
                    return m20889c0(c20480.m46207s0(iM53121a - 543));
                }
                if (i != 6) {
                    return m20889c0(this.f24485a.m46207s0(iM53121a - 543));
                }
                if (i == 7) {
                    return m20889c0(this.f24485a.m46207s0((-542) - m20887a0()));
                }
            } else {
                if (i2 == 5) {
                    C19749.f60075c.mo10588v(enumC19947).m53122b(j, enumC19947);
                    long jM20887a0 = ((long) m20887a0()) * 12;
                    C20480 c20481 = this.f24485a;
                    return m20889c0(c20481.m46202m0(j - ((jM20887a0 + ((long) c20481.f63260b)) - 1)));
                }
                if (i2 == 6 || i2 == 7) {
                    iM53121a = C19749.f60075c.mo10588v(enumC19947).m53121a(j, enumC19947);
                    i = iArr[enumC19947.ordinal()];
                    if (i != 4) {
                        C20480 c20482 = this.f24485a;
                        if (m20887a0() < 1) {
                            iM53121a = 1 - iM53121a;
                        }
                        return m20889c0(c20482.m46207s0(iM53121a - 543));
                    }
                    if (i != 6) {
                        return m20889c0(this.f24485a.m46207s0(iM53121a - 543));
                    }
                    if (i == 7) {
                        return m20889c0(this.f24485a.m46207s0((-542) - m20887a0()));
                    }
                }
            }
            return m20889c0(this.f24485a.mo7152c(j, interfaceC11901));
        }
        return (C9020) super.mo7152c(j, interfaceC11901);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: B */
    public final InterfaceC15114 mo7158m(InterfaceC5195 interfaceC5195) {
        return (C9020) super.mo7158m(interfaceC5195);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return (C9020) super.mo7158m(c20480);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: N */
    public final InterfaceC15114 mo16121N(InterfaceC13912 interfaceC13912) {
        return (C9020) super.mo16121N(interfaceC13912);
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: Z */
    public final InterfaceC15114 mo16125Z(long j) {
        return m20889c0(this.f24485a.m46204o0(j));
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: Y */
    public final InterfaceC15114 mo16124Y(long j) {
        return m20889c0(this.f24485a.m46202m0(j));
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: X */
    public final InterfaceC15114 mo16123X(long j) {
        return m20889c0(this.f24485a.m46201l0(j));
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114, p067l.InterfaceC17263
    /* JADX INFO: renamed from: d */
    public final InterfaceC15114 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        return (C9020) super.mo7153d(j, interfaceC5865);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: d */
    public final InterfaceC17263 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        return (C9020) super.mo7153d(j, interfaceC5865);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return (C9020) super.mo16131w(j, enumC10559);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: w */
    public final InterfaceC15114 mo16131w(long j, InterfaceC5865 interfaceC5865) {
        return (C9020) super.mo16131w(j, interfaceC5865);
    }

    /* JADX INFO: renamed from: c0 */
    public final C9020 m20889c0(C20480 c20480) {
        return c20480.equals(this.f24485a) ? this : new C9020(c20480);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: H */
    public final long mo16118H() {
        return this.f24485a.mo16118H();
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9020) {
            return this.f24485a.equals(((C9020) obj).f24485a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C9750((byte) 8, this);
    }
}
