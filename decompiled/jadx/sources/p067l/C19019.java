package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19019 extends AbstractC20341 implements InterfaceC19670, InterfaceC12274 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Supplier f56685b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ObjIntConsumer f56686c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C23673 f56687d;

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(long j) {
        AbstractC11111.m25619u();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo6025d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.InterfaceC12274
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo6025d(Integer num) {
        AbstractC11111.m25614p(this, num);
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void end() {
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo4233f() {
        return false;
    }

    @Override // p067l.InterfaceC19670
    /* JADX INFO: renamed from: i */
    public final void mo5379i(InterfaceC19670 interfaceC19670) {
        this.f62821a = this.f56687d.apply(this.f62821a, ((C19019) interfaceC19670).f62821a);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f62821a = this.f56685b.get();
    }

    @Override // p067l.InterfaceC2925
    public final void accept(int i) {
        this.f56686c.accept(this.f62821a, i);
    }

    public C19019(Supplier supplier, ObjIntConsumer objIntConsumer, C23673 c23673) {
        this.f56685b = supplier;
        this.f56686c = objIntConsumer;
        this.f56687d = c23673;
    }
}
