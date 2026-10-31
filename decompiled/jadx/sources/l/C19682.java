package l;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: renamed from: l.᩵᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes4.dex */
public final class C19682 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m45261(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m45262(Notification.Builder builder, int i) {
        return builder.setGroupAlertBehavior(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m45260(Notification.Builder builder, boolean z) {
        return builder.setColorized(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m45256(Notification.Builder builder, int i) {
        return builder.setBadgeIconType(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m45258(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m45259(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m45257(Notification.Builder builder, long j) {
        return builder.setTimeoutAfter(j);
    }
}
