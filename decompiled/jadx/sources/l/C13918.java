package l;

import android.graphics.Path;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ܰܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K582 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13918 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Interpolator f41487;

    static {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.0375f, 0.0f, 0.12876461f, 0.0895381f, 0.25f, 0.21855351f);
        path.cubicTo(0.32241032f, 0.2956106f, 0.43666667f, 0.41759142f, 0.48333332f, 0.48982617f);
        path.cubicTo(0.69f, 0.80972296f, 0.79333335f, 0.95001614f, 1.0f, 1.0f);
        f41487 = C8020.m21342(path);
    }
}
