package l;

import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C16896 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f51882;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C16896(C19720 c19720) {
        this.f51882 = c19720;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C4197(this.f51882);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C19014(this.f51882);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C19720 c19720 = this.f51882;
        int[] iArr = c19720.f63729;
        Object[] objArr = c19720.f63739;
        if (c19720.f63737) {
            consumer.accept(objArr[c19720.f63730]);
        }
        int i = c19720.f63730;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.accept(objArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f51882.f63732;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f51882.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f51882.clear();
    }
}
