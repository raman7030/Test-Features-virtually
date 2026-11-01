package p067l;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۚܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YRI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7488 extends AbstractC2793 implements InterfaceC4226, InterfaceC17518 {
    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C22736) ((C24922) this).f79591.mo3495(((Character) obj).charValue())).keySet();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C22736) ((C24922) this).f79591.mo3490(((Character) obj).charValue(), ((Character) obj2).charValue())).keySet();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C22736) ((C24922) this).f79591.mo3492(((Character) obj).charValue())).keySet();
    }

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18307 spliterator() {
        InterfaceC16809 interfaceC16809Mo3927 = mo3927();
        long jM14669 = C6406.m14669(this);
        ((C24922) this).f79591.comparator();
        return new C10932(interfaceC16809Mo3927, jM14669, null);
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return Character.valueOf(((C24922) this).f79591.mo3491());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return Character.valueOf(((C24922) this).f79591.mo3494());
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return mo3927();
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC17480 iterator() {
        return mo3927();
    }
}
