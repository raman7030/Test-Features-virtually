package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۡܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8947 extends AbstractC18825 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f27191;

    @Override // l.AbstractC18825, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11106.m27535(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC18825, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11106.m27536(this, consumer);
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

    @Override // l.AbstractC18825
    /* JADX INFO: renamed from: ֫ */
    public final void mo2117(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f27191.f16906[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8947(C5419 c5419) {
        super(c5419);
        this.f27191 = c5419;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8947(C5419 c5419, int i, int i2, boolean z) {
        super(c5419, i, i2, z);
        this.f27191 = c5419;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f59387 ? 257 : 321;
    }

    @Override // l.AbstractC18825
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18825 mo2116(int i, int i2, boolean z) {
        return new C8947(this.f27191, i, i2, z);
    }
}
