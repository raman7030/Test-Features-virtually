package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۨۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1MI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11462 extends AbstractCollection implements InterfaceC19825, InterfaceC1144 {
    public /* synthetic */ void forEach(Consumer consumer) {
        C21962.$default$forEach(this, consumer);
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

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
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

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return spliterator();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC12063 it = iterator();
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
                Object next = it.next();
                if (this == next) {
                    sb.append("(this collection)");
                } else {
                    sb.append(String.valueOf(next));
                }
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC19825, l.InterfaceC1144, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC7975 spliterator() {
        return new C12913(iterator(), C4248.m12789(this), 64);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
