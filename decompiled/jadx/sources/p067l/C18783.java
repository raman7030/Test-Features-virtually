package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܿۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes5.dex */
public final class C18783 extends AbstractC13634 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ */
    public boolean f56122;

    /* JADX INFO: renamed from: ۙ */
    public int f56123;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C16100 f56124;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f56125;

    /* JADX INFO: renamed from: ᩹ */
    public int f56126;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C12749 c12749 = this.f56124.f47383;
        return !(m42809() != null);
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        comparator();
        return null;
    }

    public C18783(C16100 c16100, int i, boolean z, int i2, boolean z2) {
        this.f56124 = c16100;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C20780.m46928("Start element (", i, ") is larger than end element (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f56126 = i;
        this.f56125 = z;
        this.f56123 = i2;
        this.f56122 = z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C19454 c19454 = new C19454(this);
        while (c19454.hasNext()) {
            c19454.nextInt();
            c19454.remove();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42808(int i) {
        if (this.f56125 || Integer.compare(i, this.f56126) >= 0) {
            return this.f56122 || Integer.compare(i, this.f56123) < 0;
        }
        return false;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return m42808(i) && this.f56124.contains(i);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    public final boolean add(int i) {
        if (m42808(i)) {
            return this.f56124.add(i);
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Element (", ") out of range [");
        sbM34408.append(this.f56125 ? "-" : String.valueOf(this.f56126));
        sbM34408.append(", ");
        throw new IllegalArgumentException(C10965.m25286(sbM34408, this.f56122 ? "-" : String.valueOf(this.f56123), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // p067l.AbstractC8269
    public final boolean remove(int i) {
        if (m42808(i)) {
            return this.f56124.remove(i);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        C19454 c19454 = new C19454(this);
        int i = 0;
        while (c19454.hasNext()) {
            i++;
            c19454.nextInt();
        }
        return i;
    }

    @Override // p067l.InterfaceC4206, java.util.SortedSet
    public final InterfaceC6713 comparator() {
        this.f56124.getClass();
        return null;
    }

    @Override // p067l.AbstractC13634, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C19454(this);
    }

    @Override // p067l.AbstractC13634, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C19454(this);
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC16750 mo8523() {
        return new C19454(this);
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC4206 mo8526(int i) {
        boolean z = this.f56122;
        C16100 c16100 = this.f56124;
        if (z) {
            return new C18783(c16100, this.f56126, this.f56125, i, false);
        }
        if (Integer.compare(i, this.f56123) >= 0) {
            return this;
        }
        return new C18783(c16100, this.f56126, this.f56125, i, false);
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC4206 mo8524(int i) {
        boolean z = this.f56125;
        C16100 c16100 = this.f56124;
        if (z) {
            return new C18783(c16100, i, false, this.f56123, this.f56122);
        }
        return Integer.compare(i, this.f56126) > 0 ? new C18783(c16100, i, false, this.f56123, this.f56122) : this;
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4206 mo8525(int i, int i2) {
        C16100 c16100 = this.f56124;
        boolean z = this.f56125;
        boolean z2 = this.f56122;
        if (z2 && z) {
            return new C18783(c16100, i, false, i2, false);
        }
        int i3 = this.f56123;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f56126;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C18783(c16100, i, false, i4, false) : this;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C12749 m42809() {
        C12749 c12749M36636;
        C16100 c16100 = this.f56124;
        if (c16100.f47381 == null) {
            return null;
        }
        if (this.f56125) {
            c12749M36636 = c16100.f47383;
        } else {
            int i = this.f56126;
            c12749M36636 = c16100.m36636(i);
            if (Integer.compare(c12749M36636.f35807, i) < 0) {
                c12749M36636 = c12749M36636.m29281();
            }
        }
        if (c12749M36636 == null) {
            return null;
        }
        if (this.f56122 || Integer.compare(c12749M36636.f35807, this.f56123) < 0) {
            return c12749M36636;
        }
        return null;
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ᩻֫ */
    public final int mo8527() {
        C12749 c12749M36636;
        C16100 c16100 = this.f56124;
        C12749 c12749 = null;
        if (c16100.f47381 != null) {
            if (this.f56122) {
                c12749M36636 = c16100.f47382;
            } else {
                int i = this.f56123;
                c12749M36636 = c16100.m36636(i);
                if (Integer.compare(c12749M36636.f35807, i) >= 0) {
                    c12749M36636 = c12749M36636.m29283();
                }
            }
            if (c12749M36636 != null && (this.f56125 || Integer.compare(c12749M36636.f35807, this.f56126) >= 0)) {
                c12749 = c12749M36636;
            }
        }
        if (c12749 == null) {
            throw new NoSuchElementException();
        }
        return c12749.f35807;
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ֡ */
    public final int mo8522() {
        C12749 c12749M42809 = m42809();
        if (c12749M42809 == null) {
            throw new NoSuchElementException();
        }
        return c12749M42809.f35807;
    }
}
