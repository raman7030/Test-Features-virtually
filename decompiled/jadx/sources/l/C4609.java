package l;

import android.app.Activity;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۙۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4609 implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13075 f14675;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m13522(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface sidecarInterfaceM31688;
        Window window;
        WindowManager.LayoutParams attributes;
        C11233.m27805(sidecarDeviceState, "newDeviceState");
        Collection<Activity> collectionValues = this.f14675.f39153.values();
        C13075 c13075 = this.f14675;
        for (Activity activity : collectionValues) {
            SidecarWindowLayoutInfo windowLayoutInfo = null;
            IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            if (iBinder != null && (sidecarInterfaceM31688 = c13075.m31688()) != null) {
                windowLayoutInfo = sidecarInterfaceM31688.getWindowLayoutInfo(iBinder);
            }
            InterfaceC13512 interfaceC13512 = c13075.f39151;
            if (interfaceC13512 != null) {
                ((C21543) interfaceC13512).m48702(activity, c13075.f39154.m21608(windowLayoutInfo, sidecarDeviceState));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m13521(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C11233.m27805(iBinder, "windowToken");
        C11233.m27805(sidecarWindowLayoutInfo, "newLayout");
        Activity activity = (Activity) this.f14675.f39153.get(iBinder);
        if (activity == null) {
            return;
        }
        C8137 c8137 = this.f14675.f39154;
        SidecarInterface sidecarInterfaceM31688 = this.f14675.m31688();
        SidecarDeviceState deviceState = sidecarInterfaceM31688 == null ? null : sidecarInterfaceM31688.getDeviceState();
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        C17473 c17473M21608 = c8137.m21608(sidecarWindowLayoutInfo, deviceState);
        InterfaceC13512 interfaceC13512 = this.f14675.f39151;
        if (interfaceC13512 == null) {
            return;
        }
        ((C21543) interfaceC13512).m48702(activity, c17473M21608);
    }

    public C4609(C13075 c13075) {
        this.f14675 = c13075;
    }
}
