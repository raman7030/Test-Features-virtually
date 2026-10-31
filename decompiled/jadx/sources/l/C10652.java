package l;

import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10652 extends AbstractC17539 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9241 f32045;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C10652(C9241 c9241) {
        this.f32045 = c9241;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C1479(this.f32045);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C16295(this.f32045);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C9241 c9241 = this.f32045;
        Object[] objArr = c9241.f27976;
        if (c9241.f27985) {
            consumer.accept(objArr[c9241.f27977]);
        }
        int i = c9241.f27977;
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
        return this.f32045.f27980;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f32045.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C9241 c9241 = this.f32045;
        int i = c9241.f27980;
        c9241.remove(obj);
        return c9241.f27980 != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f32045.clear();
    }
}
