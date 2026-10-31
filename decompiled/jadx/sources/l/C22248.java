package l;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩹ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes.dex */
public final class C22248 implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SidecarInterface.SidecarCallback f72195;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public SidecarDeviceState f72196;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f72197;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8137 f72198;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f72199;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (l.C18721.m43349(r2) == l.C18721.m43349(r4)) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m49960(SidecarDeviceState sidecarDeviceState) {
        C11233.m27805(sidecarDeviceState, "newDeviceState");
        ReentrantLock reentrantLock = this.f72197;
        reentrantLock.lock();
        try {
            C8137 c8137 = this.f72198;
            SidecarDeviceState sidecarDeviceState2 = this.f72196;
            c8137.getClass();
            if (!C11233.m27802(sidecarDeviceState2, sidecarDeviceState)) {
                if (sidecarDeviceState2 == null) {
                }
                this.f72196 = sidecarDeviceState;
                this.f72195.onDeviceStateChanged(sidecarDeviceState);
                C8058 c8058 = C8058.f24861;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public C22248(C8137 c8137, SidecarInterface.SidecarCallback sidecarCallback) {
        C11233.m27805(c8137, "sidecarAdapter");
        this.f72198 = c8137;
        this.f72195 = sidecarCallback;
        this.f72197 = new ReentrantLock();
        this.f72199 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m49959(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C11233.m27805(iBinder, "token");
        C11233.m27805(sidecarWindowLayoutInfo, "newLayout");
        synchronized (this.f72197) {
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f72199.get(iBinder);
            this.f72198.getClass();
            if (C8137.m21604(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                return;
            }
            this.f72195.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
        }
    }
}
