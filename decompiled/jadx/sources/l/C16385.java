package l;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.ܽۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes5.dex */
public final class C16385 extends C7173 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17797 f50418;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16385(C17797 c17797, Context context) {
        super(c17797, context);
        this.f50418 = c17797;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        C23645.m52135(bundle);
        C17797 c17797 = this.f50418;
        AbstractServiceC14974 abstractServiceC14974 = c17797.f54418;
        new C10742(c17797, str, new C23441(result), bundle).m33913(1);
        abstractServiceC14974.m35458();
    }
}
