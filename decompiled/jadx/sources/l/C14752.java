package l;

import android.view.Choreographer;

/* JADX INFO: renamed from: l.ܳ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79M1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14752 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35058(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: l.ܿ᩶ۧ
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
