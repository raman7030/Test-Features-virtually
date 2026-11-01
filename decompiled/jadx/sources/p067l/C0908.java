package p067l;

import android.app.Notification;

/* JADX INFO: renamed from: l.֨᩶ */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes2.dex */
public final class C0908 {
    /* JADX INFO: renamed from: ֫ */
    public static Notification.Action.Builder m6903(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m6904(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
