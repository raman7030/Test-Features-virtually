package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3488 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f7000;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f7001;

    public /* synthetic */ C3488(int i, Object obj) {
        this.f7000 = i;
        this.f7001 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7000) {
            case 0:
                ((ViewOnClickListenerC9523) this.f7001).f26075.m13337().mo4067((String) obj);
                break;
            default:
                ((StringBuilder) this.f7001).append((String) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
