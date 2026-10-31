package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19013 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f59911;

    public /* synthetic */ C19013(ActivityC1748 activityC1748) {
        this.f59911 = activityC1748;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43856(boolean z) {
        ActivityC1748.m5854(this.f59911, z);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m43856(((Boolean) obj).booleanValue());
    }

    public final Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
