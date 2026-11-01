package p067l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21940 extends AbstractC13262 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11211 f68977;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C21940(C11211 c11211) {
        this.f68977 = c11211;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f68977.containsValue(obj);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C24621(this);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C24621(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C8528(this, 0, this.f68977.f31141);
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C11211 c11211 = this.f68977;
        Object[] objArr = c11211.f31140;
        int i = c11211.f31141;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(objArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f68977.f31141;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f68977.clear();
    }
}
