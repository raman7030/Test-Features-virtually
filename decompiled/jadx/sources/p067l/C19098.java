package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19098 extends AbstractC5017 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C21111 f56983;

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

    @Override // p067l.AbstractC5017
    /* JADX INFO: renamed from: ֫ */
    public final void mo10676(int i, Object obj) {
        ((Consumer) obj).accept(new C11723(this.f56983, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19098(C21111 c21111) {
        super(c21111);
        this.f56983 = c21111;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19098(C21111 c21111, int i, int i2, boolean z) {
        super(c21111, i, i2, z);
        this.f56983 = c21111;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f11481 ? 1 : 65;
    }

    @Override // p067l.AbstractC5017
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5017 mo10675(int i, int i2, boolean z) {
        return new C19098(this.f56983, i, i2, z);
    }
}
