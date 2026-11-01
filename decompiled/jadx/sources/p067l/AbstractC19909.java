package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19909 implements InterfaceC10302 {

    /* JADX INFO: renamed from: a */
    public boolean f60455a;

    /* JADX INFO: renamed from: b */
    public Object f60456b;

    @Override // p067l.InterfaceC2925
    public /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public /* synthetic */ void accept(int i) {
        AbstractC11111.m25618t();
        throw null;
    }

    @Override // p067l.InterfaceC2925
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m45213n(Object obj) {
        if (this.f60455a) {
            return;
        }
        this.f60455a = true;
        this.f60456b = obj;
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        return this.f60455a;
    }
}
