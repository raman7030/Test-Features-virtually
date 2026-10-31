package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܺᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8ATV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16106 implements InterfaceC4113 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4113 f49640;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4113 f49641;

    public /* synthetic */ C16106(InterfaceC4113 interfaceC4113, InterfaceC4113 interfaceC4114) {
        this.f49640 = interfaceC4113;
        this.f49641 = interfaceC4114;
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        C2702.m8430(this, d);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo12347((Float) obj);
    }

    @Override // l.InterfaceC4113
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo12347(Float f) {
        C2702.m8431((InterfaceC4113) this, f);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C2702.m8429((InterfaceC4113) this, doubleConsumer);
    }

    @Override // l.InterfaceC4113
    /* JADX INFO: renamed from: ֫ */
    public final C16106 mo12345(InterfaceC4113 interfaceC4113) {
        return new C16106(this, interfaceC4113);
    }

    @Override // l.InterfaceC4113
    /* JADX INFO: renamed from: ֫ */
    public final void mo12346(float f) {
        this.f49640.mo12346(f);
        this.f49641.mo12346(f);
    }

    public final Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
