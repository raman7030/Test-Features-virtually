package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.۫ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes4.dex */
public class C12558 extends AbstractC10442 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f37860;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f37861;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC10442 f37862;

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC10442, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC10442, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C12558(AbstractC10442 abstractC10442, int i, int i2) {
        this.f37862 = abstractC10442;
        this.f37861 = i;
        this.f37860 = i2;
    }

    @Override // l.AbstractC10442, l.AbstractC21731, l.InterfaceC1043
    public final boolean add(int i) {
        this.f37862.add(this.f37860, i);
        this.f37860++;
        return true;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final void add(int i, int i2) {
        m26281(i);
        this.f37862.add(this.f37861 + i, i2);
        this.f37860++;
    }

    @Override // l.AbstractC10442, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m26281(i);
        this.f37860 = collection.size() + this.f37860;
        return this.f37862.addAll(this.f37861 + i, collection);
    }

    public int getInt(int i) {
        m26285(i);
        return this.f37862.getInt(this.f37861 + i);
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۘ */
    public final int mo3542(int i) {
        m26285(i);
        this.f37860--;
        return this.f37862.mo3542(this.f37861 + i);
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final int set(int i, int i2) {
        m26285(i);
        return this.f37862.set(this.f37861 + i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37860 - this.f37861;
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3538(int i, int i2, int i3, int[] iArr) {
        m26281(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f37862.mo3538(this.f37861 + i, i2, i3, iArr);
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3537(int i, int i2) {
        m26281(i);
        m26281(i2);
        int i3 = this.f37861;
        this.f37862.mo3537(i3 + i, i3 + i2);
        this.f37860 -= i2 - i;
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public final void mo3544(int i, int i2, int[] iArr) {
        m26281(i);
        this.f37862.mo3544(this.f37861 + i, i2, iArr);
        this.f37860 += i2;
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3539(int i, int i2, int[] iArr) {
        m26281(i);
        this.f37862.mo3539(this.f37861 + i, i2, iArr);
    }

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public InterfaceC15132 listIterator(int i) {
        m26281(i);
        AbstractC10442 abstractC10442 = this.f37862;
        return abstractC10442 instanceof RandomAccess ? new C13263(this, i) : new C3386(this, abstractC10442.listIterator(i + this.f37861));
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16749 spliterator() {
        AbstractC10442 abstractC10442 = this.f37862;
        return abstractC10442 instanceof RandomAccess ? new C20320(abstractC10442, this.f37861, this.f37860) : super.spliterator();
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo3585(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf == -1) {
            return false;
        }
        this.f37860--;
        this.f37862.mo3542(this.f37861 + iIndexOf);
        return true;
    }

    @Override // l.AbstractC10442
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26282(int i, InterfaceC1043 interfaceC1043) {
        m26281(i);
        return super.mo26282(i, interfaceC1043);
    }
}
