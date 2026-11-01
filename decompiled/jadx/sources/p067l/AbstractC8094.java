package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۛۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8094 implements InterfaceC16336 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2925 f21348a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo4235l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.InterfaceC16336
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo4235l(Long l2) {
        AbstractC11111.m25616r(this, l2);
    }

    public AbstractC8094(InterfaceC2925 interfaceC2925) {
        this.f21348a = (InterfaceC2925) C12826.requireNonNull(interfaceC2925);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public void mo4231c(long j) {
        this.f21348a.mo4231c(j);
    }

    @Override // p067l.InterfaceC2925
    public void end() {
        this.f21348a.end();
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public boolean mo4233f() {
        return this.f21348a.mo4233f();
    }
}
