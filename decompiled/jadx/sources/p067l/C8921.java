package p067l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۜܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8921 extends AbstractC21921 {

    /* JADX INFO: renamed from: s */
    public final boolean f24172s;

    /* JADX INFO: renamed from: t */
    public final Comparator f24173t;

    public C8921(AbstractC13204 abstractC13204) {
        super(abstractC13204, EnumC9335.f25422q | EnumC9335.f25420o);
        this.f24172s = true;
        this.f24173t = EnumC9414.INSTANCE;
    }

    public C8921(AbstractC13204 abstractC13204, Comparator comparator) {
        super(abstractC13204, EnumC9335.f25422q | EnumC9335.f25421p);
        this.f24172s = false;
        this.f24173t = (Comparator) C12826.requireNonNull(comparator);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        C12826.requireNonNull(interfaceC2925);
        if (EnumC9335.SORTED.m21660s(i) && this.f24172s) {
            return interfaceC2925;
        }
        if (EnumC9335.SIZED.m21660s(i)) {
            return new C12314(interfaceC2925, this.f24173t);
        }
        return new C3556(interfaceC2925, this.f24173t);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC7324 mo12124n0(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        if (EnumC9335.SORTED.m21660s(((AbstractC14463) abstractC11111).f41316m) && this.f24172s) {
            return abstractC11111.mo25627Q(interfaceC16847, false, intFunction);
        }
        Object[] objArrMo3499m = abstractC11111.mo25627Q(interfaceC16847, true, intFunction).mo3499m(intFunction);
        Arrays.sort(objArrMo3499m, this.f24173t);
        return new C2473(objArrMo3499m);
    }
}
