package p067l;

import android.app.RemoteInput;

/* JADX INFO: renamed from: l.ܽۙ */
/* JADX INFO: compiled from: P5TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C1656 {
    /* JADX INFO: renamed from: ֫ */
    public static int m40871(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    /* JADX INFO: renamed from: ֫ */
    public static RemoteInput.Builder m40872(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
