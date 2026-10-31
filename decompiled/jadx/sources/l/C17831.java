package l;

import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6U1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17831 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54478;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54479;

    public /* synthetic */ C17831(int i, Object obj) {
        this.f54478 = i;
        this.f54479 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f54478) {
            case 0:
                ((C14302) this.f54479).m34127(obj);
                break;
            default:
                ((LinkedHashSet) this.f54479).add(Integer.valueOf(((Long) obj).intValue()));
                break;
        }
    }
}
