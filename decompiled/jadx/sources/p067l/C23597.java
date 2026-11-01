package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.C0809h;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ܳ֨, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C23597 extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C3480 c3480;
        if (context == null || intent == null) {
            return;
        }
        boolean zContains = false;
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        "shouldUpdateId, notifyFlag : ".concat(String.valueOf(intExtra));
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
            C21586 c21586M48774 = C21586.m48774();
            if (C0809h.f3437d.equals(stringExtra)) {
                c3480 = c21586M48774.f68061;
            } else if ("vaid".equals(stringExtra)) {
                c3480 = c21586M48774.f68065;
            } else if ("aaid".equals(stringExtra)) {
                c3480 = c21586M48774.f68063;
            } else {
                c3480 = "udid".equals(stringExtra) ? c21586M48774.f68060 : null;
            }
            if (c3480 == null) {
                return;
            }
            c3480.f6985 = 0L;
        }
    }
}
