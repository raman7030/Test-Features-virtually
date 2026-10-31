package l;

import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11211 extends AbstractC17539 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f33638;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C11211(C9800 c9800) {
        this.f33638 = c9800;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C2038(this.f33638);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C16854(this.f33638);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C9800 c9800 = this.f33638;
        Object[] objArr = c9800.f29626;
        if (c9800.f29634) {
            consumer.accept(objArr[c9800.f29627]);
        }
        int i = c9800.f29627;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            Object obj = objArr[i2];
            if (obj != null) {
                consumer.accept(obj);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33638.f29629;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f33638.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C9800 c9800 = this.f33638;
        int i = c9800.f29629;
        c9800.mo21966(obj);
        return c9800.f29629 != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f33638.clear();
    }
}
