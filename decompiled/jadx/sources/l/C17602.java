package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17602 extends AbstractC2786 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f53789;

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

    @Override // l.AbstractC2786
    /* JADX INFO: renamed from: ֫ */
    public final void mo8613(int i, Object obj) {
        ((Consumer) obj).accept(new C9842(this.f53789, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17602(C19720 c19720) {
        super(c19720);
        this.f53789 = c19720;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17602(C19720 c19720, int i, int i2, boolean z) {
        super(c19720, i, i2, z);
        this.f53789 = c19720;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f8687 ? 1 : 65;
    }

    @Override // l.AbstractC2786
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC2786 mo8612(int i, int i2, boolean z) {
        return new C17602(this.f53789, i, i2, z);
    }
}
