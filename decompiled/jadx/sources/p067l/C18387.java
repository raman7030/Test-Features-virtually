package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C18387 extends AbstractC25093 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C11683 f54905;

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

    @Override // p067l.AbstractC25093
    /* JADX INFO: renamed from: ֫ */
    public final void mo35724(int i, Object obj) {
        ((Consumer) obj).accept(this.f54905.f32577[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18387(C11683 c11683) {
        super(c11683);
        this.f54905 = c11683;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18387(C11683 c11683, int i, int i2, boolean z) {
        super(c11683, i, i2, z);
        this.f54905 = c11683;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f80059 ? 1 : 65;
    }

    @Override // p067l.AbstractC25093
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC25093 mo35723(int i, int i2, boolean z) {
        return new C18387(this.f54905, i, i2, z);
    }
}
