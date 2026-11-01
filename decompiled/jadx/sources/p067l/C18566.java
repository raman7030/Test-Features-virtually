package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18566 extends AbstractC4485 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C20579 f55414;

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

    @Override // p067l.AbstractC4485
    /* JADX INFO: renamed from: ֫ */
    public final void mo9491(int i, Object obj) {
        ((Consumer) obj).accept(new C11191(this.f55414, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18566(C20579 c20579) {
        super(c20579);
        this.f55414 = c20579;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18566(C20579 c20579, int i, int i2, boolean z) {
        super(c20579, i, i2, z);
        this.f55414 = c20579;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f10074 ? 1 : 65;
    }

    @Override // p067l.AbstractC4485
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4485 mo9490(int i, int i2, boolean z) {
        return new C18566(this.f55414, i, i2, z);
    }
}
