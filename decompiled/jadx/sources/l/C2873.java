package l;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes2.dex */
public final class C2873 extends C4284 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12750 f9163;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2873(AbstractC12750 abstractC12750) {
        super(abstractC12750);
        this.f9163 = abstractC12750;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list, Bundle bundle) {
        C23645.m52135(bundle);
        C14866.m35270(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str, Bundle bundle) {
        C23645.m52135(bundle);
        this.f9163.getClass();
    }
}
