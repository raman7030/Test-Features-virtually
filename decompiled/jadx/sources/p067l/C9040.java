package p067l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9040 extends AbstractC8269 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21111 f24542;

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C9040(C21111 c21111) {
        this.f24542 = c21111;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C25133(this.f24542);
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C22452(this.f24542);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        C21111 c21111 = this.f24542;
        int[] iArr = c21111.f66360;
        if (c21111.f66368) {
            intConsumer.accept(iArr[c21111.f66361]);
        }
        int i = c21111.f66361;
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
        return this.f24542.f66363;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return this.f24542.mo4793(i);
    }

    @Override // p067l.AbstractC8269
    public final boolean remove(int i) {
        C21111 c21111 = this.f24542;
        int i2 = c21111.f66363;
        c21111.remove(i);
        return c21111.f66363 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f24542.clear();
    }
}
