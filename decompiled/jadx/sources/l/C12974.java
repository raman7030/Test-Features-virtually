package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۬۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12974 extends AbstractC18456 implements InterfaceC14696 {
    public static final C12453 c;
    public static final C12453 d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // l.AbstractC18456, l.InterfaceC0585
    public final void accept(long j) {
        n(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C12413(((Long) this.b).longValue());
        }
        return null;
    }

    static {
        EnumC8578 enumC8578 = EnumC8578.LONG_VALUE;
        C10964 c10964 = new C10964(17);
        C3639 c3639 = new C3639(12);
        C12413 c12413 = C12413.c;
        c = new C12453(true, enumC8578, c12413, c10964, c3639);
        d = new C12453(false, enumC8578, c12413, new C10964(17), new C3639(12));
    }
}
