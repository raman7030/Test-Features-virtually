package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩺ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAP7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC24322 implements InterfaceC3202 {
    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7226.m16563(this, consumer);
    }

    @Override // p067l.InterfaceC3437
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C20873.$default$forEachRemaining(this, longConsumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C7226.m16564(this, consumer);
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC3437, p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return trySplit();
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC16847 trySplit() {
        return trySplit();
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p067l.InterfaceC3437
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((LongConsumer) obj);
    }
}
