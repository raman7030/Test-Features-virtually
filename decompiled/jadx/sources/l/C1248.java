package l;

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
public class C1248 extends AbstractC15358 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f4442;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f4443;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC15358 f4444;

    @Override // l.AbstractC15358, l.AbstractC4071, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC15358, l.AbstractC4071, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC15358, l.AbstractC4071, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC1290 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC15358, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC15358, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C1248(AbstractC15358 abstractC15358, int i, int i2) {
        this.f4444 = abstractC15358;
        this.f4443 = i;
        this.f4442 = i2;
    }

    @Override // l.AbstractC4071, l.InterfaceC11169
    public final boolean add(float f) {
        this.f4444.mo4104(f, this.f4442);
        this.f4442++;
        return true;
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo4104(float f, int i) {
        m36401(i);
        this.f4444.mo4104(f, this.f4443 + i);
        this.f4442++;
    }

    @Override // l.AbstractC15358, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m36401(i);
        this.f4442 = collection.size() + this.f4442;
        return this.f4444.addAll(this.f4443 + i, collection);
    }

    @Override // l.InterfaceC4818
    public float getFloat(int i) {
        m36402(i);
        return this.f4444.getFloat(this.f4443 + i);
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float mo4105(int i) {
        m36402(i);
        this.f4442--;
        return this.f4444.mo4105(this.f4443 + i);
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float mo4099(float f, int i) {
        m36402(i);
        return this.f4444.mo4099(f, this.f4443 + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4442 - this.f4443;
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4101(int i, int i2, int i3, float[] fArr) {
        m36401(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f4444.mo4101(this.f4443 + i, i2, i3, fArr);
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4100(int i, int i2) {
        m36401(i);
        m36401(i2);
        int i3 = this.f4443;
        this.f4444.mo4100(i3 + i, i3 + i2);
        this.f4442 -= i2 - i;
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4102(int i, int i2, float[] fArr) {
        m36401(i);
        this.f4444.mo4102(this.f4443 + i, i2, fArr);
    }

    @Override // l.AbstractC15358, l.InterfaceC4818, java.util.List
    public InterfaceC3407 listIterator(int i) {
        m36401(i);
        AbstractC15358 abstractC15358 = this.f4444;
        return abstractC15358 instanceof RandomAccess ? new C5482(this, i) : new C0542(this, abstractC15358.listIterator(i + this.f4443));
    }

    @Override // l.AbstractC15358, l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16791 spliterator() {
        AbstractC15358 abstractC15358 = this.f4444;
        return abstractC15358 instanceof RandomAccess ? new C8304(abstractC15358, this.f4443, this.f4442) : super.spliterator();
    }

    @Override // l.AbstractC4071, l.InterfaceC11169
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo4106(float f) {
        int iMo14045 = mo14045(f);
        if (iMo14045 == -1) {
            return false;
        }
        this.f4442--;
        this.f4444.mo4105(this.f4443 + iMo14045);
        return true;
    }

    @Override // l.AbstractC15358
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo4103(int i, InterfaceC11169 interfaceC11169) {
        m36401(i);
        return super.mo4103(i, interfaceC11169);
    }
}
