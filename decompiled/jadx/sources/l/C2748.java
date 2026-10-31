package l;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* JADX INFO: renamed from: l.ۖ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2748 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m8496(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m8498(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m8493(Notification.Builder builder, int i) {
        return builder.setColor(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m8497(Notification.Builder builder, int i) {
        return builder.setVisibility(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m8494(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m8495(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }
}
