package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.֨ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes3.dex */
public class C3555 extends AbstractC16965 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶ */
    public int f7211;

    /* JADX INFO: renamed from: ᩸ */
    public final int f7212;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC16965 f7213;

    @Override // p067l.AbstractC16965, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC16965, p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC16965, p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC3595 iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC16965, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC16965, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C3555(AbstractC16965 abstractC16965, int i, int i2) {
        this.f7213 = abstractC16965;
        this.f7212 = i;
        this.f7211 = i2;
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC12984
    public final boolean add(float f) {
        this.f7213.mo6348(f, this.f7211);
        this.f7211++;
        return true;
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ۧ */
    public final void mo6348(float f, int i) {
        m38559(i);
        this.f7213.mo6348(f, this.f7212 + i);
        this.f7211++;
    }

    @Override // p067l.AbstractC16965, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m38559(i);
        this.f7211 = collection.size() + this.f7211;
        return this.f7213.addAll(this.f7212 + i, collection);
    }

    @Override // p067l.InterfaceC6948
    public float getFloat(int i) {
        m38560(i);
        return this.f7213.getFloat(this.f7212 + i);
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ܺ */
    public final float mo6349(int i) {
        m38560(i);
        this.f7211--;
        return this.f7213.mo6349(this.f7212 + i);
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ֫ */
    public final float mo6343(float f, int i) {
        m38560(i);
        return this.f7213.mo6343(f, this.f7212 + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7211 - this.f7212;
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ֫ */
    public final void mo6345(int i, int i2, int i3, float[] fArr) {
        m38559(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f7213.mo6345(this.f7212 + i, i2, i3, fArr);
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ֫ */
    public final void mo6344(int i, int i2) {
        m38559(i);
        m38559(i2);
        int i3 = this.f7212;
        this.f7213.mo6344(i3 + i, i3 + i2);
        this.f7211 -= i2 - i;
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ֫ */
    public final void mo6346(int i, int i2, float[] fArr) {
        m38559(i);
        this.f7213.mo6346(this.f7212 + i, i2, fArr);
    }

    @Override // p067l.AbstractC16965, p067l.InterfaceC6948, java.util.List
    public InterfaceC5607 listIterator(int i) {
        m38559(i);
        AbstractC16965 abstractC16965 = this.f7213;
        return abstractC16965 instanceof RandomAccess ? new C7579(this, i) : new C2884(this, abstractC16965.listIterator(i + this.f7212));
    }

    @Override // p067l.AbstractC16965, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC18327 spliterator() {
        AbstractC16965 abstractC16965 = this.f7213;
        return abstractC16965 instanceof RandomAccess ? new C10261(abstractC16965, this.f7212, this.f7211) : super.spliterator();
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC12984
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6350(float f) {
        int iMo15925 = mo15925(f);
        if (iMo15925 == -1) {
            return false;
        }
        this.f7211--;
        this.f7213.mo6349(this.f7212 + iMo15925);
        return true;
    }

    @Override // p067l.AbstractC16965
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6347(int i, InterfaceC12984 interfaceC12984) {
        m38559(i);
        return super.mo6347(i, interfaceC12984);
    }
}
