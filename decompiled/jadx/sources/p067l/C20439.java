package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20439 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC4030 f63140;

    public /* synthetic */ C20439(ActivityC4030 activityC4030) {
        this.f63140 = activityC4030;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46124(boolean z) {
        ActivityC4030.m8064(this.f63140, z);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m46124(((Boolean) obj).booleanValue());
    }

    public final Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
