package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QATC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21887 implements InterfaceC20476 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20476 f70069;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20476 f70070;

    public /* synthetic */ C21887(InterfaceC20476 interfaceC20476, InterfaceC20476 interfaceC20477) {
        this.f70069 = interfaceC20476;
        this.f70070 = interfaceC20477;
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        C22592.m50566(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo14393((Byte) obj);
    }

    @Override // l.InterfaceC20476
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo14393(Byte b) {
        C22592.m50567((InterfaceC20476) this, b);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C22592.m50565((InterfaceC20476) this, intConsumer);
    }

    @Override // l.InterfaceC20476
    /* JADX INFO: renamed from: ֫ */
    public final C21887 mo14391(InterfaceC20476 interfaceC20476) {
        return new C21887(this, interfaceC20476);
    }

    @Override // l.InterfaceC20476
    /* JADX INFO: renamed from: ֫ */
    public final void mo14392(byte b) {
        this.f70069.mo14392(b);
        this.f70070.mo14392(b);
    }

    public final Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
