package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11583 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f32259 = false;

    /* JADX INFO: renamed from: ᩹ */
    public final int f32260;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 17749;
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12924.m29597(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        return null;
    }

    @Override // p067l.InterfaceC18287, p067l.InterfaceC16847
    public final InterfaceC6713 getComparator() {
        return null;
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C12924.m29598(this, consumer);
    }

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return null;
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC16847 trySplit() {
        return null;
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC20202 trySplit() {
        return null;
    }

    public C11583(int i) {
        this.f32260 = i;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        if (this.f32259) {
            return false;
        }
        this.f32259 = true;
        intConsumer.accept(this.f32260);
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f32259 ? 0L : 1L;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        if (this.f32259) {
            return;
        }
        this.f32259 = true;
        intConsumer.accept(this.f32260);
    }
}
