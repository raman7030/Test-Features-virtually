package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.֡᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBZE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3052 extends AbstractCollection implements InterfaceC10429, InterfaceC3456 {
    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(mo56527parallelStream());
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
        return C19828.convert(mo56528stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return mo5156(((Byte) obj).byteValue());
    }

    @Override // p067l.InterfaceC10429
    /* JADX INFO: renamed from: ᩳ */
    public boolean mo5156(byte b) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC10429
    /* JADX INFO: renamed from: ۧ */
    public boolean mo5155(byte b) {
        InterfaceC15122 it = iterator();
        while (it.hasNext()) {
            if (b == it.nextByte()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public void forEach(Consumer consumer) {
        C12826.requireNonNull(consumer);
        mo12741(consumer instanceof InterfaceC21829 ? (InterfaceC21829) consumer : new C7076(consumer));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC10429) {
            InterfaceC15122 it = ((InterfaceC10429) collection).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (mo5156(it.nextByte())) {
                    z = true;
                }
            }
            return z;
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo24120(((Byte) obj).byteValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo5155(((Byte) obj).byteValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC10429) {
            InterfaceC15122 it = ((InterfaceC10429) collection).iterator();
            while (it.hasNext()) {
                if (!mo24120(it.nextByte())) {
                    return false;
                }
            }
            return true;
        }
        return super.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC10429) {
            InterfaceC15122 it = ((InterfaceC10429) collection).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (mo5155(it.nextByte())) {
                    z = true;
                }
            }
            return z;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC10429) {
            InterfaceC10429 interfaceC10429 = (InterfaceC10429) collection;
            InterfaceC15122 it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!interfaceC10429.mo24120(it.nextByte())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC15122 it = iterator();
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
                sb.append(String.valueOf((int) it.nextByte()));
                size = i;
            } else {
                sb.append(C0249l.f1198d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public boolean removeIf(final Predicate predicate) {
        return mo5154(predicate instanceof InterfaceC15792 ? (InterfaceC15792) predicate : new InterfaceC15792() { // from class: l.֨᩺ۘ
            @Override // java.util.function.IntPredicate
            public final /* synthetic */ boolean test(int i) {
                return C24510.m54086(this, i);
            }

            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return C24510.m54085(this, intPredicate);
            }

            /* JADX INFO: renamed from: or */
            public final /* synthetic */ IntPredicate m7167or(IntPredicate intPredicate) {
                return C24510.m54088(this, intPredicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                return C24510.m54087(this, (Byte) obj);
            }

            @Override // p067l.InterfaceC15792
            /* JADX INFO: renamed from: ֫ */
            public final C13782 mo7169(InterfaceC15792 interfaceC15792) {
                return new C13782(this, interfaceC15792);
            }

            @Override // java.util.function.Predicate
            public final Predicate and(Predicate predicate2) {
                return C20697.$default$and(this, predicate2);
            }

            public final IntPredicate negate() {
                return new C14452(this);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate, reason: collision with other method in class */
            public final Predicate mo55838negate() {
                return new C14452(this);
            }

            @Override // p067l.InterfaceC15792
            /* JADX INFO: renamed from: ۧ */
            public final C8417 mo7170(InterfaceC15792 interfaceC15792) {
                return new C8417(this, interfaceC15792);
            }

            /* JADX INFO: renamed from: or */
            public final Predicate m7168or(Predicate predicate2) {
                return C20697.$default$or(this, predicate2);
            }

            @Override // p067l.InterfaceC15792
            /* JADX INFO: renamed from: ۧ */
            public final boolean mo7171(byte b) {
                return predicate.test(Byte.valueOf(C5065.m10796((int) b)));
            }
        });
    }

    @Override // p067l.InterfaceC10429
    /* JADX INFO: renamed from: ֫ */
    public boolean mo5154(InterfaceC15792 interfaceC15792) {
        InterfaceC15122 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC15792.mo7171(it.nextByte())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public final InterfaceC19157 mo56528stream() {
        return C16474.stream(C7480.m17261b(this), false);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC19157 mo56527parallelStream() {
        return C16474.stream(C7480.m17261b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
