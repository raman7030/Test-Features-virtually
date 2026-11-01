package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۚܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7600 implements InterfaceC16336 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LongConsumer f19899b;

    public /* synthetic */ C7600(LongConsumer longConsumer, int i) {
        this.f19898a = i;
        this.f19899b = longConsumer;
    }

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ void m17551a(long j) {
    }

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ void m17552b(long j) {
    }

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ void m17553e() {
    }

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ void m17554g() {
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        switch (this.f19898a) {
            case 0:
                AbstractC11111.m25611m();
                throw null;
            default:
                AbstractC11111.m25611m();
                throw null;
        }
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(int i) {
        switch (this.f19898a) {
            case 0:
                AbstractC11111.m25618t();
                throw null;
            default:
                AbstractC11111.m25618t();
                throw null;
        }
    }

    @Override // p067l.InterfaceC16336, p067l.InterfaceC2925
    public final void accept(long j) {
        switch (this.f19898a) {
            case 0:
                this.f19899b.accept(j);
                break;
            default:
                ((C7087) this.f19899b).accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        switch (this.f19898a) {
            case 0:
                mo4235l((Long) obj);
                break;
            default:
                mo4235l((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f19898a) {
            case 0:
                break;
        }
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f19898a) {
            case 0:
                break;
        }
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo4231c(long j) {
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void end() {
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo4233f() {
        switch (this.f19898a) {
        }
        return false;
    }

    @Override // p067l.InterfaceC16336
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo4235l(Long l2) {
        switch (this.f19898a) {
            case 0:
                AbstractC11111.m25616r(this, l2);
                break;
            default:
                AbstractC11111.m25616r(this, l2);
                break;
        }
    }
}
