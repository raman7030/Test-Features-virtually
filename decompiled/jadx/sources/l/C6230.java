package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6230 implements InterfaceC10422 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ C6230(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void e() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                AbstractC9198.m();
                throw null;
            default:
                AbstractC9198.m();
                throw null;
        }
    }

    @Override // l.InterfaceC10422, l.InterfaceC0585
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(i);
                break;
            default:
                ((C19532) this.b).accept(i);
                break;
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
                d((Integer) obj);
                break;
            default:
                d((Integer) obj);
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

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void c(long j) {
    }

    @Override // l.InterfaceC10422
    public final /* synthetic */ void d(Integer num) {
        switch (this.a) {
            case 0:
                AbstractC9198.p(this, num);
                break;
            default:
                AbstractC9198.p(this, num);
                break;
        }
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
}
