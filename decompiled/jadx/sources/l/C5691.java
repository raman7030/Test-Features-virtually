package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5691 extends AbstractC3574 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f17550;

    @Override // l.InterfaceC15234
    public /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC3574
    /* JADX INFO: renamed from: ֫ */
    public final void mo10890(int i, Object obj) {
        ((Consumer) obj).accept(new C22624(this.f17550, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5691(C10630 c10630) {
        super(c10630);
        this.f17550 = c10630;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5691(C10630 c10630, int i, int i2, boolean z) {
        super(c10630, i, i2, z);
        this.f17550 = c10630;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f11333 ? 1 : 65;
    }

    @Override // l.AbstractC3574
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3574 mo10889(int i, int i2, boolean z) {
        return new C5691(this.f17550, i, i2, z);
    }
}
