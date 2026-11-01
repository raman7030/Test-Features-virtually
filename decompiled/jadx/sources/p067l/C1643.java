package p067l;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܺ᩶ */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes4.dex */
public final class C1643 {
    /* JADX INFO: renamed from: ֫ */
    public static Notification.Action.Builder m40260(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Action.Builder m40261(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Action.Builder m40262(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m40264(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Action m40263(Notification.Action.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m40267(Notification notification) {
        return notification.getGroup();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m40265(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m40266(Notification.Builder builder, boolean z) {
        return builder.setGroupSummary(z);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Notification.Builder m40269(Notification.Builder builder, boolean z) {
        return builder.setLocalOnly(z);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Notification.Builder m40268(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }
}
