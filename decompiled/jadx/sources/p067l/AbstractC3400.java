package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3400 implements InterfaceC12274 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2925 f6750a;

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(long j) {
        AbstractC11111.m25619u();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo6025d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.InterfaceC12274
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo6025d(Integer num) {
        AbstractC11111.m25614p(this, num);
    }

    public AbstractC3400(InterfaceC2925 interfaceC2925) {
        this.f6750a = (InterfaceC2925) C12826.requireNonNull(interfaceC2925);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public void mo4231c(long j) {
        this.f6750a.mo4231c(j);
    }

    @Override // p067l.InterfaceC2925
    public void end() {
        this.f6750a.end();
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public boolean mo4233f() {
        return this.f6750a.mo4233f();
    }
}
