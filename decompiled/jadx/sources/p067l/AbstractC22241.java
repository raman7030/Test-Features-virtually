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

/* JADX INFO: renamed from: l.᩷ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC92 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22241 extends AbstractCollection implements InterfaceC7838, InterfaceC3456 {
    public /* synthetic */ void forEach(Consumer consumer) {
        C22176.m49987(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(parallelStream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C11862.m27167(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
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

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return mo11023(((Character) obj).charValue());
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo11023(char c) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean mo4382(char c) {
        InterfaceC17480 it = iterator();
        while (it.hasNext()) {
            if (c == it.mo9752()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12109(InterfaceC24857 interfaceC24857) {
        iterator().forEachRemaining(interfaceC24857);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo30205(InterfaceC7838 interfaceC7838) {
        InterfaceC17480 it = interfaceC7838.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo11023(it.mo9752())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC7838) {
            return mo30205((InterfaceC7838) collection);
        }
        return super.addAll(collection);
    }

    @Override // p067l.InterfaceC7838
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final boolean add(Character ch) {
        return mo11023(ch.charValue());
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo30206(InterfaceC7838 interfaceC7838) {
        InterfaceC17480 it = interfaceC7838.iterator();
        while (it.hasNext()) {
            if (!mo11024(it.mo9752())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p067l.InterfaceC7838
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo11024(((Character) obj).charValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC7838) {
            return mo30206((InterfaceC7838) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo30207(InterfaceC7838 interfaceC7838) {
        InterfaceC17480 it = interfaceC7838.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo4382(it.mo9752())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p067l.InterfaceC7838
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo4382(((Character) obj).charValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC7838) {
            return mo30207((InterfaceC7838) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo30208(InterfaceC7838 interfaceC7838) {
        InterfaceC17480 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC7838.mo11024(it.mo9752())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC7838) {
            return mo30208((InterfaceC7838) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC17480 it = iterator();
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
                sb.append(String.valueOf(it.mo9752()));
                size = i;
            } else {
                sb.append(C0249l.f1198d);
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo18126(InterfaceC8093 interfaceC8093) {
        InterfaceC17480 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC8093.mo11886(it.mo9752())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, p067l.InterfaceC7838
    public final InterfaceC19157 stream() {
        return C16474.stream(C7480.m17261b(this), false);
    }

    @Override // java.util.Collection, p067l.InterfaceC7838
    public final InterfaceC19157 parallelStream() {
        return C16474.stream(C7480.m17261b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
