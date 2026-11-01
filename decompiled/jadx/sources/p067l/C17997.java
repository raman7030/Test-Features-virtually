package p067l;

import android.app.Service;
import android.net.Uri;
import com.alipay.sdk.p010m.p037n.C0170a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.ServerSocket;

/* JADX INFO: renamed from: l.ܽۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L9TE */
/* JADX INFO: loaded from: classes4.dex */
public final class C17997 extends Thread {

    /* JADX INFO: renamed from: ᩶ */
    public final WeakReference f53746;

    /* JADX INFO: renamed from: ᩸ */
    public C9142 f53747;

    /* JADX INFO: renamed from: ᩹ */
    public ServerSocket f53748;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m40973() {
        ServerSocket serverSocket = this.f53748;
        if (serverSocket != null) {
            this.f53748 = null;
            C4081.f8988.execute(new RunnableC2761(2, serverSocket));
        }
    }

    public C17997(ServiceC11293 serviceC11293) {
        this.f53746 = new WeakReference(serviceC11293);
        setDaemon(true);
        start();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Uri m40971(C9142 c9142) {
        String str = c9142.f24748;
        C9142 c9143 = this.f53747;
        if (c9143 == null || !c9143.f24748.equals(str)) {
            final C9142 c9144 = this.f53747;
            if (c9144 != null) {
                C4081.f8988.execute(new Runnable() { // from class: l.ۧۚ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2700.m4192(c9144);
                    }
                });
            }
            this.f53747 = c9142;
        }
        return new Uri.Builder().scheme(C0170a.f680s).encodedAuthority("127.0.0.1:" + this.f53748.getLocalPort()).path(str + "/" + c9142.f24741).build();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Service service;
        WeakReference weakReference = this.f53746;
        try {
            this.f53748 = new ServerSocket(0);
            while (!isInterrupted()) {
                new RunnableC8610(this.f53748.accept(), this.f53747);
            }
            C2700.m4192(this.f53747);
            try {
                ServerSocket serverSocket = this.f53748;
                if (serverSocket != null) {
                    serverSocket.close();
                    this.f53748 = null;
                }
            } catch (IOException unused) {
            }
            service = (Service) weakReference.get();
            if (service == null) {
                return;
            }
        } catch (Exception unused2) {
            C2700.m4192(this.f53747);
            try {
                ServerSocket serverSocket2 = this.f53748;
                if (serverSocket2 != null) {
                    serverSocket2.close();
                    this.f53748 = null;
                }
            } catch (IOException unused3) {
            }
            service = (Service) weakReference.get();
            if (service == null) {
                return;
            }
        } catch (Throwable th) {
            C2700.m4192(this.f53747);
            try {
                ServerSocket serverSocket3 = this.f53748;
                if (serverSocket3 != null) {
                    serverSocket3.close();
                    this.f53748 = null;
                }
            } catch (IOException unused4) {
            }
            Service service2 = (Service) weakReference.get();
            if (service2 != null) {
                service2.stopSelf();
                throw th;
            }
            throw th;
        }
        service.stopSelf();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40972() {
        return this.f53748 != null;
    }
}
