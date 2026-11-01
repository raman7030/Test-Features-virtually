package p067l;

import android.app.Notification;
import android.widget.RemoteViews;

/* JADX INFO: renamed from: l.ᩴ᩶ */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes4.dex */
public final class C1783 {
    /* JADX INFO: renamed from: ֫ */
    public static Notification.Action.Builder m46070(Notification.Action.Builder builder, boolean z) {
        return builder.setAllowGeneratedReplies(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m46072(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Notification.Builder m46073(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m46071(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    /* JADX INFO: renamed from: ܽ */
    public static Notification.Builder m46074(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }
}
