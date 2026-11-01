package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۨۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13320 extends AbstractC17736 implements InterfaceC2766 {
    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20873.m47164a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C20873.m47165b(this, consumer);
    }

    @Override // p067l.AbstractC17736, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC2766 trySplit() {
        return null;
    }

    @Override // p067l.AbstractC17736, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return null;
    }

    @Override // p067l.InterfaceC2766
    public final boolean tryAdvance(LongConsumer longConsumer) {
        C12826.requireNonNull(longConsumer);
        return false;
    }

    @Override // p067l.InterfaceC2766
    public final void forEachRemaining(LongConsumer longConsumer) {
        C12826.requireNonNull(longConsumer);
    }
}
