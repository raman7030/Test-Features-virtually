package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24953 extends AbstractC20260 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C7519 f79679;

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

    @Override // p067l.AbstractC20260
    /* JADX INFO: renamed from: ֫ */
    public final void mo4498(int i, Object obj) {
        ((Consumer) obj).accept(new C17576(this.f79679, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24953(C7519 c7519) {
        super(c7519);
        this.f79679 = c7519;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24953(C7519 c7519, int i, int i2, boolean z) {
        super(c7519, i, i2, z);
        this.f79679 = c7519;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f62614 ? 1 : 65;
    }

    @Override // p067l.AbstractC20260
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC20260 mo4497(int i, int i2, boolean z) {
        return new C24953(this.f79679, i, i2, z);
    }
}
