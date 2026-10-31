package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۨۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11523 extends AbstractC16169 implements InterfaceC0418 {
    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C19470.a(this, consumer);
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

    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C19470.b(this, consumer);
    }

    @Override // l.AbstractC16169, l.InterfaceC1124, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC0418 trySplit() {
        return null;
    }

    @Override // l.AbstractC16169, l.InterfaceC1124, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return null;
    }

    @Override // l.InterfaceC0418
    public final boolean tryAdvance(LongConsumer longConsumer) {
        C11003.requireNonNull(longConsumer);
        return false;
    }

    @Override // l.InterfaceC0418
    public final void forEachRemaining(LongConsumer longConsumer) {
        C11003.requireNonNull(longConsumer);
    }
}
