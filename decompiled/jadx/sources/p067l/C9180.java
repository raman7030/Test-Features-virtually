package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9180 implements InterfaceC2925 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f24843b;

    public /* synthetic */ C9180(Consumer consumer, int i) {
        this.f24842a = i;
        this.f24843b = consumer;
    }

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ void m21137a(long j) {
    }

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ void m21138b(long j) {
    }

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ void m21139e() {
    }

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ void m21140g() {
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        switch (this.f24842a) {
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
        switch (this.f24842a) {
            case 0:
                AbstractC11111.m25618t();
                throw null;
            default:
                AbstractC11111.m25618t();
                throw null;
        }
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(long j) {
        switch (this.f24842a) {
            case 0:
                AbstractC11111.m25619u();
                throw null;
            default:
                AbstractC11111.m25619u();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        switch (this.f24842a) {
            case 0:
                ((C21581) this.f24843b).m45213n(obj);
                break;
            default:
                this.f24843b.m45213n(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f24842a) {
            case 0:
                break;
        }
        return C24719.$default$andThen(this, consumer);
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
        switch (this.f24842a) {
        }
        return false;
    }
}
