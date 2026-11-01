package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5602 implements Consumer {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C20335 f13572;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean[] f13573;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1567 f13574;

    public /* synthetic */ C5602(boolean[] zArr, C1567 c1567, C20335 c20335) {
        this.f13573 = zArr;
        this.f13574 = c1567;
        this.f13572 = c20335;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f13573[0] = true;
        this.f13574.setText("/" + this.f13572.m45903((String) obj));
    }
}
