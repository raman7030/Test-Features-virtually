package p067l;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: renamed from: l.ۗۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes2.dex */
public final class ComponentCallbacksC5408 implements ComponentCallbacks {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Activity f12883;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14795 f12884;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C13045.m29867(configuration, "newConfig");
        C14795 c14795 = this.f12884;
        InterfaceC15210 interfaceC15210 = c14795.f42199;
        if (interfaceC15210 == null) {
            return;
        }
        Activity activity = this.f12883;
        ((C22843) interfaceC15210).m51047(activity, c14795.m33780(activity));
    }

    public ComponentCallbacksC5408(C14795 c14795, Activity activity) {
        this.f12884 = c14795;
        this.f12883 = activity;
    }
}
