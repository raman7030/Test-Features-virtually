package l;

import android.content.Context;

/* JADX INFO: renamed from: l.֡᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0745 implements InterfaceC14164 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17693 f2794 = new C19797();

    @Override // l.InterfaceC14164
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23337 mo2860(Context context, C21054 c21054, C1451 c1451, ExecutorC7096 executorC7096) {
        try {
            return ((InterfaceC14164) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(InterfaceC17693.class).newInstance(this.f2794)).mo2860(context, c21054, c1451, executorC7096);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
