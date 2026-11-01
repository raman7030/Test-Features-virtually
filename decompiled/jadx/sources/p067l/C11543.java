package p067l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11543 extends AbstractC8269 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7519 f32188;

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C11543(C7519 c7519) {
        this.f32188 = c7519;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C22272(this.f32188);
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C10872(this.f32188);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        C7519 c7519 = this.f32188;
        int[] iArr = c7519.f19744;
        if (c7519.f19745) {
            intConsumer.accept(iArr[c7519.f19740]);
        }
        int i = c7519.f19740;
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
        return this.f32188.f19739;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return this.f32188.mo17421(i);
    }

    @Override // p067l.AbstractC8269
    public final boolean remove(int i) {
        C7519 c7519 = this.f32188;
        int i2 = c7519.f19739;
        c7519.remove(i);
        return c7519.f19739 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f32188.clear();
    }
}
