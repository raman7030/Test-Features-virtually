package l;

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
public final class C10901 extends AbstractC22189 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C10901 f32774 = new C10901(C19389.f62753);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f32775;

    public final Object clone() {
        return this;
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.InterfaceC1022
    public final int getInt(int i) {
        int[] iArr = this.f32775;
        if (i < iArr.length) {
            return iArr[i];
        }
        throw new IndexOutOfBoundsException(C3200.m9831(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final int indexOf(int i) {
        int[] iArr = this.f32775;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final int lastIndexOf(int i) {
        int[] iArr = this.f32775;
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
        return this.f32775.length;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final InterfaceC1022 subList(int i, int i2) {
        if (i == 0 && i2 == this.f32775.length) {
            return this;
        }
        m26281(i);
        m26281(i2);
        if (i == i2) {
            return f32774;
        }
        if (i <= i2) {
            return new C7393(this, i, i2);
        }
        throw new IllegalArgumentException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f32775.length == 0;
    }

    @Override // l.AbstractC10442, l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        int i = 0;
        while (true) {
            int[] iArr = this.f32775;
            if (i >= iArr.length) {
                return;
            }
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // l.AbstractC10442, l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo3586() {
        int[] iArr = this.f32775;
        return iArr.length == 0 ? C19389.f62753 : (int[]) iArr.clone();
    }

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final InterfaceC15132 listIterator(int i) {
        m26281(i);
        return new C11627(this, i);
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3538(int i, int i2, int i3, int[] iArr) {
        C9876.m24968(iArr.length, i2, i3);
        System.arraycopy(this.f32775, i, iArr, i2, i3);
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C1728(this);
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C1728(this);
    }

    @Override // l.AbstractC10442, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        int[] iArr;
        int[] iArr2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C10901) {
            C10901 c10901 = (C10901) obj;
            if (c10901 == this || (iArr2 = this.f32775) == (iArr = c10901.f32775)) {
                return true;
            }
            if (iArr2.length != iArr.length) {
                return false;
            }
            return Arrays.equals(iArr2, iArr);
        }
        if (obj instanceof C7393) {
            return ((C7393) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC10442, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C10901) {
            int[] iArr = ((C10901) list).f32775;
            int[] iArr2 = this.f32775;
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
        if (list instanceof C7393) {
            return -((C7393) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    public C10901(int[] iArr) {
        this.f32775 = iArr;
    }
}
