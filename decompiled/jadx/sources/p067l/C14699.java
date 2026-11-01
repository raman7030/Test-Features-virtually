package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۬۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14699 extends AbstractC19909 implements InterfaceC16336 {

    /* JADX INFO: renamed from: c */
    public static final C14204 f41924c;

    /* JADX INFO: renamed from: d */
    public static final C14204 f41925d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.AbstractC19909, p067l.InterfaceC2925
    public final void accept(long j) {
        m45213n(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f60455a) {
            return new C14166(((Long) this.f60456b).longValue());
        }
        return null;
    }

    static {
        EnumC10521 enumC10521 = EnumC10521.LONG_VALUE;
        C12789 c12789 = new C12789(17);
        C5827 c5827 = new C5827(12);
        C14166 c14166 = C14166.f40405c;
        f41924c = new C14204(true, enumC10521, c14166, c12789, c5827);
        f41925d = new C14204(false, enumC10521, c14166, new C12789(17), new C5827(12));
    }
}
