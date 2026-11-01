package p067l;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23737 extends C7644 {

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f75525;

    public C23737(AbstractC7783 abstractC7783) {
        super(abstractC7783);
        this.f75525 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9655 m52771(C8374 c8374, AbstractC15689 abstractC15689, AbstractC12224 abstractC12224, C5598 c5598, C12483 c12483, C6939 c6939) {
        C20385 c20385 = new C20385(c8374, abstractC15689, abstractC12224, c5598, c12483, c6939);
        m52770(c20385, abstractC12224);
        return c20385;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9655 m52772(AbstractC15689 abstractC15689, AbstractC15689 abstractC156810, AbstractC21195 abstractC21195) {
        C23067 c23067 = new C23067(abstractC15689.f26587, abstractC21195, abstractC156810);
        m52770(c23067, abstractC21195.f20408);
        return c23067;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52770(AbstractC9655 abstractC9655, AbstractC12224 abstractC12224) {
        m43270(abstractC9655);
        HashMap map = this.f75525;
        AbstractC9655[] abstractC9655Arr = (AbstractC9655[]) map.get(abstractC12224);
        AbstractC9655[] abstractC9655Arr2 = abstractC9655Arr != null ? (AbstractC9655[]) Arrays.copyOf(abstractC9655Arr, abstractC9655Arr.length + 1) : new AbstractC9655[1];
        abstractC9655Arr2[abstractC9655Arr2.length - 1] = abstractC9655;
        map.put(abstractC12224, abstractC9655Arr2);
    }

    @Override // p067l.C19043, p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo22457(final AbstractC12224 abstractC12224, final Predicate predicate, final EnumC3620 enumC3620) {
        final AbstractC9655[] abstractC9655Arr = (AbstractC9655[]) this.f75525.get(abstractC12224);
        if (abstractC9655Arr == null) {
            return Collections.EMPTY_LIST;
        }
        return new Iterable() { // from class: l.۠᩵֨
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                List listAsList = Arrays.asList(abstractC9655Arr);
                final AbstractC12224 abstractC12225 = abstractC12224;
                final Predicate predicate2 = predicate;
                final EnumC3620 enumC3621 = enumC3620;
                return C23428.m52115(listAsList, new Function() { // from class: l.ܶ᩵֨
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
                        return ((AbstractC9655) obj).mo22457(abstractC12225, predicate2, enumC3621).iterator();
                    }
                });
            }
        };
    }

    @Override // p067l.C7644
    /* JADX INFO: renamed from: ܽ */
    public final void mo17619() {
        super.mo17619();
        for (AbstractC9655[] abstractC9655Arr : this.f75525.values()) {
            for (int i = 0; i < abstractC9655Arr.length; i++) {
                abstractC9655Arr[i] = C7644.m17618(abstractC9655Arr[i]);
            }
        }
    }
}
