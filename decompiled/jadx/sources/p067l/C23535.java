package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23535 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16847 f74976a;

    public C23535(InterfaceC16847 interfaceC16847) {
        this.f74976a = interfaceC16847;
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        C12826.requireNonNull(consumer);
        return this.f74976a.tryAdvance(new C4386(consumer, 2));
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C12826.requireNonNull(consumer);
        this.f74976a.forEachRemaining(new C4386(consumer, 2));
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        InterfaceC16847 interfaceC16847TrySplit = this.f74976a.trySplit();
        if (interfaceC16847TrySplit == null) {
            return null;
        }
        return new C23535(interfaceC16847TrySplit);
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f74976a.estimateSize();
    }

    @Override // p067l.InterfaceC16847
    public final long getExactSizeIfKnown() {
        return this.f74976a.getExactSizeIfKnown();
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f74976a.characteristics();
    }

    @Override // p067l.InterfaceC16847
    public final boolean hasCharacteristics(int i) {
        return this.f74976a.hasCharacteristics(i);
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        return this.f74976a.getComparator();
    }
}
