package p067l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3615 extends AbstractC23022 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C10321 f7483;

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C3615(C10321 c10321) {
        this.f7483 = c10321;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return this.f7483.mo23940(i);
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2944(this);
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C2944(this);
    }

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C7639(this, 0, this.f7483.f28587);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        C10321 c10321 = this.f7483;
        int[] iArr = c10321.f28586;
        int i = c10321.f28587;
        for (int i2 = 0; i2 < i; i2++) {
            intConsumer.accept(iArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7483.f28587;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f7483.clear();
    }
}
