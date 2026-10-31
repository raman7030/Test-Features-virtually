package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۛۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6024 implements InterfaceC14696 {
    public final InterfaceC0585 a;

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(double d) {
        AbstractC9198.m();
        throw null;
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(int i) {
        AbstractC9198.t();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC14696
    public final /* synthetic */ void l(Long l2) {
        AbstractC9198.r(this, l2);
    }

    public AbstractC6024(InterfaceC0585 interfaceC0585) {
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
