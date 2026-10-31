package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10818 extends AbstractC16169 implements InterfaceC18764 {
    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C3947.a(this, consumer);
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

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C3947.b(this, consumer);
    }

    @Override // l.AbstractC16169, l.InterfaceC1124, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return null;
    }

    @Override // l.AbstractC16169, l.InterfaceC1124, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC18764 trySplit() {
        return null;
    }

    @Override // l.InterfaceC18764
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        return false;
    }

    @Override // l.InterfaceC18764
    public final void forEachRemaining(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
    }
}
