package p067l;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۨܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6Y */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13634 extends AbstractC8269 implements InterfaceC4206, InterfaceC17518 {
    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return mo8526(((Integer) obj).intValue());
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* bridge */ /* synthetic */ InterfaceC16847 spliterator() {
        return spliterator();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return mo8525(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return mo8524(((Integer) obj).intValue());
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC18287 spliterator() {
        return new C17616(mo8523(), C6406.m14669(this), comparator());
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return Integer.valueOf(mo8522());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return Integer.valueOf(mo8527());
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return mo8523();
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ InterfaceC8705 iterator() {
        return mo8523();
    }
}
