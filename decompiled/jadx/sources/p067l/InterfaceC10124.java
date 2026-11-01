package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۠ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC10124 extends InterfaceC3437 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    InterfaceC10124 trySplit();
}
