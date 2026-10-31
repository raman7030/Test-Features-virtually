package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21131 extends AbstractC2786 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f68144;

    @Override // l.AbstractC2786, l.InterfaceC18764, l.InterfaceC15234
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

    @Override // l.AbstractC2786, l.InterfaceC18764, l.InterfaceC15234
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

    @Override // l.AbstractC2786
    /* JADX INFO: renamed from: ֫ */
    public final void mo8613(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f68144.f63729[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21131(C19720 c19720) {
        super(c19720);
        this.f68144 = c19720;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21131(C19720 c19720, int i, int i2, boolean z) {
        super(c19720, i, i2, z);
        this.f68144 = c19720;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f8687 ? 257 : 321;
    }

    @Override // l.AbstractC2786
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC2786 mo8612(int i, int i2, boolean z) {
        return new C21131(this.f68144, i, i2, z);
    }
}
