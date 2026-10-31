package l;

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
public final class C7393 extends AbstractC22189 implements RandomAccess, Serializable {
    public static final long serialVersionUID = 7054639518438982401L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f22754;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10901 f22755;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final transient int[] f22756;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f22757;

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3538(int i, int i2, int i3, int[] iArr) {
        C9876.m24968(iArr.length, i2, i3);
        m26285(i);
        int i4 = this.f22757;
        if (i4 + i3 > this.f22754) {
            throw new IndexOutOfBoundsException("Final index " + (i4 + i3) + " (startingIndex: " + i4 + " + length: " + i3 + ") is greater then list length " + size());
        }
        System.arraycopy(this.f22756, i + i4, iArr, i2, i3);
    }

    @Override // l.InterfaceC1022
    public final int getInt(int i) {
        m26285(i);
        return this.f22756[i + this.f22757];
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final int indexOf(int i) {
        int i2 = this.f22757;
        for (int i3 = i2; i3 < this.f22754; i3++) {
            if (i == this.f22756[i3]) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final int lastIndexOf(int i) {
        int i2 = this.f22754;
        while (true) {
            int i3 = i2 - 1;
            int i4 = this.f22757;
            if (i2 == i4) {
                return -1;
            }
            if (i == this.f22756[i3]) {
                return i3 - i4;
            }
            i2 = i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22754 - this.f22757;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f22754 <= this.f22757;
    }

    @Override // l.AbstractC10442, l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        for (int i = this.f22757; i < this.f22754; i++) {
            intConsumer.accept(this.f22756[i]);
        }
    }

    @Override // l.AbstractC10442, l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo3586() {
        return Arrays.copyOfRange(this.f22756, this.f22757, this.f22754);
    }

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final InterfaceC15132 listIterator(int i) {
        m26281(i);
        return new C22915(this, i);
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C13742(this);
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C13742(this);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m19909(int i, int i2, int[] iArr) {
        int i3 = this.f22754;
        int i4 = this.f22757;
        int[] iArr2 = this.f22756;
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

    @Override // l.AbstractC10442, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C10901) {
            C10901 c10901 = (C10901) obj;
            return m19909(0, c10901.size(), c10901.f32775);
        }
        if (obj instanceof C7393) {
            C7393 c7393 = (C7393) obj;
            return m19909(c7393.f22757, c7393.f22754, c7393.f22756);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m19908(int i, int i2, int[] iArr) {
        int i3 = this.f22754;
        int i4 = this.f22757;
        int[] iArr2 = this.f22756;
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

    @Override // l.AbstractC10442, java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int compareTo(List list) {
        if (list instanceof C10901) {
            C10901 c10901 = (C10901) list;
            return m19908(0, c10901.size(), c10901.f32775);
        }
        if (list instanceof C7393) {
            C7393 c7393 = (C7393) list;
            return m19908(c7393.f22757, c7393.f22754, c7393.f22756);
        }
        return super.compareTo(list);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return this.f22755.subList(this.f22757, this.f22754);
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final InterfaceC1022 subList(int i, int i2) {
        m26281(i);
        m26281(i2);
        if (i == i2) {
            return C10901.f32774;
        }
        if (i > i2) {
            throw new IllegalArgumentException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        int i3 = this.f22757;
        return new C7393(this.f22755, i + i3, i2 + i3);
    }

    public C7393(C10901 c10901, int i, int i2) {
        this.f22755 = c10901;
        this.f22757 = i;
        this.f22754 = i2;
        this.f22756 = c10901.f32775;
    }
}
