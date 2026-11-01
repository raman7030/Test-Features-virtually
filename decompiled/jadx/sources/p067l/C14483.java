package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۫᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14483 extends AbstractC5766 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C12472 f41359;

    @Override // p067l.AbstractC5766, p067l.InterfaceC20202, p067l.InterfaceC16847
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

    @Override // p067l.AbstractC5766, p067l.InterfaceC20202, p067l.InterfaceC16847
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

    @Override // p067l.AbstractC5766
    /* JADX INFO: renamed from: ֫ */
    public final void mo12870(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f41359.f34914[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14483(C12472 c12472) {
        super(c12472);
        this.f41359 = c12472;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14483(C12472 c12472, int i, int i2, boolean z) {
        super(c12472, i, i2, z);
        this.f41359 = c12472;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f14139 ? 256 : 320;
    }

    @Override // p067l.AbstractC5766
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5766 mo12869(int i, int i2, boolean z) {
        return new C14483(this.f41359, i, i2, z);
    }
}
