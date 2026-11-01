package p067l;

import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4386 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f9870b;

    public /* synthetic */ C4386(Consumer consumer, int i) {
        this.f9869a = i;
        this.f9870b = consumer;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f9869a) {
            case 0:
                break;
            case 1:
                break;
        }
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f9869a) {
            case 0:
                this.f9870b.accept(AbstractC24029.m53247p(obj));
                break;
            case 1:
                this.f9870b.accept(AbstractC24029.m53247p(obj));
                break;
            default:
                this.f9870b.accept(new C16828((Map.Entry) obj));
                break;
        }
    }
}
