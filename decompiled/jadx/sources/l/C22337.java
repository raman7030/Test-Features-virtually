package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.h;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ܳ֨, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C22337 extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1170 c1170;
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
            C20221 c20221M46454 = C20221.m46454();
            if (h.d.equals(stringExtra)) {
                c1170 = c20221M46454.f65413;
            } else if ("vaid".equals(stringExtra)) {
                c1170 = c20221M46454.f65417;
            } else if ("aaid".equals(stringExtra)) {
                c1170 = c20221M46454.f65415;
            } else {
                c1170 = "udid".equals(stringExtra) ? c20221M46454.f65412 : null;
            }
            if (c1170 == null) {
                return;
            }
            c1170.f4216 = 0L;
        }
    }
}
