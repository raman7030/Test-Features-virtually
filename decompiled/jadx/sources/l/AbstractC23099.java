package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩺ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAP7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23099 implements InterfaceC0877 {
    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C5111.m14655(this, consumer);
    }

    @Override // l.InterfaceC1124
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C19470.$default$forEachRemaining(this, longConsumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C5111.m14656(this, consumer);
    }

    @Override // l.InterfaceC0418, l.InterfaceC1124, l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC15234 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC1124
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((LongConsumer) obj);
    }
}
