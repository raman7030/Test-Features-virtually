package l;

import android.graphics.Path;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۛܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K582 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6158 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Interpolator f18933;

    static {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.3665f, 0.0f);
        path.cubicTo(0.4725262f, 0.06240991f, 0.6154161f, 0.5f, 0.68325f, 0.5f);
        path.cubicTo(0.7547506f, 0.5f, 0.7572583f, 0.8145101f, 1.0f, 1.0f);
        f18933 = C8020.m21342(path);
    }
}
