package p067l;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7839 implements InterfaceC19670 {

    /* JADX INFO: renamed from: a */
    public boolean f20562a;

    /* JADX INFO: renamed from: b */
    public Object f20563b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinaryOperator f20564c;

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

    public C7839(BinaryOperator binaryOperator) {
        this.f20564c = binaryOperator;
    }

    @Override // p067l.InterfaceC19670
    /* JADX INFO: renamed from: i */
    public final void mo5379i(InterfaceC19670 interfaceC19670) {
        C7839 c7839 = (C7839) interfaceC19670;
        if (c7839.f20562a) {
            return;
        }
        m45213n(c7839.f20563b);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f20562a = true;
        this.f20563b = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        if (this.f20562a) {
            this.f20562a = false;
            this.f20563b = obj;
        } else {
            this.f20563b = this.f20564c.apply(this.f20563b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f20562a ? C18189.empty() : C18189.m41402of(this.f20563b);
    }
}
