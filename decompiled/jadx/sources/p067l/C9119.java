package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C9119 extends AbstractC16494 implements InterfaceC18327 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C22531 f24689;

    @Override // p067l.AbstractC16494, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12964.m29727(this, consumer);
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
        return C12964.m29728(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p067l.AbstractC16494
    /* JADX INFO: renamed from: ֫ */
    public final void mo21063(int i, Object obj) {
        ((InterfaceC6278) obj).mo14251(this.f24689.f71032[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9119(C22531 c22531) {
        super(c22531);
        this.f24689 = c22531;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9119(C22531 c22531, int i, int i2, boolean z) {
        super(c22531, i, i2, z);
        this.f24689 = c22531;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f48452 ? 256 : 320;
    }

    @Override // p067l.AbstractC16494
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16494 mo21062(int i, int i2, boolean z) {
        return new C9119(this.f24689, i, i2, z);
    }
}
