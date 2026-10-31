package l;

import android.content.res.Configuration;
import android.os.Build;

/* JADX INFO: renamed from: l.᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: G3C1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20865 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3931 m47679(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C3931.m11973(C6753.m18373(configuration)) : C3931.m11975(configuration.locale);
    }
}
