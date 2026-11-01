package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܿ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18723 extends AbstractC19909 implements InterfaceC7580 {

    /* JADX INFO: renamed from: c */
    public static final C14204 f55940c;

    /* JADX INFO: renamed from: d */
    public static final C14204 f55941d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // p067l.AbstractC19909, p067l.InterfaceC2925
    public final void accept(double d) {
        m45213n(Double.valueOf(d));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f60455a) {
            return new C6790(((Double) this.f60456b).doubleValue());
        }
        return null;
    }

    static {
        EnumC10521 enumC10521 = EnumC10521.DOUBLE_VALUE;
        C12789 c12789 = new C12789(15);
        C5827 c5827 = new C5827(10);
        C6790 c6790 = C6790.f17582c;
        f55940c = new C14204(true, enumC10521, c6790, c12789, c5827);
        f55941d = new C14204(false, enumC10521, c6790, new C12789(15), new C5827(10));
    }
}
