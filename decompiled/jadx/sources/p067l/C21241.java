package p067l;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21241 implements InterfaceC22323 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C23663 f66776;

    public C21241(C23663 c23663) {
        this.f66776 = c23663;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [l.۠֫۠] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ܶ֫۠] */
    @Override // p067l.InterfaceC22323
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo18491(C4036 c4036, AbstractC12224 abstractC12224) {
        final C4848 c4848M33175 = C14514.m33175(abstractC12224);
        ?? r4 = new Function() { // from class: l.۠֫۠
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final C21241 c21241 = this.f27277;
                final C4848 c4848 = c4848M33175;
                return new Iterable() { // from class: l.᩸֫۠
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        final C21241 c21242 = c21241;
                        return C23428.m52115(c4848, new Function() { // from class: l.᩹֫۠
                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public /* synthetic */ Function mo56417andThen(Function function) {
                                return C22038.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public /* synthetic */ Function compose(Function function) {
                                return C22038.$default$compose(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return c21242.f66776.f75331.m49592((AbstractC12224) obj2).iterator();
                            }
                        });
                    }
                };
            }
        };
        ?? r5 = new BiFunction() { // from class: l.ܶ֫۠
            public /* synthetic */ BiFunction andThen(Function function) {
                return C18684.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C2417 c2417 = (C2417) obj;
                C21241 c21241 = this.f48601;
                c21241.getClass();
                Iterator it = c4848M33175.iterator();
                while (it.hasNext()) {
                    try {
                        return c21241.f66776.f75300.m48141(c2417, (AbstractC12224) it.next());
                    } catch (C21865 unused) {
                    }
                }
                return null;
            }
        };
        C14369 c14369 = new C14369(1);
        C23663 c23663 = this.f66776;
        return c23663.m52624(c4036, abstractC12224, (Function) r4, (BiFunction) r5, c14369, c23663.f75329);
    }
}
