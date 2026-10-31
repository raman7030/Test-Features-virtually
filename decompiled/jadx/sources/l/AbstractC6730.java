package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۜۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6730 implements InterfaceC5483 {
    public final InterfaceC0585 a;

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(int i) {
        AbstractC9198.t();
        throw null;
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(long j) {
        AbstractC9198.u();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC5483
    public final /* synthetic */ void n(Double d) {
        AbstractC9198.n(this, d);
    }

    public AbstractC6730(InterfaceC0585 interfaceC0585) {
        this.a = (InterfaceC0585) C11003.requireNonNull(interfaceC0585);
    }

    @Override // l.InterfaceC0585
    public void c(long j) {
        this.a.c(j);
    }

    @Override // l.InterfaceC0585
    public void end() {
        this.a.end();
    }

    @Override // l.InterfaceC0585
    public boolean f() {
        return this.a.f();
    }
}
