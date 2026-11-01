package p067l;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۬ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14995 implements InterfaceC19670, InterfaceC16336 {

    /* JADX INFO: renamed from: a */
    public boolean f42836a;

    /* JADX INFO: renamed from: b */
    public long f42837b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LongBinaryOperator f42838c;

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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo4235l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void end() {
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo4233f() {
        return false;
    }

    @Override // p067l.InterfaceC16336
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo4235l(Long l2) {
        AbstractC11111.m25616r(this, l2);
    }

    public C14995(LongBinaryOperator longBinaryOperator) {
        this.f42838c = longBinaryOperator;
    }

    @Override // p067l.InterfaceC19670
    /* JADX INFO: renamed from: i */
    public final void mo5379i(InterfaceC19670 interfaceC19670) {
        C14995 c14995 = (C14995) interfaceC19670;
        if (c14995.f42836a) {
            return;
        }
        accept(c14995.f42837b);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f42836a = true;
        this.f42837b = 0L;
    }

    @Override // p067l.InterfaceC2925
    public final void accept(long j) {
        if (this.f42836a) {
            this.f42836a = false;
            this.f42837b = j;
        } else {
            this.f42837b = this.f42838c.applyAsLong(this.f42837b, j);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f42836a ? C14166.f40405c : new C14166(this.f42837b);
    }
}
