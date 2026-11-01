package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public class C19043 extends AbstractC9655 implements InterfaceC8314 {

    /* JADX INFO: renamed from: ܽ */
    public int f56785;

    /* JADX INFO: renamed from: ᩳ */
    public C20271 f56786;

    public C19043(AbstractC7783 abstractC7783) {
        super(abstractC7783);
        this.f56786 = new C20271();
        this.f56785 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43271(AbstractC9655 abstractC9655) {
        if (abstractC9655 != null) {
            this.f56786.m45781(abstractC9655);
            C13679 c13679 = abstractC9655.f26586;
            c13679.f38554 = c13679.f38554.m10290(new WeakReference(this));
            this.f56785++;
            this.f26586.m31079(this, null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43270(AbstractC9655 abstractC9655) {
        this.f56786.m45777(abstractC9655);
        C13679 c13679 = abstractC9655.f26586;
        c13679.f38554 = c13679.f38554.m10290(new WeakReference(this));
        this.f56785++;
        this.f26586.m31079(this, null);
    }

    @Override // p067l.InterfaceC8314
    /* JADX INFO: renamed from: ֫ */
    public final void mo4845(AbstractC9655 abstractC9655, AbstractC7783 abstractC7783) {
        this.f56785++;
        this.f26586.m31079(abstractC9655, abstractC7783);
    }

    @Override // p067l.InterfaceC8314
    /* JADX INFO: renamed from: ۧ */
    public final void mo4846(AbstractC9655 abstractC9655, AbstractC7783 abstractC7783) {
        this.f56785++;
        this.f26586.m31080(abstractC9655, abstractC7783);
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo29925() {
        return this.f56785;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompoundScope{");
        String str = "";
        for (AbstractC9655 abstractC9655 : this.f56786) {
            sb.append(str);
            sb.append(abstractC9655);
            str = ",";
        }
        sb.append(C0249l.f1198d);
        return sb.toString();
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public Iterable mo22455(final Predicate predicate, final EnumC3620 enumC3620) {
        return new Iterable() { // from class: l.ۧ᩵֨
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                C20271 c20271 = this.f36606.f56786;
                final Predicate predicate2 = predicate;
                final EnumC3620 enumC3621 = enumC3620;
                return C23428.m52115(c20271, new Function() { // from class: l.ܽ᩵֨
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
                        return ((AbstractC9655) obj).mo22455(predicate2, enumC3621).iterator();
                    }
                });
            }
        };
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public Iterable mo22457(final AbstractC12224 abstractC12224, final Predicate predicate, final EnumC3620 enumC3620) {
        return new Iterable() { // from class: l.֫᩵֨
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                C20271 c20271 = this.f9531.f56786;
                final AbstractC12224 abstractC12225 = abstractC12224;
                final Predicate predicate2 = predicate;
                final EnumC3620 enumC3621 = enumC3620;
                return C23428.m52115(c20271, new Function() { // from class: l.ᩳ᩵֨
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

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9655 mo22459(AbstractC7783 abstractC7783) {
        for (AbstractC9655 abstractC9655 : this.f56786) {
            if (abstractC9655.mo22462(abstractC7783)) {
                return abstractC9655.mo22459(abstractC7783);
            }
        }
        return null;
    }
}
