package p067l;

import android.view.Surface;

/* JADX INFO: renamed from: l.۬᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15147 {
    /* JADX INFO: renamed from: ֫ */
    public static void m34576(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            C21334.m48348("Failed to call Surface.setFrameRate", e);
        }
    }
}
