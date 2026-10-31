package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15442 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21794 f47296;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C15442(C21794 c21794) {
        this.f47296 = c21794;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f47296.containsValue(obj);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1332(this);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C1332(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C8388(this, 0, this.f47296.f69812);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C21794 c21794 = this.f47296;
        Object[] objArr = c21794.f69811;
        int i = c21794.f69812;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(objArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f47296.f69812;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f47296.clear();
    }
}
