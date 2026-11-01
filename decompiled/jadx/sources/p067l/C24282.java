package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes.dex */
public final class C24282 extends AbstractC16494 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C22531 f76917;

    @Override // p067l.InterfaceC16847
    public /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.AbstractC16494
    /* JADX INFO: renamed from: ֫ */
    public final void mo21063(int i, Object obj) {
        ((Consumer) obj).accept(new C18506(this.f76917, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24282(C22531 c22531) {
        super(c22531);
        this.f76917 = c22531;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24282(C22531 c22531, int i, int i2, boolean z) {
        super(c22531, i, i2, z);
        this.f76917 = c22531;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f48452 ? 1 : 65;
    }

    @Override // p067l.AbstractC16494
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16494 mo21062(int i, int i2, boolean z) {
        return new C24282(this.f76917, i, i2, z);
    }
}
