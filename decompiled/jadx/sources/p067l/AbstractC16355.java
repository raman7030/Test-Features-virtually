package p067l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܳᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBU5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16355 extends AbstractC19038 implements InterfaceC3242, InterfaceC17518 {
    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* bridge */ /* synthetic */ InterfaceC16847 spliterator() {
        return spliterator();
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC21210, p067l.InterfaceC3456, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC9948 spliterator() {
        return new C13971(iterator(), C6406.m14669(this), comparator());
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC13833 iterator() {
        return iterator();
    }
}
