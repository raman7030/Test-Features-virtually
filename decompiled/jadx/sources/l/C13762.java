package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܰۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13762 extends AbstractC16169 implements InterfaceC8160 {
    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC16169.b(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC16169.g(this, consumer);
    }

    @Override // l.AbstractC16169, l.InterfaceC1124, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return null;
    }

    @Override // l.AbstractC16169, l.InterfaceC1124, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC8160 trySplit() {
        return null;
    }

    @Override // l.InterfaceC8160
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        C11003.requireNonNull(doubleConsumer);
        return false;
    }

    @Override // l.InterfaceC8160
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        C11003.requireNonNull(doubleConsumer);
    }
}
