package l;

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
public class C10400 extends AbstractC6166 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31292;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f31293;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC6166 f31294;

    @Override // l.AbstractC6166, l.AbstractC22394, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC6166, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC6166, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC11421, l.InterfaceC17105, java.util.List
    public final InterfaceC23455 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC6166, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC6166, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C10400(AbstractC6166 abstractC6166, int i, int i2) {
        this.f31294 = abstractC6166;
        this.f31293 = i;
        this.f31292 = i2;
    }

    @Override // l.AbstractC22394, l.InterfaceC11421
    public final boolean add(long j) {
        this.f31294.mo7539(this.f31292, j);
        this.f31292++;
        return true;
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final void mo7539(int i, long j) {
        m17069(i);
        this.f31294.mo7539(this.f31293 + i, j);
        this.f31292++;
    }

    @Override // l.AbstractC6166, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m17069(i);
        this.f31292 = collection.size() + this.f31292;
        return this.f31294.addAll(this.f31293 + i, collection);
    }

    @Override // l.InterfaceC2289
    public long getLong(int i) {
        m17073(i);
        return this.f31294.getLong(this.f31293 + i);
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ܽ */
    public final long mo7545(int i) {
        m17073(i);
        this.f31292--;
        return this.f31294.mo7545(this.f31293 + i);
    }

    @Override // l.InterfaceC2289
    public final long set(int i, long j) {
        m17073(i);
        return this.f31294.set(this.f31293 + i, j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31292 - this.f31293;
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final void mo7541(long[] jArr, int i, int i2, int i3) {
        m17069(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f31294.mo7541(jArr, this.f31293 + i, i2, i3);
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final void mo7537(int i, int i2) {
        m17069(i);
        m17069(i2);
        int i3 = this.f31293;
        this.f31294.mo7537(i3 + i, i3 + i2);
        this.f31292 -= i2 - i;
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final void mo7538(int i, int i2, long[] jArr) {
        m17069(i);
        this.f31294.mo7538(this.f31293 + i, i2, jArr);
    }

    @Override // l.AbstractC6166, l.InterfaceC2289, java.util.List
    public InterfaceC3700 listIterator(int i) {
        m17069(i);
        AbstractC6166 abstractC6166 = this.f31294;
        return abstractC6166 instanceof RandomAccess ? new C12516(this, i) : new C13221(this, abstractC6166.listIterator(i + this.f31293));
    }

    @Override // l.AbstractC6166, l.AbstractC22394, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC0877 spliterator() {
        AbstractC6166 abstractC6166 = this.f31294;
        return abstractC6166 instanceof RandomAccess ? new C4755(abstractC6166, this.f31293, this.f31292) : super.spliterator();
    }

    @Override // l.InterfaceC11421
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo13088(long j) {
        int iMo7546 = mo7546(j);
        if (iMo7546 == -1) {
            return false;
        }
        this.f31292--;
        this.f31294.mo7545(this.f31293 + iMo7546);
        return true;
    }

    @Override // l.AbstractC6166
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13084(int i, InterfaceC11421 interfaceC11421) {
        m17069(i);
        return super.mo13084(i, interfaceC11421);
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7542(int i, InterfaceC2289 interfaceC2289) {
        m17069(i);
        return mo13084(i, (InterfaceC11421) interfaceC2289);
    }
}
