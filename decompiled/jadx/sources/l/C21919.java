package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21919 extends AbstractC3574 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f70174;

    @Override // l.AbstractC3574, l.InterfaceC18764, l.InterfaceC15234
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

    @Override // l.AbstractC3574, l.InterfaceC18764, l.InterfaceC15234
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

    @Override // l.AbstractC3574
    /* JADX INFO: renamed from: ֫ */
    public final void mo10890(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f70174.f31934[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21919(C10630 c10630) {
        super(c10630);
        this.f70174 = c10630;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21919(C10630 c10630, int i, int i2, boolean z) {
        super(c10630, i, i2, z);
        this.f70174 = c10630;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f11333 ? 257 : 321;
    }

    @Override // l.AbstractC3574
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3574 mo10889(int i, int i2, boolean z) {
        return new C21919(this.f70174, i, i2, z);
    }
}
