package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1085 implements InterfaceC10422 {
    public final InterfaceC0585 a;

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(double d) {
        AbstractC9198.m();
        throw null;
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(long j) {
        AbstractC9198.u();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10422
    public final /* synthetic */ void d(Integer num) {
        AbstractC9198.p(this, num);
    }

    public AbstractC1085(InterfaceC0585 interfaceC0585) {
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
