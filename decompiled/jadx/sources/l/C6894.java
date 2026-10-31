package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۜܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6894 extends AbstractC20573 {
    public final boolean s;
    public final Comparator t;

    public C6894(AbstractC11401 abstractC11401) {
        super(abstractC11401, EnumC7330.q | EnumC7330.o);
        this.s = true;
        this.t = EnumC7413.INSTANCE;
    }

    public C6894(AbstractC11401 abstractC11401, Comparator comparator) {
        super(abstractC11401, EnumC7330.q | EnumC7330.p);
        this.s = false;
        this.t = (Comparator) C11003.requireNonNull(comparator);
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        C11003.requireNonNull(interfaceC0585);
        if (EnumC7330.SORTED.s(i) && this.s) {
            return interfaceC0585;
        }
        if (EnumC7330.SIZED.s(i)) {
            return new C10464(interfaceC0585, this.t);
        }
        return new C1249(interfaceC0585, this.t);
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 n0(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        if (EnumC7330.SORTED.s(((AbstractC12725) abstractC9198).m) && this.s) {
            return abstractC9198.Q(interfaceC15234, false, intFunction);
        }
        Object[] objArrM = abstractC9198.Q(interfaceC15234, true, intFunction).m(intFunction);
        Arrays.sort(objArrM, this.t);
        return new C0110(objArrM);
    }
}
