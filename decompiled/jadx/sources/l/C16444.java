package l;

import android.app.Service;
import android.net.Uri;
import com.alipay.sdk.m.n.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.ServerSocket;

/* JADX INFO: renamed from: l.ܽۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L9TE */
/* JADX INFO: loaded from: classes4.dex */
public final class C16444 extends Thread {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final WeakReference f50567;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7127 f50568;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ServerSocket f50569;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m38748() {
        ServerSocket serverSocket = this.f50569;
        if (serverSocket != null) {
            this.f50569 = null;
            C1802.f6209.execute(new RunnableC0413(2, serverSocket));
        }
    }

    public C16444(ServiceC9390 serviceC9390) {
        this.f50567 = new WeakReference(serviceC9390);
        setDaemon(true);
        start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Uri m38746(C7127 c7127) {
        String str = c7127.f21869;
        C7127 c7128 = this.f50568;
        if (c7128 == null || !c7128.f21869.equals(str)) {
            final C7127 c7129 = this.f50568;
            if (c7129 != null) {
                C1802.f6209.execute(new Runnable() { // from class: l.ۧۚ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0349.m1793(c7129);
                    }
                });
            }
            this.f50568 = c7127;
        }
        return new Uri.Builder().scheme(a.s).encodedAuthority("127.0.0.1:" + this.f50569.getLocalPort()).path(str + "/" + c7127.f21862).build();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Service service;
        WeakReference weakReference = this.f50567;
        try {
            this.f50569 = new ServerSocket(0);
            while (!isInterrupted()) {
                new RunnableC6567(this.f50569.accept(), this.f50568);
            }
            C0349.m1793(this.f50568);
            try {
                ServerSocket serverSocket = this.f50569;
                if (serverSocket != null) {
                    serverSocket.close();
                    this.f50569 = null;
                }
            } catch (IOException unused) {
            }
            service = (Service) weakReference.get();
            if (service == null) {
                return;
            }
        } catch (Exception unused2) {
            C0349.m1793(this.f50568);
            try {
                ServerSocket serverSocket2 = this.f50569;
                if (serverSocket2 != null) {
                    serverSocket2.close();
                    this.f50569 = null;
                }
            } catch (IOException unused3) {
            }
            service = (Service) weakReference.get();
            if (service == null) {
                return;
            }
        } catch (Throwable th) {
            C0349.m1793(this.f50568);
            try {
                ServerSocket serverSocket3 = this.f50569;
                if (serverSocket3 != null) {
                    serverSocket3.close();
                    this.f50569 = null;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38747() {
        return this.f50569 != null;
    }
}
