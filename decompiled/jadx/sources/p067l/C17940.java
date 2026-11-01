package p067l;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.ܽۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17940 extends C9185 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C19282 f53590;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17940(C19282 c19282, Context context) {
        super(c19282, context);
        this.f53590 = c19282;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        C2015.m54538(bundle);
        C19282 c19282 = this.f53590;
        AbstractServiceC16599 abstractServiceC16599 = c19282.f57614;
        new C12577(c19282, str, new C24646(result), bundle).m36046(1);
        abstractServiceC16599.m37614();
    }
}
