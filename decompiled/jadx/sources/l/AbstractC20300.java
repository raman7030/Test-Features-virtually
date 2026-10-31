package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20300 implements InterfaceC21048, InterfaceC8347 {
    public final boolean a;

    public /* synthetic */ void accept(double d) {
        AbstractC9198.m();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC9198.t();
        throw null;
    }

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

    @Override // l.InterfaceC0585
    public final /* synthetic */ boolean f() {
        return false;
    }

    public AbstractC20300(boolean z) {
        this.a = z;
    }

    @Override // l.InterfaceC21048
    public final int j() {
        if (this.a) {
            return 0;
        }
        return EnumC7330.r;
    }

    public final void a(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        if (this.a) {
            new C1997(abstractC9198, interfaceC15234, this).invoke();
        } else {
            new C16107(abstractC9198, interfaceC15234, abstractC9198.g0(this)).invoke();
        }
    }
}
