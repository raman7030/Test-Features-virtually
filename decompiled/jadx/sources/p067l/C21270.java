package p067l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩶ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21270 extends C5547 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C6517 f66910;

    @Override // p067l.C12253, p067l.AbstractC8229, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21270(C6517 c6517, int i, int i2) {
        super(c6517, i, i2);
        this.f66910 = c6517;
    }

    @Override // p067l.C12253, p067l.InterfaceC4544
    public final long getLong(int i) {
        m19005(i);
        return this.f66910.f16849[i + this.f34258];
    }

    @Override // p067l.AbstractC8229, p067l.InterfaceC4544, java.util.List
    public final ListIterator listIterator(int i) {
        return new C22611(this, i);
    }

    @Override // p067l.C12253, p067l.AbstractC8229, p067l.InterfaceC4544, java.util.List
    public final InterfaceC5885 listIterator(int i) {
        return new C22611(this, i);
    }

    @Override // p067l.C12253, p067l.AbstractC8229, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC3202 spliterator() {
        return new C23281(this);
    }

    @Override // p067l.C12253, p067l.AbstractC8229, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C23281(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m48048(int i, int i2, long[] jArr) {
        C6517 c6517 = this.f66910;
        long[] jArr2 = c6517.f16849;
        int i3 = this.f34258;
        if (jArr2 == jArr && i3 == i && this.f34257 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f34257) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            if (c6517.f16849[i3] != jArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // p067l.AbstractC8229, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C6517) {
            C6517 c6517 = (C6517) obj;
            return m48048(0, c6517.f16850, c6517.f16849);
        }
        if (obj instanceof C21270) {
            C21270 c21270 = (C21270) obj;
            return m48048(c21270.f34258, c21270.f34257, c21270.f66910.f16849);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m48047(int i, int i2, long[] jArr) {
        int i3;
        C6517 c6517 = this.f66910;
        long[] jArr2 = c6517.f16849;
        int i4 = this.f34258;
        if (jArr2 == jArr && i4 == i && this.f34257 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f34257;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Long.compare(c6517.f16849[i4], jArr[i]);
            if (iCompare != 0) {
                return iCompare;
            }
            i4++;
            i++;
        }
        if (i4 < i2) {
            return -1;
        }
        return i4 < i3 ? 1 : 0;
    }

    @Override // p067l.C12253, p067l.AbstractC8229, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C6517) {
            C6517 c6517 = (C6517) list;
            return m48047(0, c6517.f16850, c6517.f16849);
        }
        if (list instanceof C21270) {
            C21270 c21270 = (C21270) list;
            return m48047(c21270.f34258, c21270.f34257, c21270.f66910.f16849);
        }
        return super.compareTo(list);
    }
}
