package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAPH */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC24362 implements InterfaceC18287 {
    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12924.m29597(this, consumer);
    }

    @Override // p067l.InterfaceC3437
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C6120.$default$forEachRemaining(this, intConsumer);
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
    public /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return trySplit();
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC16847 trySplit() {
        return trySplit();
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // p067l.InterfaceC18287, p067l.InterfaceC16847
    public final InterfaceC6713 getComparator() {
        throw new IllegalStateException();
    }

    @Override // p067l.InterfaceC3437
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((IntConsumer) obj);
    }
}
