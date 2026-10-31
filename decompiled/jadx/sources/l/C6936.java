package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۜᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6936 implements InterfaceC5483 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ C6936(DoubleConsumer doubleConsumer, int i) {
        this.a = i;
        this.b = doubleConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void e() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // l.InterfaceC5483, l.InterfaceC0585
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(d);
                break;
            default:
                ((C12559) this.b).accept(d);
                break;
        }
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                AbstractC9198.t();
                throw null;
            default:
                AbstractC9198.t();
                throw null;
        }
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                AbstractC9198.u();
                throw null;
            default:
                AbstractC9198.u();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        switch (this.a) {
            case 0:
                n((Double) obj);
                break;
            default:
                n((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return C23517.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void c(long j) {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return false;
    }

    @Override // l.InterfaceC5483
    public final /* synthetic */ void n(Double d) {
        switch (this.a) {
            case 0:
                AbstractC9198.n(this, d);
                break;
            default:
                AbstractC9198.n(this, d);
                break;
        }
    }
}
