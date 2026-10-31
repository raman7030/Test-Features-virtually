package l;

import android.graphics.Path;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۨܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K582 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11803 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Interpolator f35205;

    static {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.2f, 0.0f);
        path.cubicTo(0.39583334f, 0.0f, 0.47484508f, 0.20679761f, 0.59166664f, 0.41708294f);
        path.cubicTo(0.715161f, 0.6393796f, 0.81625f, 0.9745569f, 1.0f, 1.0f);
        f35205 = C8020.m21342(path);
    }
}
