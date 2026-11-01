package p067l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ᩴ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19868 extends C9238 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C20539 f60379;

    @Override // p067l.C18367, p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19868(C20539 c20539, int i, int i2) {
        super(c20539, i, i2);
        this.f60379 = c20539;
    }

    @Override // p067l.C18367, java.util.List
    public final Object get(int i) {
        m44785(i);
        return this.f60379.f63463[i + this.f54863];
    }

    @Override // p067l.AbstractC19709, p067l.InterfaceC3913, java.util.List
    public final ListIterator listIterator(int i) {
        return new C4445(this, i);
    }

    @Override // p067l.C18367, p067l.AbstractC19709, p067l.InterfaceC3913, java.util.List
    public final InterfaceC12631 listIterator(int i) {
        return new C4445(this, i);
    }

    @Override // p067l.C18367, p067l.AbstractC19709, p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC21210, p067l.InterfaceC3456, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C5786(this);
    }

    @Override // p067l.C18367, p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C5786(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m45110(int i, int i2, Object[] objArr) {
        C20539 c20539 = this.f60379;
        Object[] objArr2 = c20539.f63463;
        int i3 = this.f54863;
        if (objArr2 == objArr && i3 == i && this.f54862 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f54862) {
            int i4 = i3 + 1;
            Object obj = c20539.f63463[i3];
            int i5 = i + 1;
            if (!C12826.equals(obj, objArr[i])) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // p067l.AbstractC19709, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C20539) {
            C20539 c20539 = (C20539) obj;
            return m45110(0, c20539.f63464, c20539.f63463);
        }
        if (obj instanceof C19868) {
            C19868 c19868 = (C19868) obj;
            return m45110(c19868.f54863, c19868.f54862, c19868.f60379.f63463);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m45109(int i, int i2, Object[] objArr) {
        int i3;
        int i4 = this.f54863;
        while (true) {
            i3 = this.f54862;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompareTo = ((Comparable) this.f60379.f63463[i4]).compareTo(objArr[i]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i4++;
            i++;
        }
        if (i4 < i2) {
            return -1;
        }
        return i4 < i3 ? 1 : 0;
    }

    @Override // p067l.C18367, p067l.AbstractC19709, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C20539) {
            C20539 c20539 = (C20539) list;
            return m45109(0, c20539.f63464, c20539.f63463);
        }
        if (list instanceof C19868) {
            C19868 c19868 = (C19868) list;
            return m45109(c19868.f54863, c19868.f54862, c19868.f60379.f63463);
        }
        return super.compareTo(list);
    }
}
