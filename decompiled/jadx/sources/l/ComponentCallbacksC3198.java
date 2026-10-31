package l;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: renamed from: l.ۗۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes2.dex */
public final class ComponentCallbacksC3198 implements ComponentCallbacks {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f10079;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13075 f10080;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C11233.m27805(configuration, "newConfig");
        C13075 c13075 = this.f10080;
        InterfaceC13512 interfaceC13512 = c13075.f39151;
        if (interfaceC13512 == null) {
            return;
        }
        Activity activity = this.f10079;
        ((C21543) interfaceC13512).m48702(activity, c13075.m31692(activity));
    }

    public ComponentCallbacksC3198(C13075 c13075, Activity activity) {
        this.f10080 = c13075;
        this.f10079 = activity;
    }
}
