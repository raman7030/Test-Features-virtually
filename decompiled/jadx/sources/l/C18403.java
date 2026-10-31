package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PZ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18403 implements InterfaceC5982 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19689 f57136;

    public /* synthetic */ C18403(InterfaceC19689 interfaceC19689) {
        this.f57136 = interfaceC19689;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16796((Integer) obj);
    }

    @Override // l.InterfaceC5982
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo16796(Integer num) {
        C10216.m25642((InterfaceC5982) this, num);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C10216.m25641((InterfaceC5982) this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        if (i > 0) {
            this.f57136.mo2591(i);
        }
    }

    public final Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
