package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܽᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes5.dex */
public class C16833 extends AbstractC18245 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f51682;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f51683;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC18245 f51684;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC18245, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC18245, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC18245, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC18245, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C16833(AbstractC18245 abstractC18245, int i, int i2) {
        this.f51684 = abstractC18245;
        this.f51683 = i;
        this.f51682 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.f51684.add(this.f51682, obj);
        this.f51682++;
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m42524(i);
        this.f51684.add(this.f51683 + i, obj);
        this.f51682++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m42524(i);
        this.f51682 = collection.size() + this.f51682;
        return this.f51684.addAll(this.f51683 + i, collection);
    }

    @Override // java.util.List
    public Object get(int i) {
        m42526(i);
        return this.f51684.get(this.f51683 + i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m42526(i);
        this.f51682--;
        return this.f51684.remove(this.f51683 + i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m42526(i);
        return this.f51684.set(this.f51683 + i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51682 - this.f51683;
    }

    @Override // l.InterfaceC1625
    /* JADX INFO: renamed from: ֫ */
    public final void mo5505(int i, int i2, int i3, Object[] objArr) {
        m42524(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f51684.mo5505(this.f51683 + i, i2, i3, objArr);
    }

    @Override // l.InterfaceC1625
    /* JADX INFO: renamed from: ֫ */
    public final void mo5504(int i, int i2) {
        m42524(i);
        m42524(i2);
        int i3 = this.f51683;
        this.f51684.mo5504(i3 + i, i3 + i2);
        this.f51682 -= i2 - i;
    }

    @Override // l.InterfaceC1625
    /* JADX INFO: renamed from: ֫ */
    public final void mo5506(int i, int i2, Object[] objArr) {
        m42524(i);
        this.f51684.mo5506(this.f51683 + i, i2, objArr);
    }

    @Override // l.AbstractC18245, l.InterfaceC1625, java.util.List
    public InterfaceC10798 listIterator(int i) {
        m42524(i);
        AbstractC18245 abstractC18245 = this.f51684;
        return abstractC18245 instanceof RandomAccess ? new C11190(this, i) : new C2017(this, abstractC18245.listIterator(i + this.f51683));
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC7975 spliterator() {
        AbstractC18245 abstractC18245 = this.f51684;
        return abstractC18245 instanceof RandomAccess ? new C13577(abstractC18245, this.f51683, this.f51682) : super.spliterator();
    }
}
