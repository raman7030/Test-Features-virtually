package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C13143 extends AbstractC16494 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C22531 f36913;

    @Override // p067l.AbstractC16494, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12924.m29597(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.AbstractC16494, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C12924.m29598(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // p067l.InterfaceC18287, p067l.InterfaceC16847
    public final InterfaceC6713 getComparator() {
        throw new IllegalStateException();
    }

    @Override // p067l.AbstractC16494
    /* JADX INFO: renamed from: ֫ */
    public final void mo21063(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f36913.f71035[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13143(C22531 c22531) {
        super(c22531);
        this.f36913 = c22531;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13143(C22531 c22531, int i, int i2, boolean z) {
        super(c22531, i, i2, z);
        this.f36913 = c22531;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f48452 ? 257 : 321;
    }

    @Override // p067l.AbstractC16494
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16494 mo21062(int i, int i2, boolean z) {
        return new C13143(this.f36913, i, i2, z);
    }
}
