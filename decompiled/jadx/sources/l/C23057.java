package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes.dex */
public final class C23057 extends AbstractC14862 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f74175;

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

    @Override // l.AbstractC14862
    /* JADX INFO: renamed from: ֫ */
    public final void mo19105(int i, Object obj) {
        ((Consumer) obj).accept(new C16979(this.f74175, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23057(C21214 c21214) {
        super(c21214);
        this.f74175 = c21214;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23057(C21214 c21214, int i, int i2, boolean z) {
        super(c21214, i, i2, z);
        this.f74175 = c21214;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f45336 ? 1 : 65;
    }

    @Override // l.AbstractC14862
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14862 mo19104(int i, int i2, boolean z) {
        return new C23057(this.f74175, i, i2, z);
    }
}
