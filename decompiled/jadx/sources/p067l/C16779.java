package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16779 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5263 f49442;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f49443;

    public /* synthetic */ C16779(C5263 c5263, int i) {
        this.f49442 = c5263;
        this.f49443 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C17450 c17450 = (C17450) obj;
        if (c17450.m39778() == 0) {
            int i = c17450.f23817;
            if (i > this.f49443) {
                c17450.f23817 = i - 1;
                this.f49442.f12389.m48074(new C5381(0, c17450));
            }
            c17450.m39776(2);
        }
    }
}
