package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20736 extends AbstractC19909 implements InterfaceC12274 {

    /* JADX INFO: renamed from: c */
    public static final C14204 f63984c;

    /* JADX INFO: renamed from: d */
    public static final C14204 f63985d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.AbstractC19909, p067l.InterfaceC2925
    public final void accept(int i) {
        m45213n(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f60455a) {
            return new C19531(((Integer) this.f60456b).intValue());
        }
        return null;
    }

    static {
        EnumC10521 enumC10521 = EnumC10521.INT_VALUE;
        C12789 c12789 = new C12789(16);
        C5827 c5827 = new C5827(11);
        C19531 c19531 = C19531.f59472c;
        f63984c = new C14204(true, enumC10521, c19531, c12789, c5827);
        f63985d = new C14204(false, enumC10521, c19531, new C12789(16), new C5827(11));
    }
}
