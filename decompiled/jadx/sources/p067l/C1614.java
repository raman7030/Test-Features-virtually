package p067l;

import android.media.browse.MediaBrowser;

/* JADX INFO: renamed from: l.ܺ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public final class C1614 extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C0949 f51113;

    public C1614(C0949 c0949) {
        this.f51113 = c0949;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        C0949 c0949 = this.f51113;
        C1789 c1789 = c0949.f9945;
        if (c1789 != null) {
            c1789.m46317();
        }
        c0949.mo9242();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        C0949 c0949 = this.f51113;
        C1789 c1789 = c0949.f9945;
        if (c1789 != null) {
            c1789.m46316();
        }
        c0949.mo9244();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        this.f51113.mo9243();
    }
}
