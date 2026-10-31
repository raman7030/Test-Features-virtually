package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20530 extends AbstractC23351 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9241 f66141;

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

    @Override // l.AbstractC23351
    /* JADX INFO: renamed from: ֫ */
    public final void mo33646(int i, Object obj) {
        ((Consumer) obj).accept(this.f66141.f27983[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20530(C9241 c9241) {
        super(c9241);
        this.f66141 = c9241;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20530(C9241 c9241, int i, int i2, boolean z) {
        super(c9241, i, i2, z);
        this.f66141 = c9241;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f75025 ? 0 : 64;
    }

    @Override // l.AbstractC23351
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC23351 mo33645(int i, int i2, boolean z) {
        return new C20530(this.f66141, i, i2, z);
    }
}
