package l;

import android.app.Notification;
import android.app.PendingIntent;

/* JADX INFO: renamed from: l.۬ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12858 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.MediaStyle m31294(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
        }
        return mediaStyle;
    }
}
