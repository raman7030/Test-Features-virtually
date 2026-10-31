package l;

import com.alipay.sdk.m.y.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public class C17545 extends AbstractC7667 implements InterfaceC6256 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f53595;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18837 f53596;

    public C17545(AbstractC5698 abstractC5698) {
        super(abstractC5698);
        this.f53596 = new C18837();
        this.f53595 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41026(AbstractC7667 abstractC7667) {
        if (abstractC7667 != null) {
            this.f53596.m43515(abstractC7667);
            C11901 c11901 = abstractC7667.f23672;
            c11901.f35544 = c11901.f35544.m8246(new WeakReference(this));
            this.f53595++;
            this.f23672.m29027(this, null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41025(AbstractC7667 abstractC7667) {
        this.f53596.m43511(abstractC7667);
        C11901 c11901 = abstractC7667.f23672;
        c11901.f35544 = c11901.f35544.m8246(new WeakReference(this));
        this.f53595++;
        this.f23672.m29027(this, null);
    }

    @Override // l.InterfaceC6256
    /* JADX INFO: renamed from: ֫ */
    public final void mo2489(AbstractC7667 abstractC7667, AbstractC5698 abstractC5698) {
        this.f53595++;
        this.f23672.m29027(abstractC7667, abstractC5698);
    }

    @Override // l.InterfaceC6256
    /* JADX INFO: renamed from: ۧ */
    public final void mo2490(AbstractC7667 abstractC7667, AbstractC5698 abstractC5698) {
        this.f53595++;
        this.f23672.m29028(abstractC7667, abstractC5698);
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo27864() {
        return this.f53595;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompoundScope{");
        String str = "";
        for (AbstractC7667 abstractC7667 : this.f53596) {
            sb.append(str);
            sb.append(abstractC7667);
            str = ",";
        }
        sb.append(l.d);
        return sb.toString();
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public Iterable mo20475(final Predicate predicate, final EnumC1317 enumC1317) {
        return new Iterable() { // from class: l.ۧ᩵֨
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                C18837 c18837 = this.f33607.f53596;
                final Predicate predicate2 = predicate;
                final EnumC1317 enumC1318 = enumC1317;
                return C22159.m49777(c18837, new Function() { // from class: l.ܽ᩵֨
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo22274andThen(Function function) {
                        return C20696.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C20696.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((AbstractC7667) obj).mo20475(predicate2, enumC1318).iterator();
                    }
                });
            }
        };
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public Iterable mo20477(final AbstractC10370 abstractC10370, final Predicate predicate, final EnumC1317 enumC1317) {
        return new Iterable() { // from class: l.֫᩵֨
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                C18837 c18837 = this.f6746.f53596;
                final AbstractC10370 abstractC10371 = abstractC10370;
                final Predicate predicate2 = predicate;
                final EnumC1317 enumC1318 = enumC1317;
                return C22159.m49777(c18837, new Function() { // from class: l.ᩳ᩵֨
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo22274andThen(Function function) {
                        return C20696.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C20696.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((AbstractC7667) obj).mo20477(abstractC10371, predicate2, enumC1318).iterator();
                    }
                });
            }
        };
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7667 mo20479(AbstractC5698 abstractC5698) {
        for (AbstractC7667 abstractC7667 : this.f53596) {
            if (abstractC7667.mo20482(abstractC5698)) {
                return abstractC7667.mo20479(abstractC5698);
            }
        }
        return null;
    }
}
