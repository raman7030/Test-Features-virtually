package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܿ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17208 extends AbstractC18456 implements InterfaceC5483 {
    public static final C12453 c;
    public static final C12453 d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.AbstractC18456, l.InterfaceC0585
    public final void accept(double d2) {
        n(Double.valueOf(d2));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C4652(((Double) this.b).doubleValue());
        }
        return null;
    }

    static {
        EnumC8578 enumC8578 = EnumC8578.DOUBLE_VALUE;
        C10964 c10964 = new C10964(15);
        C3639 c3639 = new C3639(10);
        C4652 c4652 = C4652.c;
        c = new C12453(true, enumC8578, c4652, c10964, c3639);
        d = new C12453(false, enumC8578, c4652, new C10964(15), new C3639(10));
    }
}
