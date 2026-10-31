package l;

import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2122 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C2122(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept(AbstractC22791.p(obj));
                break;
            case 1:
                this.b.accept(AbstractC22791.p(obj));
                break;
            default:
                this.b.accept(new C15214((Map.Entry) obj));
                break;
        }
    }
}
