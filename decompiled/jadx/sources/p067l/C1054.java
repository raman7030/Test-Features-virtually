package p067l;

import android.media.browse.MediaBrowser;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes2.dex */
public class C1054 extends MediaBrowser.SubscriptionCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC1474 f16650;

    public C1054(AbstractC1474 abstractC1474) {
        this.f16650 = abstractC1474;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list) {
        C1579.m37423(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str) {
        this.f16650.getClass();
    }
}
