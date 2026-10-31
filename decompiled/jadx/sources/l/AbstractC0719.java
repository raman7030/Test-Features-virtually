package l;

import com.alipay.sdk.m.y.l;
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
public abstract class AbstractC0719 extends AbstractCollection implements InterfaceC8481, InterfaceC1144 {
    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(mo42463parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C22291.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(mo42464stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return mo2827(((Byte) obj).byteValue());
    }

    @Override // l.InterfaceC8481
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo2827(byte b) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC8481
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo2826(byte b) {
        InterfaceC13419 it = iterator();
        while (it.hasNext()) {
            if (b == it.nextByte()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public void forEach(Consumer consumer) {
        C11003.requireNonNull(consumer);
        mo10760(consumer instanceof InterfaceC20476 ? (InterfaceC20476) consumer : new C4953(consumer));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC8481) {
            InterfaceC13419 it = ((InterfaceC8481) collection).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (mo2827(it.nextByte())) {
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
        return mo22151(((Byte) obj).byteValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo2826(((Byte) obj).byteValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC8481) {
            InterfaceC13419 it = ((InterfaceC8481) collection).iterator();
            while (it.hasNext()) {
                if (!mo22151(it.nextByte())) {
                    return false;
                }
            }
            return true;
        }
        return super.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC8481) {
            InterfaceC13419 it = ((InterfaceC8481) collection).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (mo2826(it.nextByte())) {
                    z = true;
                }
            }
            return z;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC8481) {
            InterfaceC8481 interfaceC8481 = (InterfaceC8481) collection;
            InterfaceC13419 it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!interfaceC8481.mo22151(it.nextByte())) {
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
        InterfaceC13419 it = iterator();
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
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public boolean removeIf(final Predicate predicate) {
        return mo2825(predicate instanceof InterfaceC14124 ? (InterfaceC14124) predicate : new InterfaceC14124() { // from class: l.֨᩺ۘ
            @Override // java.util.function.IntPredicate
            public final /* synthetic */ boolean test(int i) {
                return C23297.m51690(this, i);
            }

            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return C23297.m51689(this, intPredicate);
            }

            public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return C23297.m51692(this, intPredicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                return C23297.m51691(this, (Byte) obj);
            }

            @Override // l.InterfaceC14124
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final C12009 mo4925(InterfaceC14124 interfaceC14124) {
                return new C12009(this, interfaceC14124);
            }

            @Override // java.util.function.Predicate
            public final Predicate and(Predicate predicate2) {
                return C19285.$default$and(this, predicate2);
            }

            public final IntPredicate negate() {
                return new C12714(this);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate, reason: collision with other method in class */
            public final Predicate mo4928negate() {
                return new C12714(this);
            }

            @Override // l.InterfaceC14124
            /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
            public final C6364 mo4926(InterfaceC14124 interfaceC14124) {
                return new C6364(this, interfaceC14124);
            }

            public final Predicate or(Predicate predicate2) {
                return C19285.$default$or(this, predicate2);
            }

            @Override // l.InterfaceC14124
            /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
            public final boolean mo4927(byte b) {
                return predicate.test(Byte.valueOf(C2837.m8729((int) b)));
            }
        });
    }

    @Override // l.InterfaceC8481
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo2825(InterfaceC14124 interfaceC14124) {
        InterfaceC13419 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC14124.mo4927(it.nextByte())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public final InterfaceC17664 mo42464stream() {
        return C14841.stream(C5378.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC17664 mo42463parallelStream() {
        return C14841.stream(C5378.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
