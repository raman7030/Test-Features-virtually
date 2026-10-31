package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ᩴ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18413 extends C7228 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19119 f57160;

    @Override // l.C16833, l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18413(C19119 c19119, int i, int i2) {
        super(c19119, i, i2);
        this.f57160 = c19119;
    }

    @Override // l.C16833, java.util.List
    public final Object get(int i) {
        m42526(i);
        return this.f57160.f60231[i + this.f51683];
    }

    @Override // l.AbstractC18245, l.InterfaceC1625, java.util.List
    public final ListIterator listIterator(int i) {
        return new C2185(this, i);
    }

    @Override // l.C16833, l.AbstractC18245, l.InterfaceC1625, java.util.List
    public final InterfaceC10798 listIterator(int i) {
        return new C2185(this, i);
    }

    @Override // l.C16833, l.AbstractC18245, l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC19825, l.InterfaceC1144, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C3596(this);
    }

    @Override // l.C16833, l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C3596(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m42837(int i, int i2, Object[] objArr) {
        C19119 c19119 = this.f57160;
        Object[] objArr2 = c19119.f60231;
        int i3 = this.f51683;
        if (objArr2 == objArr && i3 == i && this.f51682 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f51682) {
            int i4 = i3 + 1;
            Object obj = c19119.f60231[i3];
            int i5 = i + 1;
            if (!C11003.equals(obj, objArr[i])) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC18245, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C19119) {
            C19119 c19119 = (C19119) obj;
            return m42837(0, c19119.f60232, c19119.f60231);
        }
        if (obj instanceof C18413) {
            C18413 c18413 = (C18413) obj;
            return m42837(c18413.f51683, c18413.f51682, c18413.f57160.f60231);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m42836(int i, int i2, Object[] objArr) {
        int i3;
        int i4 = this.f51683;
        while (true) {
            i3 = this.f51682;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompareTo = ((Comparable) this.f57160.f60231[i4]).compareTo(objArr[i]);
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

    @Override // l.C16833, l.AbstractC18245, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C19119) {
            C19119 c19119 = (C19119) list;
            return m42836(0, c19119.f60232, c19119.f60231);
        }
        if (list instanceof C18413) {
            C18413 c18413 = (C18413) list;
            return m42836(c18413.f51683, c18413.f51682, c18413.f57160.f60231);
        }
        return super.compareTo(list);
    }
}
