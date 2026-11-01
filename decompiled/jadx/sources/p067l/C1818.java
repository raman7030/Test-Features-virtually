package p067l;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: renamed from: l.᩵᩶ */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes4.dex */
public final class C1818 {
    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m47558(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Notification.Builder m47559(Notification.Builder builder, int i) {
        return builder.setGroupAlertBehavior(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m47557(Notification.Builder builder, boolean z) {
        return builder.setColorized(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m47553(Notification.Builder builder, int i) {
        return builder.setBadgeIconType(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m47555(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m47556(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m47554(Notification.Builder builder, long j) {
        return builder.setTimeoutAfter(j);
    }
}
