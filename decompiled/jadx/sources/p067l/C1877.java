package p067l;

import android.content.res.Configuration;
import android.os.Build;

/* JADX INFO: renamed from: l.᩷۫ */
/* JADX INFO: compiled from: G3C1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1877 {
    /* JADX INFO: renamed from: ֫ */
    public static C1037 m50008(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C1037.m13893(C1177.m20321(configuration)) : C1037.m13895(configuration.locale);
    }
}
