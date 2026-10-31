package l;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* JADX INFO: renamed from: l.ᩴۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6KF */
/* JADX INFO: loaded from: classes4.dex */
public final class C18469 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0123 f57267;

    public C18469(C0123 c0123) {
        this.f57267 = c0123;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        C0123 c0123 = this.f57267;
        c0123.f1227.post(c0123.f1228);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C0123 c0123 = this.f57267;
        c0123.f1227.post(c0123.f1228);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        C0123 c0123 = this.f57267;
        c0123.f1227.post(c0123.f1228);
    }
}
