package l;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.۟ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public class C7173 extends C11407 {
    public C7173(C1569 c1569, Context context) {
        super(c1569, context);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        C13522 c13522 = new C13522(str, new C23441(result));
        c13522.m33913(2);
        c13522.m33915();
    }
}
