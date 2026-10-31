package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAPH */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23141 implements InterfaceC16749 {
    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11106.m27535(this, consumer);
    }

    @Override // l.InterfaceC1124
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C3947.$default$forEachRemaining(this, intConsumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11106.m27536(this, consumer);
    }

    @Override // l.InterfaceC1124, l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC15234 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16749, l.InterfaceC15234
    public final InterfaceC4571 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC1124
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((IntConsumer) obj);
    }
}
