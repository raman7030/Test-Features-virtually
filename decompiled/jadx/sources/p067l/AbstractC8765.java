package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۜۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8765 implements InterfaceC7580 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2925 f23785a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo12365n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // p067l.InterfaceC7580
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo12365n(Double d) {
        AbstractC11111.m25612n(this, d);
    }

    public AbstractC8765(InterfaceC2925 interfaceC2925) {
        this.f23785a = (InterfaceC2925) C12826.requireNonNull(interfaceC2925);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public void mo4231c(long j) {
        this.f23785a.mo4231c(j);
    }

    @Override // p067l.InterfaceC2925
    public void end() {
        this.f23785a.end();
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public boolean mo4233f() {
        return this.f23785a.mo4233f();
    }
}
