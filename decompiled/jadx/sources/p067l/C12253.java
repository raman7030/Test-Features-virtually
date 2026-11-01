package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۤܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes4.dex */
public class C12253 extends AbstractC8229 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶ */
    public int f34257;

    /* JADX INFO: renamed from: ᩸ */
    public final int f34258;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC8229 f34259;

    @Override // p067l.AbstractC8229, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC8229, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC8229, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p067l.InterfaceC13223, p067l.InterfaceC18625, java.util.List
    public final InterfaceC24660 iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC8229, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC8229, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C12253(AbstractC8229 abstractC8229, int i, int i2) {
        this.f34259 = abstractC8229;
        this.f34258 = i;
        this.f34257 = i2;
    }

    @Override // p067l.AbstractC23652, p067l.InterfaceC13223
    public final boolean add(long j) {
        this.f34259.mo9607(this.f34257, j);
        this.f34257++;
        return true;
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final void mo9607(int i, long j) {
        m19001(i);
        this.f34259.mo9607(this.f34258 + i, j);
        this.f34257++;
    }

    @Override // p067l.AbstractC8229, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m19001(i);
        this.f34257 = collection.size() + this.f34257;
        return this.f34259.addAll(this.f34258 + i, collection);
    }

    @Override // p067l.InterfaceC4544
    public long getLong(int i) {
        m19005(i);
        return this.f34259.getLong(this.f34258 + i);
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ܽ */
    public final long mo9613(int i) {
        m19005(i);
        this.f34257--;
        return this.f34259.mo9613(this.f34258 + i);
    }

    @Override // p067l.InterfaceC4544
    public final long set(int i, long j) {
        m19005(i);
        return this.f34259.set(this.f34258 + i, j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34257 - this.f34258;
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final void mo9609(long[] jArr, int i, int i2, int i3) {
        m19001(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f34259.mo9609(jArr, this.f34258 + i, i2, i3);
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final void mo9605(int i, int i2) {
        m19001(i);
        m19001(i2);
        int i3 = this.f34258;
        this.f34259.mo9605(i3 + i, i3 + i2);
        this.f34257 -= i2 - i;
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final void mo9606(int i, int i2, long[] jArr) {
        m19001(i);
        this.f34259.mo9606(this.f34258 + i, i2, jArr);
    }

    @Override // p067l.AbstractC8229, p067l.InterfaceC4544, java.util.List
    public InterfaceC5885 listIterator(int i) {
        m19001(i);
        AbstractC8229 abstractC8229 = this.f34259;
        return abstractC8229 instanceof RandomAccess ? new C14264(this, i) : new C14934(this, abstractC8229.listIterator(i + this.f34258));
    }

    @Override // p067l.AbstractC8229, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC3202 spliterator() {
        AbstractC8229 abstractC8229 = this.f34259;
        return abstractC8229 instanceof RandomAccess ? new C6888(abstractC8229, this.f34258, this.f34257) : super.spliterator();
    }

    @Override // p067l.InterfaceC13223
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo14952(long j) {
        int iMo9614 = mo9614(j);
        if (iMo9614 == -1) {
            return false;
        }
        this.f34257--;
        this.f34259.mo9613(this.f34258 + iMo9614);
        return true;
    }

    @Override // p067l.AbstractC8229
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14948(int i, InterfaceC13223 interfaceC13223) {
        m19001(i);
        return super.mo14948(i, interfaceC13223);
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9610(int i, InterfaceC4544 interfaceC4544) {
        m19001(i);
        return mo14948(i, (InterfaceC13223) interfaceC4544);
    }
}
