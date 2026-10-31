package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.m.m.b;
import com.alipay.sdk.m.y.o;
import l.C7166;
import l.ConcurrentMapC10942;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class APayEntranceActivity extends Activity {
    public static final String d = "ap_order_info";
    public static final String e = "ap_target_packagename";
    public static final String f = "ap_session";
    public static final String g = "ap_local_info";
    public static final ConcurrentMapC10942 h = new ConcurrentMapC10942();
    public String a;
    public String b;
    public com.alipay.sdk.m.w.a c;

    /* JADX INFO: compiled from: N673 */
    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.b;
        com.alipay.sdk.m.w.a aVar = this.c;
        StringBuilder sbM19190 = C7166.m19190(str, "|");
        sbM19190.append(TextUtils.isEmpty(this.a));
        com.alipay.sdk.m.m.a.a(aVar, b.f77909l, "BSAFinish", sbM19190.toString());
        if (TextUtils.isEmpty(this.a)) {
            this.a = com.alipay.sdk.m.l.b.a();
            com.alipay.sdk.m.w.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.b(true);
            }
        }
        if (str != null) {
            a aVar3 = (a) h.remove(str);
            if (aVar3 != null) {
                aVar3.a(this.a);
            } else {
                com.alipay.sdk.m.m.a.b(this.c, "wr", "refNull", "session=".concat(str));
            }
        }
        try {
            super.finish();
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(this.c, "wr", "APStartFinish", th);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        com.alipay.sdk.m.m.a.a(this.c, b.f77909l, "BSAOnAR", this.b + "|" + i + "," + i2);
        if (i == 1000) {
            if (intent != null) {
                try {
                    this.a = intent.getStringExtra(o.c);
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString(d);
            String string2 = extras.getString(e);
            this.b = extras.getString(f);
            String string3 = extras.getString(g, "{}");
            if (!TextUtils.isEmpty(this.b)) {
                com.alipay.sdk.m.w.a aVarA = com.alipay.sdk.m.w.a.C0028a.a(this.b);
                this.c = aVarA;
                com.alipay.sdk.m.m.a.a(aVarA, b.f77909l, "BSAEntryCreate", this.b + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th) {
                com.alipay.sdk.m.m.a.a(this.c, "wr", "APStartEx", th);
                finish();
            }
            if (this.c != null) {
                Context applicationContext = getApplicationContext();
                com.alipay.sdk.m.w.a aVar = this.c;
                com.alipay.sdk.m.m.a.a(applicationContext, aVar, string, aVar.d);
                this.c.a(true);
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
