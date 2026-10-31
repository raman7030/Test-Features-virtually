package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۡۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes4.dex */
public final class C8805 extends C4797 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15859 f26810;

    @Override // l.C12558, l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8805(C15859 c15859, int i, int i2) {
        super(c15859, i, i2);
        this.f26810 = c15859;
    }

    @Override // l.C12558, l.InterfaceC1022
    public final int getInt(int i) {
        m26285(i);
        return this.f26810.f49020[i + this.f37861];
    }

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final ListIterator listIterator(int i) {
        return new C20800(this, i);
    }

    @Override // l.C12558, l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final InterfaceC15132 listIterator(int i) {
        return new C20800(this, i);
    }

    @Override // l.C12558, l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C9511(this);
    }

    @Override // l.C12558, l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C9511(this);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m22709(int i, int i2, int[] iArr) {
        C15859 c15859 = this.f26810;
        int[] iArr2 = c15859.f49020;
        int i3 = this.f37861;
        if (iArr2 == iArr && i3 == i && this.f37860 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f37860) {
            int i4 = i3 + 1;
            int i5 = c15859.f49020[i3];
            int i6 = i + 1;
            if (i5 != iArr[i]) {
                return false;
            }
            i = i6;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC10442, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C15859) {
            C15859 c15859 = (C15859) obj;
            return m22709(0, c15859.f49021, c15859.f49020);
        }
        if (obj instanceof C8805) {
            C8805 c8805 = (C8805) obj;
            return m22709(c8805.f37861, c8805.f37860, c8805.f26810.f49020);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22708(int i, int i2, int[] iArr) {
        int i3;
        C15859 c15859 = this.f26810;
        int[] iArr2 = c15859.f49020;
        int i4 = this.f37861;
        if (iArr2 == iArr && i4 == i && this.f37860 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f37860;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Integer.compare(c15859.f49020[i4], iArr[i]);
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

    @Override // l.C12558, l.AbstractC10442, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C15859) {
            C15859 c15859 = (C15859) list;
            return m22708(0, c15859.f49021, c15859.f49020);
        }
        if (list instanceof C8805) {
            C8805 c8805 = (C8805) list;
            return m22708(c8805.f37861, c8805.f37860, c8805.f26810.f49020);
        }
        return super.compareTo(list);
    }
}
