package p067l;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۫ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14285 implements InterfaceC19670, InterfaceC12274 {

    /* JADX INFO: renamed from: a */
    public boolean f40689a;

    /* JADX INFO: renamed from: b */
    public int f40690b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IntBinaryOperator f40691c;

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

    public C14285(IntBinaryOperator intBinaryOperator) {
        this.f40691c = intBinaryOperator;
    }

    @Override // p067l.InterfaceC19670
    /* JADX INFO: renamed from: i */
    public final void mo5379i(InterfaceC19670 interfaceC19670) {
        C14285 c14285 = (C14285) interfaceC19670;
        if (c14285.f40689a) {
            return;
        }
        accept(c14285.f40690b);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f40689a = true;
        this.f40690b = 0;
    }

    @Override // p067l.InterfaceC2925
    public final void accept(int i) {
        if (this.f40689a) {
            this.f40689a = false;
            this.f40690b = i;
        } else {
            this.f40690b = this.f40691c.applyAsInt(this.f40690b, i);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f40689a ? C19531.f59472c : new C19531(this.f40690b);
    }
}
