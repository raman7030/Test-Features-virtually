package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.۫֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12106 implements InterfaceC5214 {
    public final Collection a;

    @Override // l.InterfaceC5214
    public final /* synthetic */ InterfaceC5214 j(long j, long j2, IntFunction intFunction) {
        return AbstractC9198.F(this, j, j2, intFunction);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC5214
    public final InterfaceC5214 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public C12106(Collection collection) {
        this.a = collection;
    }

    @Override // l.InterfaceC5214
    public final InterfaceC15234 spliterator() {
        return C5378.stream(this.a).spliterator();
    }

    @Override // l.InterfaceC5214
    public final void k(Object[] objArr, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // l.InterfaceC5214
    public final Object[] m(IntFunction intFunction) {
        Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // l.InterfaceC5214
    public final long count() {
        return this.a.size();
    }

    @Override // l.InterfaceC5214
    public final void forEach(Consumer consumer) {
        C5378.a(this.a, consumer);
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.a.size()), this.a);
    }
}
