package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5727 extends AbstractC7068 implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final C5727 f14028c = new C5727();
    public static final long serialVersionUID = 1039765215346859963L;

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: k */
    public final String mo10584k() {
        return "Minguo";
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: o */
    public final String mo10585o() {
        return "roc";
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: y */
    public final InterfaceC6338 mo10590y(int i) {
        if (i == 0) {
            return EnumC24502.BEFORE_ROC;
        }
        if (i == 1) {
            return EnumC24502.ROC;
        }
        throw new C17796("Invalid era: " + i);
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: M */
    public final InterfaceC15114 mo10579M(int i, int i2, int i3) {
        return new C8409(C20480.m46187h0(i + 1911, i2, i3));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: q */
    public final InterfaceC15114 mo10587q(int i, int i2) {
        return new C8409(C20480.m46189j0(i + 1911, i2));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: j */
    public final InterfaceC15114 mo10583j(long j) {
        return new C8409(C20480.m46188i0(j));
    }

    @Override // p067l.AbstractC7068
    /* JADX INFO: renamed from: m */
    public final InterfaceC15114 mo12725m() {
        return new C8409(C20480.m46185X(C20480.m46186g0(AbstractC11092.m25535a())));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: E */
    public final InterfaceC15114 mo10577E(InterfaceC4524 interfaceC4524) {
        if (interfaceC4524 instanceof C8409) {
            return (C8409) interfaceC4524;
        }
        return new C8409(C20480.m46185X(interfaceC4524));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: S */
    public final boolean mo10582S(long j) {
        return C10361.f28676c.mo10582S(j + 1911);
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: z */
    public final int mo10591z(InterfaceC6338 interfaceC6338, int i) {
        if (interfaceC6338 instanceof EnumC24502) {
            return interfaceC6338 == EnumC24502.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: x */
    public final List mo10589x() {
        return AbstractC24029.m53212B(EnumC24502.values());
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: v */
    public final C23970 mo10588v(EnumC19947 enumC19947) {
        int i = AbstractC21821.f68656a[enumC19947.ordinal()];
        if (i == 1) {
            C23970 c23970 = EnumC19947.PROLEPTIC_MONTH.f60552b;
            return C23970.m53119f(c23970.f76156a - 22932, c23970.f76159d - 22932);
        }
        if (i == 2) {
            C23970 c23971 = EnumC19947.YEAR.f60552b;
            return C23970.m53120g(1L, c23971.f76159d - 1911, (-c23971.f76156a) + 1912);
        }
        if (i != 3) {
            return enumC19947.f60552b;
        }
        C23970 c23972 = EnumC19947.YEAR.f60552b;
        return C23970.m53119f(c23972.f76156a - 1911, c23972.f76159d - 1911);
    }

    @Override // p067l.AbstractC7068, p067l.InterfaceC4997
    /* JADX INFO: renamed from: O */
    public final InterfaceC15114 mo10580O(Map map, EnumC18645 enumC18645) {
        return (C8409) super.mo10580O(map, enumC18645);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: P */
    public final InterfaceC23832 mo10581P(C6398 c6398, AbstractC7739 abstractC7739) {
        return C11032.m25441W(this, c6398, abstractC7739);
    }

    public Object writeReplace() {
        return new C9750((byte) 1, this);
    }
}
