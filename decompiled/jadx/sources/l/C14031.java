package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14031 extends AbstractC23351 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9241 f42426;

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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo33646(int i, Object obj) {
        ((Consumer) obj).accept(new C17707(this.f42426, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14031(C9241 c9241) {
        super(c9241);
        this.f42426 = c9241;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14031(C9241 c9241, int i, int i2, boolean z) {
        super(c9241, i, i2, z);
        this.f42426 = c9241;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f75025 ? 1 : 65;
    }

    @Override // l.AbstractC23351
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC23351 mo33645(int i, int i2, boolean z) {
        return new C14031(this.f42426, i, i2, z);
    }
}
