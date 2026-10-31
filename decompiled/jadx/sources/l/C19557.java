package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J540 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19557 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63222;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f63222) {
            case 0:
                ((InterfaceC18851) obj).m43556();
                break;
            default:
                ((InterfaceC5012) obj).getClass();
                break;
        }
    }
}
