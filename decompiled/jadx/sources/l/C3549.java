package l;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۗ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T61X */
/* JADX INFO: loaded from: classes3.dex */
public final class C3549 extends AbstractList implements RandomAccess, Serializable, InterfaceC11728 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f11281;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f11282;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f11283;

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public /* synthetic */ void forEach(Consumer consumer) {
        C21962.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(mo42463parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public /* synthetic */ InterfaceC17664 mo42463parallelStream() {
        return C14841.stream(C5378.b(this), true);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C0438.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, l.InterfaceC11728
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C10317.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, l.InterfaceC11728
    public /* synthetic */ void sort(Comparator comparator) {
        C10317.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(mo42464stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public /* synthetic */ InterfaceC17664 mo42464stream() {
        return C14841.stream(C5378.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        C4025.m12103(i, size());
        int i2 = this.f11281 + i;
        int[] iArr = this.f11282;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    public C3549(int i, int i2, int[] iArr) {
        this.f11282 = iArr;
        this.f11281 = i;
        this.f11283 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11283 - this.f11281;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C4025.m12103(i, size());
        return Integer.valueOf(this.f11282[this.f11281 + i]);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, l.InterfaceC11728, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return C22291.spliterator(this.f11282, this.f11281, this.f11283, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && C13426.m32445(((Integer) obj).intValue(), this.f11281, this.f11283, this.f11282) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f11283;
        int i2 = this.f11281;
        int iM32445 = C13426.m32445(iIntValue, i2, i, this.f11282);
        if (iM32445 >= 0) {
            return iM32445 - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f11283;
            do {
                i2--;
                i = this.f11281;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
            } while (this.f11282[i2] != iIntValue);
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        C4025.m12104(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.f11281;
        return new C3549(i + i3, i3 + i2, this.f11282);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3549) {
            C3549 c3549 = (C3549) obj;
            int size = size();
            if (c3549.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f11282[this.f11281 + i] != c3549.f11282[c3549.f11281 + i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f11281; i2 < this.f11283; i2++) {
            i = (i * 31) + this.f11282[i2];
        }
        return i;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f11282;
        int i = this.f11281;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i < this.f11283) {
                sb.append(", ");
                sb.append(iArr[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
