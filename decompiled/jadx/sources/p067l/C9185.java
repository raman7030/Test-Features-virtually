package p067l;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.۟ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public class C9185 extends C13209 {
    public C9185(C3859 c3859, Context context) {
        super(c3859, context);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        C15219 c15219 = new C15219(str, new C24646(result));
        c15219.m36046(2);
        c15219.m36048();
    }
}
