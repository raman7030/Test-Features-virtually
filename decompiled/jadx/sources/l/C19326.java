package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19326 extends AbstractC18456 implements InterfaceC10422 {
    public static final C12453 c;
    public static final C12453 d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.AbstractC18456, l.InterfaceC0585
    public final void accept(int i) {
        n(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C18058(((Integer) this.b).intValue());
        }
        return null;
    }

    static {
        EnumC8578 enumC8578 = EnumC8578.INT_VALUE;
        C10964 c10964 = new C10964(16);
        C3639 c3639 = new C3639(11);
        C18058 c18058 = C18058.c;
        c = new C12453(true, enumC8578, c18058, c10964, c3639);
        d = new C12453(false, enumC8578, c18058, new C10964(16), new C3639(11));
    }
}
