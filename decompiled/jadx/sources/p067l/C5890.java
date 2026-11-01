package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5890 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC15689 f14503;

    public /* synthetic */ C5890(AbstractC15689 abstractC15689) {
        this.f14503 = abstractC15689;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f14503.mo28415((C18511) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
