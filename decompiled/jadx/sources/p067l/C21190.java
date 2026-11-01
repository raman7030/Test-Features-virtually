package p067l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21190 extends AbstractC23022 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C12472 f66595;

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C21190(C12472 c12472) {
        this.f66595 = c12472;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C15153(this.f66595);
    }

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C14483(this.f66595);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        C12472 c12472 = this.f66595;
        int[] iArr = c12472.f34906;
        int[] iArr2 = c12472.f34914;
        if (c12472.f34916) {
            intConsumer.accept(iArr2[c12472.f34911]);
        }
        int i = c12472.f34911;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                intConsumer.accept(iArr2[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f66595.f34917;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return this.f66595.m28707(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f66595.clear();
    }
}
