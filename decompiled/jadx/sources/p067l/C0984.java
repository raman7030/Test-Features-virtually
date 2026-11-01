package p067l;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0984 extends C1054 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC1474 f11961;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0984(AbstractC1474 abstractC1474) {
        super(abstractC1474);
        this.f11961 = abstractC1474;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list, Bundle bundle) {
        C2015.m54538(bundle);
        C1579.m37423(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str, Bundle bundle) {
        C2015.m54538(bundle);
        this.f11961.getClass();
    }
}
