package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۘܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes3.dex */
public class C6147 extends AbstractC20900 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶ */
    public int f15429;

    /* JADX INFO: renamed from: ᩸ */
    public final int f15430;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC20900 f15431;

    @Override // p067l.AbstractC20900, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC20900, p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC20900, p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC17480 iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC20900, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC20900, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C6147(AbstractC20900 abstractC20900, int i, int i2) {
        this.f15431 = abstractC20900;
        this.f15430 = i;
        this.f15429 = i2;
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC7838
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11023(char c) {
        this.f15431.mo6023(c, this.f15429);
        this.f15429++;
        return true;
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ۧ */
    public final void mo6023(char c, int i) {
        m47210(i);
        this.f15431.mo6023(c, this.f15430 + i);
        this.f15429++;
    }

    @Override // p067l.AbstractC20900, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m47210(i);
        this.f15429 = collection.size() + this.f15429;
        return this.f15431.addAll(this.f15430 + i, collection);
    }

    @Override // p067l.InterfaceC3399
    public char getChar(int i) {
        m47211(i);
        return this.f15431.getChar(this.f15430 + i);
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֡ */
    public final char mo6017(int i) {
        m47211(i);
        this.f15429--;
        return this.f15431.mo6017(this.f15430 + i);
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֫ */
    public final char mo6018(char c, int i) {
        m47211(i);
        return this.f15431.mo6018(c, this.f15430 + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15429 - this.f15430;
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֫ */
    public final void mo6020(int i, int i2, char[] cArr, int i3) {
        m47210(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f15431.mo6020(this.f15430 + i, i2, cArr, i3);
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֫ */
    public final void mo6019(int i, int i2) {
        m47210(i);
        m47210(i2);
        int i3 = this.f15430;
        this.f15431.mo6019(i3 + i, i3 + i2);
        this.f15429 -= i2 - i;
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֫ */
    public final void mo6022(char[] cArr, int i, int i2) {
        m47210(i);
        this.f15431.mo6022(cArr, this.f15430 + i, i2);
    }

    @Override // p067l.AbstractC20900, p067l.InterfaceC3399, java.util.List
    public InterfaceC16809 listIterator(int i) {
        m47210(i);
        AbstractC20900 abstractC20900 = this.f15431;
        return abstractC20900 instanceof RandomAccess ? new C4806(this, i) : new C17545(this, abstractC20900.listIterator(i + this.f15430));
    }

    @Override // p067l.AbstractC20900, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC18307 spliterator() {
        AbstractC20900 abstractC20900 = this.f15431;
        return abstractC20900 instanceof RandomAccess ? new C20229(abstractC20900, this.f15430, this.f15429) : super.spliterator();
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC7838
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo4382(char c) {
        int iIndexOf = indexOf(c);
        if (iIndexOf == -1) {
            return false;
        }
        this.f15429--;
        this.f15431.mo6017(this.f15430 + iIndexOf);
        return true;
    }

    @Override // p067l.AbstractC20900
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13946(int i, InterfaceC7838 interfaceC7838) {
        m47210(i);
        return super.mo13946(i, interfaceC7838);
    }
}
