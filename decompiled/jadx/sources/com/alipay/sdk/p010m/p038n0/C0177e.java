package com.alipay.sdk.p010m.p038n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.C0809h;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.alipay.sdk.m.n0.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C0177e extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C0173a c0173a;
        if (context == null || intent == null) {
            return;
        }
        boolean zContains = false;
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        C0178f.m816a("shouldUpdateId, notifyFlag : ".concat(String.valueOf(intExtra)));
        if (intExtra == 1) {
            if (TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
                zContains = true;
            }
        } else if (intExtra == 2) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
            if (stringArrayListExtra != null) {
                zContains = stringArrayListExtra.contains(context.getPackageName());
            }
        } else if (intExtra == 0) {
            zContains = true;
        }
        if (zContains) {
            String stringExtra = intent.getStringExtra("openIdType");
            C0178f c0178fM814a = C0178f.m814a();
            if (C0809h.f3437d.equals(stringExtra)) {
                c0173a = c0178fM814a.f733b;
            } else if ("vaid".equals(stringExtra)) {
                c0173a = c0178fM814a.f735d;
            } else if ("aaid".equals(stringExtra)) {
                c0173a = c0178fM814a.f734c;
            } else {
                c0173a = "udid".equals(stringExtra) ? c0178fM814a.f732a : null;
            }
            if (c0173a == null) {
                return;
            }
            c0173a.m801b();
        }
    }
}
