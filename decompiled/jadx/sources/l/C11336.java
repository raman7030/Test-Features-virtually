package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C11336 extends AbstractC14862 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f33914;

    @Override // l.AbstractC14862, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11106.m27535(this, consumer);
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
        return C11106.m27536(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16749, l.InterfaceC15234
    public final InterfaceC4571 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC14862
    /* JADX INFO: renamed from: ֫ */
    public final void mo19105(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f33914.f68352[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11336(C21214 c21214) {
        super(c21214);
        this.f33914 = c21214;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11336(C21214 c21214, int i, int i2, boolean z) {
        super(c21214, i, i2, z);
        this.f33914 = c21214;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f45336 ? 257 : 321;
    }

    @Override // l.AbstractC14862
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14862 mo19104(int i, int i2, boolean z) {
        return new C11336(this.f33914, i, i2, z);
    }
}
