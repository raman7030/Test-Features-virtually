package l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܳᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBU5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14716 extends AbstractC17539 implements InterfaceC0919, InterfaceC15940 {
    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return spliterator();
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC19825, l.InterfaceC1144, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC7975 spliterator() {
        return new C12208(iterator(), C4248.m12789(this), comparator());
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC12063 iterator() {
        return iterator();
    }
}
