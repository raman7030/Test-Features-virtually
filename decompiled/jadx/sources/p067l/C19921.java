package p067l;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* JADX INFO: renamed from: l.ᩴۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6KF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19921 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C2485 f60487;

    public C19921(C2485 c2485) {
        this.f60487 = c2485;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        C2485 c2485 = this.f60487;
        c2485.f4003.post(c2485.f4004);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C2485 c2485 = this.f60487;
        c2485.f4003.post(c2485.f4004);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        C2485 c2485 = this.f60487;
        c2485.f4003.post(c2485.f4004);
    }
}
