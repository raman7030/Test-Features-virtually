package p067l;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12118 extends AbstractC20341 implements InterfaceC19670 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Supplier f33863b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BiConsumer f33864c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BiConsumer f33865d;

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(int i) {
        AbstractC11111.m25618t();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(long j) {
        AbstractC11111.m25619u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
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
        this.f33865d.accept(this.f62821a, ((C12118) interfaceC19670).f62821a);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f62821a = this.f33863b.get();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        this.f33864c.accept(this.f62821a, obj);
    }

    public C12118(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f33863b = supplier;
        this.f33864c = biConsumer;
        this.f33865d = biConsumer2;
    }
}
