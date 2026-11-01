package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12729 extends AbstractC23457 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩹ */
    public static final C12729 f35752 = new C12729(C20796.f65364);

    /* JADX INFO: renamed from: ᩸ */
    public final int[] f35753;

    public final Object clone() {
        return this;
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.InterfaceC3340
    public final int getInt(int i) {
        int[] iArr = this.f35753;
        if (i < iArr.length) {
            return iArr[i];
        }
        throw new IndexOutOfBoundsException(C5410.m11876(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final int indexOf(int i) {
        int[] iArr = this.f35753;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final int lastIndexOf(int i) {
        int[] iArr = this.f35753;
        int length = iArr.length;
        while (true) {
            int i2 = length - 1;
            if (length == 0) {
                return -1;
            }
            if (i == iArr[i2]) {
                return i2;
            }
            length = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35753.length;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final InterfaceC3340 subList(int i, int i2) {
        if (i == 0 && i2 == this.f35753.length) {
            return this;
        }
        m28310(i);
        m28310(i2);
        if (i == i2) {
            return f35752;
        }
        if (i <= i2) {
            return new C9395(this, i, i2);
        }
        throw new IllegalArgumentException(C20780.m46928("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f35753.length == 0;
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        int i = 0;
        while (true) {
            int[] iArr = this.f35753;
            if (i >= iArr.length) {
                return;
            }
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo5873() {
        int[] iArr = this.f35753;
        return iArr.length == 0 ? C20796.f65364 : (int[]) iArr.clone();
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final InterfaceC16750 listIterator(int i) {
        m28310(i);
        return new C13419(this, i);
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5825(int i, int i2, int i3, int[] iArr) {
        C11755.m26983(iArr.length, i2, i3);
        System.arraycopy(this.f35753, i, iArr, i2, i3);
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C4011(this);
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C4011(this);
    }

    @Override // p067l.AbstractC12293, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        int[] iArr;
        int[] iArr2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C12729) {
            C12729 c12729 = (C12729) obj;
            if (c12729 == this || (iArr2 = this.f35753) == (iArr = c12729.f35753)) {
                return true;
            }
            if (iArr2.length != iArr.length) {
                return false;
            }
            return Arrays.equals(iArr2, iArr);
        }
        if (obj instanceof C9395) {
            return ((C9395) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // p067l.AbstractC12293, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C12729) {
            int[] iArr = ((C12729) list).f35753;
            int[] iArr2 = this.f35753;
            if (iArr2 != iArr) {
                int length = iArr2.length;
                int length2 = iArr.length;
                int i = 0;
                while (i < length && i < length2) {
                    int iCompare = Integer.compare(iArr2[i], iArr[i]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i++;
                }
                if (i < length2) {
                    return -1;
                }
                if (i < length) {
                    return 1;
                }
            }
            return 0;
        }
        if (list instanceof C9395) {
            return -((C9395) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    public C12729(int[] iArr) {
        this.f35753 = iArr;
    }
}
