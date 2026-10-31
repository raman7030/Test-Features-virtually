package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܶۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15212 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC3219 f46681;

    public C15212(ServiceC3219 serviceC3219) {
        this.f46681 = serviceC3219;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ServiceC3219 serviceC3219 = this.f46681;
        serviceC3219.f10133.m18365(C13096.m31738());
        serviceC3219.f10127.invalidate();
        int iM31747 = C13096.m31747();
        for (int i = 0; i < 2; i++) {
            View childAt = serviceC3219.f10124.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = iM31747;
            layoutParams.width = iM31747;
            childAt.setLayoutParams(layoutParams);
        }
        ServiceC3219.m9888(serviceC3219);
    }
}
