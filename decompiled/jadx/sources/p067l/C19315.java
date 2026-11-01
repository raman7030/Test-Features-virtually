package p067l;

import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6U1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19315 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f57674;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f57675;

    public /* synthetic */ C19315(int i, Object obj) {
        this.f57674 = i;
        this.f57675 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f57674) {
            case 0:
                ((C15961) this.f57675).m36260(obj);
                break;
            default:
                ((LinkedHashSet) this.f57675).add(Integer.valueOf(((Long) obj).intValue()));
                break;
        }
    }
}
