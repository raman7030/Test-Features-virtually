package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20202 extends InterfaceC3437 {
    @Override // p067l.InterfaceC16847
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // p067l.InterfaceC16847
    boolean tryAdvance(Consumer consumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    InterfaceC20202 trySplit();
}
