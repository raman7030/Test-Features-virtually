package l;

import android.app.RemoteInput;

/* JADX INFO: renamed from: l.ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16403 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38655(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static RemoteInput.Builder m38656(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
