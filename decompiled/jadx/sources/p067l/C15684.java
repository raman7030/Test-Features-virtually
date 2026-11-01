package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15684 extends AbstractC25093 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C11683 f45459;

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
        ((Consumer) obj).accept(new C19729(this.f45459, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15684(C11683 c11683) {
        super(c11683);
        this.f45459 = c11683;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15684(C11683 c11683, int i, int i2, boolean z) {
        super(c11683, i, i2, z);
        this.f45459 = c11683;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f80059 ? 1 : 65;
    }

    @Override // p067l.AbstractC25093
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC25093 mo35723(int i, int i2, boolean z) {
        return new C15684(this.f45459, i, i2, z);
    }
}
