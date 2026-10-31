package l;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۨܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6Y */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11853 extends AbstractC6208 implements InterfaceC1933, InterfaceC15940 {
    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return mo6353(((Integer) obj).intValue());
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return spliterator();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return mo6352(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return mo6351(((Integer) obj).intValue());
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16749 spliterator() {
        return new C16043(mo6350(), C4248.m12789(this), comparator());
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return Integer.valueOf(mo6349());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return Integer.valueOf(mo6354());
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return mo6350();
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ InterfaceC6667 iterator() {
        return mo6350();
    }
}
