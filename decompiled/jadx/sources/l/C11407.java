package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.ۨۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public class C11407 extends MediaBrowserService {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22695 f34106;

    public C11407(C22695 c22695, Context context) {
        this.f34106 = c22695;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundleM31132;
        int i2;
        C12817 c12817;
        C23645.m52135(bundle);
        C22695 c22695 = this.f34106;
        AbstractServiceC14974 abstractServiceC14974 = c22695.f73332;
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        if (bundle2 == null || bundle2.getInt("extra_client_version", 0) == 0) {
            bundleM31132 = null;
            i2 = -1;
        } else {
            bundle2.remove("extra_client_version");
            c22695.f73329 = new Messenger(abstractServiceC14974.f45643);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            bundle3.putBinder("extra_messenger", c22695.f73329.getBinder());
            c22695.f73330.add(bundle3);
            int i3 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
            i2 = i3;
            bundleM31132 = bundle3;
        }
        C9996 c9996 = new C9996(abstractServiceC14974, str, i2, i, null);
        C12817 c12817M35456 = abstractServiceC14974.m35456();
        if (c12817M35456 == null) {
            c12817 = null;
        } else {
            if (c22695.f73329 != null) {
                abstractServiceC14974.f45640.add(c9996);
            }
            if (bundleM31132 == null) {
                bundleM31132 = c12817M35456.m31132();
            } else if (c12817M35456.m31132() != null) {
                bundleM31132.putAll(c12817M35456.m31132());
            }
            c12817 = new C12817(bundleM31132, c12817M35456.m31133());
        }
        if (c12817 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(c12817.f38460, c12817.f38459);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        this.f34106.f73332.m35458();
    }
}
