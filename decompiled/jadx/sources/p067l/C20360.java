package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ᩴᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBW1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20360 implements InterfaceC6278 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Consumer f62884;

    public /* synthetic */ C20360(Consumer consumer) {
        this.f62884 = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        C4937.m10476(this, d);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo14252((Float) obj);
    }

    @Override // p067l.InterfaceC6278
    /* JADX INFO: renamed from: ֫ */
    public final void mo14251(float f) {
        this.f62884.accept(Float.valueOf(f));
    }

    @Override // p067l.InterfaceC6278
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo14252(Float f) {
        C4937.m10477((InterfaceC6278) this, f);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C4937.m10475((InterfaceC6278) this, doubleConsumer);
    }

    @Override // p067l.InterfaceC6278
    /* JADX INFO: renamed from: ֫ */
    public final C17676 mo14250(InterfaceC6278 interfaceC6278) {
        return new C17676(this, interfaceC6278);
    }

    public final Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
