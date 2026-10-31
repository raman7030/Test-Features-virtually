package l;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۡ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9108 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0923 f27602;

    public C9108(Context context, C4169 c4169) {
        C0923 c0923 = new C0923(context, new C21103(c4169));
        this.f27602 = c0923;
        c0923.m3330(new GestureDetectorOnDoubleTapListenerC9814(c4169));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23474(MotionEvent motionEvent) {
        this.f27602.m3331(motionEvent);
    }
}
