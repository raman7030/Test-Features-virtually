package l;

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
public class C3976 extends AbstractC19499 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f12618;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f12619;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC19499 f12620;

    @Override // l.AbstractC19499, l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC19499, l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC19499, l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15900 iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC19499, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC19499, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    public C3976(AbstractC19499 abstractC19499, int i, int i2) {
        this.f12620 = abstractC19499;
        this.f12619 = i;
        this.f12618 = i2;
    }

    @Override // l.AbstractC20910, l.InterfaceC5755
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8955(char c) {
        this.f12620.mo3752(c, this.f12618);
        this.f12618++;
        return true;
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ۧ */
    public final void mo3752(char c, int i) {
        m44912(i);
        this.f12620.mo3752(c, this.f12619 + i);
        this.f12618++;
    }

    @Override // l.AbstractC19499, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m44912(i);
        this.f12618 = collection.size() + this.f12618;
        return this.f12620.addAll(this.f12619 + i, collection);
    }

    @Override // l.InterfaceC1084
    public char getChar(int i) {
        m44913(i);
        return this.f12620.getChar(this.f12619 + i);
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ֡ */
    public final char mo3746(int i) {
        m44913(i);
        this.f12618--;
        return this.f12620.mo3746(this.f12619 + i);
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ֫ */
    public final char mo3747(char c, int i) {
        m44913(i);
        return this.f12620.mo3747(c, this.f12619 + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12618 - this.f12619;
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ֫ */
    public final void mo3749(int i, int i2, char[] cArr, int i3) {
        m44912(i);
        if (i + i3 > size()) {
            throw new IndexOutOfBoundsException("End index (" + i + i3 + ") is greater than list size (" + size() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f12620.mo3749(this.f12619 + i, i2, cArr, i3);
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ֫ */
    public final void mo3748(int i, int i2) {
        m44912(i);
        m44912(i2);
        int i3 = this.f12619;
        this.f12620.mo3748(i3 + i, i3 + i2);
        this.f12618 -= i2 - i;
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ֫ */
    public final void mo3751(char[] cArr, int i, int i2) {
        m44912(i);
        this.f12620.mo3751(cArr, this.f12619 + i, i2);
    }

    @Override // l.AbstractC19499, l.InterfaceC1084, java.util.List
    public InterfaceC15194 listIterator(int i) {
        m44912(i);
        AbstractC19499 abstractC19499 = this.f12620;
        return abstractC19499 instanceof RandomAccess ? new C2565(this, i) : new C15969(this, abstractC19499.listIterator(i + this.f12619));
    }

    @Override // l.AbstractC19499, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16770 spliterator() {
        AbstractC19499 abstractC19499 = this.f12620;
        return abstractC19499 instanceof RandomAccess ? new C18793(abstractC19499, this.f12619, this.f12618) : super.spliterator();
    }

    @Override // l.AbstractC20910, l.InterfaceC5755
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo2005(char c) {
        int iIndexOf = indexOf(c);
        if (iIndexOf == -1) {
            return false;
        }
        this.f12618--;
        this.f12620.mo3746(this.f12619 + iIndexOf);
        return true;
    }

    @Override // l.AbstractC19499
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo12022(int i, InterfaceC5755 interfaceC5755) {
        m44912(i);
        return super.mo12022(i, interfaceC5755);
    }
}
