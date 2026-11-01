package p067l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩸֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes5.dex */
public final class C22591 extends C10841 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C23261 f71311;

    @Override // p067l.C6147, p067l.AbstractC20900, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22591(C23261 c23261, int i, int i2) {
        super(c23261, i, i2);
        this.f71311 = c23261;
    }

    @Override // p067l.C6147, p067l.InterfaceC3399
    public final char getChar(int i) {
        m47211(i);
        return this.f71311.f73099[i + this.f15430];
    }

    @Override // p067l.AbstractC20900, p067l.InterfaceC3399, java.util.List
    public final ListIterator listIterator(int i) {
        return new C9849(this, i);
    }

    @Override // p067l.C6147, p067l.AbstractC20900, p067l.InterfaceC3399, java.util.List
    public final InterfaceC16809 listIterator(int i) {
        return new C9849(this, i);
    }

    @Override // p067l.C6147, p067l.AbstractC20900, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C16554(this);
    }

    @Override // p067l.C6147, p067l.AbstractC20900, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18307 spliterator() {
        return new C16554(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m50629(char[] cArr, int i, int i2) {
        C23261 c23261 = this.f71311;
        char[] cArr2 = c23261.f73099;
        int i3 = this.f15430;
        if (cArr2 == cArr && i3 == i && this.f15429 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f15429) {
            int i4 = i3 + 1;
            char c = c23261.f73099[i3];
            int i5 = i + 1;
            if (c != cArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // p067l.AbstractC20900, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C23261) {
            C23261 c23261 = (C23261) obj;
            return m50629(c23261.f73099, 0, c23261.f73100);
        }
        if (obj instanceof C22591) {
            C22591 c22591 = (C22591) obj;
            return m50629(c22591.f71311.f73099, c22591.f15430, c22591.f15429);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m50628(char[] cArr, int i, int i2) {
        int i3;
        C23261 c23261 = this.f71311;
        char[] cArr2 = c23261.f73099;
        int i4 = this.f15430;
        if (cArr2 == cArr && i4 == i && this.f15429 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f15429;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Character.compare(c23261.f73099[i4], cArr[i]);
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

    @Override // p067l.C6147, p067l.AbstractC20900, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C23261) {
            C23261 c23261 = (C23261) list;
            return m50628(c23261.f73099, 0, c23261.f73100);
        }
        if (list instanceof C22591) {
            C22591 c22591 = (C22591) list;
            return m50628(c22591.f71311.f73099, c22591.f15430, c22591.f15429);
        }
        return super.compareTo(list);
    }
}
