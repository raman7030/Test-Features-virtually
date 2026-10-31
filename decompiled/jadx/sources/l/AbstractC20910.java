package l;

import com.alipay.sdk.m.y.l;
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
public abstract class AbstractC20910 extends AbstractCollection implements InterfaceC5755, InterfaceC1144 {
    public /* synthetic */ void forEach(Consumer consumer) {
        C20841.m47659(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C9989.m25150(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C22291.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return mo8955(((Character) obj).charValue());
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo8955(char c) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean mo2005(char c) {
        InterfaceC15900 it = iterator();
        while (it.hasNext()) {
            if (c == it.mo7691()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10076(InterfaceC23662 interfaceC23662) {
        iterator().forEachRemaining(interfaceC23662);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo28161(InterfaceC5755 interfaceC5755) {
        InterfaceC15900 it = interfaceC5755.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo8955(it.mo7691())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC5755) {
            return mo28161((InterfaceC5755) collection);
        }
        return super.addAll(collection);
    }

    @Override // l.InterfaceC5755
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final boolean add(Character ch) {
        return mo8955(ch.charValue());
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo28162(InterfaceC5755 interfaceC5755) {
        InterfaceC15900 it = interfaceC5755.iterator();
        while (it.hasNext()) {
            if (!mo8956(it.mo7691())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC5755
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo8956(((Character) obj).charValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC5755) {
            return mo28162((InterfaceC5755) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo28163(InterfaceC5755 interfaceC5755) {
        InterfaceC15900 it = interfaceC5755.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo2005(it.mo7691())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC5755
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo2005(((Character) obj).charValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC5755) {
            return mo28163((InterfaceC5755) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo28164(InterfaceC5755 interfaceC5755) {
        InterfaceC15900 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC5755.mo8956(it.mo7691())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC5755) {
            return mo28164((InterfaceC5755) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC15900 it = iterator();
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
                sb.append(String.valueOf(it.mo7691()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo16207(InterfaceC6023 interfaceC6023) {
        InterfaceC15900 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC6023.mo9839(it.mo7691())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC5755
    public final InterfaceC17664 stream() {
        return C14841.stream(C5378.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC5755
    public final InterfaceC17664 parallelStream() {
        return C14841.stream(C5378.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
