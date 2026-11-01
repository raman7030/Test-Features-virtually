package p067l;

import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19555 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f59531;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f59532;

    public /* synthetic */ C19555(int i, Object obj) {
        this.f59531 = i;
        this.f59532 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f59531) {
            case 0:
                C5473.m12060((C5473) this.f59532, (Set) obj);
                break;
            default:
                ((C20622) this.f59532).m46583(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
