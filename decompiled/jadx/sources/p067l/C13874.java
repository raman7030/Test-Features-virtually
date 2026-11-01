package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.۫֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13874 implements InterfaceC7324 {

    /* JADX INFO: renamed from: a */
    public final Collection f39190a;

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7324 mo3497j(long j, long j2, IntFunction intFunction) {
        return AbstractC11111.m25591F(this, j, j2, intFunction);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int mo3500o() {
        return 0;
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: a */
    public final InterfaceC7324 mo3496a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public C13874(Collection collection) {
        this.f39190a = collection;
    }

    @Override // p067l.InterfaceC7324
    public final InterfaceC16847 spliterator() {
        return C7480.stream(this.f39190a).spliterator();
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: k */
    public final void mo3498k(Object[] objArr, int i) {
        Iterator it = this.f39190a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: m */
    public final Object[] mo3499m(IntFunction intFunction) {
        Collection collection = this.f39190a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // p067l.InterfaceC7324
    public final long count() {
        return this.f39190a.size();
    }

    @Override // p067l.InterfaceC7324
    public final void forEach(Consumer consumer) {
        C7480.m17260a(this.f39190a, consumer);
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.f39190a.size()), this.f39190a);
    }
}
