package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12741 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38311;

    public /* synthetic */ C12741(int i, Object obj) {
        this.f38311 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f38311) {
            case 0:
                C4925.m14315((Runnable) obj);
                break;
            case 1:
                ((InterfaceC18851) obj).m43557();
                break;
            default:
                ((InterfaceC5012) obj).getClass();
                break;
        }
    }
}
