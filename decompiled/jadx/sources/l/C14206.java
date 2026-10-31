package l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: l.ܳ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5IZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14206 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EdgeEffect m33872(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m33871(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m33870(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
