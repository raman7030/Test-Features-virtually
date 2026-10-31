package l;

import android.graphics.Path;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.᩺ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K582 */
/* JADX INFO: loaded from: classes.dex */
public final class C23091 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Interpolator f74246;

    static {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.06834272f, 0.019925667f, 0.19220331f, 0.15855429f, 0.33333334f, 0.3492616f);
        path.cubicTo(0.38410434f, 0.41477913f, 0.5494579f, 0.6813603f, 0.6666667f, 0.68279964f);
        path.cubicTo(0.75258625f, 0.6817962f, 0.73725396f, 0.8788962f, 1.0f, 1.0f);
        f74246 = C8020.m21342(path);
    }
}
