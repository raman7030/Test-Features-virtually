package p067l;

import android.app.Notification;
import android.media.session.MediaSession;

/* JADX INFO: renamed from: l.ۗۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5201 {
    /* JADX INFO: renamed from: ֫ */
    public static void m11160(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.MediaStyle m11158() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.MediaStyle m11159(Notification.MediaStyle mediaStyle, int[] iArr, C1560 c1560) {
        if (iArr != null) {
            m11162(mediaStyle, iArr);
        }
        if (c1560 != null) {
            m11161(mediaStyle, (MediaSession.Token) c1560.m36714());
        }
        return mediaStyle;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11162(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11161(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }
}
