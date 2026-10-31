package l;

import android.media.browse.MediaBrowser;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes2.dex */
public class C4284 extends MediaBrowser.SubscriptionCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12750 f13834;

    public C4284(AbstractC12750 abstractC12750) {
        this.f13834 = abstractC12750;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list) {
        C14866.m35270(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str) {
        this.f13834.getClass();
    }
}
