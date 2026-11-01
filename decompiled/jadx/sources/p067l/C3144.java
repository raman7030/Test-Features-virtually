package p067l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3144 extends AbstractC20341 implements InterfaceC19670 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5755b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BiFunction f5756c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinaryOperator f5757d;

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
        this.f62821a = this.f5757d.apply(this.f62821a, ((C3144) interfaceC19670).f62821a);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f62821a = this.f5755b;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        this.f62821a = this.f5756c.apply(this.f62821a, obj);
    }

    public C3144(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f5755b = obj;
        this.f5756c = biFunction;
        this.f5757d = binaryOperator;
    }
}
