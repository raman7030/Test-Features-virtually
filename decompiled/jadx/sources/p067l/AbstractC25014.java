package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25014 implements InterfaceC2925 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2925 f79851a;

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(int i) {
        AbstractC11111.m25618t();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(long j) {
        AbstractC11111.m25619u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public AbstractC25014(InterfaceC2925 interfaceC2925) {
        this.f79851a = (InterfaceC2925) C12826.requireNonNull(interfaceC2925);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public void mo4231c(long j) {
        this.f79851a.mo4231c(j);
    }

    @Override // p067l.InterfaceC2925
    public void end() {
        this.f79851a.end();
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public boolean mo4233f() {
        return this.f79851a.mo4233f();
    }
}
