package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PZ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19858 implements InterfaceC8054 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC21081 f60356;

    public /* synthetic */ C19858(InterfaceC21081 interfaceC21081) {
        this.f60356 = interfaceC21081;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo18722((Integer) obj);
    }

    @Override // p067l.InterfaceC8054
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo18722(Integer num) {
        C12078.m27664((InterfaceC8054) this, num);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C12078.m27663((InterfaceC8054) this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        if (i > 0) {
            this.f60356.mo4931(i);
        }
    }

    public final Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
