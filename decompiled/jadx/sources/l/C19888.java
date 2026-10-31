package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩶ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19888 extends C3344 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4365 f64274;

    @Override // l.C10400, l.AbstractC6166, l.AbstractC22394, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19888(C4365 c4365, int i, int i2) {
        super(c4365, i, i2);
        this.f64274 = c4365;
    }

    @Override // l.C10400, l.InterfaceC2289
    public final long getLong(int i) {
        m17073(i);
        return this.f64274.f14034[i + this.f31293];
    }

    @Override // l.AbstractC6166, l.InterfaceC2289, java.util.List
    public final ListIterator listIterator(int i) {
        return new C21299(this, i);
    }

    @Override // l.C10400, l.AbstractC6166, l.InterfaceC2289, java.util.List
    public final InterfaceC3700 listIterator(int i) {
        return new C21299(this, i);
    }

    @Override // l.C10400, l.AbstractC6166, l.AbstractC22394, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC0877 spliterator() {
        return new C22004(this);
    }

    @Override // l.C10400, l.AbstractC6166, l.AbstractC22394, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C22004(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m45737(int i, int i2, long[] jArr) {
        C4365 c4365 = this.f64274;
        long[] jArr2 = c4365.f14034;
        int i3 = this.f31293;
        if (jArr2 == jArr && i3 == i && this.f31292 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f31292) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            if (c4365.f14034[i3] != jArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC6166, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C4365) {
            C4365 c4365 = (C4365) obj;
            return m45737(0, c4365.f14035, c4365.f14034);
        }
        if (obj instanceof C19888) {
            C19888 c19888 = (C19888) obj;
            return m45737(c19888.f31293, c19888.f31292, c19888.f64274.f14034);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m45736(int i, int i2, long[] jArr) {
        int i3;
        C4365 c4365 = this.f64274;
        long[] jArr2 = c4365.f14034;
        int i4 = this.f31293;
        if (jArr2 == jArr && i4 == i && this.f31292 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f31292;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Long.compare(c4365.f14034[i4], jArr[i]);
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

    @Override // l.C10400, l.AbstractC6166, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C4365) {
            C4365 c4365 = (C4365) list;
            return m45736(0, c4365.f14035, c4365.f14034);
        }
        if (list instanceof C19888) {
            C19888 c19888 = (C19888) list;
            return m45736(c19888.f31293, c19888.f31292, c19888.f64274.f14034);
        }
        return super.compareTo(list);
    }
}
