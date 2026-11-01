package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7778 extends AbstractC5766 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C12472 f20397;

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

    @Override // p067l.AbstractC5766
    /* JADX INFO: renamed from: ֫ */
    public final void mo12870(int i, Object obj) {
        ((Consumer) obj).accept(new C23871(this.f20397, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7778(C12472 c12472) {
        super(c12472);
        this.f20397 = c12472;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7778(C12472 c12472, int i, int i2, boolean z) {
        super(c12472, i, i2, z);
        this.f20397 = c12472;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f14139 ? 1 : 65;
    }

    @Override // p067l.AbstractC5766
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5766 mo12869(int i, int i2, boolean z) {
        return new C7778(this.f20397, i, i2, z);
    }
}
