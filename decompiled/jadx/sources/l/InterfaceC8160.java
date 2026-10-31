package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۠ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC8160 extends InterfaceC1124 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // l.InterfaceC1124, l.InterfaceC15234
    InterfaceC8160 trySplit();
}
