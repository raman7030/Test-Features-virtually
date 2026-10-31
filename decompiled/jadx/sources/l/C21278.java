package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩸֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21278 extends C8915 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21983 f68628;

    @Override // l.C3976, l.AbstractC19499, l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21278(C21983 c21983, int i, int i2) {
        super(c21983, i, i2);
        this.f68628 = c21983;
    }

    @Override // l.C3976, l.InterfaceC1084
    public final char getChar(int i) {
        m44913(i);
        return this.f68628.f70388[i + this.f12619];
    }

    @Override // l.AbstractC19499, l.InterfaceC1084, java.util.List
    public final ListIterator listIterator(int i) {
        return new C7871(this, i);
    }

    @Override // l.C3976, l.AbstractC19499, l.InterfaceC1084, java.util.List
    public final InterfaceC15194 listIterator(int i) {
        return new C7871(this, i);
    }

    @Override // l.C3976, l.AbstractC19499, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C14926(this);
    }

    @Override // l.C3976, l.AbstractC19499, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16770 spliterator() {
        return new C14926(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m48298(char[] cArr, int i, int i2) {
        C21983 c21983 = this.f68628;
        char[] cArr2 = c21983.f70388;
        int i3 = this.f12619;
        if (cArr2 == cArr && i3 == i && this.f12618 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f12618) {
            int i4 = i3 + 1;
            char c = c21983.f70388[i3];
            int i5 = i + 1;
            if (c != cArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC19499, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C21983) {
            C21983 c21983 = (C21983) obj;
            return m48298(c21983.f70388, 0, c21983.f70389);
        }
        if (obj instanceof C21278) {
            C21278 c21278 = (C21278) obj;
            return m48298(c21278.f68628.f70388, c21278.f12619, c21278.f12618);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m48297(char[] cArr, int i, int i2) {
        int i3;
        C21983 c21983 = this.f68628;
        char[] cArr2 = c21983.f70388;
        int i4 = this.f12619;
        if (cArr2 == cArr && i4 == i && this.f12618 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f12618;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Character.compare(c21983.f70388[i4], cArr[i]);
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

    @Override // l.C3976, l.AbstractC19499, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C21983) {
            C21983 c21983 = (C21983) list;
            return m48297(c21983.f70388, 0, c21983.f70389);
        }
        if (list instanceof C21278) {
            C21278 c21278 = (C21278) list;
            return m48297(c21278.f68628.f70388, c21278.f12619, c21278.f12618);
        }
        return super.compareTo(list);
    }
}
