package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14478 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f41351;

    public /* synthetic */ C14478(int i, Object obj) {
        this.f41351 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f41351) {
            case 0:
                C7050.m16212((Runnable) obj);
                break;
            case 1:
                ((InterfaceC20284) obj).m45823();
                break;
            default:
                ((InterfaceC7131) obj).getClass();
                break;
        }
    }
}
