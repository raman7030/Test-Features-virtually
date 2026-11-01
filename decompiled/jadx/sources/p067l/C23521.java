package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23521 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f74946;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f74947;

    public /* synthetic */ C23521(int i, Object obj) {
        this.f74946 = i;
        this.f74947 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        switch (this.f74946) {
            case 0:
                ((AbstractC7783) this.f74947).m18025((C4848) obj);
                break;
            default:
                C21567 c21567 = (C21567) this.f74947;
                c21567.getClass();
                ((AbstractC23743) obj).mo3382(c21567);
                break;
        }
    }
}
