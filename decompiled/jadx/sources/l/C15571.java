package l;

import android.media.browse.MediaBrowser;

/* JADX INFO: renamed from: l.ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15571 extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2167 f47981;

    public C15571(C2167 c2167) {
        this.f47981 = c2167;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        C2167 c2167 = this.f47981;
        C19101 c19101 = c2167.f7160;
        if (c19101 != null) {
            c19101.m44023();
        }
        c2167.mo7163();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        C2167 c2167 = this.f47981;
        C19101 c19101 = c2167.f7160;
        if (c19101 != null) {
            c19101.m44022();
        }
        c2167.mo7165();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        this.f47981.mo7164();
    }
}
