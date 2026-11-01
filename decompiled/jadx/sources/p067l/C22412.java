package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C22412 extends AbstractC25093 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C11683 f70691;

    @Override // p067l.AbstractC25093, p067l.InterfaceC20202, p067l.InterfaceC16847
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

    @Override // p067l.AbstractC25093, p067l.InterfaceC20202, p067l.InterfaceC16847
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

    @Override // p067l.AbstractC25093
    /* JADX INFO: renamed from: ֫ */
    public final void mo35724(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f70691.f32587[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22412(C11683 c11683) {
        super(c11683);
        this.f70691 = c11683;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22412(C11683 c11683, int i, int i2, boolean z) {
        super(c11683, i, i2, z);
        this.f70691 = c11683;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f80059 ? 256 : 320;
    }

    @Override // p067l.AbstractC25093
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC25093 mo35723(int i, int i2, boolean z) {
        return new C22412(this.f70691, i, i2, z);
    }
}
