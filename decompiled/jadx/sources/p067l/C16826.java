package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܶۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16826 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ServiceC5428 f49804;

    public C16826(ServiceC5428 serviceC5428) {
        this.f49804 = serviceC5428;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ServiceC5428 serviceC5428 = this.f49804;
        serviceC5428.f12939.m20313(C14815.m33828());
        serviceC5428.f12933.invalidate();
        int iM33837 = C14815.m33837();
        for (int i = 0; i < 2; i++) {
            View childAt = serviceC5428.f12930.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = iM33837;
            layoutParams.width = iM33837;
            childAt.setLayoutParams(layoutParams);
        }
        ServiceC5428.m11935(serviceC5428);
    }
}
