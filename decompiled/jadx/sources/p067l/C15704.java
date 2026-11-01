package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15704 extends AbstractC24561 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C11151 f45509;

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

    @Override // p067l.AbstractC24561
    /* JADX INFO: renamed from: ֫ */
    public final void mo35766(int i, Object obj) {
        ((Consumer) obj).accept(new C19197(this.f45509, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15704(C11151 c11151) {
        super(c11151);
        this.f45509 = c11151;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15704(C11151 c11151, int i, int i2, boolean z) {
        super(c11151, i, i2, z);
        this.f45509 = c11151;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f77771 ? 1 : 65;
    }

    @Override // p067l.AbstractC24561
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC24561 mo35765(int i, int i2, boolean z) {
        return new C15704(this.f45509, i, i2, z);
    }
}
