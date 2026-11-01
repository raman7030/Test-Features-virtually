package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۜᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8961 implements InterfaceC7580 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24278a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DoubleConsumer f24279b;

    public /* synthetic */ C8961(DoubleConsumer doubleConsumer, int i) {
        this.f24278a = i;
        this.f24279b = doubleConsumer;
    }

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ void m20699a(long j) {
    }

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ void m20700b(long j) {
    }

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ void m20701e() {
    }

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ void m20702g() {
    }

    @Override // p067l.InterfaceC7580, p067l.InterfaceC2925
    public final void accept(double d) {
        switch (this.f24278a) {
            case 0:
                this.f24279b.accept(d);
                break;
            default:
                ((C14305) this.f24279b).accept(d);
                break;
        }
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(int i) {
        switch (this.f24278a) {
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
        switch (this.f24278a) {
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
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        switch (this.f24278a) {
            case 0:
                mo12365n((Double) obj);
                break;
            default:
                mo12365n((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f24278a) {
            case 0:
                break;
        }
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f24278a) {
            case 0:
                break;
        }
        return AbstractC17736.m40299a(this, doubleConsumer);
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
        switch (this.f24278a) {
        }
        return false;
    }

    @Override // p067l.InterfaceC7580
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo12365n(Double d) {
        switch (this.f24278a) {
            case 0:
                AbstractC11111.m25612n(this, d);
                break;
            default:
                AbstractC11111.m25612n(this, d);
                break;
        }
    }
}
