package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩸ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1Q1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23022 extends AbstractCollection implements InterfaceC3360, InterfaceC3456 {
    public /* synthetic */ void forEach(Consumer consumer) {
        C18763.m42786(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(parallelStream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C7384.m17107(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C23554.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public boolean add(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo5872(int i) {
        InterfaceC8705 it = iterator();
        while (it.hasNext()) {
            if (i == it.nextInt()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public void forEach(IntConsumer intConsumer) {
        iterator().forEachRemaining(intConsumer);
    }

    /* JADX INFO: renamed from: ܶ */
    public int[] mo5873() {
        int size = size();
        if (size == 0) {
            return C20796.f65364;
        }
        int[] iArr = new int[size];
        InterfaceC8705 it = iterator();
        if (size < 0) {
            throw new IllegalArgumentException(C19768.m44906(size, "The maximum number of elements (", ") is negative"));
        }
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size == 0 || !it.hasNext()) {
                break;
            }
            iArr[i] = it.nextInt();
            i++;
            size = i2;
        }
        return iArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        return add(num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p067l.InterfaceC3360
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return contains(((Integer) obj).intValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo18622(InterfaceC3360 interfaceC3360) {
        InterfaceC8705 it = interfaceC3360.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.nextInt())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p067l.InterfaceC3360
    @Deprecated
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo5872(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC3360) {
            return mo18622((InterfaceC3360) collection);
        }
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo23492(InterfaceC3360 interfaceC3360) {
        InterfaceC8705 it = interfaceC3360.iterator();
        while (it.hasNext()) {
            if (!contains(it.nextInt())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC3360) {
            return mo23492((InterfaceC3360) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo23493(InterfaceC3360 interfaceC3360) {
        InterfaceC8705 it = interfaceC3360.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo5872(it.nextInt())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC3360) {
            return mo23493((InterfaceC3360) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo23494(InterfaceC3360 interfaceC3360) {
        InterfaceC8705 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC3360.contains(it.nextInt())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC3360) {
            return mo23494((InterfaceC3360) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC8705 it = iterator();
        int size = size();
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(String.valueOf(it.nextInt()));
                size = i;
            } else {
                sb.append(C0249l.f1198d);
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo5871(IntPredicate intPredicate) {
        C12826.requireNonNull(intPredicate);
        InterfaceC8705 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (intPredicate.test(it.nextInt())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, p067l.InterfaceC3360
    public final InterfaceC19157 stream() {
        return C16474.stream(C7480.m17261b(this), false);
    }

    @Override // java.util.Collection, p067l.InterfaceC3360
    public final InterfaceC19157 parallelStream() {
        return C16474.stream(C7480.m17261b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
