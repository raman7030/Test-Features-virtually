package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C22452 extends AbstractC5017 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C21111 f70826;

    @Override // p067l.AbstractC5017, p067l.InterfaceC20202, p067l.InterfaceC16847
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

    @Override // p067l.AbstractC5017, p067l.InterfaceC20202, p067l.InterfaceC16847
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

    @Override // p067l.AbstractC5017
    /* JADX INFO: renamed from: ֫ */
    public final void mo10676(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f70826.f66360[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22452(C21111 c21111) {
        super(c21111);
        this.f70826 = c21111;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22452(C21111 c21111, int i, int i2, boolean z) {
        super(c21111, i, i2, z);
        this.f70826 = c21111;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f11481 ? 257 : 321;
    }

    @Override // p067l.AbstractC5017
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5017 mo10675(int i, int i2, boolean z) {
        return new C22452(this.f70826, i, i2, z);
    }
}
