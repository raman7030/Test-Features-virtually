package p067l;

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
public class C14304 extends AbstractC12293 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶ */
    public int f40886;

    /* JADX INFO: renamed from: ᩸ */
    public final int f40887;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC12293 f40888;

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC12293, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC12293, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C14304(AbstractC12293 abstractC12293, int i, int i2) {
        this.f40888 = abstractC12293;
        this.f40887 = i;
        this.f40886 = i2;
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, p067l.InterfaceC3360
    public final boolean add(int i) {
        this.f40888.add(this.f40886, i);
        this.f40886++;
        return true;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final void add(int i, int i2) {
        m28310(i);
        this.f40888.add(this.f40887 + i, i2);
        this.f40886++;
    }

    @Override // p067l.AbstractC12293, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m28310(i);
        this.f40886 = collection.size() + this.f40886;
        return this.f40888.addAll(this.f40887 + i, collection);
    }

    public int getInt(int i) {
        m28314(i);
        return this.f40888.getInt(this.f40887 + i);
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۘ */
    public final int mo5829(int i) {
        m28314(i);
        this.f40886--;
        return this.f40888.mo5829(this.f40887 + i);
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final int set(int i, int i2) {
        m28314(i);
        return this.f40888.set(this.f40887 + i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40886 - this.f40887;
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5825(int i, int i2, int i3, int[] iArr) {
        m28310(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f40888.mo5825(this.f40887 + i, i2, i3, iArr);
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5824(int i, int i2) {
        m28310(i);
        m28310(i2);
        int i3 = this.f40887;
        this.f40888.mo5824(i3 + i, i3 + i2);
        this.f40886 -= i2 - i;
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public final void mo5831(int i, int i2, int[] iArr) {
        m28310(i);
        this.f40888.mo5831(this.f40887 + i, i2, iArr);
        this.f40886 += i2;
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5826(int i, int i2, int[] iArr) {
        m28310(i);
        this.f40888.mo5826(this.f40887 + i, i2, iArr);
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public InterfaceC16750 listIterator(int i) {
        m28310(i);
        AbstractC12293 abstractC12293 = this.f40888;
        return abstractC12293 instanceof RandomAccess ? new C14974(this, i) : new C5587(this, abstractC12293.listIterator(i + this.f40887));
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC18287 spliterator() {
        AbstractC12293 abstractC12293 = this.f40888;
        return abstractC12293 instanceof RandomAccess ? new C21681(abstractC12293, this.f40887, this.f40886) : super.spliterator();
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo5872(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf == -1) {
            return false;
        }
        this.f40886--;
        this.f40888.mo5829(this.f40887 + iIndexOf);
        return true;
    }

    @Override // p067l.AbstractC12293
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28311(int i, InterfaceC3360 interfaceC3360) {
        m28310(i);
        return super.mo28311(i, interfaceC3360);
    }
}
