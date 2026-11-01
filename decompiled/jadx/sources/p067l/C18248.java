package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܽܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18248 extends AbstractC23851 implements InterfaceC12274 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo6025d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.InterfaceC12274
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo6025d(Integer num) {
        AbstractC11111.m25614p(this, num);
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
    public final void accept(int i) {
        this.f75779b++;
    }
}
