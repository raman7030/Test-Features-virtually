package p067l;

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
public final class C5742 extends AbstractList implements RandomAccess, Serializable, InterfaceC13515 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶ */
    public final int f14087;

    /* JADX INFO: renamed from: ᩸ */
    public final int[] f14088;

    /* JADX INFO: renamed from: ᩹ */
    public final int f14089;

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public /* synthetic */ void forEach(Consumer consumer) {
        C23241.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(mo56527parallelStream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public /* synthetic */ InterfaceC19157 mo56527parallelStream() {
        return C16474.stream(C7480.m17261b(this), true);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C2785.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C12174.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public /* synthetic */ void sort(Comparator comparator) {
        C12174.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(mo56528stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public /* synthetic */ InterfaceC19157 mo56528stream() {
        return C16474.stream(C7480.m17261b(this), false);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        C6194.m14023(i, size());
        int i2 = this.f14087 + i;
        int[] iArr = this.f14088;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    public C5742(int i, int i2, int[] iArr) {
        this.f14088 = iArr;
        this.f14087 = i;
        this.f14089 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14089 - this.f14087;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C6194.m14023(i, size());
        return Integer.valueOf(this.f14088[this.f14087 + i]);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, p067l.InterfaceC13515, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return C23554.spliterator(this.f14088, this.f14087, this.f14089, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && C15129.m34547(((Integer) obj).intValue(), this.f14087, this.f14089, this.f14088) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f14089;
        int i2 = this.f14087;
        int iM34547 = C15129.m34547(iIntValue, i2, i, this.f14088);
        if (iM34547 >= 0) {
            return iM34547 - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f14089;
            do {
                i2--;
                i = this.f14087;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
            } while (this.f14088[i2] != iIntValue);
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        C6194.m14024(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.f14087;
        return new C5742(i + i3, i3 + i2, this.f14088);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5742) {
            C5742 c5742 = (C5742) obj;
            int size = size();
            if (c5742.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f14088[this.f14087 + i] != c5742.f14088[c5742.f14087 + i]) {
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
        for (int i2 = this.f14087; i2 < this.f14089; i2++) {
            i = (i * 31) + this.f14088[i2];
        }
        return i;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f14088;
        int i = this.f14087;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i < this.f14089) {
                sb.append(", ");
                sb.append(iArr[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
