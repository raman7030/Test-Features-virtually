package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9695 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f29309 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f29310;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 17749;
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11106.m27535(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        return null;
    }

    @Override // l.InterfaceC16749, l.InterfaceC15234
    public final InterfaceC4571 getComparator() {
        return null;
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
    public final /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return null;
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC15234 trySplit() {
        return null;
    }

    @Override // l.InterfaceC18764, l.InterfaceC1124, l.InterfaceC15234
    public final /* bridge */ /* synthetic */ InterfaceC18764 trySplit() {
        return null;
    }

    public C9695(int i) {
        this.f29310 = i;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        if (this.f29309) {
            return false;
        }
        this.f29309 = true;
        intConsumer.accept(this.f29310);
        return true;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.f29309 ? 0L : 1L;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        if (this.f29309) {
            return;
        }
        this.f29309 = true;
        intConsumer.accept(this.f29310);
    }
}
