package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۙ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: OCI7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7076 implements InterfaceC21829 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Consumer f18447;

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        C23840.m52908(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16296((Byte) obj);
    }

    @Override // p067l.InterfaceC21829
    /* JADX INFO: renamed from: ֫ */
    public final void mo16295(byte b) {
        this.f18447.accept(Byte.valueOf(b));
    }

    @Override // p067l.InterfaceC21829
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo16296(Byte b) {
        C23840.m52909((InterfaceC21829) this, b);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C23840.m52907((InterfaceC21829) this, intConsumer);
    }

    @Override // p067l.InterfaceC21829
    /* JADX INFO: renamed from: ֫ */
    public final C23170 mo16294(InterfaceC21829 interfaceC21829) {
        return new C23170(this, interfaceC21829);
    }

    public final Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
