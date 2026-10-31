package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23827 implements InterfaceC0585 {
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

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(long j) {
        AbstractC9198.u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    public AbstractC23827(InterfaceC0585 interfaceC0585) {
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
