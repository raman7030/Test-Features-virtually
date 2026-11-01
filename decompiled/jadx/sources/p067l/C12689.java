package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12689 extends AbstractC21406 implements InterfaceC20202, IntConsumer {

    /* JADX INFO: renamed from: f */
    public int f35593f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C6120.m13914a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C6120.m13915b(this, consumer);
    }

    @Override // p067l.AbstractC23262
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo7434b(InterfaceC16847 interfaceC16847) {
        return new C12689((InterfaceC20202) interfaceC16847, this);
    }

    @Override // p067l.AbstractC21406
    /* JADX INFO: renamed from: g */
    public final void mo9815g(Object obj) {
        ((IntConsumer) obj).accept(this.f35593f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f35593f = i;
    }

    @Override // p067l.AbstractC21406
    /* JADX INFO: renamed from: j */
    public final AbstractC24187 mo9816j(int i) {
        return new C11448(i);
    }
}
