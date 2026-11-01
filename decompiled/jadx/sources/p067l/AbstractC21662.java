package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21662 implements InterfaceC22373, InterfaceC10302 {

    /* JADX INFO: renamed from: a */
    public final boolean f68233a;

    public /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC11111.m25618t();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC11111.m25619u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
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
        return false;
    }

    public AbstractC21662(boolean z) {
        this.f68233a = z;
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: j */
    public final int mo23312j() {
        if (this.f68233a) {
            return 0;
        }
        return EnumC9335.f25423r;
    }

    /* JADX INFO: renamed from: a */
    public final void m48868a(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847) {
        if (this.f68233a) {
            new C4267(abstractC11111, interfaceC16847, this).invoke();
        } else {
            new C17677(abstractC11111, interfaceC16847, abstractC11111.mo25630g0(this)).invoke();
        }
    }
}
