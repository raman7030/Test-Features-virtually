package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18764 extends InterfaceC1124 {
    @Override // l.InterfaceC15234
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // l.InterfaceC15234
    boolean tryAdvance(Consumer consumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // l.InterfaceC1124, l.InterfaceC15234
    InterfaceC18764 trySplit();
}
