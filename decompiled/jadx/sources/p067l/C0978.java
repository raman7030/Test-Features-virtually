package p067l;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* JADX INFO: renamed from: l.ۖ᩶ */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes2.dex */
public final class C0978 {
    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m10543(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Notification.Builder m10545(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m10540(Notification.Builder builder, int i) {
        return builder.setColor(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Notification.Builder m10544(Notification.Builder builder, int i) {
        return builder.setVisibility(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m10541(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m10542(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }
}
