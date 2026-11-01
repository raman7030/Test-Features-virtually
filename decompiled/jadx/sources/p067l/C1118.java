package p067l;

import android.app.Notification;
import android.content.LocusId;

/* JADX INFO: renamed from: l.ۚ᩶ */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes2.dex */
public final class C1118 {
    /* JADX INFO: renamed from: ֫ */
    public static Notification.Action.Builder m17725(Notification.Action.Builder builder, boolean z) {
        return builder.setContextual(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m17727(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m17726(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Notification.Builder m17728(Notification.Builder builder, boolean z) {
        return builder.setAllowSystemGeneratedContextualActions(z);
    }
}
