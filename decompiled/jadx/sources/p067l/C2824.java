package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2824 extends AbstractC20260 implements InterfaceC4135 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C7519 f4852;

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.AbstractC20260, p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC21829 c7076;
        if (consumer instanceof InterfaceC21829) {
            c7076 = (InterfaceC21829) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c7076 = new C7076(consumer);
        }
        return tryAdvance((Object) c7076);
    }

    @Override // p067l.AbstractC20260, p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC21829 c7076;
        if (consumer instanceof InterfaceC21829) {
            c7076 = (InterfaceC21829) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c7076 = new C7076(consumer);
        }
        forEachRemaining((Object) c7076);
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p067l.AbstractC20260
    /* JADX INFO: renamed from: ֫ */
    public final void mo4498(int i, Object obj) {
        ((InterfaceC21829) obj).mo16295(this.f4852.f19741[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2824(C7519 c7519) {
        super(c7519);
        this.f4852 = c7519;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2824(C7519 c7519, int i, int i2, boolean z) {
        super(c7519, i, i2, z);
        this.f4852 = c7519;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f62614 ? 256 : 320;
    }

    @Override // p067l.AbstractC20260
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC20260 mo4497(int i, int i2, boolean z) {
        return new C2824(this.f4852, i, i2, z);
    }
}
