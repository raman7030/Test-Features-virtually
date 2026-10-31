package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23763 extends AbstractC18825 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f76927;

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

    @Override // l.AbstractC18825
    /* JADX INFO: renamed from: ֫ */
    public final void mo2117(int i, Object obj) {
        ((Consumer) obj).accept(new C16001(this.f76927, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23763(C5419 c5419) {
        super(c5419);
        this.f76927 = c5419;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23763(C5419 c5419, int i, int i2, boolean z) {
        super(c5419, i, i2, z);
        this.f76927 = c5419;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f59387 ? 1 : 65;
    }

    @Override // l.AbstractC18825
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18825 mo2116(int i, int i2, boolean z) {
        return new C23763(this.f76927, i, i2, z);
    }
}
