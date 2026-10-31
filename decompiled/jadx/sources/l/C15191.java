package l;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* JADX INFO: renamed from: l.ܶۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15191 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12807 m35924() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            int i = C12807.f38445;
            return C4341.m13040(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SidecarInterface m35923(Context context) {
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }
}
