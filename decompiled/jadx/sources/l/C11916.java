package l;

import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11916 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9241 f35633;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C11916(C9241 c9241) {
        this.f35633 = c9241;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C6418(this.f35633);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C20530(this.f35633);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C9241 c9241 = this.f35633;
        Object[] objArr = c9241.f27976;
        Object[] objArr2 = c9241.f27983;
        if (c9241.f27985) {
            consumer.n(objArr2[c9241.f27977]);
        }
        int i = c9241.f27977;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                consumer.n(objArr2[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f35633.f27980;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f35633.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f35633.clear();
    }
}
