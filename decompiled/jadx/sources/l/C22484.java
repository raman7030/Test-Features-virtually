package l;

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
public final class C22484 extends C5551 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f72799;

    public C22484(AbstractC5698 abstractC5698) {
        super(abstractC5698);
        this.f72799 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7667 m50430(C6319 c6319, AbstractC14016 abstractC14016, AbstractC10370 abstractC10370, C3398 c3398, C10643 c10643, C4809 c4809) {
        C18957 c18957 = new C18957(c6319, abstractC14016, abstractC10370, c3398, c10643, c4809);
        m50429(c18957, abstractC10370);
        return c18957;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7667 m50431(AbstractC14016 abstractC14016, AbstractC14016 abstractC14017, AbstractC19810 abstractC19810) {
        C21779 c21779 = new C21779(abstractC14016.f23673, abstractC19810, abstractC14017);
        m50429(c21779, abstractC19810.f17562);
        return c21779;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50429(AbstractC7667 abstractC7667, AbstractC10370 abstractC10370) {
        m41025(abstractC7667);
        HashMap map = this.f72799;
        AbstractC7667[] abstractC7667Arr = (AbstractC7667[]) map.get(abstractC10370);
        AbstractC7667[] abstractC7667Arr2 = abstractC7667Arr != null ? (AbstractC7667[]) Arrays.copyOf(abstractC7667Arr, abstractC7667Arr.length + 1) : new AbstractC7667[1];
        abstractC7667Arr2[abstractC7667Arr2.length - 1] = abstractC7667;
        map.put(abstractC10370, abstractC7667Arr2);
    }

    @Override // l.C17545, l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo20477(final AbstractC10370 abstractC10370, final Predicate predicate, final EnumC1317 enumC1317) {
        final AbstractC7667[] abstractC7667Arr = (AbstractC7667[]) this.f72799.get(abstractC10370);
        if (abstractC7667Arr == null) {
            return Collections.EMPTY_LIST;
        }
        return new Iterable() { // from class: l.۠᩵֨
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                List listAsList = Arrays.asList(abstractC7667Arr);
                final AbstractC10370 abstractC10371 = abstractC10370;
                final Predicate predicate2 = predicate;
                final EnumC1317 enumC1318 = enumC1317;
                return C22159.m49777(listAsList, new Function() { // from class: l.ܶ᩵֨
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

    @Override // l.C5551
    /* JADX INFO: renamed from: ܽ */
    public final void mo15705() {
        super.mo15705();
        for (AbstractC7667[] abstractC7667Arr : this.f72799.values()) {
            for (int i = 0; i < abstractC7667Arr.length; i++) {
                abstractC7667Arr[i] = C5551.m15704(abstractC7667Arr[i]);
            }
        }
    }
}
