package p067l;

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
public final class C6749 implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14795 f17503;

    /* JADX INFO: renamed from: ֫ */
    public void m15411(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface sidecarInterfaceM33776;
        Window window;
        WindowManager.LayoutParams attributes;
        C13045.m29867(sidecarDeviceState, "newDeviceState");
        Collection<Activity> collectionValues = this.f17503.f42201.values();
        C14795 c14795 = this.f17503;
        for (Activity activity : collectionValues) {
            SidecarWindowLayoutInfo windowLayoutInfo = null;
            IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            if (iBinder != null && (sidecarInterfaceM33776 = c14795.m33776()) != null) {
                windowLayoutInfo = sidecarInterfaceM33776.getWindowLayoutInfo(iBinder);
            }
            InterfaceC15210 interfaceC15210 = c14795.f42199;
            if (interfaceC15210 != null) {
                ((C22843) interfaceC15210).m51047(activity, c14795.f42202.m23576(windowLayoutInfo, sidecarDeviceState));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void m15410(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C13045.m29867(iBinder, "windowToken");
        C13045.m29867(sidecarWindowLayoutInfo, "newLayout");
        Activity activity = (Activity) this.f17503.f42201.get(iBinder);
        if (activity == null) {
            return;
        }
        C10102 c10102 = this.f17503.f42202;
        SidecarInterface sidecarInterfaceM33776 = this.f17503.m33776();
        SidecarDeviceState deviceState = sidecarInterfaceM33776 == null ? null : sidecarInterfaceM33776.getDeviceState();
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        C18975 c18975M23576 = c10102.m23576(sidecarWindowLayoutInfo, deviceState);
        InterfaceC15210 interfaceC15210 = this.f17503.f42199;
        if (interfaceC15210 == null) {
            return;
        }
        ((C22843) interfaceC15210).m51047(activity, c18975M23576);
    }

    public C6749(C14795 c14795) {
        this.f17503 = c14795;
    }
}
