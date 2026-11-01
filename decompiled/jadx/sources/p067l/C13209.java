package p067l;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.ۨۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public class C13209 extends MediaBrowserService {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23937 f37103;

    public C13209(C23937 c23937, Context context) {
        this.f37103 = c23937;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundleM33221;
        int i2;
        C14549 c14549;
        C2015.m54538(bundle);
        C23937 c23937 = this.f37103;
        AbstractServiceC16599 abstractServiceC16599 = c23937.f76058;
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        if (bundle2 == null || bundle2.getInt("extra_client_version", 0) == 0) {
            bundleM33221 = null;
            i2 = -1;
        } else {
            bundle2.remove("extra_client_version");
            c23937.f76055 = new Messenger(abstractServiceC16599.f48756);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            bundle3.putBinder("extra_messenger", c23937.f76055.getBinder());
            c23937.f76056.add(bundle3);
            int i3 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
            i2 = i3;
            bundleM33221 = bundle3;
        }
        C11868 c11868 = new C11868(abstractServiceC16599, str, i2, i, null);
        C14549 c14549M37612 = abstractServiceC16599.m37612();
        if (c14549M37612 == null) {
            c14549 = null;
        } else {
            if (c23937.f76055 != null) {
                abstractServiceC16599.f48753.add(c11868);
            }
            if (bundleM33221 == null) {
                bundleM33221 = c14549M37612.m33221();
            } else if (c14549M37612.m33221() != null) {
                bundleM33221.putAll(c14549M37612.m33221());
            }
            c14549 = new C14549(bundleM33221, c14549M37612.m33222());
        }
        if (c14549 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(c14549.f41503, c14549.f41502);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        this.f37103.f76058.m37614();
    }
}
