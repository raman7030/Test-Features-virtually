package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܺᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8ATV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17676 implements InterfaceC6278 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC6278 f52803;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC6278 f52804;

    public /* synthetic */ C17676(InterfaceC6278 interfaceC6278, InterfaceC6278 interfaceC6279) {
        this.f52803 = interfaceC6278;
        this.f52804 = interfaceC6279;
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

    @Override // p067l.InterfaceC6278
    /* JADX INFO: renamed from: ֫ */
    public final void mo14251(float f) {
        this.f52803.mo14251(f);
        this.f52804.mo14251(f);
    }

    public final Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
