package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۡܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10872 extends AbstractC20260 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C7519 f30126;

    @Override // p067l.AbstractC20260, p067l.InterfaceC16847
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

    @Override // p067l.AbstractC20260, p067l.InterfaceC16847
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

    @Override // p067l.AbstractC20260
    /* JADX INFO: renamed from: ֫ */
    public final void mo4498(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f30126.f19744[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10872(C7519 c7519) {
        super(c7519);
        this.f30126 = c7519;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10872(C7519 c7519, int i, int i2, boolean z) {
        super(c7519, i, i2, z);
        this.f30126 = c7519;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f62614 ? 257 : 321;
    }

    @Override // p067l.AbstractC20260
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC20260 mo4497(int i, int i2, boolean z) {
        return new C10872(this.f30126, i, i2, z);
    }
}
