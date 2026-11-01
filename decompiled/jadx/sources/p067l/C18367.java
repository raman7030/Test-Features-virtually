package p067l;

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
public class C18367 extends AbstractC19709 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶ */
    public int f54862;

    /* JADX INFO: renamed from: ᩸ */
    public final int f54863;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC19709 f54864;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC19709, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC19709, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC19709, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC19709, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C18367(AbstractC19709 abstractC19709, int i, int i2) {
        this.f54864 = abstractC19709;
        this.f54863 = i;
        this.f54862 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.f54864.add(this.f54862, obj);
        this.f54862++;
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m44783(i);
        this.f54864.add(this.f54863 + i, obj);
        this.f54862++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m44783(i);
        this.f54862 = collection.size() + this.f54862;
        return this.f54864.addAll(this.f54863 + i, collection);
    }

    @Override // java.util.List
    public Object get(int i) {
        m44785(i);
        return this.f54864.get(this.f54863 + i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m44785(i);
        this.f54862--;
        return this.f54864.remove(this.f54863 + i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m44785(i);
        return this.f54864.set(this.f54863 + i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54862 - this.f54863;
    }

    @Override // p067l.InterfaceC3913
    /* JADX INFO: renamed from: ֫ */
    public final void mo7735(int i, int i2, int i3, Object[] objArr) {
        m44783(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f54864.mo7735(this.f54863 + i, i2, i3, objArr);
    }

    @Override // p067l.InterfaceC3913
    /* JADX INFO: renamed from: ֫ */
    public final void mo7734(int i, int i2) {
        m44783(i);
        m44783(i2);
        int i3 = this.f54863;
        this.f54864.mo7734(i3 + i, i3 + i2);
        this.f54862 -= i2 - i;
    }

    @Override // p067l.InterfaceC3913
    /* JADX INFO: renamed from: ֫ */
    public final void mo7736(int i, int i2, Object[] objArr) {
        m44783(i);
        this.f54864.mo7736(this.f54863 + i, i2, objArr);
    }

    @Override // p067l.AbstractC19709, p067l.InterfaceC3913, java.util.List
    public InterfaceC12631 listIterator(int i) {
        m44783(i);
        AbstractC19709 abstractC19709 = this.f54864;
        return abstractC19709 instanceof RandomAccess ? new C13004(this, i) : new C4286(this, abstractC19709.listIterator(i + this.f54863));
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC9948 spliterator() {
        AbstractC19709 abstractC19709 = this.f54864;
        return abstractC19709 instanceof RandomAccess ? new C15272(abstractC19709, this.f54863, this.f54862) : super.spliterator();
    }
}
