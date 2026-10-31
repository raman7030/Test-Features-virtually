package l;

import android.app.Notification;
import android.content.LocusId;

/* JADX INFO: renamed from: l.ۚ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes2.dex */
public final class C5570 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m15810(Notification.Action.Builder builder, boolean z) {
        return builder.setContextual(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m15812(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m15811(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m15813(Notification.Builder builder, boolean z) {
        return builder.setAllowSystemGeneratedContextualActions(z);
    }
}
