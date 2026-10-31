package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21089 extends AbstractC23910 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f68009;

    @Override // l.AbstractC23910, l.InterfaceC18764, l.InterfaceC15234
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

    @Override // l.AbstractC23910, l.InterfaceC18764, l.InterfaceC15234
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

    @Override // l.AbstractC23910
    /* JADX INFO: renamed from: ֫ */
    public final void mo33604(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f68009.f29636[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21089(C9800 c9800) {
        super(c9800);
        this.f68009 = c9800;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21089(C9800 c9800, int i, int i2, boolean z) {
        super(c9800, i, i2, z);
        this.f68009 = c9800;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f77308 ? 256 : 320;
    }

    @Override // l.AbstractC23910
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC23910 mo33603(int i, int i2, boolean z) {
        return new C21089(this.f68009, i, i2, z);
    }
}
