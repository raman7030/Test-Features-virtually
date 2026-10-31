package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2703 implements InterfaceC0585 {
    public boolean a;
    public boolean b;

    @Override // l.InterfaceC0585
    public /* synthetic */ void accept(double d) {
        AbstractC9198.m();
        throw null;
    }

    @Override // l.InterfaceC0585
    public /* synthetic */ void accept(int i) {
        AbstractC9198.t();
        throw null;
    }

    @Override // l.InterfaceC0585
    public /* synthetic */ void accept(long j) {
        AbstractC9198.u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void c(long j) {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void end() {
    }

    public AbstractC2703(EnumC20342 enumC20342) {
        this.b = !enumC20342.b;
    }

    @Override // l.InterfaceC0585
    public final boolean f() {
        return this.a;
    }
}
