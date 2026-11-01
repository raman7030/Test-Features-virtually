package p067l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C4425 extends AbstractC8269 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22531 f9938;

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C4425(C22531 c22531) {
        this.f9938 = c22531;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C9530(this.f9938);
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C13143(this.f9938);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        C22531 c22531 = this.f9938;
        int[] iArr = c22531.f71035;
        if (c22531.f71036) {
            intConsumer.accept(iArr[c22531.f71031]);
        }
        int i = c22531.f71031;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int i3 = iArr[i2];
            if (i3 != 0) {
                intConsumer.accept(i3);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9938.f71030;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return this.f9938.mo23794(i);
    }

    @Override // p067l.AbstractC8269
    public final boolean remove(int i) {
        C22531 c22531 = this.f9938;
        int i2 = c22531.f71030;
        c22531.remove(i);
        return c22531.f71030 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9938.clear();
    }
}
