package l;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۚܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YRI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5387 extends AbstractC0447 implements InterfaceC1954, InterfaceC15940 {
    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C21431) ((C23731) this).f76840.mo1099(((Character) obj).charValue())).keySet();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C21431) ((C23731) this).f76840.mo1094(((Character) obj).charValue(), ((Character) obj2).charValue())).keySet();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C21431) ((C23731) this).f76840.mo1096(((Character) obj).charValue())).keySet();
    }

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16770 spliterator() {
        InterfaceC15194 interfaceC15194Mo1529 = mo1529();
        long jM12789 = C4248.m12789(this);
        ((C23731) this).f76840.comparator();
        return new C9010(interfaceC15194Mo1529, jM12789, null);
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return Character.valueOf(((C23731) this).f76840.mo1095());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return Character.valueOf(((C23731) this).f76840.mo1098());
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return mo1529();
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC15900 iterator() {
        return mo1529();
    }
}
