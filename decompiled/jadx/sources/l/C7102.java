package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C7102 extends AbstractC14862 implements InterfaceC16791 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f21808;

    @Override // l.AbstractC14862, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11148.m27665(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC14862, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11148.m27666(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC14862
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19105(int i, Object obj) {
        ((InterfaceC4113) obj).mo12346(this.f21808.f68349[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7102(C21214 c21214) {
        super(c21214);
        this.f21808 = c21214;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7102(C21214 c21214, int i, int i2, boolean z) {
        super(c21214, i, i2, z);
        this.f21808 = c21214;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f45336 ? 256 : 320;
    }

    @Override // l.AbstractC14862
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14862 mo19104(int i, int i2, boolean z) {
        return new C7102(this.f21808, i, i2, z);
    }
}
