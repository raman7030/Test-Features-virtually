package p067l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۡۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes4.dex */
public final class C10737 extends C6928 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C17441 f29735;

    @Override // p067l.C14304, p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10737(C17441 c17441, int i, int i2) {
        super(c17441, i, i2);
        this.f29735 = c17441;
    }

    @Override // p067l.C14304, p067l.InterfaceC3340
    public final int getInt(int i) {
        m28314(i);
        return this.f29735.f52158[i + this.f40887];
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final ListIterator listIterator(int i) {
        return new C22137(this, i);
    }

    @Override // p067l.C14304, p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final InterfaceC16750 listIterator(int i) {
        return new C22137(this, i);
    }

    @Override // p067l.C14304, p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C11408(this);
    }

    @Override // p067l.C14304, p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C11408(this);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m24679(int i, int i2, int[] iArr) {
        C17441 c17441 = this.f29735;
        int[] iArr2 = c17441.f52158;
        int i3 = this.f40887;
        if (iArr2 == iArr && i3 == i && this.f40886 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f40886) {
            int i4 = i3 + 1;
            int i5 = c17441.f52158[i3];
            int i6 = i + 1;
            if (i5 != iArr[i]) {
                return false;
            }
            i = i6;
            i3 = i4;
        }
        return true;
    }

    @Override // p067l.AbstractC12293, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C17441) {
            C17441 c17441 = (C17441) obj;
            return m24679(0, c17441.f52159, c17441.f52158);
        }
        if (obj instanceof C10737) {
            C10737 c10737 = (C10737) obj;
            return m24679(c10737.f40887, c10737.f40886, c10737.f29735.f52158);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m24678(int i, int i2, int[] iArr) {
        int i3;
        C17441 c17441 = this.f29735;
        int[] iArr2 = c17441.f52158;
        int i4 = this.f40887;
        if (iArr2 == iArr && i4 == i && this.f40886 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f40886;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Integer.compare(c17441.f52158[i4], iArr[i]);
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

    @Override // p067l.C14304, p067l.AbstractC12293, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C17441) {
            C17441 c17441 = (C17441) list;
            return m24678(0, c17441.f52159, c17441.f52158);
        }
        if (list instanceof C10737) {
            C10737 c10737 = (C10737) list;
            return m24678(c10737.f40887, c10737.f40886, c10737.f29735.f52158);
        }
        return super.compareTo(list);
    }
}
