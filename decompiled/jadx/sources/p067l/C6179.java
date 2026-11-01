package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۘܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6179 extends AbstractC23851 implements InterfaceC16336 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo4235l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.InterfaceC16336
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo4235l(Long l2) {
        AbstractC11111.m25616r(this, l2);
    }

    @Override // p067l.AbstractC20341, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f75779b);
    }

    @Override // p067l.InterfaceC19670
    /* JADX INFO: renamed from: i */
    public final void mo5379i(InterfaceC19670 interfaceC19670) {
        this.f75779b += ((AbstractC23851) interfaceC19670).f75779b;
    }

    @Override // p067l.AbstractC23851, p067l.InterfaceC2925
    public final void accept(long j) {
        this.f75779b++;
    }
}
