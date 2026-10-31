package l;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAN2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18721 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m43347(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C8969 c8969 = C8969.f27244;
        C11233.m27805(sidecarWindowLayoutInfo, "info");
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? c8969 : list;
            } catch (NoSuchFieldError unused) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke != null) {
                    return (List) objInvoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m43346(SidecarDeviceState sidecarDeviceState) {
        C11233.m27805(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke != null) {
                    return ((Integer) objInvoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m43349(SidecarDeviceState sidecarDeviceState) {
        C11233.m27805(sidecarDeviceState, "sidecarDeviceState");
        int iM43346 = m43346(sidecarDeviceState);
        if (iM43346 < 0 || iM43346 > 4) {
            return 0;
        }
        return iM43346;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43348(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
        }
    }
}
