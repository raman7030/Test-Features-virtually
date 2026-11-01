package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۘܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91W */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6238 extends AbstractCollection implements InterfaceC12984, InterfaceC3456 {
    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public /* synthetic */ void forEach(Consumer consumer) {
        C21031.m47445(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(mo56527parallelStream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C4266.m8670(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C23554.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(mo56528stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return add(((Float) obj).floatValue());
    }

    public boolean add(float f) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean mo6350(float f) {
        InterfaceC3595 it = iterator();
        while (it.hasNext()) {
            if (f == it.nextFloat()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC2924
    /* JADX INFO: renamed from: ۧ */
    public void mo4794(InterfaceC6278 interfaceC6278) {
        iterator().forEachRemaining(interfaceC6278);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo14151(InterfaceC12984 interfaceC12984) {
        InterfaceC3595 it = interfaceC12984.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.nextFloat())) {
                z = true;
            }
        }
        return z;
    }

    @Override // p067l.InterfaceC12984
    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public final boolean add(Float f) {
        return add(f.floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC12984) {
            return mo14151((InterfaceC12984) collection);
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p067l.InterfaceC12984
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo18969(((Float) obj).floatValue());
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo14154(InterfaceC12984 interfaceC12984) {
        InterfaceC3595 it = interfaceC12984.iterator();
        while (it.hasNext()) {
            if (!mo18969(it.nextFloat())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p067l.InterfaceC12984
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo6350(((Float) obj).floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC12984) {
            return mo14154((InterfaceC12984) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo14155(InterfaceC12984 interfaceC12984) {
        InterfaceC3595 it = interfaceC12984.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo6350(it.nextFloat())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC12984) {
            return mo14155((InterfaceC12984) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo14156(InterfaceC12984 interfaceC12984) {
        InterfaceC3595 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC12984.mo18969(it.nextFloat())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC12984) {
            return mo14156((InterfaceC12984) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC3595 it = iterator();
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
                sb.append(String.valueOf(it.nextFloat()));
                size = i;
            } else {
                sb.append(C0249l.f1198d);
                return sb.toString();
            }
        }
    }

    @Override // p067l.InterfaceC12984
    /* JADX INFO: renamed from: ֫ */
    public boolean mo14152(InterfaceC24382 interfaceC24382) {
        InterfaceC3595 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC24382.mo19088(it.nextFloat())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, p067l.InterfaceC12984, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public final InterfaceC19157 mo56528stream() {
        return C16474.stream(C7480.m17261b(this), false);
    }

    @Override // java.util.Collection, p067l.InterfaceC12984, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC19157 mo56527parallelStream() {
        return C16474.stream(C7480.m17261b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
