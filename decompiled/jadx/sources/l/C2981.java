package l;

import android.app.Notification;
import android.media.session.MediaSession;

/* JADX INFO: renamed from: l.ۗۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2981 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9108(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.MediaStyle m9106() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.MediaStyle m9107(Notification.MediaStyle mediaStyle, int[] iArr, C14472 c14472) {
        if (iArr != null) {
            m9110(mediaStyle, iArr);
        }
        if (c14472 != null) {
            m9109(mediaStyle, (MediaSession.Token) c14472.m34573());
        }
        return mediaStyle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9110(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9109(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }
}
