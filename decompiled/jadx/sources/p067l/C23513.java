package p067l;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩹ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes.dex */
public final class C23513 implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: ֫ */
    public final SidecarInterface.SidecarCallback f74920;

    /* JADX INFO: renamed from: ۧ */
    public SidecarDeviceState f74921;

    /* JADX INFO: renamed from: ܽ */
    public final ReentrantLock f74922;

    /* JADX INFO: renamed from: ܿ */
    public final C10102 f74923;

    /* JADX INFO: renamed from: ᩳ */
    public final WeakHashMap f74924;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (p067l.C20161.m45616(r2) == p067l.C20161.m45616(r4)) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m52288(SidecarDeviceState sidecarDeviceState) {
        C13045.m29867(sidecarDeviceState, "newDeviceState");
        ReentrantLock reentrantLock = this.f74922;
        reentrantLock.lock();
        try {
            C10102 c10102 = this.f74923;
            SidecarDeviceState sidecarDeviceState2 = this.f74921;
            c10102.getClass();
            if (!C13045.m29864(sidecarDeviceState2, sidecarDeviceState)) {
                if (sidecarDeviceState2 == null) {
                }
                this.f74921 = sidecarDeviceState;
                this.f74920.onDeviceStateChanged(sidecarDeviceState);
                C10027 c10027 = C10027.f27775;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public C23513(C10102 c10102, SidecarInterface.SidecarCallback sidecarCallback) {
        C13045.m29867(c10102, "sidecarAdapter");
        this.f74923 = c10102;
        this.f74920 = sidecarCallback;
        this.f74922 = new ReentrantLock();
        this.f74924 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public void m52287(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C13045.m29867(iBinder, "token");
        C13045.m29867(sidecarWindowLayoutInfo, "newLayout");
        synchronized (this.f74922) {
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f74924.get(iBinder);
            this.f74923.getClass();
            if (C10102.m23572(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                return;
            }
            this.f74920.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
        }
    }
}
