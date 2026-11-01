package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۟ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9395 extends AbstractC23457 implements RandomAccess, Serializable {
    public static final long serialVersionUID = 7054639518438982401L;

    /* JADX INFO: renamed from: ۙ */
    public final int f25666;

    /* JADX INFO: renamed from: ᩶ */
    public final C12729 f25667;

    /* JADX INFO: renamed from: ᩸ */
    public final transient int[] f25668;

    /* JADX INFO: renamed from: ᩹ */
    public final int f25669;

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5825(int i, int i2, int i3, int[] iArr) {
        C11755.m26983(iArr.length, i2, i3);
        m28314(i);
        int i4 = this.f25669;
        if (i4 + i3 > this.f25666) {
            throw new IndexOutOfBoundsException("Final index " + (i4 + i3) + " (startingIndex: " + i4 + " + length: " + i3 + ") is greater then list length " + size());
        }
        System.arraycopy(this.f25668, i + i4, iArr, i2, i3);
    }

    @Override // p067l.InterfaceC3340
    public final int getInt(int i) {
        m28314(i);
        return this.f25668[i + this.f25669];
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final int indexOf(int i) {
        int i2 = this.f25669;
        for (int i3 = i2; i3 < this.f25666; i3++) {
            if (i == this.f25668[i3]) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final int lastIndexOf(int i) {
        int i2 = this.f25666;
        while (true) {
            int i3 = i2 - 1;
            int i4 = this.f25669;
            if (i2 == i4) {
                return -1;
            }
            if (i == this.f25668[i3]) {
                return i3 - i4;
            }
            i2 = i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25666 - this.f25669;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f25666 <= this.f25669;
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        for (int i = this.f25669; i < this.f25666; i++) {
            intConsumer.accept(this.f25668[i]);
        }
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo5873() {
        return Arrays.copyOfRange(this.f25668, this.f25669, this.f25666);
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final InterfaceC16750 listIterator(int i) {
        m28310(i);
        return new C24147(this, i);
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C15429(this);
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C15429(this);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m21882(int i, int i2, int[] iArr) {
        int i3 = this.f25666;
        int i4 = this.f25669;
        int[] iArr2 = this.f25668;
        if (iArr2 == iArr && i4 == i && i3 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i4 < i3) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            if (iArr2[i4] != iArr[i]) {
                return false;
            }
            i4 = i5;
            i = i6;
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
        if (obj instanceof C12729) {
            C12729 c12729 = (C12729) obj;
            return m21882(0, c12729.size(), c12729.f35753);
        }
        if (obj instanceof C9395) {
            C9395 c9395 = (C9395) obj;
            return m21882(c9395.f25669, c9395.f25666, c9395.f25668);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m21881(int i, int i2, int[] iArr) {
        int i3 = this.f25666;
        int i4 = this.f25669;
        int[] iArr2 = this.f25668;
        if (iArr2 == iArr && i4 == i && i3 == i2) {
            return 0;
        }
        while (i4 < i3 && i4 < i2) {
            int iCompare = Integer.compare(iArr2[i4], iArr[i]);
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

    @Override // p067l.AbstractC12293, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C12729) {
            C12729 c12729 = (C12729) list;
            return m21881(0, c12729.size(), c12729.f35753);
        }
        if (list instanceof C9395) {
            C9395 c9395 = (C9395) list;
            return m21881(c9395.f25669, c9395.f25666, c9395.f25668);
        }
        return super.compareTo(list);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return this.f25667.subList(this.f25669, this.f25666);
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final InterfaceC3340 subList(int i, int i2) {
        m28310(i);
        m28310(i2);
        if (i == i2) {
            return C12729.f35752;
        }
        if (i > i2) {
            throw new IllegalArgumentException(C20780.m46928("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        int i3 = this.f25669;
        return new C9395(this.f25667, i + i3, i2 + i3);
    }

    public C9395(C12729 c12729, int i, int i2) {
        this.f25667 = c12729;
        this.f25669 = i;
        this.f25666 = i2;
        this.f25668 = c12729.f35753;
    }
}
