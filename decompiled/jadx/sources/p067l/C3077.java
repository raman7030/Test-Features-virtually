package p067l;

import android.content.Context;

/* JADX INFO: renamed from: l.֡᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3077 implements InterfaceC15829 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19183 f5567 = new C21184();

    @Override // p067l.InterfaceC15829
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC24547 mo5189(Context context, C22378 c22378, C3748 c3748, ExecutorC9113 executorC9113) {
        try {
            return ((InterfaceC15829) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(InterfaceC19183.class).newInstance(this.f5567)).mo5189(context, c22378, c3748, executorC9113);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
