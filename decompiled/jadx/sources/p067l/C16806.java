package p067l;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* JADX INFO: renamed from: l.ܶۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16806 {
    /* JADX INFO: renamed from: ֫ */
    public static C14540 m38084() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            int i = C14540.f41487;
            return C6494.m14904(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static SidecarInterface m38083(Context context) {
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }
}
