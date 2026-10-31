package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۙ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: OCI7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4953 implements InterfaceC20476 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Consumer f15613;

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        C22592.m50566(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo14393((Byte) obj);
    }

    @Override // l.InterfaceC20476
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14392(byte b) {
        this.f15613.accept(Byte.valueOf(b));
    }

    @Override // l.InterfaceC20476
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo14393(Byte b) {
        C22592.m50567((InterfaceC20476) this, b);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C22592.m50565((InterfaceC20476) this, intConsumer);
    }

    @Override // l.InterfaceC20476
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21887 mo14391(InterfaceC20476 interfaceC20476) {
        return new C21887(this, interfaceC20476);
    }

    public final Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
